package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The OffscreenCanvas interface provides a canvas that can be rendered off screen. It is available in both the window
  * and worker contexts.
  */
@js.native
@JSGlobal
class OffscreenCanvas(var width: Double, var height: Double) extends js.Object {

  /** Returns a rendering context for the offscreen canvas. */
  def getContext(contextType: String): js.Dynamic = js.native
  def getContext(contextType: String, contextAttributes: WebGLContextAttributes): js.Dynamic = js.native
  def getContext(contextType: String, contextAttributes: TwoDContextAttributes): js.Dynamic = js.native

  /** Creates a Blob object representing the image contained in the canvas. */
  def convertToBlob(options: ConvertToBlobOptions = js.native): js.Promise[Blob] = js.native

  /** Creates an ImageBitmap object from the most recently rendered image of the OffscreenCanvas. */
  def transferToImageBitmap(): ImageBitmap = js.native
}
