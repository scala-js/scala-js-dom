/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The LinkStyle interface allows to access the associated CSS style sheet of a node. */
@js.native
trait LinkStyle extends js.Object {

  /** Returns the StyleSheet object associated with the given element, or null if there is none. */
  def sheet: StyleSheet = js.native
}
