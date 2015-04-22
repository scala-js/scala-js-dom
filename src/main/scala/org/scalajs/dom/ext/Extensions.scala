package org.scalajs.dom.ext

import java.nio.ByteBuffer

import scala.language.implicitConversions
import scala.concurrent.{Promise, Future}

import scala.scalajs.js
import scala.scalajs.js.typedarray._
import scala.scalajs.js.typedarray.TypedArrayBufferOps._

import org.scalajs.dom
import org.scalajs.dom.{html, raw}
import org.scalajs.dom.raw.Blob


/**
 * Used to extend out javascript *Collections to make them usable as normal
 * Scala Seq[*]s
 */
class EasySeq[T](jsLength: Int, jsApply: Int => T) extends Seq[T] {
  def length = jsLength.toInt

  def apply(x: Int) = jsApply(x)

  def iterator = new Iterator[T] {
    var index = 0

    def hasNext: scala.Boolean = index < jsLength

    def next() = {
      val res = jsApply(index)
      index += 1
      res
    }

  }
}

/**
 * Encapsulates a Color, allowing you to do useful work with it
 * before serializing it to a String
 */
case class Color(r: Int, g: Int, b: Int) {
  override def toString() = s"rgb($r, $g, $b)"

  def *(c: Color) = Color(r * c.r, g * c.g, b * c.b)

  def +(c: Color) = Color(r + c.r, g + c.g, b + c.b)
}

object Color {

  val d = "[0-9a-zA-Z]"
  val RGB = "rgb\\((\\d+), (\\d+), (\\d+)\\)".r
  val ShortHex = s"#($d)($d)($d)".r
  val LongHex = s"#($d$d)($d$d)($d$d)".r

  def hex(x: String) = Integer.parseInt(x, 16)

  def apply(s: String): Color = {
    s match {
      case RGB(r, g, b) => Color(r.toInt, g.toInt, b.toInt)
      case ShortHex(r, g, b) => Color(hex(r) * 16, hex(g) * 16, hex(b) * 16)
      case LongHex(r, g, b) => Color(hex(r), hex(g), hex(b))
    }
  }

  val White = Color(255, 255, 255)
  val Red = Color(255, 0, 0)
  val Green = Color(0, 255, 0)
  val Blue = Color(0, 0, 255)
  val Cyan = Color(0, 255, 255)
  val Magenta = Color(255, 0, 255)
  val Yellow = Color(255, 255, 0)
  val Black = Color(0, 0, 0)
  val all = Seq(
    White,
    Red,
    Green,
    Blue,
    Cyan,
    Magenta,
    Yellow,
    Black
  )
}

object Image {
  def createBase64Svg(s: String) = {
    val img =
      dom.document
        .createElement("img")
        .asInstanceOf[html.Image]

    img.src = "data:image/svg+xml;base64," + s
    img
  }
}

/**
 * A list of the codes returned by KeyEvents.
 */
object KeyCode {
  val backspace = 8
  val tab = 9
  val enter = 13
  val shift = 16
  val ctrl = 17
  val alt = 18
  val pause = 19
  val capsLock = 20
  val escape = 27
  val space = 32
  val pageUp = 33
  val pageDown = 34
  val end = 35
  val home = 36
  val left = 37
  val up = 38
  val right = 39
  val down = 40
  val insert = 45
  val delete = 46
  val num0 = 48
  val num1 = 49
  val num2 = 50
  val num3 = 51
  val num4 = 52
  val num5 = 53
  val num6 = 54
  val num7 = 55
  val num8 = 56
  val num9 = 57
  val a = 65
  val b = 66
  val c = 67
  val d = 68
  val e = 69
  val f = 70
  val g = 71
  val h = 72
  val i = 73
  val j = 74
  val k = 75
  val l = 76
  val m = 77
  val n = 78
  val o = 79
  val p = 80
  val q = 81
  val r = 82
  val s = 83
  val t = 84
  val u = 85
  val v = 86
  val w = 87
  val x = 88
  val y = 89
  val z = 90
}


/**
 * Thrown when `Ajax.get` or `Ajax.post` receives a non-20X response code.
 * Contains the XMLHttpRequest that resulted in that response
 */
case class AjaxException(xhr: dom.XMLHttpRequest) extends Exception {
  def isTimeout = xhr.status == 0 && xhr.readyState == 4
}

/**
 * Wraps an XMLHttpRequest to provide an easy one-line way of making 
 * an Ajax call, returning a Future.
 */
object Ajax {
  /**
   * Supported data formats for Ajax are implicitly converted to InputData
   */
  sealed trait InputData extends js.Any

  object InputData {
    implicit def str2ajax(s: String): InputData = s.asInstanceOf[InputData]

    implicit def arrayBufferView2ajax(b: ArrayBufferView): InputData = b.asInstanceOf[InputData]

