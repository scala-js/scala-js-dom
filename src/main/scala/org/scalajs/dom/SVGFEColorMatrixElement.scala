/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
abstract class SVGFEColorMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in1: SVGAnimatedString = js.native

  def `type`: SVGAnimatedEnumeration = js.native

  def values: SVGAnimatedNumberList = js.native
}

@js.native
@JSGlobal
object SVGFEColorMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEColorMatrixElement),List())))) */
  val SVG_FECOLORMATRIX_TYPE_SATURATE: Int = js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Int = js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: Int = js.native
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Int = js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Int = js.native
}
