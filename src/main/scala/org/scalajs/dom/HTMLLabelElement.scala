/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLLabelElement interface gives access to properties specific to &lt;label&gt; elements. It inherits from
  * HTMLElement.
  */
@js.native
@JSGlobal
abstract class HTMLLabelElement extends HTMLElement {

  /** The ID of the labeled control. Reflects the for attribute. */
  var htmlFor: String = js.native

  def form: HTMLFormElement = js.native
}
