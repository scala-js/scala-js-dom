package org.scalajs.dom

import scala.scalajs.js

/** Fetch API's [[https://fetch.spec.whatwg.org/#requestredirect RequestRedirect enum]] */
@js.native
sealed trait RequestRedirect extends js.Any

object RequestRedirect {
  val follow: RequestRedirect = "follow".asInstanceOf[RequestRedirect]
  val error: RequestRedirect = "error".asInstanceOf[RequestRedirect]
  val manual: RequestRedirect = "manual".asInstanceOf[RequestRedirect]
}
