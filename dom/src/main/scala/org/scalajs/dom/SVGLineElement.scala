/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGLineElement interface provides access to the properties of &lt;line&gt; elements, as well as methods to
  * manipulate them.
  */
@js.native
@JSGlobal
abstract class SVGLineElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired {

  /** Corresponds to attribute y1 on the given &lt;line&gt; element. */
  def y1: SVGAnimatedLength = js.native

  /** Corresponds to attribute x2 on the given &lt;line&gt; element. */
  def x2: SVGAnimatedLength = js.native

  /** Corresponds to attribute x1 on the given &lt;line&gt; element. */
  def x1: SVGAnimatedLength = js.native

  /** Corresponds to attribute y2 on the given &lt;line&gt; element. */
  def y2: SVGAnimatedLength = js.native
}
