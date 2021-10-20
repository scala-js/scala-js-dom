/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The ImageData interface represents the underlying pixel data of an area of a &lt;canvas&gt; element. It is created
  * using creators on the CanvasRenderingContext2D object associated with the canvas createImageData() and
  * getImageData()). It can also be used to set a part of the canvas (like with putImageData()).
  */
@js.native
@JSGlobal
class ImageData extends js.Object {

  /** Is an unsigned long representing the actual width, in pixels, of the ImageData. */
  def width: Int = js.native

  /** Is a Uint8ClampedArray representing a one-dimensional array containing the data in the RGBA order, with integer
    * values between 0 and 255 (included).
    */
  def data: js.Array[Int] = js.native

  /** Is an unsigned long representing the actual height, in pixels, of the ImageData. */
  def height: Int = js.native
}
