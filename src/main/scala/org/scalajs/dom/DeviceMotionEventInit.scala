package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

trait DeviceMotionEventInit extends EventInit {

  /** Device acceleration with gravity removed. */
  val acceleration: js.UndefOr[DeviceAcceleration] = js.undefined

  /** Device acceleration including the force of gravity. */
  val accelerationIncludingGravity: js.UndefOr[DeviceAcceleration] =
    js.undefined

  /** The rate of rotation. */
  val rotationRate: js.UndefOr[DeviceRotationRate] = js.undefined

  /** The sampling rate in seconds that data is received from the hardware. */
  val interval: js.UndefOr[Double] = js.undefined
}
