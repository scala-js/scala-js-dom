/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLMapElement interface provides special properties and methods (beyond those of the regular object HTMLElement
  * interface it also has available to it by inheritance) for manipulating the layout and presentation of map elements.
  */
@js.native
@JSGlobal
abstract class HTMLMapElement extends HTMLElement {

  /** Is a DOMString representing the &lt;map&gt; element for referencing it other context. If the id attribute is set,
    * this must have the same value; and it cannot be null or empty.
    */
  var name: String = js.native
}
