package org.scalajs.dom

import scala.scalajs.js

trait DeviceMotionEventInit extends EventInit {

  /** Device acceleration with gravity removed. */
  var acceleration: js.UndefOr[DeviceAcceleration] = js.undefined

  /** Device acceleration including the force of gravity. */
  var accelerationIncludingGravity: js.UndefOr[DeviceAcceleration] =
    js.undefined

  /** The rate of rotation. */
  var rotationRate: js.UndefOr[DeviceRotationRate] = js.undefined

  /** The sampling rate in seconds that data is received from the hardware. */
  var interval: js.UndefOr[Double] = js.undefined
}
