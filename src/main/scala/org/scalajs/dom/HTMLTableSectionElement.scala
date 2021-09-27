/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLTableSectionElement interface provides special properties and methods (beyond the HTMLElement interface it
  * also has available to it by inheritance) for manipulating the layout and presentation of sections, that is headers,
  * footers and bodies, in an HTML table.
  */
@js.native
@JSGlobal
abstract class HTMLTableSectionElement extends HTMLElement with HTMLTableAlignment {

  /** Returns a live HTMLCollection containing the rows in the section. The HTMLCollection is live and is automatically
    * updated when rows are added or removed.
    */
  def rows: HTMLCollection = js.native

  /** Removes the cell at the given position in the section. If the given position is greater (or equal as it starts at
    * zero) than the amount of rows in the section, or is smaller than 0, it raises a DOMException with the
    * IndexSizeError value.
    */
  def deleteRow(index: Int = js.native): Unit = js.native

  def moveRow(indexFrom: Int = js.native, indexTo: Int = js.native): Object = js.native

  def insertRow(index: Int = js.native): HTMLElement = js.native
}
