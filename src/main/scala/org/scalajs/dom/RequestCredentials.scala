package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestcredentials RequestCredentials enum]] */
@js.native
sealed trait RequestCredentials extends js.Any

object RequestCredentials {
  val omit: RequestCredentials = "omit".asInstanceOf[RequestCredentials]
  val `same-origin` = "same-origin".asInstanceOf[RequestCredentials]
  val include: RequestCredentials = "include".asInstanceOf[RequestCredentials]
}
