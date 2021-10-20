/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGStopElement interface corresponds to the &lt;stop&gt; element. */
@js.native
@JSGlobal
abstract class SVGStopElement extends SVGElement with SVGStylable {

  /** Corresponds to attribute offset on the given &lt;stop&gt; element. */
  var offset: SVGAnimatedNumber = js.native
}
