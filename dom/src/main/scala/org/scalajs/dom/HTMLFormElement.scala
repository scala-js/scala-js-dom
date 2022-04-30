/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLFormElement interface provides methods to create and modify &lt;form&gt; elements; it inherits from
  * properties and methods of the HTMLElement interface.
  */
@js.native
@JSGlobal
abstract class HTMLFormElement extends HTMLElement {

  /** length returns the number of controls in the FORM element. */
  def length: Int = js.native

  /** target gets/sets the target of the action (i.e., the frame to render its output in). */
  var target: String = js.native

  /** acceptCharset returns a list of the supported character encodings for the given FORM element. This list can be
    * comma- or space-separated.
    */
  var acceptCharset: String = js.native

  /** enctype gets/sets the content type of the FORM element. */
  var enctype: String = js.native

  /** elements returns an HTMLFormControlsCollection (HTML 4 HTMLCollection) of all the form controls contained in the
    * FORM element, with the exception of input elements which have a type attribute of image.
    */
  def elements: HTMLCollection[Element] = js.native

  /** action gets/sets the action of the &lt;form&gt; element. */
  var action: String = js.native

  /** name returns the name of the current form element as a string. */
  var name: String = js.native

  /** method gets/sets the HTTP method used to submit the form. */
  var method: String = js.native

  /** encoding is an alternative name for the enctype element on the DOM HTMLFormElement object. */
  var encoding: String = js.native

  /** reset restores a form element's default values. */
  def reset(): Unit = js.native

  /** Gets the item in the elements collection at the specified index, or null if there is no item at that index. You
    * can also specify the index in array-style brackets or parentheses after the form object name, without calling this
    * method explicitly.
    */
  def item(name: js.Any = js.native, index: js.Any = js.native): js.Dynamic = js.native

  /** This method does something similar to activating a submit button of the form. */
  def submit(): Unit = js.native

  /** Gets the item or list of items in elements collection whose name or id match the specified name, or null if no
    * items match. You can also specify the name in array-style brackets or parentheses after the form object name,
    * without calling this method explicitly.
    */
  def namedItem(name: String): js.Dynamic = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: String): js.Any = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: String, v: js.Any): Unit = js.native

  /** Reflects the autocomplete HTML attribute, containing a string that indicates whether the controls in this form can
    * have their values automatically populated by the browser.
    */
  var autocomplete: String = js.native

  /** Reflects the novalidate HTML attribute, indicating that the form should not be validated. */
  var noValidate: Boolean = js.native

  def checkValidity(): Boolean = js.native

  /** The reportValidity() method returns true if the element's child controls satisfy their validation constraints.
    * When false is returned, cancelable invalid events are fired for each invalid child and validation problems are
    * reported to the user.
    */
  def reportValidity(): Boolean = js.native
}
