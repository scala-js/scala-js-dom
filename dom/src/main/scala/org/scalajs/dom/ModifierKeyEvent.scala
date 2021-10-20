/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait ModifierKeyEvent extends js.Object {

  /** The metaKey property indicates if the meta key was pressed (true) or not (false) when the event occurred. */
  def metaKey: Boolean = js.native

  /** The altKey property indicates if the alt key was pressed (true) or not (false) when the event occurred. */
  def altKey: Boolean = js.native

  /** A Boolean value indicating whether or not the control key was down when the touch event was fired. Read only. */
  def ctrlKey: Boolean = js.native

  /** A Boolean value indicating whether or not the shift key was down when the touch event was fired. Read only. */
  def shiftKey: Boolean = js.native
}
