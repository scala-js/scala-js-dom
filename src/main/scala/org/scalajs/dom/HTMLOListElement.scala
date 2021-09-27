/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLOListElement interface provides special properties (beyond those defined on the regular HTMLElement
  * interface it also has available to it by inheritance) for manipulating ordered list elements.
  */
@js.native
@JSGlobal
abstract class HTMLOListElement extends HTMLElement {

  /** Is a long value reflecting the start and defining the value of the first number of the first element of the list.
    */
  var start: Int = js.native
}
