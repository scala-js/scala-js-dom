package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.|

trait ExtendableMessageEventInit extends ExtendableEventInit {
  var data: js.UndefOr[Any] = js.undefined

  var origin: js.UndefOr[String] = js.undefined

  var lastEventId: js.UndefOr[String] = js.undefined

  var source: js.UndefOr[Client | ServiceWorker | MessagePort] = js.undefined

  var ports: js.UndefOr[js.Array[MessagePort]] = js.undefined
}
