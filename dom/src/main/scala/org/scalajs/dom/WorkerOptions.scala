package org.scalajs.dom

import scala.scalajs.js

@js.native
trait WorkerOptions extends js.Any {
  var credentials: js.UndefOr[RequestCredentials] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[WorkerType] = js.native
}
