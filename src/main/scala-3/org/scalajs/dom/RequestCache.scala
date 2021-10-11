package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestcache RequestCache enum]] */
opaque type RequestCache = String

object RequestCache {
  val default: RequestCache = "default"
  val `no-store`: RequestCache = "no-store"
  val reload: RequestCache = "reload"
  val `no-cache`: RequestCache = "no-cache"
  val `force-cache`: RequestCache = "force-cache"
  val `only-if-cached`: RequestCache = "only-if-cached"
}
