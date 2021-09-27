package org.scalajs.dom

import scala.scalajs.js

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
