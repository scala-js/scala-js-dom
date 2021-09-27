/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGEllipseElement interface provides access to the properties of &lt;ellipse&gt; elements, as well as methods to
  * manipulate them.
  */
@js.native
@JSGlobal
abstract class SVGEllipseElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired {

  /** Corresponds to attribute ry on the given &lt;ellipse&gt; element. */
  def ry: SVGAnimatedLength = js.native

  /** Corresponds to attribute cx on the given &lt;ellipse&gt; element. */
  def cx: SVGAnimatedLength = js.native

  /** Corresponds to attribute rx on the given &lt;ellipse&gt; element. */
  def rx: SVGAnimatedLength = js.native

  /** Corresponds to attribute cy on the given &lt;ellipse&gt; element. */
  def cy: SVGAnimatedLength = js.native
}
