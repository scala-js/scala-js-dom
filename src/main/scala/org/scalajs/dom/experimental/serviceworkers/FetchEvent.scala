package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import org.scalajs.dom.webgl.RenderingContext
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** See [[https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent FetchEvent]] on MDN
  *
  * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#fetch-event-section ¶4.5 FetchEvent]] on whatwg
  * ServiceWorker spec.
  */
@js.native
@JSGlobal
class FetchEvent(typeArg: String, init: js.UndefOr[FetchEventInit]) extends ExtendableEvent(typeArg, init) {

  /** Boolean that is true if the event was dispatched with the user's intention for the page to reload, and false
    * otherwise. Typically, pressing the refresh button in a browser is a reload, while clicking a link and pressing the
    * back button is not.
    */
  def isReload: Boolean = js.native

  /** The Request that triggered the event handler. */
  def request: Request = js.native

  def preloadResponse: js.Promise[js.UndefOr[Response]] = js.native

  def clientId: String = js.native

  def replacesClientId: String = js.native

  def resultingClientId: String = js.native

  /** See [[https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/respondWith respondWith]] page on MDN.
    *
    * The respondWith() method of the FetchEvent interface is intended for containing code that generates custom
    * responses to the requests coming from the controlled page. This code will resolve by returning a Response or
    * network error to Fetch.
    *
    * Renderer-side security checks about tainting for cross-origin content are tied to the transparency (or opacity) of
    * the Response body, not URLs. If the request is a top-level navigation and the return value is a Response whose
    * type attribute is opaque (i.e. an opaque response body), a network error is returned to Fetch. The final URL of
    * all successful (non network-error) responses is the requested URL.
    */
  def respondWith(promisedResponse: Response | js.Promise[Response]): Unit = js.native
}
