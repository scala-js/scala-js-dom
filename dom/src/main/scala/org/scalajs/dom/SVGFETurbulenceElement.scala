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
abstract class SVGFETurbulenceElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def baseFrequencyX: SVGAnimatedNumber = js.native

  def numOctaves: SVGAnimatedInteger = js.native

  def `type`: SVGAnimatedEnumeration = js.native

  def baseFrequencyY: SVGAnimatedNumber = js.native

  def stitchTiles: SVGAnimatedEnumeration = js.native

  def seed: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
object SVGFETurbulenceElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFETurbulenceElement),List())))) */
  val SVG_STITCHTYPE_UNKNOWN: Int = js.native
  val SVG_STITCHTYPE_NOSTITCH: Int = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Int = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Int = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Int = js.native
  val SVG_STITCHTYPE_STITCH: Int = js.native
}
