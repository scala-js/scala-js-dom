package org.scalajs.dom.experimental

import scala.language.implicitConversions
import scalajs.js

/**
 * Implicit imports for the vibration api.
 *
 * http://www.w3.org/TR/2015/REC-vibration-20150210/
 */
object Vibration {
  implicit def toVibration(n: org.scalajs.dom.Navigator): VibrationNavigator =
    n.asInstanceOf[VibrationNavigator]

  @js.native
  trait VibrationNavigator extends js.Any {

    /** Vibrate the device for the specified number of milliseconds. */
    def vibrate(duration: Double): Boolean = js.native

    /**
     * Vibrate the device in the given pattern.
     *
     * @param pattern the pattern to vibrate.  The first number is the initial
     *                duration, the subsequent a delay of silence, and so on.
     */
    def vibrate(pattern: js.Array[Double]): Boolean = js.native
  }
}
