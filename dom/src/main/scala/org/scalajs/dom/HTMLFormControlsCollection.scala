/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The HTMLFormControlsCollection interface represents a collection of HTML form control elements.
  *
  * It represents the lists returned by the HTMLFormElement interface's elements property and the HTMLFieldSetElement
  * interface's elements property.
  *
  * This interface replaces one method from HTMLCollection, on which it is based.
  */
@js.native
@JSGlobal
class HTMLFormControlsCollection private[this] () extends HTMLCollection[RadioNodeList | Element]
