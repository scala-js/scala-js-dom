/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The NonDocumentTypeChildNode interface contains methods that are particular to Node objects that can have a parent,
  * but not suitable for DocumentType.
  *
  * NonDocumentTypeChildNode is a raw interface and no object of this type can be created; it is implemented by Element,
  * and CharacterData objects.
  *
  * https://developer.mozilla.org/en-US/docs/Web/API/NonDocumentTypeChildNode
  */
@js.native
trait NonDocumentTypeChildNode extends js.Object {

  /** The previousElementSibling read-only property returns the Element immediately prior to the specified one in its
    * parent's children list, or null if the specified element is the first one in the list.
    */
  def previousElementSibling: Element = js.native

  /** The nextElementSibling read-only property returns the element immediately following the specified one in its
    * parent's children list, or null if the specified element is the last one in the list.
    */
  def nextElementSibling: Element = js.native
}
