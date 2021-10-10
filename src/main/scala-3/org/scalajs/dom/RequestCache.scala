package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestcache RequestCache enum]] */
opaque type RequestCache = String

object RequestCache {
  val default: RequestCache = "default"
  val `no-store` = "no-store"
  val reload: RequestCache = "reload"
  val `no-cache` = "no-cache"
  val `force-cache` = "force-cache"
  val `only-if-cached` = "only-if-cached"
}
