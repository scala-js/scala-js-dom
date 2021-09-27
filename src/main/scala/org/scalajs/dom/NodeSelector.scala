/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait NodeSelector extends js.Object {

  /** Returns a list of the elements within the document (using depth-first pre-order traversal of the document's nodes)
    * that match the specified group of selectors.
    */
  def querySelectorAll(selectors: String): NodeList[Element] = js.native

  /** Returns the first element within the document (using depth-first pre-order traversal of the document's nodes) that
    * matches the specified group of selectors.
    */
  def querySelector(selectors: String): Element = js.native
}
