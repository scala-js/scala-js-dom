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

/** The DOM UIEvent represents simple user interface events. */
@js.native
@JSGlobal
class UIEvent(typeArg: String, init: js.UndefOr[UIEventInit] = js.undefined) extends Event(typeArg, init) {

  /** Detail about the event, depending on the type of event. Read only. */
  def detail: Int = js.native

  /** A view which generated the event. Read only. */
  def view: Window = js.native
}
