package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The [[Lock]] interface of the Web Locks API provides the name and mode of a lock. This may be a newly requested lock
  * that is received in the callback to [[LockManager.request]], or a record of an active or queued lock returned by
  * [[LockManager.query]].
  */
@js.native
@JSGlobal
class Lock private[this] extends js.Object {

  /** The access mode passed to [[LockManager.request]] when the lock was requested. */
  def mode: LockMode = js.native

  /** The name passed to [[LockManager.request]] when the lock was requested. */
  def name: String = js.native

}
