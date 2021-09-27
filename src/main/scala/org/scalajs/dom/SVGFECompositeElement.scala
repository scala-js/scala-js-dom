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
abstract class SVGFECompositeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def operator: SVGAnimatedEnumeration = js.native

  def in2: SVGAnimatedString = js.native

  def k2: SVGAnimatedNumber = js.native

  def k1: SVGAnimatedNumber = js.native

  def k3: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native

  def k4: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
object SVGFECompositeElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFECompositeElement),List())))) */
  val SVG_FECOMPOSITE_OPERATOR_OUT: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_OVER: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_XOR: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_IN: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_ATOP: Int = js.native
}
