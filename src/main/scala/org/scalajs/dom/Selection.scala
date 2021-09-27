/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** Selection is the class of the object returned by window.getSelection() and other methods. It represents the text
  * selection in the greater page, possibly spanning multiple elements, when the user drags over static text and other
  * parts of the page. For information about text selection in an individual text editing element, see Input, TextArea
  * and document.activeElement which typically return the parent object returned from window.getSelection().
  */
@js.native
@JSGlobal
class Selection extends js.Object {

  /** Returns a boolean indicating whether the selection's start and end points are at the same position. */
  def isCollapsed: Boolean = js.native

  /** Returns the node in which the selection begins. */
  def anchorNode: Node = js.native

  /** Returns the node in which the selection ends. */
  def focusNode: Node = js.native

  /** Returns a number representing the offset of the selection's anchor within the anchorNode. If anchorNode is a text
    * node, this is the number of characters within anchorNode preceding the anchor. If anchorNode is an element, this
    * is the number of child nodes of the anchorNode preceding the anchor.
    */
  def anchorOffset: Int = js.native

  /** Returns a number representing the offset of the selection's anchor within the focusNode. If focusNode is a text
    * node, this is the number of characters within focusNode preceding the focus. If focusNode is an element, this is
    * the number of child nodes of the focusNode preceding the focus.
    */
  def focusOffset: Int = js.native

  /** Returns the number of ranges in the selection. */
  def rangeCount: Int = js.native

  /** A range object that will be added to the selection. */
  def addRange(range: Range): Unit = js.native

  /** Collapses the selection to the end of the last range in the selection.  If the content the selection is in is
    * focused and editable, the caret will blink there.
    */
  def collapseToEnd(): Unit = js.native

  /** Adds all the children of the specified node to the selection. Previous selection is lost. */
  def selectAllChildren(parentNode: Node): Unit = js.native

  /** Returns a range object representing one of the ranges currently selected. */
  def getRangeAt(index: Int): Range = js.native

  /** Collapses the current selection to a single point. The document is not modified. If the content is focused and
    * editable, the caret will blink there.
    */
  def collapse(parentNode: Node, offset: Int): Unit = js.native

  /** Removes all ranges from the selection, leaving the anchorNode and focusNode properties equal to null and leaving
    * nothing selected.
    */
  def removeAllRanges(): Unit = js.native

  /** Collapses the selection to the start of the first range in the selection.  If the content of the selection is
    * focused and editable, the caret will blink there.
    */
  def collapseToStart(): Unit = js.native

  /** Deletes the actual text being represented by a selection object from the document's DOM. */
  def deleteFromDocument(): Unit = js.native

  /** Removes a range from the selection. */
  def removeRange(range: Range): Unit = js.native

  /** Indicates if the node is part of the selection */
  def containsNode(node: Node, partialContainment: Boolean = js.native): Boolean = js.native

  /** Moves the focus of the selection to a specified point. The anchor of the selection does not move. The selection
    * will be from the anchor to the new focus regardless of direction.
    */
  def extend(node: Node, offset: Int = js.native): Unit = js.native
}
