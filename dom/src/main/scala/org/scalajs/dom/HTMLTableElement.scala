/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLTableElement interface provides special properties and methods (beyond the regular HTMLElement object
  * interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an
  * HTML document.
  */
@js.native
@JSGlobal
abstract class HTMLTableElement extends HTMLElement {

  /** Is an HTMLTableSectionElement representing the first &lt;tfoot&gt; that is a child of the element, or null if none
    * is found. When set, if the object doesn't represent a &lt;tfoot&gt;, a DOMException with the HierarchyRequestError
    * name is thrown. If a correct object is given, it is inserted in the tree immediately before the first element that
    * is neither a &lt;caption&gt;, a &lt;colgroup&gt;, nor a &lt;thead&gt;, or as the last child if there is no such
    * element, and the first &lt;tfoot&gt; that is a child of this element is removed from the tree, if any.
    */
  var tFoot: HTMLTableSectionElement = js.native

  /** Returns a live HTMLCollection containing all the rows of the element, that is all &lt;tr&gt; that are a child of
    * the element, or a child or one of its &lt;thead&gt;, &lt;tbody&gt; and &lt;tfoot&gt; children. The rows members of
    * a &lt;thead&gt; appear first, in tree order, and those members of a &lt;tbody&gt; last, also in tree order. The
    * HTMLCollection is live and is automatically updated when the HTMLTableElement changes.
    */
  def rows: HTMLCollection[Element] = js.native

  /** Is an HTMLTableCaptionElement representing the first &lt;caption&gt; that is a child of the element, or null if
    * none is found. When set, if the object doesn't represent a &lt;caption&gt;, a DOMException with the
    * HierarchyRequestError name is thrown. If a correct object is given, it is inserted in the tree as the first child
    * of this element and the first &lt;caption&gt; that is a child of this element is removed from the tree, if any.
    */
  var caption: HTMLTableCaptionElement = js.native

  /** Returns a live HTMLCollection containing all the &lt;tbody&gt; of the element. The HTMLCollection is live and is
    * automatically updated when the HTMLTableElement changes.
    */
  def tBodies: HTMLCollection[Element] = js.native

  /** Is an HTMLTableSectionElement representing the first &lt;thead&gt; that is a child of the element, or null if none
    * is found. When set, if the object doesn't represent a &lt;thead&gt;, a DOMException with the HierarchyRequestError
    * name is thrown. If a correct object is given, it is inserted in the tree immediately before the first element that
    * is neither a &lt;caption&gt;, nor a &lt;colgroup&gt;, or as the last child if there is no such element, and the
    * first &lt;thead&gt; that is a child of this element is removed from the tree, if any.
    */
  var tHead: HTMLTableSectionElement = js.native

  /** Removes the row corresponding to the index given in parameter. If the index value is -1 the last row is removed;
    * if it smaller than -1 or greater than the amount of rows in the collection, a DOMException with the value
    * IndexSizeError is raised.
    */
  def deleteRow(index: Int): Unit = js.native

  def createTBody(): HTMLElement = js.native

  /** Removes the first &lt;caption&gt; that is a child of the element. */
  def deleteCaption(): Unit = js.native

  /** Returns an HTMLElement representing a new row of the table. It inserts it in the rows collection immediately
    * before the &lt;tr&gt; element at the givent index position. If necessary a &lt;tbody&gt; is created. If the index
    * is -1, the new row is appended to the collection. If the index is smaller than -1 or greater than the number of
    * rows in the collection, a DOMException with the value IndexSizeError is raised.
    */
  def insertRow(index: Int = js.native): HTMLElement = js.native

  /** Removes the first &lt;tfoot&gt; that is a child of the element. */
  def deleteTFoot(): Unit = js.native

  /** Returns an HTMLElement representing the first &lt;thead&gt; that is a child of the element. If none is found, a
    * new one is created and inserted in the tree immediately before the first element that is neither a
    * &lt;caption&gt;, nor a &lt;colgroup&gt;, or as the last child if there is no such element.
    */
  def createTHead(): HTMLElement = js.native

  /** Removes the first &lt;thead&gt; that is a child of the element. */
  def deleteTHead(): Unit = js.native

  /** Returns an HTMLElement representing the first &lt;caption&gt; that is a child of the element. If none is found, a
    * new one is created and inserted in the tree as the first child of the &lt;table&gt; element.
    */
  def createCaption(): HTMLElement = js.native

  def moveRow(indexFrom: Int = js.native, indexTo: Int = js.native): Object = js.native

  /** Returns an HTMLElement representing the first &lt;tfoot&gt; that is a child of the element. If none is found, a
    * new one is created and inserted in the tree immediately before the first element that is neither a
    * &lt;caption&gt;, a &lt;colgroup&gt;, nor a &lt;thead&gt;, or as the last child if there is no such element.
    */
  def createTFoot(): HTMLElement = js.native
}
