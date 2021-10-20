/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement. */
@js.native
@JSGlobal
abstract class SVGGradientElement
    extends SVGElement with SVGUnitTypes with SVGStylable with SVGExternalResourcesRequired with SVGURIReference {

  /** Corresponds to attribute spreadMethod on the given element. One of the Spread Method Types defined on this
    * interface.
    */
  def spreadMethod: SVGAnimatedEnumeration = js.native

  /** Corresponds to attribute gradientTransform on the given element. */
  def gradientTransform: SVGAnimatedTransformList = js.native

  /** Corresponds to attribute gradientUnits on the given element. Takes one of the constants defined in SVGUnitTypes.
    */
  def gradientUnits: SVGAnimatedEnumeration = js.native
}

/** The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement. */
@js.native
@JSGlobal
object SVGGradientElement extends js.Object {
  val SVG_SPREADMETHOD_REFLECT: Int = js.native
  val SVG_SPREADMETHOD_PAD: Int = js.native

  /** The type is not one of predefined types. It is invalid to attempt to define a new value of this type or to attempt
    * to switch an existing value to this type.
    */
  val SVG_SPREADMETHOD_UNKNOWN: Int = js.native
  val SVG_SPREADMETHOD_REPEAT: Int = js.native
}
