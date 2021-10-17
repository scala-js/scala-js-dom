package org.scalajs.dom

import scala.scalajs.js

opaque type ResponseType = String

/** see [[https://fetch.spec.whatwg.org/#responsetype]] of whatwg Fetch spec */
object ResponseType {
  val basic: ResponseType = "basic"
  val cors: ResponseType = "cors"
  val default: ResponseType = "default"
  val error: ResponseType = "error"
  val opaque: ResponseType = "opaque"
  val opaqueredirect: ResponseType = "opaqueredirect"
}
