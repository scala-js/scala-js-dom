/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** KeyboardEvent objects describe a user interaction with the keyboard. Each event describes a key; the event type
  * (keydown, keypress, or keyup) identifies what kind of activity was performed.
  *
  * Note: The KeyboardEvent indicates just what's happening on a key. When you need to handle text input, use HTML5
  * input event instead. For example, if user inputs text from hand-writing system like tablet PC, key events may not be
  * fired.
  *
  * Warning: keypress event is to be deprecated in favor of beforeinput event eventually
  *
  * W3C
  */
@js.native
@JSGlobal
class KeyboardEvent(typeArg: String, init: js.UndefOr[KeyboardEventInit])
    extends UIEvent(typeArg, init) with ModifierKeyEvent {

  def this(typeArg: String) = this(typeArg, js.native)

  /** Returns the Unicode value of a character key pressed during a keypress event.
    *
    * Note: Required especially in Gecko based browsers
    */
  def charCode: Int = js.native

  /** A system and implementation dependent numerical code identifying the unmodified value of the pressed key. This is
    * usually the decimal ASCII (RFC 20) or Windows 1252 code corresponding to the key; see Virtual key codes for a list
    * of Gecko's keyCode values. If the key can't be identified, this value is 0. Read only.
    */
  def keyCode: Int = js.native

  /** The location of the key on the keyboard or other input device. See the constants in the [[KeyboardEvent]] object.
    */
  def location: Int = js.native

  /** The key value of the key represented by the event. If the value has a printed representation, this attribute's
    * value is the same as the char attribute. Otherwise, it's one of the key value strings specified in Key values. If
    * the key can't be identified, this is the string "Unidentified". See key names for the detail.
    */
  def key: String = js.native

  /** true if the key is being held down such that it is automatically repeating */
  def repeat: Boolean = js.native

  /** Returns the current state of the specified modifier key. */
  def getModifierState(keyArg: String): Boolean = js.native

  /** Returns a string with the code value of the physical key represented by the event. */
  def code: String = js.native

  /** Returns a boolean value that is true if the event is fired between after compositionstart and before
    * compositionend.
    */
  def isComposing: Boolean = js.native
}

@js.native
@JSGlobal
object KeyboardEvent extends js.Object {

  /** The key has only one version, or can't be distinguished between the left and right versions of the key, and was
    * not pressed on the numeric keypad or a key that is considered to be part of the keypad.
    */
  def DOM_KEY_LOCATION_STANDARD: Int = js.native

  /** The key was the left-hand version of the key; for example, the left-hand Control key was pressed on a standard 101
    * key US keyboard. This value is only used for keys that have more that one possible location on the keyboard.
    */
  def DOM_KEY_LOCATION_LEFT: Int = js.native

  /** The key was the right-hand version of the key; for example, the right-hand Control key is pressed on a standard
    * 101 key US keyboard. This value is only used for keys that have more that one possible location on the keyboard.
    */
  def DOM_KEY_LOCATION_RIGHT: Int = js.native

  /** The key was on the numeric keypad, or has a virtual key code that corresponds to the numeric keypad.
    *
    * @note
    *   When NumLock is locked, Gecko always returns [[DOM_KEY_LOCATION_NUMPAD]] for the keys on the numeric pad.
    *   Otherwise, when NumLock is unlocked and the keyboard actually has a numeric keypad, Gecko always returns
    *   [[DOM_KEY_LOCATION_NUMPAD]] too. On the other hand, if the keyboard doesn't have a keypad, such as on a notebook
    *   computer, some keys become Numpad only when NumLock is locked. When such keys fires key events, the location
    *   attribute value depends on the key. That is, it must not be [[DOM_KEY_LOCATION_NUMPAD]].
    * @note
    *   NumLock key's key events indicate [[DOM_KEY_LOCATION_STANDARD]] both on Gecko and Internet Explorer.
    */
  def DOM_KEY_LOCATION_NUMPAD: Int = js.native
}
