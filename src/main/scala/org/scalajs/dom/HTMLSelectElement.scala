/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** DOM select elements share all of the properties and methods of other HTML elements described in the element section.
  * They also have the specialized interface HTMLSelectElement (or HTML 4 HTMLSelectElement).
  */
@js.native
@JSGlobal
abstract class HTMLSelectElement extends HTMLElement {

  /** The set of &lt;option&gt; elements contained by this element. Read only. */
  val options: js.Array[HTMLOptionElement] = js.native

  /** The value of this form control, that is, of the first selected option. */
  var value: String = js.native

  /** The form that this element is associated with. If this element is a descendant of a form element, then this
    * attribute is the ID of that form element. If the element is not a descendant of a form element, then: HTML5 The
    * attribute can be the ID of any form element in the same document. HTML 4 The attribute is null. Read only.
    */
  def form: HTMLFormElement = js.native

  /** Reflects the name HTML attribute, containing the name of this control used by servers and DOM search functions. */
  var name: String = js.native

  /** Reflects the size HTML attribute, which contains the number of visible items in the control. The default is 1,
    * HTML5 unless multiple is true, in which case it is 4.
    */
  var size: Int = js.native

  /** The number of &lt;option&gt; elements in this select element. */
  var length: Int = js.native

  /** The index of the first selected &lt;option&gt; element. */
  var selectedIndex: Int = js.native

  /** Reflects the multiple HTML attribute, whichindicates whether multiple items can be selected. */
  var multiple: Boolean = js.native
  def `type`: String = js.native

  /** Reflects the disabled HTML attribute, which indicates whether the control is disabled. If it is disabled, it does
    * not accept clicks.
    */
  var disabled: Boolean = js.native

  /** Removes the element at the specified index from the options collection for this select element. */
  def remove(index: Int = js.native): Unit = js.native

  /** Adds an element to the collection of option elements for this select element. */
  def add(element: HTMLElement, before: js.Any = js.native): Unit = js.native

  def item(name: js.Any = js.native, index: js.Any = js.native): js.Dynamic = js.native

  def namedItem(name: String): js.Dynamic = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: String): js.Any = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: String, v: js.Any): Unit = js.native

  /** A localized message that describes the validation constraints that the control does not satisfy (if any). This
    * attribute is the empty string if the control is not a candidate for constraint validation (willValidate is false),
    * or it satisfies its constraints. Read only. HTML5
    */
  def validationMessage: String = js.native

  /** Reflects the autofocus HTML attribute, which indicates whether the control should have input focus when the page
    * loads, unless the user overrides it, for example by typing in a different control. Only one form-associated
    * element in a document can have this attribute specified. HTML5
    */
  var autofocus: Boolean = js.native

  /** The validity states that this control is in. Read only. HTML5 */
  def validity: ValidityState = js.native

  /** Reflects the required HTML attribute, which indicates whether the user is required to select a value before
    * submitting the form. HTML5
    */
  var required: Boolean = js.native

  /** Indicates whether the button is a candidate for constraint validation. It is false if any conditions bar it from
    * constraint validation. Read only. HTML5
    */
  def willValidate: Boolean = js.native

  def checkValidity(): Boolean = js.native

  def setCustomValidity(error: String): Unit = js.native
}
