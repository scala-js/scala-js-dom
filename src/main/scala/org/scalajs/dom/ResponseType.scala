package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ResponseType extends js.Any

/** see [[https://fetch.spec.whatwg.org/#responsetype]] of whatwg Fetch spec */
object ResponseType {
  val basic: ResponseType = "basic".asInstanceOf[ResponseType]
  val cors: ResponseType = "cors".asInstanceOf[ResponseType]
  val default: ResponseType = "default".asInstanceOf[ResponseType]
  val error: ResponseType = "error".asInstanceOf[ResponseType]
  val opaque: ResponseType = "opaque".asInstanceOf[ResponseType]
  val opaqueredirect: ResponseType = "opaqueredirect".asInstanceOf[ResponseType]
}
