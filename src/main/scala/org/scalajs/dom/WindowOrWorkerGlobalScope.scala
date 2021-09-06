package org.scalajs.dom

import org.scalajs.dom.experimental.cachestorage.CacheStorage
import scala.scalajs.js
import scala.scalajs.js.|

/** The WindowOrWorkerGlobalScope mixin describes several features common to the Window and WorkerGlobalScope
  * interfaces.
  *
  * Note: WindowOrWorkerGlobalScope is a mixin and not an interface; you can't actually create an object of type
  * WindowOrWorkerGlobalScope.
  */
@js.native
trait WindowOrWorkerGlobalScope extends WindowBase64 with WindowTimers {
  import WindowOrWorkerGlobalScope._

  /** Returns the CacheStorage object associated with the current context. This object enables functionality such as
    * storing assets for offline use, and generating custom responses to requests.
    */
  def caches: js.UndefOr[CacheStorage] = js.native

  /** Returns a boolean value that indicates whether a SharedArrayBuffer can be sent via a Window.postMessage() call. */
  def crossOriginIsolated: Boolean = js.native

  /** Provides a mechanism for applications to asynchronously access capabilities of indexed databases. */
  def indexedDB: js.UndefOr[IDBFactory] = js.native

  /** Returns a boolean indicating whether the current context is secure or not. */
  def isSecureContext: Boolean = js.native

  /** Returns the origin of the global scope, serialized as a string. */
  def origin: String = js.native //should be USVString

  /** Starts the process of fetching a resource from the network. */
  def fetch(info: RequestInfo, init: RequestInit = js.native): js.Promise[Response] = js.native

  /** Enqueues a microtask—a short function to be executed after execution of the JavaScript code completes and control
    * isn't being returned to a JavaScript caller, but before handling callbacks and other tasks.
    *
    * This lets your code run without interfering with other, possibly higher priority, code, but before the browser
    * runtime regains control, potentially depending upon the work you need to complete.
    */
  def queueMicrotask(function: js.Function0[Any]): Unit = js.native

  /** Accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap. Optionally
    * the source is cropped to the rectangle of pixels originating at (sx, sy) with width sw, and height sh.
    */
  def createImageBitmap(image: CreateImageBitmapInput): js.Promise[ImageBitmap] = js.native

  def createImageBitmap(image: CreateImageBitmapInput,
      options: CreateImageBitmapOptions): js.Promise[ImageBitmap] = js.native

  def createImageBitmap(image: CreateImageBitmapInput, sx: Double, sy: Double, sw: Double,
      sh: Double): js.Promise[ImageBitmap] = js.native

  def createImageBitmap(image: CreateImageBitmapInput, sx: Double, sy: Double, sw: Double, sh: Double,
      options: CreateImageBitmapOptions): js.Promise[ImageBitmap] = js.native
}

/** The ImageBitmap interface represents a bitmap image which can be drawn to a &lt;canvas&gt; without undue latency. It
  * can be created from a variety of source objects using the createImageBitmap() factory method. ImageBitmap provides
  * an asynchronous and resource efficient pathway to prepare textures for rendering in WebGL.
  */
@js.native
trait ImageBitmap extends js.Object {

  /** An unsigned long representing the height, in CSS pixels, of the ImageData. */
  def height: Double = js.native

  /** An unsigned long representing the width, in CSS pixels, of the ImageData. */
  def width: Double = js.native

  /** Dispose of all graphical resources associated with an ImageBitmap. */
  def close(): Unit = js.native
}

trait CreateImageBitmapOptions extends js.Object {
  var imageOrientation: js.UndefOr[String] = js.undefined
  var premultiplyAlpha: js.UndefOr[String] = js.undefined
  var colorSpaceConversion: js.UndefOr[String] = js.undefined
  var resizeWidth: js.UndefOr[Double] = js.undefined
  var resizeHeight: js.UndefOr[Double] = js.undefined
  var resizeQuality: js.UndefOr[String] = js.undefined
}

object WindowOrWorkerGlobalScope {

  type CreateImageBitmapInput =
    HTMLImageElement | SVGImageElement | HTMLVideoElement | HTMLCanvasElement | HTMLCanvasElement | Blob | ImageData | ImageBitmap | OffscreenCanvas

}
