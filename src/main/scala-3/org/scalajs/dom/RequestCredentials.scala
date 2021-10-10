package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestcredentials RequestCredentials enum]] */
opaque type RequestCredentials = String

object RequestCredentials {
  val omit: RequestCredentials = "omit"
  val `same-origin` = "same-origin"
  val include: RequestCredentials = "include"
}
