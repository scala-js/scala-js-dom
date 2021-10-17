package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The RadioNodeList interface represents a collection of radio elements in a <form> or a <fieldset> element. */
@js.native
@JSGlobal
class RadioNodeList extends NodeList[Node] {

  /** If the underlying element collection contains radio buttons, the value property represents the checked radio
    * button. On retrieving the value property, the value of the currently checked radio button is returned as a string.
    * If the collection does not contain any radio buttons or none of the radio buttons in the collection is in checked
    * state, the empty string is returned. On setting the value property, the first radio button input element whose
    * value property is equal to the new value will be set to checked.
    */
  def value: String = js.native
}
