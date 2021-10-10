package org.scalajs.dom

import scala.scalajs.js

/** Fetch API's [[https://fetch.spec.whatwg.org/#requestmode RequestMode enum]] */
opaque type RequestMode = String

object RequestMode {
  val navigate: RequestMode = "navigate"
  val `same-origin` = "same-origin"
  val `no-cors` = "no-cors"
  val cors: RequestMode = "cors"
}
