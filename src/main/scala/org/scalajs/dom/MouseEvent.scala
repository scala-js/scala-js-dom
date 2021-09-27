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

/** The DOM MouseEvent interface represents events that occur due to the user interacting with a pointing device (such
  * as a mouse).
  *
  * Common events using this interface include click, dblclick, mouseup, mousedown. The list of all events using this
  * interface is provided in the Events reference.
  *
  * MouseEvent derives from UIEvent, which in turn derives from Event.
  */
@js.native
@JSGlobal
class MouseEvent(typeArg: String, init: js.UndefOr[MouseEventInit])
    extends UIEvent(typeArg, init) with ModifierKeyEvent {

  /** The screenX property provides the X coordinate of the mouse pointer in global (screen) coordinates. */
  def screenX: Double = js.native

  /** The pageX property is an integer value in pixels for the X coordinate of the mouse pointer, relative to the whole
    * document, when the mouse event fired. This property takes into account any horizontal scrolling of the page.
    */
  def pageX: Double = js.native

  /** The pageY property is an integer value in pixels for the Y coordinate of the mouse pointer, relative to the whole
    * document, when the mouse event fired. This property takes into account any vertical scrolling of the page.
    */
  def pageY: Double = js.native

  /** The clientY property provides the Y coordinate of the mouse pointer in local (DOM content) coordinates. */
  def clientY: Double = js.native

  /** The screenY property provides the Y coordinate of the mouse pointer in global (screen) coordinates. */
  def screenY: Double = js.native

  /** The relatedTarget property is the secondary target for the event, if there is one. */
  def relatedTarget: EventTarget = js.native

  /** The button property indicates which button was pressed on the mouse to trigger the event. */
  def button: Int = js.native

  /** The buttons property indicates which buttons were pressed on the mouse to trigger the event. */
  def buttons: Int = js.native

  /** The clientX property provides the X coordinate of the mouse pointer in local (DOM content) coordinates. */
  def clientX: Double = js.native

  /** Returns the current state of the specified modifier key. See the KeyboardEvent.getModifierState() documentation
    * for details.
    */
  def getModifierState(keyArg: String): Boolean = js.native

  /** Provides the difference in the X coordinate of the mouse pointer between the given event and the previous
    * mousemove event
    */
  def movementX: Double = js.native

  /** Provides the difference in the Y coordinate of the mouse pointer between the given event and the previous
    * mousemove event
    */
  def movementY: Double = js.native
}
