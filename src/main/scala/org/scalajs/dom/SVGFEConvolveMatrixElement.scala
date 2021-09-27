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
object SVGFEConvolveMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEConvolveMatrixElement),List())))) */
  val SVG_EDGEMODE_WRAP: Int = js.native
  val SVG_EDGEMODE_DUPLICATE: Int = js.native
  val SVG_EDGEMODE_UNKNOWN: Int = js.native
  val SVG_EDGEMODE_NONE: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGFEConvolveMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def orderY: SVGAnimatedInteger = js.native

  def kernelUnitLengthY: SVGAnimatedNumber = js.native

  def orderX: SVGAnimatedInteger = js.native

  def preserveAlpha: SVGAnimatedBoolean = js.native

  def kernelMatrix: SVGAnimatedNumberList = js.native

  def edgeMode: SVGAnimatedEnumeration = js.native

  def kernelUnitLengthX: SVGAnimatedNumber = js.native

  def bias: SVGAnimatedNumber = js.native

  def targetX: SVGAnimatedInteger = js.native

  def targetY: SVGAnimatedInteger = js.native

  def divisor: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native
}
