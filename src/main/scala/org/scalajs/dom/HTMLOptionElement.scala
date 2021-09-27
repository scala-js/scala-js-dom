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

/** The HTMLOptionElement interface represents &lt;option&gt; elements and inherits all classes and methods of the
  * HTMLElement interface.
  */
@js.native
@JSGlobal
abstract class HTMLOptionElement extends HTMLElement {

  /** The position of the option within the list of options it belongs to, in tree-order. If the option is not part of a
    * list of options, like when it is part of the &lt;datalist&gt; element, the value is 0.
    */
  def index: Int = js.native

  /** Contains the initial value of the selected HTML attribute, indicating whether the option is selected by default or
    * not.
    */
  var defaultSelected: Boolean = js.native

  /** Reflects the value of the value HTML attribute, if it exists; otherwise reflects value of the Node.textContent
    * property.
    */
  var value: String = js.native

  /** Contains the text content of the element. */
  var text: String = js.native

  /** If the option is a descendent of a &lt;select&gt; element, then this property has the same value as the form
    * property of the corresponding HTMLSelectElement object; otherwise, it is null.
    */
  def form: HTMLFormElement = js.native

  /** Reflects the value of the label HTML attribute, which provides a label for the option. If this attribute isn't
    * specifically set, reading it returns the element's text content.
    */
  var label: String = js.native

  /** Indicates whether the option is currently selected. */
  var selected: Boolean = js.native

  /** Reflects the value of the disabled HTML attribute, which indicates that the option is unavailable to be selected.
    * An option can also be disabled if it is a child of an &lt;optgroup&gt; element that is disabled.
    */
  var disabled: Boolean = js.native

  def create(): HTMLOptionElement = js.native
}
