/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLQuoteElement interface provides special properties and methods (beyond the regular HTMLElement interface it
  * also has available to it by inheritance) for manipulating quoting elements, like &lt;blockquote&gt; and &lt;q&gt;,
  * but not the &lt;cite&gt; element.
  */
@js.native
@JSGlobal
abstract class HTMLQuoteElement extends HTMLElement {
  var dateTime: String = js.native

  /** Reflects the cite HTML attribute, containing a URL for the source of the quotation. */
  var cite: String = js.native
}
