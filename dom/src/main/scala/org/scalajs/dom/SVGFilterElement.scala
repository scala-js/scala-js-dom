/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGFilterElement interface provides access to the properties of &lt;filter&gt; elements, as well as methods to
  * manipulate them.
  */
@js.native
@JSGlobal
abstract class SVGFilterElement
    extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGURIReference
    with SVGExternalResourcesRequired {

  /** Corresponds to attribute y on the given &lt;filter&gt; element. */
  def y: SVGAnimatedLength = js.native

  /** Corresponds to attribute width on the given &lt;filter&gt; element. */
  def width: SVGAnimatedLength = js.native

  /** Contains the X component of attribute filterRes on the given &lt;filter&gt; element. */
  def filterResX: SVGAnimatedInteger = js.native

  /** Corresponds to attribute filterUnits on the given &lt;filter&gt; element. Takes one of the constants defined in
    * SVGUnitTypes.
    */
  def filterUnits: SVGAnimatedEnumeration = js.native

  /** Corresponds to attribute primitiveUnits on the given &lt;filter&gt; element. Takes one of the constants defined in
    * SVGUnitTypes.
    */
  def primitiveUnits: SVGAnimatedEnumeration = js.native

  /** Corresponds to attribute x on the given &lt;filter&gt; element. */
  def x: SVGAnimatedLength = js.native

  /** Corresponds to attribute height on the given &lt;filter&gt; element. */
  def height: SVGAnimatedLength = js.native

  /** Contains the Y component of attribute filterRes on the given &lt;filter&gt; element. */
  def filterResY: SVGAnimatedInteger = js.native

  /** Sets the values for attribute filterRes. */
  def setFilterRes(filterResX: Double, filterResY: Double): Unit = js.native
}
