package org.scalajs.dom.experimental.serviceworkers

import scala.scalajs.js

/** The WindowClient interface of the ServiceWorker API represents the scope of a service worker client that is a
  * document in a browser context, controlled by an active worker. The service worker client independently selects and
  * uses a service worker for its own loading and sub-resources.
  */
@js.native
trait WindowClient extends Client {

  /** The visibilityState read-only property of the WindowClient interface indicates the visibility of the current
    * client. This value can be one of hidden, visible, prerender, or unloaded.
    */
  //todo: stubs for https://www.w3.org/TR/page-visibility/#dom-document-visibilitystate
  def visibilityState: String = js.native

  /** The focused read-only property of the WindowClient interface is a Boolean that indicates whether the current
    * client has focus.
    */
  def focused: Boolean = js.native

  /** Gives user input focus to the current client and returns a Promise that resolves to the existing WindowClient. */
  def focus(): js.Promise[WindowClient]

  /** See
    * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client-navigate-method ¶4.2.8 navigate(url)]]
    * of ServiceWorker whatwg spec.
    *
    * @return
    *   Promse[WindowClient] or `null`
    */
  def navigate(url: String): js.Promise[WindowClient] = js.native
}
