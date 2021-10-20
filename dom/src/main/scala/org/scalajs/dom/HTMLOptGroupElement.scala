/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLOptGroupElement interface provides special properties and methods (beyond the regular HTMLElement object
  * interface they also have available to them by inheritance) for manipulating the layout and presentation of
  * &lt;optgroup&gt; elements.
  */
@js.native
@JSGlobal
abstract class HTMLOptGroupElement extends HTMLElement {

  /** Set or get the label for the group. */
  var label: String = js.native

  /** If true, the whole list of children &lt;option&gt; is disabled */
  var disabled: Boolean = js.native
}
