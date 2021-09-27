/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLTableColElement interface provides special properties (beyond the HTMLElement interface it also has
  * available to it inheritance) for manipulating single or grouped table column elements.
  */
@js.native
@JSGlobal
abstract class HTMLTableColElement extends HTMLElement with HTMLTableAlignment {

  /** Reflects the span HTML attribute, indicating the number of columns to apply this object's attributes to. Must be a
    * positive integer.
    */
  var span: Int = js.native
}
