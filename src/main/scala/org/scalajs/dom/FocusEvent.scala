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

/** The FocusEvent interface represents focus-related events like focus, blur, focusin, or focusout. */
@js.native
@JSGlobal
class FocusEvent(typeArg: String, init: js.UndefOr[FocusEventInit] = js.undefined) extends UIEvent(typeArg, init) {

  /** The FocusEvent.relatedTarget read-only property represents a secondary target for this event, which will depend of
    * the event itself. As in some cases (like when tabbing in or out a page), this property may be set to null for
    * security reasons.
    */
  def relatedTarget: EventTarget = js.native
}
