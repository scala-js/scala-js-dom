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
