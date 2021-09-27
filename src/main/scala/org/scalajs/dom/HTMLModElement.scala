/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLModElement interface provides special properties (beyond the regular methods and properties available
  * through the HTMLElement interface they also have available to them by inheritance) for manipulating modification
  * elements, that is &lt;del&gt; and &lt;ins&gt;.
  */
@js.native
@JSGlobal
abstract class HTMLModElement extends HTMLElement {
  var dateTime: String = js.native

  /** Reflects the cite HTML attribute, containing a URI of a resource explaining the change. */
  var cite: String = js.native
}
