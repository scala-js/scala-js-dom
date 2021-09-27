/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGPatternElement interface corresponds to the &lt;pattern&gt; element. */
@js.native
@JSGlobal
abstract class SVGPatternElement
    extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGFitToViewBox
    with SVGExternalResourcesRequired with SVGURIReference {

  /** Corresponds to attribute patternUnits on the given &lt;pattern&gt; element. Takes one of the constants defined in
    * SVGUnitTypes.
    */
  def patternUnits: SVGAnimatedEnumeration = js.native

  /** Corresponds to attribute y on the given &lt;pattern&gt; element. */
  def y: SVGAnimatedLength = js.native

  /** Corresponds to attribute width on the given &lt;pattern&gt; element. */
  def width: SVGAnimatedLength = js.native

  /** Corresponds to attribute x on the given &lt;pattern&gt; element. */
  def x: SVGAnimatedLength = js.native

  /** Corresponds to attribute patternContentUnits on the given &lt;pattern&gt; element. Takes one of the constants
    * defined in SVGUnitTypes.
    */
  def patternContentUnits: SVGAnimatedEnumeration = js.native

  /** Corresponds to attribute patternTransform on the given &lt;pattern&gt; element. */
  def patternTransform: SVGAnimatedTransformList = js.native

  /** Corresponds to attribute height on the given &lt;pattern&gt; element. */
  def height: SVGAnimatedLength = js.native
}
