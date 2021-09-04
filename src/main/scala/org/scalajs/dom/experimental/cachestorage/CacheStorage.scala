package org.scalajs.dom.experimental.cachestorage

import org.scalajs.dom._
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

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#cache ¶5.4 cache]] of ServiceWorker whatwg
  * spec.
  */
@js.native
@JSGlobal
abstract class Cache extends js.Object {

  def `match`(request: RequestInfo,
      options: js.UndefOr[CacheQueryOptions] = js.native): js.Promise[js.UndefOr[Response]] = js.native

  def matchAll(request: RequestInfo = js.native,
      options: js.UndefOr[CacheQueryOptions] = js.native): js.Promise[js.Array[Response]] = js.native

  def add(request: RequestInfo): js.Promise[Unit] = js.native

  def addAll(requests: js.Array[RequestInfo]): js.Promise[Unit] = js.native

  def put(request: RequestInfo, response: Response): js.Promise[Unit] = js.native

  def delete(request: RequestInfo, options: js.UndefOr[CacheQueryOptions] = js.native): js.Promise[Boolean] = js.native

  def keys(request: js.UndefOr[RequestInfo] = js.native,
      options: js.UndefOr[CacheQueryOptions] = js.native): js.Promise[js.Array[Request]]
}
