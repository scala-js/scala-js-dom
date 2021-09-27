/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The Navigator interface represents the state and the identity of the user agent. It allows scripts to query it and
  * to register themselves to carry on some activities.
  *
  * A Navigator object can be retrieved using the read-only Window.navigator property.
  */
@js.native
@JSGlobal
class Navigator
    extends NavigatorID with NavigatorOnLine with NavigatorContentUtils with NavigatorGeolocation
    with NavigatorStorageUtils with NavigatorLanguage with NavigatorVibration {

  /** The Clipboard API adds to the Navigator interface the read-only clipboard property, which returns the Clipboard
    * object used to read and write the clipboard's contents. The Clipboard API can be used to implement cut, copy, and
    * paste features within a web application.
    *
    * Use of the asynchronous clipboard read and write methods requires that the user grant the web site or app
    * permission to access the clipboard. This permission must be obtained from the Permissions API using the
    * "clipboard-read" and/or "clipboard-write" permissions.
    */
  def clipboard: Clipboard = js.native

  /** The navigator.sendBeacon() method can be used to asynchronously transfer small HTTP data from the User Agent to a
    * web server.
    *
    * @param url
    *   The url parameter indicates the resolved URL where the data is to be transmitted.
    * @param data
    *   The data parameter is the ArrayBufferView, Blob, DOMString, or FormData data that is to be transmitted.
    */
  def sendBeacon(url: String, data: BodyInit = js.native): Boolean = js.native

  /** https://storage.spec.whatwg.org/ */
  def storage: StorageManager = js.native

  /** Implements the Gamepad API.
    *
    * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
    */
  def getGamepads(): js.Array[Gamepad] = js.native
}
