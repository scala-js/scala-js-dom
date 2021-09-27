package org.scalajs.dom.experimental.serviceworkers

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#cache ¶5.4 cache]] of ServiceWorker whatwg
  * spec.
  */
@deprecated("Use org.scalajs.dom.experimental.cachestorage.Cache", "1.2.0")
@js.native
@JSGlobal
abstract class Cache extends org.scalajs.dom.experimental.cachestorage.Cache
