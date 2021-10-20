/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an
  * SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute.
  */
@js.native
@JSGlobal
class SVGTransform extends js.Object {
  def `type`: Int = js.native

  /** A convenience attribute for SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX and SVG_TRANSFORM_SKEWY. It holds the angle
    * that was specified. For SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE and SVG_TRANSFORM_SCALE, angle will be zero.
    */
  def angle: Double = js.native

  /** The matrix that represents this transformation. The matrix object is live, meaning that any changes made to the
    * SVGTransform object are immediately reflected in the matrix object and vice versa. In case the matrix object is
    * changed directly (i.e., without using the methods on the SVGTransform interface itself) then the type of the
    * SVGTransform changes to SVG_TRANSFORM_MATRIX. For SVG_TRANSFORM_MATRIX, the matrix contains the a, b, c, d, e, f
    * values supplied by the user. For SVG_TRANSFORM_TRANSLATE, e and f represent the translation amounts (a=1, b=0, c=0
    * and d=1). For SVG_TRANSFORM_SCALE, a and d represent the scale amounts (b=0, c=0, e=0 and f=0). For
    * SVG_TRANSFORM_SKEWX and SVG_TRANSFORM_SKEWY, a, b, c and d represent the matrix which will result in the given
    * skew (e=0 and f=0). For SVG_TRANSFORM_ROTATE, a, b, c, d, e and f together represent the matrix which will result
    * in the given rotation. When the rotation is around the center point (0, 0), e and f will be zero.
    */
  def matrix: SVGMatrix = js.native

  /** Sets the transform type to SVG_TRANSFORM_TRANSLATE, with parameters tx and ty defining the translation amounts.
    * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
    * attribute or when the object itself is read only.
    */
  def setTranslate(tx: Double, ty: Double): Unit = js.native

  /** Sets the transform type to SVG_TRANSFORM_SCALE, with parameters sx and sy defining the scale amounts. Exceptions:
    * a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only attribute or
    * when the object itself is read only.
    */
  def setScale(sx: Double, sy: Double): Unit = js.native

  /** Sets the transform type to SVG_TRANSFORM_MATRIX, with parameter matrix defining the new transformation. Note that
    * the values from the parameter matrix are copied. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR
    * is raised when attempting to modify a read only attribute or when the object itself is read only.
    */
  def setMatrix(matrix: SVGMatrix): Unit = js.native

  /** Sets the transform type to SVG_TRANSFORM_SKEWY, with parameter angle defining the amount of skew. Exceptions: a
    * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only attribute or
    * when the object itself is read only.
    */
  def setSkewY(angle: Double): Unit = js.native

  /** Sets the transform type to SVG_TRANSFORM_ROTATE, with parameter angle defining the rotation angle and parameters
    * cx and cy defining the optional center of rotation. Exceptions: a DOMException with code
    * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only attribute or when the object itself is
    * read only.
    */
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native

  /** Sets the transform type to SVG_TRANSFORM_SKEWX, with parameter angle defining the amount of skew. Exceptions: a
    * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only attribute or
    * when the object itself is read only.
    */
  def setSkewX(angle: Double): Unit = js.native
}

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an
  * SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute.
  */
@js.native
@JSGlobal
object SVGTransform extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTransform),List())))) */
  val SVG_TRANSFORM_SKEWX: Int = js.native

  /** The unit type is not one of predefined unit types. It is invalid to attempt to define a new value of this type or
    * to attempt to switch an existing value to this type.
    */
  val SVG_TRANSFORM_UNKNOWN: Int = js.native
  val SVG_TRANSFORM_SCALE: Int = js.native
  val SVG_TRANSFORM_TRANSLATE: Int = js.native
  val SVG_TRANSFORM_MATRIX: Int = js.native
  val SVG_TRANSFORM_ROTATE: Int = js.native
  val SVG_TRANSFORM_SKEWY: Int = js.native
}
