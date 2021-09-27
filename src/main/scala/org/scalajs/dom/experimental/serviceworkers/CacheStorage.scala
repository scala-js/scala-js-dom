package org.scalajs.dom.experimental.serviceworkers

import scala.scalajs.js

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#cache-storage ¶5.5 cache]] of ServiceWorker
  * whatwg spec.
  */
@deprecated("Use org.scalajs.dom.experimental.cachestorage.CacheStorage", "1.2.0")
@js.native
trait CacheStorage extends org.scalajs.dom.experimental.cachestorage.CacheStorage
