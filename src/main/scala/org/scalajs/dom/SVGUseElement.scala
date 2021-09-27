/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGUseElement interface provides access to the properties of &lt;use&gt; elements, as well as methods to
  * manipulate them.
  */
@js.native
@JSGlobal
abstract class SVGUseElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired with SVGURIReference {

  /** Corresponds to attribute y on the given &lt;use&gt; element. */
  def y: SVGAnimatedLength = js.native

  /** Corresponds to attribute width on the given &lt;use&gt; element. */
  def width: SVGAnimatedLength = js.native

  /** If the xlink:href attribute is being animated, contains the current animated root of the instance tree. If the
    * xlink:href attribute is not currently being animated, contains the same value as instanceRoot. See description of
    * SVGElementInstance to learn more about the instance tree.
    */
  def animatedInstanceRoot: SVGElementInstance = js.native

  /** The root of the instance tree. See description of SVGElementInstance to learn more about the instance tree. */
  def instanceRoot: SVGElementInstance = js.native

  /** Corresponds to attribute x on the given &lt;use&gt; element. */
  def x: SVGAnimatedLength = js.native

  /** Corresponds to attribute height on the given &lt;use&gt; element. */
  def height: SVGAnimatedLength = js.native
}
