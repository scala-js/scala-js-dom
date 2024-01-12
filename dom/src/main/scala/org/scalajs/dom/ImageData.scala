/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import js.typedarray.Uint8ClampedArray

/** The ImageData interface represents the underlying pixel data of an area of a &lt;canvas&gt; element. It is created
  * using creators on the CanvasRenderingContext2D object associated with the canvas createImageData() and
  * getImageData()). It can also be used to set a part of the canvas (like with putImageData()).
  */
@js.native
@JSGlobal
class ImageData extends js.Object {

  /** Create an ImageData instance from an array of pixel data and a width.
    * @param data
    *   pixel data
    * @param width
    *   width in pixels
    */
  def this(data: Uint8ClampedArray, width: Int) = this()

  /** Create an ImageData instance from an array of pixel data, width, and height.
    * @param data
    *   pixel data
    * @param width
    *   width in pixels
    * @param height
    *   height in pixels
    */
  def this(data: Uint8ClampedArray, width: Int, height: Int) = this()

  /** Create a blank ImageData instance from specified width and height.
    * @param width
    *   width in pixels
    * @param height
    *   height in pixels
    */
  def this(width: Int, height: Int) = this()

  /** Create a blank ImageData instance from specified width, height, and settings object.
    * @param width
    *   width in pixels
    * @param height
    *   height in pixels
    * @param settings
    *   image settings
    */
  def this(width: Int, height: Int, settings: ImageSettings) = this()

  /** Create a blank ImageData instance from specified pixel data, width, height, and settings object.
    * @param data
    *   pixel data
    * @param width
    *   width in pixels
    * @param height
    *   height in pixels
    * @param settings
    *   image settings
    */
  def this(data: Uint8ClampedArray, width: Int, height: Int, settings: ImageSettings) = this()

  /** Is an unsigned long representing the actual width, in pixels, of the ImageData. */
  def width: Int = js.native

  /** Is a Uint8ClampedArray representing a one-dimensional array containing the data in the RGBA order, with integer
    * values between 0 and 255 (included).
    */
  def data: Uint8ClampedArray = js.native

  /** Is an unsigned long representing the actual height, in pixels, of the ImageData. */
  def height: Int = js.native

}
