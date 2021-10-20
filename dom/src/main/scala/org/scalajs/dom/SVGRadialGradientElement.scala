/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGRadialGradientElement interface corresponds to the &lt;radialgradient&gt; element. */
@js.native
@JSGlobal
class SVGRadialGradientElement extends SVGGradientElement {

  /** Corresponds to attribute cx on the given &lt;radialgradient&gt; element. */
  def cx: SVGAnimatedLength = js.native

  /** Corresponds to attribute r on the given &lt;radialgradient&gt; element. */
  def r: SVGAnimatedLength = js.native

  /** Corresponds to attribute cy on the given &lt;radialgradient&gt; element. */
  def cy: SVGAnimatedLength = js.native

  /** Corresponds to attribute fx on the given &lt;radialgradient&gt; element. */
  def fx: SVGAnimatedLength = js.native

  /** Corresponds to attribute fy on the given &lt;radialgradient&gt; element. */
  def fy: SVGAnimatedLength = js.native
}
