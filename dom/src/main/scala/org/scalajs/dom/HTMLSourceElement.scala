/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLSourceElement interface provides special properties (beyond the regular HTMLElement object interface it also
  * has available to it by inheritance) for manipulating &lt;source&gt; elements.
  */
@js.native
@JSGlobal
abstract class HTMLSourceElement extends HTMLElement {

  /** Reflects the src HTML attribute, containing the URL for the media resource. */
  var src: String = js.native

  /** Reflects the media HTML attribute, containing the intended type of the media resource. */
  var media: String = js.native
  var `type`: String = js.native
}