    implicit def blob2ajax(b: Blob): InputData = b.asInstanceOf[InputData]

    implicit def byteBuffer2ajax(data: ByteBuffer): InputData = {
      if (data.hasTypedArray()) {
        // get relevant part of the underlying typed array
        data.typedArray().subarray(data.position, data.limit)
      } else {
        // fall back to copying the data
        val tempBuffer = ByteBuffer.allocateDirect(data.remaining)
        val origPosition = data.position
        tempBuffer.put(data)
        data.position(origPosition)
        tempBuffer.typedArray()
      }
    }
  }

  def get(url: String,
          data: InputData = "",
          timeout: Int = 0,
          headers: Map[String, String] = Map.empty,
          withCredentials: Boolean = false,
          responseType: String = "") = {
    apply("GET", url, data, timeout, headers, withCredentials, responseType)
  }

  def post(url: String,
           data: InputData = "",
           timeout: Int = 0,
           headers: Map[String, String] = Map.empty,
           withCredentials: Boolean = false,
           responseType: String = "") = {
    apply("POST", url, data, timeout, headers, withCredentials, responseType)
  }

  def put(url: String,
          data: InputData = "",
          timeout: Int = 0,
          headers: Map[String, String] = Map.empty,
          withCredentials: Boolean = false,
          responseType: String = "") = {
    apply("PUT", url, data, timeout, headers, withCredentials, responseType)
  }

  def delete(url: String,
             data: InputData = "",
             timeout: Int = 0,
             headers: Map[String, String] = Map.empty,
             withCredentials: Boolean = false,
             responseType: String = "") = {
    apply("DELETE", url, data, timeout, headers, withCredentials, responseType)
  }

  def apply(method: String,
            url: String,
            data: InputData,
            timeout: Int,
            headers: Map[String, String],
            withCredentials: Boolean, 
            responseType: String): Future[dom.XMLHttpRequest] = {
    val req = new dom.XMLHttpRequest()
    val promise = Promise[dom.XMLHttpRequest]()

    req.onreadystatechange = {(e: dom.Event) =>
      if (req.readyState.toInt == 4){
        if ((req.status >= 200 && req.status < 300) || req.status == 304)
          promise.success(req)
        else
          promise.failure(AjaxException(req))
      }
    }
    req.open(method, url)
    req.responseType = responseType
    req.timeout = timeout
    req.withCredentials = withCredentials
    headers.foreach(x => req.setRequestHeader(x._1, x._2))
    req.send(data)
    promise.future
  }
}

/**
 * Wraps [[dom.Storage]] replacing null-returning methods with option-returning ones
 */
sealed class Storage(domStorage: dom.Storage) {
  def length: Int = domStorage.length

  def apply(key: String): Option[String] = Option(domStorage.getItem(key))

  def update(key: String, data: String): Unit = domStorage.setItem(key, data)

  def clear(): Unit = domStorage.clear()

  def remove(key: String): Unit = domStorage.removeItem(key)

  def key(index: Int): Option[String] = Option(domStorage.key(index))
}

object SessionStorage extends Storage(dom.sessionStorage)

object LocalStorage extends Storage(dom.localStorage)

/**
 * W3C recommendation for touch events
 *
 * @see http://www.w3.org/TR/touch-events/
 */
trait TouchEvents extends js.Object {
  /**
   * The touchstart event is fired when a touch point is placed on the touch
   * surface.
   *
   * MDN
   */
  var ontouchstart: js.Function1[raw.TouchEvent, _] = js.native

  /**
   * The touchmove event is fired when a touch point is moved along the touch
   * surface.
   *
   * MDN
   */
  var ontouchmove: js.Function1[raw.TouchEvent, _] = js.native

  /**
   * The touchend event is fired when a touch point is removed from the touch
   * surface.
   *
   * MDN
   */
  var ontouchend: js.Function1[raw.TouchEvent, _] = js.native

  /**
   * The touchcancel event is fired when a touch point has been disrupted in an
   * implementation-specific manner (too many touch points for example).
   *
   * MDN
   */
  var ontouchcancel: js.Function1[raw.TouchEvent, _] = js.native
}

/**
 * Implicits to add touch event handlers to [[raw.HTMLDocument]] and
 * [[raw.Window]].
 *
 * @note Touch events may not be available on all modern browsers. See
 *       http://www.quirksmode.org/mobile/tableTouch.html#t00 for a compatibility
 *       table.
 */
object TouchEvents {
  implicit def HTMLDocumentToTouchEvents(html: raw.HTMLDocument): TouchEvents =
    html.asInstanceOf[TouchEvents]

  implicit def WindowToTouchEvents(window: raw.Window): TouchEvents =
    window.asInstanceOf[TouchEvents]
}
