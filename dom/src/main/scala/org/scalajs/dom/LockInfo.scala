package org.scalajs.dom

import scala.scalajs.js

@js.native
trait LockInfo extends js.Object {

  def name: String = js.native

  def mode: LockMode = js.native

  def clientId: String = js.native

}
