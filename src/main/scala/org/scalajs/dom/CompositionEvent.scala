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

/** The DOM CompositionEvent represents events that occur due to the user indirectly entering text. */
@js.native
@JSGlobal
class CompositionEvent(typeArg: String, init: js.UndefOr[CompositionEventInit]) extends UIEvent(typeArg, init) {

  /** For compositionstart events, this is the currently selected text that will be replaced by the string being
    * composed. This value doesn't change even if content changes the selection range; rather, it indicates the string
    * that was selected when composition started. For compositionupdate, this is the string as it stands currently as
    * editing is ongoing. For compositionend events, this is the string as committed to the editor. Read only.
    */
  def data: String = js.native

  /** The locale of current input method (for example, the keyboard layout locale if the composition is associated with
    * IME). Read only.
    */
  def locale: String = js.native
}
