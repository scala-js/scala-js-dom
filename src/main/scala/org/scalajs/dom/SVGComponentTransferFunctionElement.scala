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
abstract class SVGComponentTransferFunctionElement extends SVGElement {
  def tableValues: SVGAnimatedNumberList = js.native

  def slope: SVGAnimatedNumber = js.native

  def `type`: SVGAnimatedEnumeration = js.native

  def exponent: SVGAnimatedNumber = js.native

  def amplitude: SVGAnimatedNumber = js.native

  def intercept: SVGAnimatedNumber = js.native

  def offset: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
object SVGComponentTransferFunctionElement extends js.Object {
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Int = js.native
}
