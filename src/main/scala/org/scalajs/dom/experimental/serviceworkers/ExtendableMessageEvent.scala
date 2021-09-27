package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import org.scalajs.dom.webgl.RenderingContext
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** Service workers define the extendable message event that extends the message event defined in HTML to allow
  * extending the lifetime of the event.
  */
@js.native
@JSGlobal
class ExtendableMessageEvent(typeArg: String, init: js.UndefOr[ExtendableMessageEventInit])
    extends ExtendableEvent(typeArg, init) {

  /** Returns the event's data. It can be any data type. */
  val data: Any = js.native

  /** Returns the origin of the service worker's environment settings object. */
  val origin: String = js.native

  /** Represents, in server-sent events, the last event ID of the event source. */
  val lastEventId: String = js.native

  /** @return
    *   a reference to the service worker that sent the message or `null`.
    */
  def source: ServiceWorker | MessagePort = js.native

  /** It represents the MessagePort array being sent, if any. */
  def ports: js.Array[MessagePort] = js.native
}
