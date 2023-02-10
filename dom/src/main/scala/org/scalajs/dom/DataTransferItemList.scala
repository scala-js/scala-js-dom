/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** A list of [[DataTransferItem]] objects representing items being dragged. During a drag operation, each DragEvent has
  * a dataTransfer property and that property is a DataTransferItemList.
  */
@js.native
@JSGlobal
class DataTransferItemList private[this] extends js.Object {

  /** Returns the number of items in the drag data store. */
  def length: Int = js.native

  /** Adds a new entry for the given data to the drag data store. If the data is plain text then a type string has to be
    * provided also.
    */
  def add(data: String, `type`: String): DataTransferItem = js.native

  /** Adds a new entry for the given data to the drag data store. If the data is plain text then a type string has to be
    * provided also.
    */
  def add(data: File): DataTransferItem = js.native

  /** Removes the indexth entry in the drag data store. */
  def remove(index: Int): Unit = js.native

  /** Removes all the entries in the drag data store. */
  def clear(): Unit = js.native

  /** Returns the DataTransferItem object representing the indexth entry in the drag data store. */
  @js.annotation.JSBracketAccess
  def apply(index: Int): DataTransferItem = js.native
}
