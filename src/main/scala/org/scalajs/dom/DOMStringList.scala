/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A type returned by DOMConfiguration.parameterNames which contains a list of DOMString (strings). */
@js.native
@JSGlobal
class DOMStringList private[this] () extends DOMList[String] {
  def item(index: Int): String = js.native

  def contains(str: String): Boolean = js.native
}
