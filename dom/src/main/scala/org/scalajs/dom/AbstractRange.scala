/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The AbstractRange abstract interface is the base class upon which all DOM range types are defined. A range is an
  * object that indicates the start and end points of a section of content within the document.
  */
@js.native
trait AbstractRange extends js.Object {

  /** The Range.startOffset read-only property returns a number representing where in the startContainer the Range
    * starts.
    */
  def startOffset: Int = js.native

  /** The Range.collapsed read-only property returns a Boolean flag indicating whether the start and end points of the
    * Range are at the same position. It returns true if the start and end boundary points of the Range are the same
    * point in the DOM, false if not.
    */
  def collapsed: Boolean = js.native

  /** The Range.endOffset read-only property returns a number representing where in the Range.endContainer the Range
    * ends.
    */
  def endOffset: Int = js.native

  /** The Range.startContainer read-only property returns the Node within which the Range starts. To change the start
    * position of a node, use one of the Range.setStart() methods.
    */
  def startContainer: Node = js.native

  /** The Range.endContainer read-only property returns the Node within which the Range ends. To change the end position
    * of a node, use the Range.setEnd() method or a similar one.
    */
  def endContainer: Node = js.native

}
