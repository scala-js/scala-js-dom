/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait WindowBase64 extends js.Object {

  /** Creates a base-64 encoded ASCII string from a "string" of binary data. */
  def btoa(rawString: String): String = js.native

  /** Decodes a string of data which has been encoded using base-64 encoding. */
  def atob(encodedString: String): String = js.native
}
