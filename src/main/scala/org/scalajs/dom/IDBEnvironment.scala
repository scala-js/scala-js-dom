/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The IDBEvironment interface of the IndexedDB API provides asynchronous access to a client-side database. It is
  * implemented by window and Worker objects.
  */
@deprecated(
    "Removed. This feature is no longer recommended. Though some browsers might still support it, it may have already been removed from the relevant web standards, may be in the process of being dropped, or may only be kept for compatibility purposes. Avoid using it, and update existing code if possible. See https://developer.mozilla.org/en-US/docs/Web/API/IDBEnvironment",
    "1.2.0")
@js.native
trait IDBEnvironment extends js.Object {

  /** an IDBRequest object that communicates back to the requesting application through events. This design means that
    * any number of requests can be active on any database at a time.
    */
  @deprecated("Use window.indexedDB", "1.2.0")
  def indexedDB: IDBFactory = js.native
}
