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
abstract class SVGFEBlendElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in2: SVGAnimatedString = js.native

  def mode: SVGAnimatedEnumeration = js.native

  def in1: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
object SVGFEBlendElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEBlendElement),List())))) */
  val SVG_FEBLEND_MODE_DARKEN: Int = js.native
  val SVG_FEBLEND_MODE_UNKNOWN: Int = js.native
  val SVG_FEBLEND_MODE_MULTIPLY: Int = js.native
  val SVG_FEBLEND_MODE_NORMAL: Int = js.native
  val SVG_FEBLEND_MODE_SCREEN: Int = js.native
  val SVG_FEBLEND_MODE_LIGHTEN: Int = js.native
}
