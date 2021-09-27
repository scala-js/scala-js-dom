/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The IDBOpenDBRequest interface of the IndexedDB API provides access to results of requests to open databases using
  * specific event handler attributes.
  *
  * @tparam A
  *   Type of `.target.result` on events
  */
@js.native
@JSGlobal
class IDBOpenDBRequest[A] extends IDBRequest[Null, A] {

  /** The event handler for the upgradeneeded event, fired when a database of a bigger version number than the existing
    * stored database is loaded.
    */
  var onupgradeneeded: js.Function1[IDBVersionChangeEvent, _] = js.native

  /** The event handler for the blocked event. This event is triggered when the upgradeneeded should be triggered
    * because of a version change but the database is still in use (ie not closed) somewhere, even after the
    * versionchange event was sent.
    */
  var onblocked: js.Function1[IDBVersionChangeEvent, _] = js.native
}
