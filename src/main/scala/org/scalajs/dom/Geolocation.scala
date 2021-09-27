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

/** The Geolocation interface represents an object able to programmatically obtain the position of the device. It gives
  * Web content access to the location of the device. This allows a Web site or app offer customized results based on
  * the user's location.
  */
@js.native
trait Geolocation extends js.Object {

  /** The Geolocation.clearWatch() method is used to unregister location/error monitoring handlers previously installed
    * using Geolocation.watchPosition().
    */
  def clearWatch(watchId: Int): Unit = js.native

  def getCurrentPosition(successCallback: js.Function1[Position, _], errorCallback: js.Function1[PositionError, _],
      options: PositionOptions = js.native): Unit = js.native

  /** The Geolocation.getCurrentPosition() method is used to get the current position of the device. */
  def getCurrentPosition(successCallback: js.Function1[Position, _]): Unit = js.native

  /** The Geolocation.watchPosition() method is used to register a handler function that will be called automatically
    * each time the position of the device changes. You can also, optionally, specify an error handling callback
    * function.
    */
  def watchPosition(successCallback: js.Function1[Position, _],
      errorCallback: js.Function1[PositionError, _] = js.native, options: PositionOptions = js.native): Int = js.native
}
