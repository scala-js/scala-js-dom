package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#cache ¶5.4 cache]] of ServiceWorker whatwg
  * spec.
  */
@js.native
trait CacheQueryOptions extends js.Object {
  var ignoreSearch: Boolean = js.native // false

  var ignoreMethod: Boolean = js.native // false

  var ignoreVary: Boolean = js.native //false

  var cacheName: String = js.native
}
