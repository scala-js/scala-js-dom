/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The Position interface represents the position of the concerned device at a given time. The position, represented by
  * a Coordinates object, comprehends the 2D position of the device, on a spheroid representing the Earth, but also its
  * altitude and its speed.
  */
@js.native
trait Position extends js.Object {

  /** The Position.timestamp read-only property, a DOMTimeStamp object, represents the date and the time of the creation
    * of the Position object it belongs to. The precision is to the millisecond.
    */
  def timestamp: Double = js.native

  /** The Position.coords read-only property, a Coordinates object, represents a geographic attitude: it contains the
    * location, that is longitude and latitude on the Earth, the altitude, and the speed of the object concerned,
    * regrouped inside the returned value. It also contains accuracy information about these values.
    */
  def coords: Coordinates = js.native
}
