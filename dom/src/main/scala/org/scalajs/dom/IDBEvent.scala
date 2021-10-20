/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** @tparam A Type of `.target.result` */
@js.native
@JSGlobal("Event")
class IDBEvent[+A](typeArg: String, init: js.UndefOr[EventInit] = js.undefined) extends Event(typeArg, init) {
  override def target: IDBEventTarget[A] = js.native
}
