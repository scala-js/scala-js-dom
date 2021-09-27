/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGDefsElement interface corresponds to the &lt;defs&gt; element. */
@js.native
@JSGlobal
abstract class SVGDefsElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired
