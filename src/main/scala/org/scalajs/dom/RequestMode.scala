package org.scalajs.dom

import scala.scalajs.js

/** Fetch API's [[https://fetch.spec.whatwg.org/#requestmode RequestMode enum]] */
@js.native
sealed trait RequestMode extends js.Any

object RequestMode {
  val navigate: RequestMode = "navigate".asInstanceOf[RequestMode]
  val `same-origin` = "same-origin".asInstanceOf[RequestMode]
  val `no-cors` = "no-cors".asInstanceOf[RequestMode]
  val cors: RequestMode = "cors".asInstanceOf[RequestMode]
}
