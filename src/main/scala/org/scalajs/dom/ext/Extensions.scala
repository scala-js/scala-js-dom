package org.scalajs.dom.ext

import java.nio.ByteBuffer

import scala.language.implicitConversions
import scala.concurrent.{Promise, Future}

import scala.scalajs.js
import scala.scalajs.js.typedarray._
import scala.scalajs.js.typedarray.TypedArrayBufferOps._

import org.scalajs.dom
import org.scalajs.dom.{FormData, html, raw}
import org.scalajs.dom.raw.{Blob, KeyboardEvent}

/**
 * Used to extend out javascript *Collections to make them usable as normal
 * Scala Seq[*]s
 */
class EasySeq[T](jsLength: Int, jsApply: Int => T)
    extends scala.collection.Seq[T] {

  def length = jsLength

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

  def toHex: String = f"#$r%02x$g%02x$b%02x"

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
      case RGB(r, g, b)      => Color(r.toInt, g.toInt, b.toInt)
      case ShortHex(r, g, b) => Color(hex(r) * 16, hex(g) * 16, hex(b) * 16)
      case LongHex(r, g, b)  => Color(hex(r), hex(g), hex(b))
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
    val img = dom.document.createElement("img").asInstanceOf[html.Image]

    img.src = "data:image/svg+xml;base64," + s
    img
  }
}

/**
 * A list of the codes returned by KeyEvents.
 */
object KeyCode {
  final val Backspace = 8
  final val Tab = 9
  final val Enter = 13
  final val Shift = 16
  final val Ctrl = 17
  final val Alt = 18
  final val Pause = 19
  final val CapsLock = 20
  final val Escape = 27
  final val Space = 32
  final val PageUp = 33
  final val PageDown = 34
  final val End = 35
  final val Home = 36
  final val Left = 37
  final val Up = 38
  final val Right = 39
  final val Down = 40
  final val Insert = 45
  final val Delete = 46
  final val Num0 = 48
  final val Num1 = 49
  final val Num2 = 50
  final val Num3 = 51
  final val Num4 = 52
  final val Num5 = 53
  final val Num6 = 54
  final val Num7 = 55
  final val Num8 = 56
  final val Num9 = 57
  final val A = 65
  final val B = 66
  final val C = 67
  final val D = 68
  final val E = 69
  final val F = 70
  final val G = 71
  final val H = 72
  final val I = 73
  final val J = 74
  final val K = 75
  final val L = 76
  final val M = 77
  final val N = 78
  final val O = 79
  final val P = 80
  final val Q = 81
  final val R = 82
  final val S = 83
  final val T = 84
  final val U = 85
  final val V = 86
  final val W = 87
  final val X = 88
  final val Y = 89
  final val Z = 90
  final val F1 = 112
  final val F2 = 113
  final val F3 = 114
  final val F4 = 115
  final val F5 = 116
  final val F6 = 117
  final val F7 = 118
  final val F8 = 119
  final val F9 = 120
  final val F10 = 121
  final val F11 = 122
  final val F12 = 123
}

/** Aliases for DOM_KEY_LOCATION_* constants from [[KeyboardEvent]] */
object KeyLocation {
  final val Standard = KeyboardEvent.DOM_KEY_LOCATION_STANDARD
  final val Left = KeyboardEvent.DOM_KEY_LOCATION_LEFT
  final val Right = KeyboardEvent.DOM_KEY_LOCATION_RIGHT
  final val NumPad = KeyboardEvent.DOM_KEY_LOCATION_NUMPAD
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
  @js.native
  sealed trait InputData extends js.Any

  object InputData {
    implicit def str2ajax(s: String): InputData = s.asInstanceOf[InputData]

    implicit def arrayBufferView2ajax(b: ArrayBufferView): InputData =
      b.asInstanceOf[InputData]

    implicit def blob2ajax(b: Blob): InputData = b.asInstanceOf[InputData]

    implicit def formdata2ajax(b: FormData): InputData =
      b.asInstanceOf[InputData]

    implicit def byteBuffer2ajax(data: ByteBuffer): InputData = {
      if (data.hasTypedArray()) {
        // get relevant part of the underlying typed array
        // val typedArray = data.typedArray()
        // typedArray.subarray(data.position, data.limit)
        js.Object().asInstanceOf[InputData]
      } else {
        // fall back to copying the data
        // val tempBuffer = ByteBuffer.allocateDirect(data.remaining)
        // val origPosition = data.position()
        // tempBuffer.put(data)
        // data.position(origPosition)
        // tempBuffer.typedArray()
        js.Object().asInstanceOf[InputData]
      }
    }
  }

  def get(url: String, data: InputData = null, timeout: Int = 0,
      headers: Map[String, String] = Map.empty,
      withCredentials: Boolean = false, responseType: String = "") = {
    apply("GET", url, data, timeout, headers, withCredentials, responseType)
  }

  def post(url: String, data: InputData = null, timeout: Int = 0,
      headers: Map[String, String] = Map.empty,
      withCredentials: Boolean = false, responseType: String = "") = {
    apply("POST", url, data, timeout, headers, withCredentials, responseType)
  }

  def put(url: String, data: InputData = null, timeout: Int = 0,
      headers: Map[String, String] = Map.empty,
      withCredentials: Boolean = false, responseType: String = "") = {
    apply("PUT", url, data, timeout, headers, withCredentials, responseType)
  }

  def patch(url: String, data: InputData = null, timeout: Int = 0,
      headers: Map[String, String] = Map.empty,
      withCredentials: Boolean = false, responseType: String = "") = {
    apply("PATCH", url, data, timeout, headers, withCredentials, responseType)
  }

  def delete(url: String, data: InputData = null, timeout: Int = 0,
      headers: Map[String, String] = Map.empty,
      withCredentials: Boolean = false, responseType: String = "") = {
    apply("DELETE", url, data, timeout, headers, withCredentials, responseType)
  }

  def apply(method: String, url: String, data: InputData, timeout: Int,
      headers: Map[String, String], withCredentials: Boolean,
      responseType: String): Future[dom.XMLHttpRequest] = {
    val req = new dom.XMLHttpRequest()
    val promise = Promise[dom.XMLHttpRequest]()

    req.onreadystatechange = { (e: dom.Event) =>
      if (req.readyState == 4) {
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
    if (data == null)
      req.send()
    else
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

object SessionStorage extends Storage(dom.window.sessionStorage)

object LocalStorage extends Storage(dom.window.localStorage)

/**
 * W3C recommendation for touch events
 *
 * @see http://www.w3.org/TR/touch-events/
 */
@js.native
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
