/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLButtonElement interface provides properties and methods (beyond the &lt;button&gt; object interface it also
  * has available to them by inheritance) for manipulating the layout and presentation of button elements.
  */
@js.native
@JSGlobal
abstract class HTMLButtonElement extends HTMLElement {

  /** The current form control value of the button. */
  var value: String = js.native
  var status: js.Any = js.native

  /** The form that this button is associated with. If the button is a descendant of a form element, then this attribute
    * is the ID of that form element. If the button is not a descendant of a form element, then the attribute can be the
    * ID of any form element in the same document it is related to, or the null value if none matches.
    */
  def form: HTMLFormElement = js.native

  /** The name of the object when submitted with a form. HTML5 If specified, it must not be the empty string. */
  var name: String = js.native
  var `type`: String = js.native

  /** The control is disabled, meaning that it does not accept any clicks. */
  var disabled: Boolean = js.native

  /** A localized message that describes the validation constraints that the control does not satisfy (if any). This
    * attribute is the empty string if the control is not a candidate for constraint validation (willValidate is false),
    * or it satisfies its constraints.
    */
  def validationMessage: String = js.native

  /** A name or keyword indicating where to display the response that is received after submitting the form. If
    * specified, this attribute overrides the target attribute of the &lt;form&gt; element that owns this element.
    */
  var formTarget: String = js.native

  /** Indicates whether the button is a candidate for constraint validation. It is false if any conditions bar it from
    * constraint validation.
    */
  def willValidate: Boolean = js.native

  /** The URI of a resource that processes information submitted by the button. If specified, this attribute overrides
    * the action attribute of the &lt;form&gt; element that owns this element.
    */
  var formAction: String = js.native

  /** The control should have input focus when the page loads, unless the user overrides it, for example by typing in a
    * different control. Only one form-associated element in a document can have this attribute specified.
    */
  var autofocus: Boolean = js.native

  /** The validity states that this button is in. */
  def validity: ValidityState = js.native

  /** Indicates that the form is not to be validated when it is submitted. If specified, this attribute overrides the
    * enctype attribute of the &lt;form&gt; element that owns this element.
    */
  var formNoValidate: String = js.native
  var formEnctype: String = js.native

  /** The HTTP method that the browser uses to submit the form. If specified, this attribute overrides the method
    * attribute of the &lt;form&gt; element that owns this element.
    */
  var formMethod: String = js.native

  def checkValidity(): Boolean = js.native

  def setCustomValidity(error: String): Unit = js.native
}
