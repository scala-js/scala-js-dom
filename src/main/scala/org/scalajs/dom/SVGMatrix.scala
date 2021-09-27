/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Many of SVG's graphics operations utilize 2x3 matrices of the form: */
@js.native
@JSGlobal
class SVGMatrix extends js.Object {
  var e: Double = js.native
  var c: Double = js.native
  var a: Double = js.native
  var b: Double = js.native
  var d: Double = js.native
  var f: Double = js.native

  /** Performs matrix multiplication. This matrix is post-multiplied by another matrix, returning the resulting new
    * matrix.
    */
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = js.native

  /** Post-multiplies the transformation [1 0 0 -1 0 0] and returns the resulting matrix. */
  def flipY(): SVGMatrix = js.native

  /** Post-multiplies a skewY transformation on the current matrix and returns the resulting matrix. */
  def skewY(angle: Double): SVGMatrix = js.native

  /** Return the inverse matrix Exceptions: a DOMException with code SVG_MATRIX_NOT_INVERTABLE is raised if the matrix
    * is not invertable.
    */
  def inverse(): SVGMatrix = js.native

  /** Post-multiplies a non-uniform scale transformation on the current matrix and returns the resulting matrix. */
  def scaleNonUniform(scaleFactorX: Double, scaleFactorY: Double): SVGMatrix = js.native

  /** Post-multiplies a rotation transformation on the current matrix and returns the resulting matrix. */
  def rotate(angle: Double): SVGMatrix = js.native

  /** Post-multiplies the transformation [-1 0 0 1 0 0] and returns the resulting matrix. */
  def flipX(): SVGMatrix = js.native

  /** Post-multiplies a translation transformation on the current matrix and returns the resulting matrix. */
  def translate(x: Double, y: Double): SVGMatrix = js.native

  /** Post-multiplies a uniform scale transformation on the current matrix and returns the resulting matrix. */
  def scale(scaleFactor: Double): SVGMatrix = js.native

  /** Post-multiplies a rotation transformation on the current matrix and returns the resulting matrix. The rotation
    * angle is determined by taking (+/-) atan(y/x). The direction of the vector (x, y) determines whether the positive
    * or negative angle value is used. Exceptions: a DOMException with code SVG_INVALID_VALUE_ERR is raised if one of
    * the parameters has an invalid value.
    */
  def rotateFromVector(x: Double, y: Double): SVGMatrix = js.native

  /** Post-multiplies a skewX transformation on the current matrix and returns the resulting matrix. */
  def skewX(angle: Double): SVGMatrix = js.native
}
