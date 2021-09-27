package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestdestination RequestDestination enum]] */
@js.native
sealed trait RequestDestination extends js.Any

object RequestDestination {
  val empty: RequestDestination = "".asInstanceOf[RequestDestination]
  val document: RequestDestination = "document".asInstanceOf[RequestDestination]
  val sharedworker: RequestDestination = "sharedworker".asInstanceOf[RequestDestination]
  val subresource: RequestDestination = "subresource".asInstanceOf[RequestDestination]
  val unknown: RequestDestination = "unknown".asInstanceOf[RequestDestination]
  val worker: RequestDestination = "worker".asInstanceOf[RequestDestination]
}
