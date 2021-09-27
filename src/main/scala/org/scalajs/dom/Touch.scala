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

/** A Touch object represents a single point of contact between the user and a touch-sensitive interface device (which
  * may be, for example, a touchscreen or a trackpad).
  *
  * Note: Many of these values are hardware-dependent; for example, if the device doesn't have a way to detect the
  * amount of pressure placed on the surface, the force value will always be 1.0. This may also be the case for radiusX
  * and radiusY; if the hardware reports only a single point, these values will be 1.
  */
@js.native
@JSGlobal
class Touch extends js.Object {

  /** A unique identifier for this Touch object. A given touch (say, by a finger) will have the same identifier for the
    * duration of its movement around the surface. This lets you ensure that you're tracking the same touch all the
    * time. Read only.
    */
  def identifier: Double = js.native

  /** The X coordinate of the touch point relative to the left edge of the screen. Read only. */
  def screenX: Double = js.native

  /** The Y coordinate of the touch point relative to the top edge of the screen. Read only. */
  def screenY: Double = js.native

  /** The X coordinate of the touch point relative to the left edge of the browser viewport, not including any scroll
    * offset. Read only.
    */
  def clientX: Double = js.native

  /** The Y coordinate of the touch point relative to the top edge of the browser viewport, not including any scroll
    * offset. Read only.
    */
  def clientY: Double = js.native

  /** The X coordinate of the touch point relative to the left edge of the document. Unlike clientX, this value includes
    * the horizontal scroll offset, if any.
    *
    * Read only.
    */
  def pageX: Double = js.native

  /** The Y coordinate of the touch point relative to the top of the document. Unlike clientY, this value includes the
    * vertical scroll offset, if any. Read only.
    */
  def pageY: Double = js.native

  /** The X radius of the ellipse that most closely circumscribes the area of contact with the screen. The value is in
    * pixels of the same scale as screenX. Read only.
    */
  def radiusX: Double = js.native

  /** The Y radius of the ellipse that most closely circumscribes the area of contact with the screen. The value is in
    * pixels of the same scale as screenY. Read only.
    */
  def radiusY: Double = js.native

  /** The angle (in degrees) that the ellipse described by radiusX and radiusY must be rotated, clockwise, to most
    * accurately cover the area of contact between the user and the surface. Read only.
    */
  def rotationAngle: Double = js.native

  /** The amount of pressure being applied to the surface by the user, as a float between 0.0 (no pressure) and 1.0
    * (maximum pressure). Read only.
    */
  def force: Double = js.native

  /** The Element on which the touch point started when it was first placed on the surface, even if the touch point has
    * since moved outside the interactive area of that element or even been removed from the document. Note that if the
    * target is removed from the document, events will still be targeted at it, and hence won't necessarily bubble up to
    * the window or document anymore. If there's any risk of an element being removed while it is being touched, best
    * practice is to attach the touch listeners directly to the target. Read only.
    */
  def target: EventTarget = js.native
}
