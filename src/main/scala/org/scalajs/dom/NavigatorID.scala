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

/** The NavigatorID interface contains methods and properties related to the identity of the browser.
  *
  * There is no object of type NavigatorID, but other interfaces, like Navigator or WorkerNavigator, implement it.
  */
@js.native
trait NavigatorID extends js.Object {

  /** Returns the version of the browser as a string. It may be either a plain version number, like "5.0", or a version
    * number followed by more detailed information. The HTML5 specification also allows any browser to return "4.0"
    * here, for compatibility reasons.
    */
  def appVersion: String = js.native

  /** Returns the name of the browser. The HTML5 specification also allows any browser to return "Netscape" here, for
    * compatibility reasons.
    */
  def appName: String = js.native

  /** Returns the user agent string for the current browser. */
  def userAgent: String = js.native

  /** Returns a string representing the platform of the browser. */
  def platform: String = js.native
}
