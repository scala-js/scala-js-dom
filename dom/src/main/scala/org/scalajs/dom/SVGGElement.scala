/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGGElement interface corresponds to the &lt;g&gt; element. */
@js.native
@JSGlobal
abstract class SVGGElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired
