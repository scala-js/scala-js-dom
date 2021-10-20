/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGNumberList defines a list of SVGNumber objects. */
@js.native
@JSGlobal
class SVGNumberList extends js.Object {
  def numberOfItems: Int = js.native

  /** Replaces an existing item in the list with a new item. If newItem is already in a list, it is removed from its
    * previous list before it is inserted into this list. The inserted item is the item itself and not a copy. If the
    * item is already in this list, note that the index of the item to replace is before the removal of the item.
    * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read
    * only attribute or when the object itself is read only. a DOMException with code INDEX_SIZE_ERR is raised if the
    * index number is greater than or equal to numberOfItems.
    */
  def replaceItem(newItem: SVGNumber, index: Int): SVGNumber = js.native

  /** Returns the specified item from the list. The returned item is the item itself and not a copy. Any changes made to
    * the item are immediately reflected in the list. The first item is number 0. Exceptions: a DOMException with code
    * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only attribute or when the object itself
    * is read only.
    */
  def getItem(index: Int): SVGNumber = js.native

  /** Clears all existing current items from the list, with the result being an empty list. Exceptions: a DOMException
    * with code NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only attribute or when the
    * object itself is read only.
    */
  def clear(): Unit = js.native

  /** Inserts a new item at the end of the list. If newItem is already in a list, it is removed from its previous list
    * before it is inserted into this list. The inserted item is the item itself and not a copy. Exceptions: a
    * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only attribute or
    * when the object itself is read only.
    */
  def appendItem(newItem: SVGNumber): SVGNumber = js.native

  /** Clears all existing current items from the list and re-initializes the list to hold the single item specified by
    * the parameter. If the inserted item is already in a list, it is removed from its previous list before it is
    * inserted into this list. The inserted item is the item itself and not a copy. The return value is the item
    * inserted into the list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
    * corresponds to a read only attribute or when the object itself is read only.
    */
  def initialize(newItem: SVGNumber): SVGNumber = js.native

  /** Removes an existing item from the list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
    * when the list corresponds to a read only attribute or when the object itself is read only. a DOMException with
    * code INDEX_SIZE_ERR is raised if the index number is greater than or equal to numberOfItems.
    */
  def removeItem(index: Int): SVGNumber = js.native

  /** Inserts a new item into the list at the specified position. The first item is number 0. If newItem is already in a
    * list, it is removed from its previous list before it is inserted into this list. The inserted item is the item
    * itself and not a copy. If the item is already in this list, note that the index of the item to insert before is
    * before the removal of the item. If the index is equal to 0, then the new item is inserted at the front of the
    * list. If the index is greater than or equal to numberOfItems, then the new item is appended to the end of the
    * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a
    * read only attribute or when the object itself is read only.
    */
  def insertItemBefore(newItem: SVGNumber, index: Int): SVGNumber = js.native
}
