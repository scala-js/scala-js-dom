/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGLinearGradientElement interface corresponds to the &lt;lineargradient&gt; element. */
@js.native
@JSGlobal
class SVGLinearGradientElement extends SVGGradientElement {

  /** Corresponds to attribute y1 on the given &lt;lineargradient&gt; element. */
  def y1: SVGAnimatedLength = js.native

  /** Corresponds to attribute x2 on the given &lt;lineargradient&gt; element. */
  def x2: SVGAnimatedLength = js.native

  /** Corresponds to attribute x1 on the given &lt;lineargradient&gt; element. */
  def x1: SVGAnimatedLength = js.native

  /** Corresponds to attribute y2 on the given &lt;lineargradient&gt; element. */
  def y2: SVGAnimatedLength = js.native
}
