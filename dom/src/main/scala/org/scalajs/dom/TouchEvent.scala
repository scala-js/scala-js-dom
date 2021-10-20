/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A TouchEvent represents an event sent when the state of contacts with a touch-sensitive surface changes. This
  * surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact with
  * the screen and includes support for detecting movement, addition and removal of contact points, and so forth.
  *
  * Touches are represented by the Touch object; each touch is described by a position, size and shape, amount of
  * pressure, and target element. Lists of touches are represented by TouchList objects.
  */
@js.native
@JSGlobal
class TouchEvent(typeArg: String, init: js.UndefOr[TouchEventInit])
    extends UIEvent(typeArg, init) with ModifierKeyEvent {

  /** A TouchList of all the Touch objects representing individual points of contact whose states changed between the
    * previous touch event and this one. Read only.
    */
  def changedTouches: TouchList = js.native

  /** A TouchList listing all the Touch objects for touch points that are still in contact with the touch surface and
    * whose touchstart event occurred inside the same target element as the current target element.
    */
  def targetTouches: TouchList = js.native

  /** A TouchList listing all the Touch objects for touch points that are still in contact with the touch surface,
    * regardless of whether or not they've changed or what their target was at touchstart time.
    */
  def touches: TouchList = js.native

  /** The target of the touches associated with this event. This target corresponds to the target of all the touches in
    * the targetTouches attribute, but note that other touches in this event may have a different target. To be careful,
    * you should use the target associated with individual touches.
    */
  override def target: EventTarget = js.native
}
