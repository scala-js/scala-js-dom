/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLOptionsCollection interface represents a collection of <option> HTML elements (in document order) and offers
  * methods and properties for selecting from the list as well as optionally altering its items. This object is returned
  * only by the options property of select.
  */
@js.native
@JSGlobal
class HTMLOptionsCollection private[this] () extends HTMLCollection {
  override def item(index: Int): HTMLOptionElement = js.native

  /** Returns the specific node whose ID or, as a fallback, name matches the string specified by name. Matching by name
    * is only done as a last resort, only in HTML, and only if the referenced element supports the name attribute.
    * Returns null if no node exists by the given name.
    */
  override def namedItem(name: String): HTMLOptionElement = js.native
}
