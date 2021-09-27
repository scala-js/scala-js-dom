/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLParamElement interface provides special properties (beyond those of the regular HTMLElement object interface
  * it inherits) for manipulating &lt;param&gt; elements, representing a pair of a key and a value that acts as a
  * parameter for an &lt;object&gt; element.
  */
@js.native
@JSGlobal
abstract class HTMLParamElement extends HTMLElement {

  /** Is a DOMString representing the value associated to the parameter. It reflects the value attribute. */
  var value: String = js.native

  /** Is a DOMString representing the name of the parameter. It reflects the name attribute. */
  var name: String = js.native
}
