/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait WindowTimers extends js.Object {

  /** Clears the delay set by window.setTimeout(). */
  def clearTimeout(handle: Int): Unit = js.native

  /** Calls a function or executes a code snippet after a specified delay. */
  def setTimeout(handler: js.Function0[Any], timeout: Double): Int = js.native

  /** Cancels repeated action which was set up using setInterval. */
  def clearInterval(handle: Int): Unit = js.native

  /** Calls a function or executes a code snippet repeatedly, with a fixed time delay between each call to that
    * function.
    */
  def setInterval(handler: js.Function0[Any], timeout: Double): Int = js.native
}
