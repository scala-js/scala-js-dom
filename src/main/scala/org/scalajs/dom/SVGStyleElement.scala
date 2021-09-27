/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGStyleElement interface corresponds to the SVG &lt;style&gt; element. */
@js.native
@JSGlobal
abstract class SVGStyleElement extends SVGElement with SVGLangSpace {

  /** Corresponds to attribute media on the given element. A DOMException is raised with code
    * NO_MODIFICATION_ALLOWED_ERR on an attempt to change the value of a read only attribute.
    */
  var media: String = js.native

  def `type`: String = js.native

  /** Corresponds to attribute title on the given element. A DOMException is raised with code
    * NO_MODIFICATION_ALLOWED_ERR on an attempt to change the value of a read only attribute.
    */
  var title: String = js.native
}
