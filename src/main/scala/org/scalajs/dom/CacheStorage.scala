package org.scalajs.dom

import scala.scalajs.js

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#cache-storage ¶5.5 cache]] of ServiceWorker
  * whatwg spec.
  */
@js.native
trait CacheStorage extends js.Object {
  def `match`(request: RequestInfo, options: CacheQueryOptions = js.native): js.Promise[js.Any] = js.native

  def has(cacheName: String): js.Promise[Boolean] = js.native

  def open(cacheName: String): js.Promise[Cache] = js.native

  def delete(cacheName: String): js.Promise[Boolean] = js.native

  def keys(): js.Promise[js.Array[String]] = js.native
}
