package org.scalajs.dom

import scala.scalajs.js

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#clients ¶4.3 clients]] of ServiceWorker
  * whatwg spec.
  */
@js.native
trait Clients extends js.Object {
  def get(id: String): js.Promise[js.UndefOr[Client]] = js.native

  def matchAll(options: js.UndefOr[ClientQueryOptions] = js.native): js.Promise[js.Array[Client]] = js.native

  def openWindow(url: String): js.Promise[WindowClient] = js.native

  def claim(): js.Promise[Unit] = js.native
}
