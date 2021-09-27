/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** XMLHttpRequest Level 2 adds support for the new FormData interface. FormData objects provide a way to easily
  * construct a set of key/value pairs representing form fields and their values, which can then be easily sent using
  * the XMLHttpRequest send() method.
  */
@js.native
@JSGlobal
class FormData(form: HTMLFormElement = js.native) extends js.Object {

  /** Appends a key/value pair to the FormData object. */
  def append(name: js.Any, value: js.Any, blobName: String = js.native): Unit = js.native
}

@js.native
@JSGlobal
object FormData extends js.Object
