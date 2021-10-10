package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestdestination RequestDestination enum]] */
opaque type RequestDestination = String

object RequestDestination {
  val empty: RequestDestination = ""
  val document: RequestDestination = "document"
  val sharedworker: RequestDestination = "sharedworker"
  val subresource: RequestDestination = "subresource"
  val unknown: RequestDestination = "unknown"
  val worker: RequestDestination = "worker"
}
