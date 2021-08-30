package org.scalajs.dom.ext

import java.nio.ByteBuffer
import org.scalajs.dom
import org.scalajs.dom.{Blob, FormData, KeyboardEvent}
import scala.concurrent.{Future, Promise}
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.typedarray.ArrayBufferView
import scala.scalajs.js.typedarray.TypedArrayBufferOps._

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
        data.typedArray().subarray(data.position, data.limit)
      } else {
        // fall back to copying the data
        val tempBuffer = ByteBuffer.allocateDirect(data.remaining)
        val origPosition = data.position()
        tempBuffer.put(data)
        data.position(origPosition)
        tempBuffer.typedArray()
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
