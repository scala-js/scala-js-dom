/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The Coordinates interface represents the position and attitude of the device on Earth, as well as the accuracy with
  * which these data are computed.
  */
@js.native
trait Coordinates extends js.Object {

  /** The Coordinates.altitudeAccuracy read-only property is a strictly positive double representing the accuracy, with
    * a 95% confidence level, of the altitude expressed in meters. This value is null if the implementation doesn't
    * support measuring altitude.
    */
  def altitudeAccuracy: Double = js.native

  /** The Coordinates.longitude read-only property is a double representing the longitude of the position in decimal
    * degrees.
    */
  def longitude: Double = js.native

  /** The Coordinates.latitude read-only property is a double representing the latitude of the position in decimal
    * degrees.
    */
  def latitude: Double = js.native

  /** The Coordinates.speed read-only property is a double representing the velocity of the device in meters per second.
    * This value is null if the implementation is not able to measure it.
    */
  def speed: Double = js.native

  /** The Coordinates.heading read-only property is a double representing the direction in which the device is
    * traveling. This value, specified in degrees, indicates how far off from heading due north the device is. 0 degrees
    * represents true true north, and the direction is determined clockwise (which means that east is 90 degrees and
    * west is 270 degrees). If Coordinates.speed is 0, heading is NaN. If the device is not able to provide heading
    * information, this value is null.
    */
  def heading: Double = js.native

  /** The Coordinates.altitude read-only property is a double representing the altitude of the position in meters,
    * relative to sea level. This value is null if the implementation cannot provide this data.
    */
  def altitude: Double = js.native

  /** The Coordinates.accuracy read-only property is a strictly positive double representing the accuracy, with a 95%
    * confidence level, of the Coordinates.latitude and Coordinates.longitude properties expressed in meters.
    */
  def accuracy: Double = js.native
}
