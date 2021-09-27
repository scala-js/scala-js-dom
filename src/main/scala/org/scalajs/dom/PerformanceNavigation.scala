/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The PerformanceNavigation interface represents information about how the navigtion to the current document was done.
  */
@js.native
@JSGlobal
class PerformanceNavigation extends js.Object {

  /** The PerformanceNavigation.redirectCount read-only property returns an unsigned short representing the number of
    * REDIRECTs done before reaching the page.
    */
  def redirectCount: Int = js.native

  def `type`: Int = js.native

  /** Is a jsonizer returning a json object representing the PerformanceNavigation object. */
  def toJSON(): js.Dynamic = js.native
}

@js.native
@JSGlobal
object PerformanceNavigation extends js.Object {

  val TYPE_RELOAD: Int = js.native
  val TYPE_RESERVED: Int = js.native
  val TYPE_BACK_FORWARD: Int = js.native
  val TYPE_NAVIGATE: Int = js.native
}
