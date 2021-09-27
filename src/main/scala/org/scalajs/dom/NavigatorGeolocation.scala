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

/** The NavigatorGeolocation interface contains a constructor method allowing objects implementing it to obtain a
  * Geolocation instance.
  *
  * There is no object of type NavigatorGeolocation, but some, like Navigator implements it.
  */
@js.native
trait NavigatorGeolocation extends js.Object {

  /** The NavigatorGeolocation.geolocation read-only property returns a Geolocation object that gives Web content access
    * to the location of the device. This allows a Web site or app offer customized results based on the user's
    * location.
    */
  def geolocation: Geolocation = js.native
}
