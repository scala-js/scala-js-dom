/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** HTMLCollection is an interface representing a generic collection of elements (in document order) and offers methods
  * and properties for traversing the list.
  */
@js.native
@JSGlobal
abstract class HTMLCollection extends DOMList[Element] {
  def item(index: Int): Element = js.native

  /** Returns the specific node whose ID or, as a fallback, name matches the string specified by name. Matching by name
    * is only done as a last resort, only in HTML, and only if the referenced element supports the name attribute.
    * Returns null if no node exists by the given name.
    */
  def namedItem(name: String): Element = js.native
}
