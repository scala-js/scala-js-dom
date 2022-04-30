/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLTextAreaElement interface, which provides special properties and methods (beyond the regular HTMLElement
  * interface it also has available to it by inheritance) for manipulating the layout and presentation of
  * &lt;textarea&gt; elements.
  */
@js.native
@JSGlobal
abstract class HTMLTextAreaElement extends HTMLElement {

  /** The raw value contained in the control. */
  var value: String = js.native
  var status: js.Any = js.native

  /** The containing form element, if this element is in a form. If this element is not contained in a form element, it
    * can be the id attribute of any &lt;form&gt; element in the same document or the value null.
    */
  def form: HTMLFormElement = js.native

  /** Reflects name HTML attribute, containing the name of the control. */
  var name: String = js.native

  /** Reflects the disabled HTML attribute, indicating that the control is not available for interaction. */
  var disabled: Boolean = js.native

  /** The index of the beginning of selected text. If no text is selected, contains the index of the character that
    * follows the input cursor. On being set, the control behaves as if setSelectionRange() had been called with this as
    * the first argument, and selectionEnd as the second argument.
    */
  var selectionStart: Int = js.native

  /** Reflects the rows HTML attribute, indicating the number of visible text lines for the control. */
  var rows: Int = js.native

  /** Reflects the cols HTML attribute, indicating the visible width of the text area. */
  var cols: Int = js.native

  /** Reflects the readonly HTML attribute, indicating that the user cannot modify the value of the control. */
  var readOnly: Boolean = js.native

  /** Reflects the wrap HTML attribute, indicating how the control wraps text. */
  var wrap: String = js.native

  /** The index of the end of selected text. If no text is selected, contains the index of the character that follows
    * the input cursor. On being set, the control behaves as if setSelectionRange() had been called with this as the
    * second argument, and selectionStart as the first argument.
    */
  var selectionEnd: Int = js.native

  /** The string textarea. */
  def `type`: String = js.native

  /** The control's default value, which behaves like the element.textContent property. */
  var defaultValue: String = js.native

  /** Selects a range of text, and sets selectionStart and selectionEnd. If either argument is greater than the length
    * of the value, it is treated as pointing to the end of the value. If end is less than start, then both are treated
    * as the value of end.
    */
  def setSelectionRange(start: Int, end: Int): Unit = js.native

  /** Selects the contents of the control. */
  def select(): Unit = js.native

  /** A localized message that describes the validation constraints that the control does not satisfy (if any). This is
    * the empty string if the control is not a candidate for constraint validation (willValidate is false), or it
    * satisfies its constraints.
    */
  def validationMessage: String = js.native

  /** Reflects the autofocus HTML attribute, indicating that the control should have input focus when the page loads */
  var autofocus: Boolean = js.native

  /** The validity states that this element is in. */
  def validity: ValidityState = js.native

  /** Reflects the required HTML attribute, indicating that the user must specify a value before submitting the form. */
  var required: Boolean = js.native

  /** Reflects the maxlength HTML attribute, indicating the maximum number of characters the user can enter. This
    * constraint is evaluated only when the value changes.
    */
  var maxLength: Int = js.native

  /** Indicates whether the element is a candidate for constraint validation. It is false if any conditions bar it from
    * constraint validation.
    */
  def willValidate: Boolean = js.native

  /** Reflects the placeholder HTML attribute, containing a hint to the user about what to enter in the control. */
  var placeholder: String = js.native

  /** Returns false if the button is a candidate for constraint validation, and it does not satisfy its constraints. In
    * this case, it also fires an invalid event at the control. It returns true if the control is not a candidate for
    * constraint validation, or if it satisfies its constraints.
    */
  def checkValidity(): Boolean = js.native

  /** Sets a custom validity message for the element. If this message is not the empty string, then the element is
    * suffering from a custom validity error, and does not validate.
    */
  def setCustomValidity(error: String): Unit = js.native

  def reportValidity(): Boolean = js.native
}
