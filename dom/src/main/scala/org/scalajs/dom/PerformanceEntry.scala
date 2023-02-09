/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Encapsulates a single performance metric that is part of the browser's performance timeline. */
@js.native
@JSGlobal
class PerformanceEntry extends js.Object {

  /** The name for a performance entry. It acts as an identifier, but it does not have to be unique. The value depends
    * on the subclass.
    */
  def name: String = js.native

  /** The first timestamp recorded for this performance entry. The meaning of this property depends on the value of this
    * entry's [[entryType]].
    */
  def startTime: Double = js.native

  /** The duration of the performance entry. The meaning of this property depends on the value of this entry's
    * [[entryType]].
    */
  def duration: Int = js.native

  /** The type of performance metric that this entry represents. */
  def entryType: String = js.native
}
