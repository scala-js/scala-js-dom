/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The InputEvent interface represents an event notifying the user of editable content changes. */
@js.native
@JSGlobal
class InputEvent(typeArg: String, init: InputEventInit) extends UIEvent(typeArg, init) {

  def this(typeArg: String) = this(typeArg, js.native)

  /** Returns a DOMString with the inserted characters. This may be an empty string if the change doesn't insert text
    * (such as when deleting characters, for example).
    */
  def data: String = js.native

  /** Returns a DataTransfer object containing information about richtext or plaintext data being added to or removed
    * from editable content.
    */
  def dataTransfer: DataTransfer = js.native

  /** Returns the type of change for editable content such as, for example, inserting, deleting, or formatting text. See
    * the property page for a complete list of input types.
    */
  def inputType: InputType = js.native

  /** Returns a Boolean value indicating if the event is fired after compositionstart and before compositionend. */
  def isComposing: Boolean = js.native

  /** Returns an array of static ranges that will be affected by a change to the DOM if the input event is not canceled.
    */
  def getTargetRanges(): js.Array[StaticRange] = js.native

}
