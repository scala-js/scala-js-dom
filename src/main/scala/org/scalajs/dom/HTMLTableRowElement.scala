/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLTableRowElement interface provides special properties and methods (beyond the HTMLElement interface it also
  * has available to it by inheritance) for manipulating the layout and presentation of rows in an HTML table.
  */
@js.native
@JSGlobal
abstract class HTMLTableRowElement extends HTMLElement with HTMLTableAlignment {

  /** Returns a long value which gives the logical position of the row within the entire table. If the row is not part
    * of a table, returns -1.
    */
  def rowIndex: Int = js.native

  /** Returns a live HTMLCollection containing the cells in the row. The HTMLCollection is live and is automatically
    * updated when cells are added or removed.
    */
  def cells: HTMLCollection = js.native

  var borderColorLight: js.Any = js.native

  /** Returns a long value which gives the logical position of the row within the table section it belongs to. If the
    * row is not part of a section, returns -1.
    */
  def sectionRowIndex: Int = js.native
  var borderColor: js.Any = js.native
  var height: js.Any = js.native
  var borderColorDark: js.Any = js.native

  /** Removes the cell at the given position in the row. If the given position is greater (or equal as it starts at
    * zero) than the amount of cells in the row, or is smaller than 0, it raises a DOMException with the IndexSizeError
    * value.
    */
  def deleteCell(index: Int = js.native): Unit = js.native

  /** Inserts a new cell just before the given position in the row. If the given position is not given or is -1, it
    * appends the cell to the row. If the given position is greater (or equal as it starts at zero) than the amount of
    * cells in the row, or is smaller than -1, it raises a DOMException with the IndexSizeError value.
    */
  def insertCell(index: Int = js.native): HTMLElement = js.native
}
