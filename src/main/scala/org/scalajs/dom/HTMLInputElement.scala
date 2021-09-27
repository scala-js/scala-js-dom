/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLInputElement interface provides special properties and methods (beyond the regular HTMLElement interface it
  * also has available to it by inheritance) for manipulating the layout and presentation of input elements.
  */
@js.native
@JSGlobal
abstract class HTMLInputElement extends HTMLElement {

  /** Reflects the width HTML attribute, which defines the width of the image displayed for the button, if the value of
    * type is image.
    */
  var width: String = js.native
  var status: Boolean = js.native

  /** The containing form element, if this element is in a form. If this element is not contained in a form element:
    * HTML5 this can be the id attribute of any &lt;form&gt; element in the same document. Even if the attribute is set
    * on &lt;input&gt;, this property will be null, if it isn't the id of a &lt;form&gt; element. HTML 4 this must be
    * null.
    */
  def form: HTMLFormElement = js.native

  /** The index of the beginning of selected text. */
  var selectionStart: Int = js.native

  /** Indicates that a checkbox is neither on nor off. */
  var indeterminate: Boolean = js.native

  /** Reflects the readonly HTML attribute, indicating that the user cannot modify the value of the control. HTML5This
    * is ignored if the value of the type attribute is hidden, range, color, checkbox, radio, file, or a button type.
    */
  var readOnly: Boolean = js.native

  /** Reflects the size HTML attribute, containing size of the control. This value is in pixels unless the value of type
    * is text or password, in which case, it is an integer number of characters. HTML5 Applies only when type is set to
    * text, search, tel, url, email, or password; otherwise it is ignored.
    */
  var size: Int = js.native

  /** The index of the end of selected text. */
  var selectionEnd: Int = js.native

  /** Reflects the accept HTML attribute, containing comma-separated list of file types accepted by the server when type
    * is file.
    */
  var accept: String = js.native

  /** Reflects the alt HTML attribute, containing alternative text to use when type is image. */
  var alt: String = js.native

  /** The default state of a radio button or checkbox as originally specified in HTML that created this object. */
  var defaultChecked: Boolean = js.native

  /** Current value in the control. */
  var value: String = js.native

  /** Reflects the src HTML attribute, which specifies a URI for the location of an image to display on the graphical
    * submit button, if the value of type is image; otherwise it is ignored.
    */
  var src: String = js.native

  /** Reflects the name HTML attribute, containing a name that identifies the element when submitting the form. */
  var name: String = js.native

  /** Reflects the height HTML attribute, which defines the height of the image displayed for the button, if the value
    * of type is image.
    */
  var height: String = js.native

  /** The current state of the element when type is checkbox or radio. */
  var checked: Boolean = js.native

  /** Reflects the disabled HTML attribute, indicating that the control is not available for interaction. The input
    * values will not be submitted with the form.
    */
  var disabled: Boolean = js.native

  /** Reflects the maxlength HTML attribute, containing the maximum length of text (in Unicode code points) that the
    * value can be changed to. The constraint is evaluated only when the value is changed Note: If you set maxLength to
    * a negative value programmatically, an exception will be thrown.
    */
  var maxLength: Int = js.native

  /** Reflects the type HTML attribute, indicating the type of control to display. See type attribute of &lt;input&gt;
    * for possible values.
    */
  var `type`: String = js.native

  /** The default value as originally specified in HTML that created this object. */
  var defaultValue: String = js.native

  /** Selects a range of text in the element (but does not focus it). The optional selectionDirection parameter may be
    * "forward" or "backward" to establish the direction in which selection was set, or "none" if the direction is
    * unknown or not relevant. The default is "none". Specifying a selectionDirection parameter sets the value of the
    * selectionDirection property.
    */
  def setSelectionRange(start: Int, end: Int): Unit = js.native

  /** Selects the input text in the element, and focuses it so the user can subsequently replace the whole entry. */
  def select(): Unit = js.native

  /** A localized message that describes the validation constraints that the control does not satisfy (if any). This is
    * the empty string if the control is not a candidate for constraint validation (willvalidate is false), or it
    * satisfies its constraints.
    */
  def validationMessage: String = js.native
  var files: FileList = js.native

  /** Reflects the max HTML attribute, containing the maximum (numeric or date-time) value for this item, which must not
    * be less than its minimum (min attribute) value.
    */
  var max: String = js.native

  /** Reflects the formtarget HTML attribute, containing a name or keyword indicating where to display the response that
    * is received after submitting the form. If specified, this attribute overrides the target attribute of the
    * &lt;form&gt; element that owns this element.
    */
  var formTarget: String = js.native

  /** Indicates whether the element is a candidate for constraint validation. It is false if any conditions bar it from
    * constraint validation.
    */
  def willValidate: Boolean = js.native

