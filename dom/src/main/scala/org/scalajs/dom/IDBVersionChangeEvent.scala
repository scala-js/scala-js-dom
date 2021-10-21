/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The specification has changed and some not up-to-date browsers only support the deprecated unique attribute,
  * version, from an early draft version.
  */
@js.native
@JSGlobal
class IDBVersionChangeEvent(typeArg: String, init: js.UndefOr[IDBVersionChangeEventInit])
    extends IDBEvent[IDBDatabase](typeArg, init) {

  /** Returns the new version of the database.
    *
    * This is null when the database is being deleted.
    */
  def newVersion: java.lang.Double = js.native

  /** Returns the old version of the database. */
  def oldVersion: Double = js.native
}

object IDBVersionChangeEvent {

  @inline implicit final class Ops(private val e: IDBVersionChangeEvent) extends AnyVal {

    /** Returns the new version of the database.
      *
      * This is None when the database is being deleted.
      */
    def newVersionOption: Option[Double] =
      (e.newVersion: Any) match {
        case i: Double => Some(i)
        case _         => None
      }
  }
}
