/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLDialogElement interface provides methods to manipulate &lt;dialog&gt; elements. It inherits properties and
  * methods from the HTMLElement interface.
  */
@js.native
@JSGlobal
abstract class HTMLDialogElement extends HTMLElement {

  /** A boolean value reflecting the `open` HTML attribute, indicating whether the dialog is available for interaction.
    */
  def open: Boolean = js.native

  /** returnValue gets/sets the return value for the dialog. */
  var returnValue: String = js.native

  /** Closes the dialog. An optional string may be passed as an argument, updating the returnValue of the dialog. */
  def close(returnValue: String = js.native): Unit = js.native

  /** Displays the dialog modelessly, i.e. still allowing interaction with content outside of the dialog. */
  def show(): Unit = js.native

  /** Displays the dialog as a modal, over the top of any other dialogs that might be present. Interaction outside the
    * dialog is blocked.
    */
  def showModal(): Unit = js.native
}
