package org.scalajs.dom

import scala.scalajs.js

trait DeviceAcceleration extends js.Any {

  /** The acceleration in x. In m/s<sup>2</sup>. */
  val x: Double

  /** The acceleration in y. In m/s<sup>2</sup>. */
  val y: Double

  /** The acceleration in z. In m/s<sup>2</sup>. */
  val z: Double
}