  /** Reflects the step HTML attribute, which works with min and max to limit the increments at which a numeric or
    * date-time value can be set. It can be the string any or a positive floating point number. If this is not set to
    * any, the control accepts only values at multiples of the step value greater than the minimum.
    */
  var step: String = js.native

  /** Reflects the autofocus HTML attribute, which specifies that a form control should have input focus when the page
    * loads, unless the user overrides it, for example by typing in a different control. Only one form element in a
    * document can have the autofocus attribute. It cannot be applied if the type attribute is set to hidden (that is,
    * you cannot automatically set focus to a hidden control).
    */
  var autofocus: Boolean = js.native

  /** Reflects the required HTML attribute, indicating that the user must fill in a value before submitting a form. */
  var required: Boolean = js.native

  /** Reflects the formenctype HTML attribute, containing the type of content that is used to submit the form to the
    * server. If specified, this attribute overrides the enctype attribute of the &lt;form&gt; element that owns this
    * element.
    */
  var formEnctype: String = js.native

  /** The value of the element, interpreted as one of the following in order: a time value a number null if conversion
    * is not possible
    */
  var valueAsNumber: Double = js.native

  /** Reflects the placeholder HTML attribute, containing a hint to the user of what can be entered in the control. The
    * placeholder text must not contain carriage returns or line-feeds. This attribute applies when the value of the
    * type attribute is text, search, tel, url or email; otherwise it is ignored.
    */
  var placeholder: String = js.native

  /** Reflects the formmethod HTML attribute, containing the HTTP method that the browser uses to submit the form. If
    * specified, this attribute overrides the method attribute of the &lt;form&gt; element that owns this element.
    */
  var formMethod: String = js.native

  /** Identifies a list of pre-defined options to suggest to the user. The value must be the id of a &lt;datalist&gt;
    * element in the same document. The browser displays only options that are valid values for this input element. This
    * attribute is ignored when the type attribute's value is hidden, checkbox, radio, file, or a button type.
    */
  var list: HTMLElement = js.native

  /** Reflects the autocomplete HTML attribute, indicating whether the value of the control can be automatically
    * completed by the browser. Ignored if the value of the type attribute is hidden, checkbox, radio, file, or a button
    * type (button, submit, reset, image). Possible values are: off: The user must explicitly enter a value into this
    * field for every use, or the document provides its own auto-completion method; the browser does not automatically
    * complete the entry. on: The browser can automatically complete the value based on values that the user has entered
    * during previous uses.
    */
  var autocomplete: String = js.native

  /** Reflects the min HTML attribute, containing the minimum (numeric or date-time) value for this item, which must not
    * be greater than its maximum (max attribute) value.
    */
  var min: String = js.native

  /** Reflects the formaction HTML attribute, containing the URI of a program that processes information submitted by
    * the element. If specified, this attribute overrides the action attribute of the &lt;form&gt; element that owns
    * this element.
    */
  var formAction: String = js.native

  /** Reflects the pattern HTML attribute, containing a regular expression that the control's value is checked against.
    * The pattern must match the entire value, not just some subset. Use the title attribute to describe the pattern to
    * help the user. This attribute applies when the value of the type attribute is text, search, tel, url or email;
    * otherwise it is ignored.
    */
  var pattern: String = js.native

  /** The validity state that this element is in. */
  def validity: ValidityState = js.native

  /** Reflects the formnovalidate HTML attribute, indicating that the form is not to be validated when it is submitted.
    * If specified, this attribute overrides the novalidate attribute of the &lt;form&gt; element that owns this
    * element.
    */
  var formNoValidate: String = js.native

  /** Reflects the multiple HTML attribute, indicating whether more than one value is possible (e.g., multiple files).
    */
  var multiple: Boolean = js.native

  /** Returns false if the element is a candidate for constraint validation, and it does not satisfy its constraints. In
    * this case, it also fires an invalid event at the element. It returns true if the element is not a candidate for
    * constraint validation, or if it satisfies its constraints.
    */
  def checkValidity(): Boolean = js.native

  /** Decrements the value by (step * n), where n defaults to 1 if not specified. Throws an INVALID_STATE_ERR exception:
    * if the method is not applicable to for the current type value. if the element has no step value. if the value
    * cannot be converted to a number. if the resulting value is above the max or below the min.
    */
  def stepDown(n: Int = js.native): Unit = js.native

  /** Increments the value by (step * n), where n defaults to 1 if not specified. Throws an INVALID_STATE_ERR exception:
    * if the method is not applicable to for the current type value. if the element has no step value. if the value
    * cannot be converted to a number. if the resulting value is above the max or below the min.
    */
  def stepUp(n: Int = js.native): Unit = js.native

  /** Sets a custom validity message for the element. If this message is not the empty string, then the element is
    * suffering from a custom validity error, and does not validate.
    */
  def setCustomValidity(error: String): Unit = js.native
}
