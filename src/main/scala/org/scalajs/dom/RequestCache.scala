package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestcache RequestCache enum]] */
@js.native
sealed trait RequestCache extends js.Any

object RequestCache {
  val default: RequestCache = "default".asInstanceOf[RequestCache]
  val `no-store` = "no-store".asInstanceOf[RequestCache]
  val reload: RequestCache = "reload".asInstanceOf[RequestCache]
  val `no-cache` = "no-cache".asInstanceOf[RequestCache]
  val `force-cache` = "force-cache".asInstanceOf[RequestCache]
  val `only-if-cached` = "only-if-cached".asInstanceOf[RequestCache]
}
