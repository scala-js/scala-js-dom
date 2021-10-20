/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLTableCellElement interface provides special properties and methods (beyond the regular HTMLElement interface
  * it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either
  * header or data cells, in an HTML document.
  */
@js.native
@JSGlobal
abstract class HTMLTableCellElement extends HTMLElement with HTMLTableAlignment {

  /** Is a DOMSettableTokenList describing a list of id of &lt;th&gt; elements that represents headers associated with
    * the cell. It reflects the headers attribute.
    */
  def headers: String = js.native

  /** Is a long representing the cell position in the cells collection of the &lt;tr&gt; it belongs to. If the cell
    * doesn't belong to a &lt;tr&gt;, it returns -1.
    */
  def cellIndex: Int = js.native

  /** Is an unsigned long that represents the number of columns this cell must span. It reflects the colspan attribute.
    */
  var colSpan: Int = js.native

  /** Is an unsigned long that represents the number of rows this cell must span. It reflects the rowspan attribute. */
  var rowSpan: Int = js.native
}
