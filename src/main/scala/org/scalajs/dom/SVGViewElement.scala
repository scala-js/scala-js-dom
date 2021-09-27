/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGViewElement interface provides access to the properties of &lt;view&gt; elements, as well as methods to
  * manipulate them.
  */
@js.native
@JSGlobal
abstract class SVGViewElement
    extends SVGElement with SVGZoomAndPan with SVGFitToViewBox with SVGExternalResourcesRequired {

  /** Corresponds to attribute viewTarget on the given &lt;view&gt; element. A list of DOMString values which contain
    * the names listed in the viewTarget attribute. Each of the DOMString values can be associated with the
    * corresponding element using the getElementById() method call.
    */
  def viewTarget: SVGStringList = js.native
}
