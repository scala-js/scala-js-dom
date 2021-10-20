package org.scalajs.dom

import scala.scalajs.js

trait DeviceRotationRate extends js.Any {

  /** The z axis rotation in degrees per second. */
  val alpha: Double

  /** The x axis rotation in degrees per second. */
  val beta: Double

  /** The y axis rotation in degrees per second. */
  val gamma: Double
}
