package org.scalajs.dom

import scala.scalajs.js

trait WorkerOptions extends js.Object {
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[WorkerType] = js.undefined
}
