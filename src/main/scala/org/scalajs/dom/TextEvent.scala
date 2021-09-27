/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class TextEvent(typeArg: String, init: js.UndefOr[TextEventInit]) extends UIEvent(typeArg, init) {
  def inputMethod: Int = js.native

  def data: String = js.native

  def locale: String = js.native

  def initTextEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, dataArg: String,
      inputMethod: Int, locale: String): Unit = js.native
}

@js.native
@JSGlobal
object TextEvent extends js.Object {
  val DOM_INPUT_METHOD_KEYBOARD: Int = js.native
  val DOM_INPUT_METHOD_DROP: Int = js.native
  val DOM_INPUT_METHOD_IME: Int = js.native
  val DOM_INPUT_METHOD_SCRIPT: Int = js.native
  val DOM_INPUT_METHOD_VOICE: Int = js.native
  val DOM_INPUT_METHOD_UNKNOWN: Int = js.native
  val DOM_INPUT_METHOD_PASTE: Int = js.native
  val DOM_INPUT_METHOD_HANDWRITING: Int = js.native
  val DOM_INPUT_METHOD_OPTION: Int = js.native
  val DOM_INPUT_METHOD_MULTIMODAL: Int = js.native
}
