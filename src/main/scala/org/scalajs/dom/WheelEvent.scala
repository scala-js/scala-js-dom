/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The DOM WheelEvent represents events that occur due to the user moving a mouse wheel or similar input device. */
@js.native
@JSGlobal
class WheelEvent(typeArg: String, init: js.UndefOr[WheelEventInit]) extends MouseEvent(typeArg, init) {

  /** Scroll amount for the z-axis. Read only. */
  def deltaZ: Double = js.native

  /** Horizontal scroll amount. Read only. */
  def deltaX: Double = js.native

  /** Unit of delta values. See Delta modes for a list of permitted values. Read only. */
  def deltaMode: Int = js.native

  /** Vertical scroll amount. Read only. */
  def deltaY: Double = js.native
}

@js.native
@JSGlobal
object WheelEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(WheelEvent),List())))) */
  /** The delta values are specified in pixels. */
  val DOM_DELTA_PIXEL: Int = js.native

  /** The delta values are specified in lines. */
  val DOM_DELTA_LINE: Int = js.native

  /** The delta values are specified in pages. */
  val DOM_DELTA_PAGE: Int = js.native
}
