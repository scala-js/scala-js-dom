package org.scalajs.dom

import scala.scalajs.js

/** an object containing a snapshot of the [[LockManager]] state */
@js.native
trait LockManagerSnapshot extends js.Object {

  /** An array of [[Lock]] objects for held locks. */
  def held: js.Array[LockInfo] = js.native

  /** An array of [[Lock]] objects for pending lock requests. */
  def pending: js.Array[LockInfo] = js.native

}
