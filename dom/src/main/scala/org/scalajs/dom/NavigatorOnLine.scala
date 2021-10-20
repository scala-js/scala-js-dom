/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The NavigatorOnLine interface contains methods and properties related to the connectivity status of the browser. */
@js.native
trait NavigatorOnLine extends js.Object {

  /** Returns the online status of the browser. The property returns a boolean value, with true for being online and
    * false for being offline. The property sends updates whenever the browser's ability to connect to the network
    * changes. The update occurs when the user follows links or when a script requests a remote page. For example, the
    * property should return false when users click links soon after they lose internet connection.
    */
  def onLine: Boolean = js.native
}
