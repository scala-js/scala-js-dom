package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import scala.scalajs.js

trait FetchEventInit extends ExtendableEventInit {
  var isReload: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
}
