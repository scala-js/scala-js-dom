/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGImageElement interface corresponds to the &lt;image&gt; element. */
@js.native
@JSGlobal
abstract class SVGImageElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired with SVGURIReference {

  /** Corresponds to attribute y on the given &lt;image&gt; element. */
  def y: SVGAnimatedLength = js.native

  /** Corresponds to attribute width on the given &lt;image&gt; element. */
  def width: SVGAnimatedLength = js.native

  /** Corresponds to attribute preserveAspectRatio on the given &lt;image&gt; element. */
  def preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native

  /** Corresponds to attribute x on the given &lt;image&gt; element. */
  def x: SVGAnimatedLength = js.native

  /** Corresponds to attribute height on the given &lt;image&gt; element. */
  def height: SVGAnimatedLength = js.native
}
