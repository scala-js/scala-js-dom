package org.scalajs.dom

import scala.scalajs.js

/** Fetch API's [[https://fetch.spec.whatwg.org/#requestredirect RequestRedirect enum]] */
opaque type RequestRedirect = String

object RequestRedirect {
  val follow: RequestRedirect = "follow"
  val error: RequestRedirect = "error"
  val manual: RequestRedirect = "manual"
}
