package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The [[LockManager]] interface of the Web Locks API provides methods for requesting a new [[Lock]] object and
  * querying for an existing [[Lock]] object. To get an instance of [[LockManager]], call `navigator.locks`.
  */
@js.native
@JSGlobal
class LockManager private[this] extends js.Object {

  /** Resolves with an object containing information about held and pending locks. */
  def query(): js.Promise[LockManagerSnapshot] = js.native

  /** Requests a [[Lock]] object with parameters specifying its name and characteristics. The requested [[Lock]] is
    * passed to a callback, while the function itself returns a [[js.Promise]] that resolves with `undefined`.
    */
  def request(name: String, callback: js.Function1[Lock, js.Promise[Unit]]): js.Promise[Unit] = js.native

  def request(name: String, options: LockOptions,
      callback: js.Function1[Lock, js.Promise[Unit]]): js.Promise[Unit] = js.native

}
