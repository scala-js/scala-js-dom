/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Most of today's web content assumes the user's pointing device will be a mouse. However, since many devices support
  * other types of pointing input devices, such as pen/stylus and touch surfaces, extensions to the existing pointing
  * device event models are needed and pointer events address that need.
  *
  * Pointer events are DOM events that are fired for a pointing device. They are designed to create a single DOM event
  * model to handle pointing input devices such as a mouse, pen/stylus or touch (such as one or more fingers). The
  * pointer is a hardware-agnostic device that can target a specific set of screen coordinates. Having a single event
  * model for pointers can simplify creating Web sites and applications and provide a good user experience regardless of
  * the user's hardware. However, for scenarios when device-specific handling is desired, pointer events defines a
  * property to inspect the device type which produced the event.
  *
  * The events needed to handle generic pointer input are analogous to mouse events (mousedown/pointerdown,
  * mousemove/pointermove, etc.). Consequently, pointer event types are intentionally similar to mouse event types.
  * Additionally, a pointer event contains the usual properties present in mouse events (client coordinates, target
  * element, button states, etc.) in addition to new properties for other forms of input: pressure, contact geometry,
  * tilt, etc. In fact, the PointerEvent interface inherits all of the MouseEvent's properties thus facilitating
  * migrating content from mouse events to pointer events.
  */
@js.native
@JSGlobal
class PointerEvent(typeArg: String, pointerEventInit: js.UndefOr[PointerEventInit] = js.undefined)
    extends MouseEvent(typeArg, pointerEventInit) {

  def this(typeArg: String) = this(typeArg, js.native)

  /** An identifier assigned to a pointer event that is unique from the identifiers of all active pointer events at the
    * time. Authors cannot assume values convey any particular meaning other than an identifier for the pointer that is
    * unique from all other active pointers.
    */
  def pointerId: Double = js.native

  /** The width read-only property of the PointerEvent interface represents the width of the pointer's contact geometry
    * along the x-axis, measured in CSS pixels. Depending on the source of the pointer device (such as a finger), for a
    * given pointer, each event may produce a different value.
    */
  def width: Double = js.native

  /** The height read-only property of the PointerEvent interface represents the height of the pointer's contact
    * geometry, along the Y axis (in CSS pixels). Depending on the source of the pointer device (for example a finger),
    * for a given pointer, each event may produce a different value.
    */
  def height: Double = js.native

  /** The normalized pressure of the pointer input in the range of 0 to 1, where 0 and 1 represent the minimum and
    * maximum pressure the hardware is capable of detecting, respectively.
    *
    * For hardware that does not support pressure, including but not limited to mouse, the value MUST be 0.5 when the
    * pointer is active and 0 otherwise.
    */
  def pressure: Double = js.native

  /** The tangentialPressure read-only property of the PointerEvent interface represents the normalized tangential
    * pressure of the pointer input (also known as barrel pressure or cylinder stress) in the range -1 to 1, where 0 is
    * the neutral position of the control.
    *
    * Note that some hardware may only support positive values in the range 0 to 1. For hardware that does not support
    * tangential pressure, the value will be 0.
    */
  def tangentialPressure: Double = js.native

  /** This property is the angle (in degrees) between the Y-Z plane of the pointer and the screen. This property is
    * typically only useful for a pen/stylus pointer type. The range of values is -90 to 90 degrees and a positive value
    * means a tilt to the right. For devices that do not support this property, the value is 0.
    */
  def tiltX: Double = js.native

  /** This property is the angle (in degrees) between the X-Z plane of the pointer and the screen. This property is
    * typically only useful for a pen/stylus pointer type. The range of values is -90 to 90 degrees and a positive value
    * is a tilt toward the user. For devices that do not support this property, the value is 0.
    */
  def tiltY: Double = js.native

  /** The twist read-only property of the PointerEvent interface represents the clockwise rotation of the transducer
    * (e.g. pen stylus) around its major axis in degrees, with a value in the range 0 to 359.
    *
    * For devices that do not report twist, the value MUST be 0.
    */
  def twist: Double = js.native

  /** The pointerType read-only property of the PointerEvent interface indicates the device type that caused the pointer
    * event. The supported values are the following strings:
    *
    * mouse The event was generated by a mouse device.
    *
    * pen The event was generated by a pen or stylus device.
    *
    * touch The event was generated by a touch such as a finger. If the device type cannot be detected by the browser,
    * the value can be an empty string (""). If the browser supports pointer device types other than those listed above,
    * the value should be vendor prefixed to avoid conflicting names for different types of devices.
    */
  def pointerType: String = js.native

  /** Indicates if the pointer represents the primary pointer of this pointer type.
    *
    * In some scenarios there may be multiple pointers (for example a device with both a touchscreen and a mouse) or a
    * pointer supports multiple contact points (for example a touchscreen that supports multiple finger touches). The
    * application can use the isPrimary property to identify a master pointer among the set of active pointers for each
    * pointer type. If an application only wants to support a primary pointer, it can ignore all pointer events that are
    * not primary.
    *
    * For mouse there is only one pointer, so it will always be the primary pointer. For touch input, a pointer is
    * considered primary if the user touched the screen when there were no other active touches. For pen and stylus
    * input, a pointer is considered primary if the user's pen initially contacted the screenwhen there were no other
    * active pens contacting the screen.
    */
  def isPrimary: Boolean = js.native
}
