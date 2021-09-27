/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGNumber interface correspond to the &lt;number&gt; basic data type. */
@js.native
@JSGlobal
class SVGNumber extends js.Object {

  /** The value of the given attribute. Exceptions on setting: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
    * Raised on an attempt to change the value of a read only attribute.
    */
  var value: Double = js.native
}
