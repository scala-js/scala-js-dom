/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
object CSS extends js.Object {

  /** The CSS.supports() method returns a boolean value indicating if the browser supports a given CSS feature, or not.
    * Allows to test the support of a pair property-value.
    */
  def supports(propertyName: String, value: String): Boolean = js.native

  /** The CSS.supports() method returns a boolean value indicating if the browser supports a given CSS feature, or not.
    * Takes one parameter matching the condition of @supports.
    */
  def supports(supportCondition: String): Boolean = js.native

}
