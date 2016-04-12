package org.scalajs.dom.experimental.deviceorientation

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
class DeviceOrientationEvent(
    `type`: String,
    eventInitDict: DeviceOrientationEventInit
) extends dom.Event {
  /** Z-Axis rotation in degrees. */
  val alpha: Double = js.native

  /** X-Axis rotation in degrees. */
  val beta: Double = js.native

  /** Y-Axis rotation in degrees. */
  val gamma: Double = js.native

  /**
   * If true, this event data is has been produced using sensor fusion from
   * the magnometer and other sensors.  When false- only the gyroscope has
   * been used.
   */
  val absolute: Boolean = js.native
}

@ScalaJSDefined
trait DeviceOrientationEventInit extends js.Object {
  /** Z-Axis rotation in degrees. */
  val alpha: Double

  /** X-Axis rotation in degrees. */
  val beta: Double

  /** Y-Axis rotation in degrees. */
  val gamma: Double

  /**
   * If true, this event data is has been produced using sensor fusion from
   * the magnometer and other sensors.  When false- only the gyroscope has
   * been used.
   */
  val absolute: Boolean
}

object DeviceOrientationEventInit {
  def apply(
      alpha: Double,
      beta: Double,
      gamma: Double,
      absolute: Boolean): DeviceOrientationEventInit = {
    js.Dynamic.literal(
      alpha = alpha,
      beta = beta,
      gamma = gamma,
      absolute = absolute).asInstanceOf[DeviceOrientationEventInit]
  }
}

@ScalaJSDefined
trait DeviceAcceleration extends js.Any  {
  /** The acceleration in x. In m/s<sup>2</sup>. */
  val x: Double

  /** The acceleration in y. In m/s<sup>2</sup>. */
  val y: Double

  /** The acceleration in z. In m/s<sup>2</sup>. */
  val z: Double
}

@ScalaJSDefined
trait DeviceRotationRate extends js.Any {
  /** The z axis rotation in degrees per second. */
  val alpha: Double

  /** The x axis rotation in degrees per second. */
  val beta: Double

  /** The y axis rotation in degrees per second. */
  val gamma: Double
}

@js.native
class DeviceMotionEvent extends dom.Event {
  /** Device acceleration with gravity removed. */
  val acceleration: DeviceAcceleration = js.native

  /** Device acceleration including the force of gravity. */
  val accelerationIncludingGravity: DeviceAcceleration = js.native

  /** The rate of rotation. */
  val rotationRate: DeviceRotationRate = js.native

  /** The sampling rate in seconds that data is received from the hardware. */
  val interval: Double = js.native
}

@ScalaJSDefined
trait DeviceMotionEventInit extends js.Any {
  /** Device acceleration with gravity removed. */
  val acceleration: DeviceAcceleration

  /** Device acceleration including the force of gravity. */
  val accelerationIncludingGravity: DeviceAcceleration

  /** The rate of rotation. */
  val rotationRate: DeviceRotationRate

  /** The sampling rate in seconds that data is received from the hardware. */
  val interval: Double
}
