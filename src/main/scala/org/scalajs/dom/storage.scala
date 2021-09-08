package org.scalajs.dom

import scala.scalajs.js

@js.native
trait StorageManager extends js.Any {
  def persisted(): js.Promise[Boolean] = js.native
  def persist(): js.Promise[Boolean] = js.native
  def estimate(): js.Promise[StorageEstimate] = js.native
}

@js.native
trait StorageEstimate extends js.Any {
  val usage: Double = js.native
  val quota: Double = js.native
}
