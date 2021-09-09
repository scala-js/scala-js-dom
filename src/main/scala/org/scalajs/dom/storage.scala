package org.scalajs.dom

import scala.scalajs.js

@js.native
trait StorageManager extends js.Object {
  def persisted(): js.Promise[Boolean] = js.native
  def persist(): js.Promise[Boolean] = js.native
  def estimate(): js.Promise[StorageEstimate] = js.native
}

@js.native
trait StorageEstimate extends js.Object {
  val usage: Double = js.native
  val quota: Double = js.native
}
