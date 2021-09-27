/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGClipPathElement interface provides access to the properties of &lt;clippath&gt; elements, as well as methods
  * to manipulate them.
  */
@js.native
@JSGlobal
abstract class SVGClipPathElement
    extends SVGElement with SVGUnitTypes with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired {

  /** Corresponds to attribute clipPathUnits on the given &lt;clippath&gt; element. Takes one of the constants defined
    * in SVGUnitTypes
    */
  def clipPathUnits: SVGAnimatedEnumeration = js.native
}
