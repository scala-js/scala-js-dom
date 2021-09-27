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
abstract class SVGFEDisplacementMapElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in2: SVGAnimatedString = js.native

  def xChannelSelector: SVGAnimatedEnumeration = js.native

  def yChannelSelector: SVGAnimatedEnumeration = js.native

  def scale: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
object SVGFEDisplacementMapElement extends js.Object {
  val SVG_CHANNEL_B: Int = js.native
  val SVG_CHANNEL_R: Int = js.native
  val SVG_CHANNEL_G: Int = js.native
  val SVG_CHANNEL_UNKNOWN: Int = js.native
  val SVG_CHANNEL_A: Int = js.native
}
