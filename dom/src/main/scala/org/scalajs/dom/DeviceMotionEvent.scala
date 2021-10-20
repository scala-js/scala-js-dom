package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class DeviceMotionEvent(typeArg: String, init: js.UndefOr[DeviceMotionEventInit] = js.undefined)
    extends Event(typeArg, init) {

  /** Device acceleration with gravity removed. */
  val acceleration: DeviceAcceleration = js.native

  /** Device acceleration including the force of gravity. */
  val accelerationIncludingGravity: DeviceAcceleration = js.native

  /** The rate of rotation. */
  val rotationRate: DeviceRotationRate = js.native

  /** The sampling rate in seconds that data is received from the hardware. */
  val interval: Double = js.native
}
