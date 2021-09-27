package org.scalajs.dom

import scala.scalajs.js

@js.native
trait StorageEstimate extends js.Object {
  val usage: Double = js.native
  val quota: Double = js.native
}
