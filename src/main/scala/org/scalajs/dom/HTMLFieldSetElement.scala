/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.{MediaSource, MediaStream}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The HTMLFieldSetElement interface special properties and methods (beyond the regular HTMLelement interface it also
  * has available to it by inheritance) for manipulating the layout and presentation of field-set elements.
  */
@js.native
@JSGlobal
abstract class HTMLFieldSetElement extends HTMLElement {

  /** The containing form element, if this element is in a form. If the button is not a descendant of a form element,
    * then the attribute can be the ID of any form element in the same document it is related to, or the null value if
    * none matches.
    */
  def form: HTMLFormElement = js.native

  /** Reflects the disabled HTML attribute, indicating whether the user can interact with the control. */
  var disabled: Boolean = js.native

  /** A localized message that describes the validation constraints that the element does not satisfy (if any). This is
    * the empty string if the element is not a candidate for constraint validation (willValidate is false), or it
    * satisfies its constraints.
    */
  def validationMessage: String = js.native

  /** The validity states that this element is in. */
  def validity: ValidityState = js.native

  /** Always false because &lt;fieldset&gt; objects are never candidates for constraint validation. */
  def willValidate: Boolean = js.native

  /** Always returns true because &lt;fieldset&gt; objects are never candidates for constraint validation. */
  def checkValidity(): Boolean = js.native

  /** Sets a custom validity message for the field set. If this message is not the empty string, then the field set is
    * suffering from a custom validity error, and does not validate.
    */
  def setCustomValidity(error: String): Unit = js.native
}
