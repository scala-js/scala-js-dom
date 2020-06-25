package org.scalajs.dom.raw

import org.scalajs.dom.experimental.{RequestInfo, RequestInit, Response}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait WindowOrWorkerGlobalScope extends js.Object {

  def caches: js.Any = js.native
  def crossOriginIsolated: Boolean = js.native
  def isSecureContext: Boolean = js.native
  def origin: String = js.native

  type indexedDB = org.scalajs.dom.raw.IDBFactory

  /**
   * Starts the process of fetching a resource from the network.
   *
   * MDN
   */
  def fetch(info: RequestInfo,
      init: RequestInit = null): js.Promise[Response] = js.native

  /**
   * Enqueues a microtask—a short function to be executed after execution of
   * the JavaScript code completes and control isn't being returned to a
   * JavaScript caller, but before handling callbacks and other tasks.
   *
   * This lets your code run without interfering with other, possibly higher
   * priority, code, but before the browser runtime regains control,
   * potentially depending upon the work you need to complete.
   *
   * MDN
   */
  def queueMicrotask(function: js.Function): Unit = js.native

  /**
   * Creates a base-64 encoded ASCII string from a "string" of binary data.
   */
  def btoa(rawString: String): String = js.native

  /**
   * Decodes a string of data which has been encoded using base-64 encoding.
   */
  def atob(encodedString: String): String = js.native

  /**
   * Clears the delay set by window.setTimeout().
   *
   * MDN
   */
  def clearTimeout(handle: Int): Unit = js.native

  /**
   * Calls a function or executes a code snippet after a specified delay.
   *
   * MDN
   */
  def setTimeout(handler: js.Function0[Any], timeout: Double): Int = js.native

  /**
   * Cancels repeated action which was set up using setInterval.
   *
   * MDN
   */
  def clearInterval(handle: Int): Unit = js.native

  /**
   * Calls a function or executes a code snippet repeatedly, with a fixed time
   * delay between each call to that function.
   *
   * MDN
   */
  def setInterval(handler: js.Function0[Any], timeout: Double): Int = js.native

  /**
   * Accepts a variety of different image sources, and returns a Promise which
   * resolves to an ImageBitmap.
   * Optionally the source is cropped to the rectangle of pixels originating at
   * (sx, sy) with width sw, and height sh.
   *
   * MDN
   */
  def createImageBitmap(
      image: HTMLImageElement | SVGImageElement | HTMLVideoElement | HTMLCanvasElement | HTMLCanvasElement | Blob | ImageData | ImageBitmap | OffscreenCanvas): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(
      image: HTMLImageElement | SVGImageElement | HTMLVideoElement | HTMLCanvasElement | HTMLCanvasElement | Blob | ImageData | ImageBitmap | OffscreenCanvas,
      options: CreateImageBitmapOption): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(
      image: HTMLImageElement | SVGImageElement | HTMLVideoElement | HTMLCanvasElement | HTMLCanvasElement | Blob | ImageData | ImageBitmap | OffscreenCanvas,
      sx: Double, sy: Double, sw: Double,
      sh: Double): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(
      image: HTMLImageElement | SVGImageElement | HTMLVideoElement | HTMLCanvasElement | HTMLCanvasElement | Blob | ImageData | ImageBitmap | OffscreenCanvas,
      sx: Double, sy: Double, sw: Double, sh: Double,
      options: CreateImageBitmapOption): js.Promise[ImageBitmap] = js.native
}

trait CreateImageBitmapOption extends js.Object {
  var imageOrientation: js.UndefOr[String] = js.undefined

  var premultiplyAlpha: js.UndefOr[String] = js.undefined

  var colorSpaceConversion: js.UndefOr[String] = js.undefined

  var resizeWidth: js.UndefOr[Double] = js.undefined

  var resizeHeight: js.UndefOr[Double] = js.undefined

  var resizeQuality: js.UndefOr[String] = js.undefined
}

/**
 * The ImageBitmap interface represents a bitmap image which can be drawn to a
 * <canvas> without undue latency.
 * It can be created from a variety of source objects using the
 * createImageBitmap() factory method.
 * ImageBitmap provides an asynchronous and resource efficient pathway to
 * prepare textures for rendering in WebGL.
 *
 * MDN
 */
@js.native
trait ImageBitmap extends js.Object {

  /**
   * An unsigned long representing the height, in CSS pixels, of the ImageData.
   */
  def height: Double = js.native

  /**
   * An unsigned long representing the width, in CSS pixels, of the ImageData.
   */
  def width: Double = js.native
}
