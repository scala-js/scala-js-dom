package org.scalajs.dom

import scala.scalajs.js

@js.native
trait NavigatorLocks extends js.Object {

  /** A [[LockManager]] object which provides methods for requesting a new [[Lock]] object and querying for an existing
    * [[Lock]] object.
    */
  def locks: LockManager = js.native
}
