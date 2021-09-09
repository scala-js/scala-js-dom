package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class DeviceOrientationEvent(typeArg: String, init: js.UndefOr[DeviceOrientationEventInit])
    extends Event(typeArg, init) {

  /** Z-Axis rotation in degrees. */
  val alpha: Double = js.native

  /** X-Axis rotation in degrees. */
  val beta: Double = js.native

  /** Y-Axis rotation in degrees. */
  val gamma: Double = js.native

  /** If true, this event data is has been produced using sensor fusion from the magnometer and other sensors. When
    * false- only the gyroscope has been used.
    */
  val absolute: Boolean = js.native
}

trait DeviceOrientationEventInit extends EventInit {

  /** Z-Axis rotation in degrees. */
  var alpha: js.UndefOr[Double] = js.undefined

  /** X-Axis rotation in degrees. */
  var beta: js.UndefOr[Double] = js.undefined

  /** Y-Axis rotation in degrees. */
  var gamma: js.UndefOr[Double] = js.undefined

  /** If true, this event data is has been produced using sensor fusion from the magnometer and other sensors. When
    * false- only the gyroscope has been used.
    */
  var absolute: js.UndefOr[Boolean] = js.undefined
}

trait DeviceAcceleration extends js.Any {

  /** The acceleration in x. In m/s<sup>2</sup>. */
  val x: Double

  /** The acceleration in y. In m/s<sup>2</sup>. */
  val y: Double

  /** The acceleration in z. In m/s<sup>2</sup>. */
  val z: Double
}

trait DeviceRotationRate extends js.Any {

  /** The z axis rotation in degrees per second. */
  val alpha: Double

  /** The x axis rotation in degrees per second. */
  val beta: Double

  /** The y axis rotation in degrees per second. */
  val gamma: Double
}

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
