package org.scalajs.dom

import scala.scalajs.js

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
