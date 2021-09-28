package org.scalajs.dom

import scala.scalajs.js

/** [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client ¶4.2 Client]] of Service Workers 1 spec.
  */
@js.native
trait ClientQueryOptions extends js.Object {
  var includeUncontrolled: Boolean = js.native

  var `type`: ClientType = js.native
}
