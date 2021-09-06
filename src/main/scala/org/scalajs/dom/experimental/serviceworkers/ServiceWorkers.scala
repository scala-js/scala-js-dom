package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import org.scalajs.dom.webgl.RenderingContext
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
sealed trait FrameType extends js.Any

/** part of ServiceWorker
  * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client-frametype ¶4.2.2 frameType]] of
  * serviceWorker spec
  */
object FrameType {

  /** The window client's global object's browsing context is an auxiliary browsing context. */
  val auxiliary: FrameType = "auxiliary".asInstanceOf[FrameType]

  /** The window client's global object's browsing context is a top-level browsing context. */
  val `top-level` = "top-level".asInstanceOf[FrameType]

  /** The window client's global object's browsing context is a nested browsing context. */
  val nested: FrameType = "nested".asInstanceOf[FrameType]

  val none: FrameType = "none".asInstanceOf[FrameType]
}

/** [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client ¶4.2 Client]] of Service Workers 1 spec.
  */
@js.native
trait Client extends js.Object {

  /** The url attribute must return the context object's associated service worker client's serialized creation url. */
  def url: String = js.native

  def frameType: FrameType = js.native

  /** The id attribute must return its associated service worker client's id. */
  def id: String = js.native

  /** Allows a service worker to send a message to a client (a Window, Worker, or SharedWorker). The message is received
    * in the "message" event on navigator.serviceWorker.
    *
    * @param transfer
    *   A sequence of objects that are transferred with the message. The ownership of these objects is given to the
    *   destination side and they are no longer usable on the sending side.
    */
  def postMessage(message: js.Any, transfer: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native
}

/** see [[https://html.spec.whatwg.org/multipage/scripting.html#canvasproxy ¶4.12.4.1 Proxying canvases to workers]] in
  * whatwg html spec.
  */
@js.native
trait CanvasProxy extends js.Any {
  def setContext(context: RenderingContext): Unit = js.native
}

trait FetchEventInit extends ExtendableEventInit {
  var isReload: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
}

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

/** The ServiceWorker interface of the ServiceWorker API provides a reference to a service worker. Multiple browsing
  * contexts (e.g. pages, workers, etc.) can be associated with the same service worker, each through a unique
  * ServiceWorker object.
  */
@js.native
trait ServiceWorker extends EventTarget {

  /** Returns the ServiceWorker serialized script URL defined as part of ServiceWorkerRegistration. Must be on the same
    * origin as the document that registers the ServiceWorker.
    */
  def scriptURL: String = js.native

  /** The state read-only property of the ServiceWorker interface returns a string representing the current state of the
    * service worker. It can be one of the following values: installing, installed, activating, activated, or redundant.
    */
  def state: String = js.native

  /** @param transfer
    *   A sequence of objects that are transferred with the message. The ownership of these objects is given to the
    *   destination side and they are no longer usable on the sending side.
    */
  var onstatechange: js.Function1[Event, _] = js.native

  /** [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#service-worker-postmessage ¶3.1.3 postMessage]]
    * on whatwg ServiceWorker spec.
    */
  def postMessage(message: js.Any, transfer: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native
}

/** The ServiceWorkerRegistion interface of the ServiceWorker API represents the service worker registration. You
  * register a service worker to control one or more pages that share the same origin.
  */
@js.native
trait ServiceWorkerRegistration extends EventTarget {

  /** The installing property of the ServiceWorkerRegistration interface returns a service worker whose
    * ServiceWorker.state is installing. This property is initially set to null.
    */
  var installing: ServiceWorker = js.native

  /** The waiting property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state
    * is installed. This property is initially set to null.
    */
  var waiting: ServiceWorker = js.native

  /** The active property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state
    * is activating or activated. This property is initially set to null.
    */
  var active: ServiceWorker = js.native

  /** The scope read-only property of the ServiceWorkerRegistration interface returns a unique identifier for a service
    * worker registration. The service worker must be on the same origin as the document that registers the
    * ServiceWorker.
    */
  var scope: String = js.native

  /** The update method of the ServiceWorkerRegistration interface allows you to ping the server for an updated service
    * worker script. If you don't explicitly call this, the UA will do this automatically once every 24 hours.
    */
  def update(): js.Promise[Unit] = js.native

  /** The unregister method of the ServiceWorkerRegistration interface unregisters the service worker registration and
    * returns a Promise. The promise will resolve to false if no registration was found, otherwise it resolves to true
    * irrespective of whether unregistration happened or not (it may not unregister if someone else just called
    * ServiceWorkerContainer.register with the same scope.) The service worker will finish any ongoing operations before
    * it is unregistered.
    */
  def unregister(): js.Promise[Boolean] = js.native

  /** The onupdatefound property of the ServiceWorkerRegistration interface is an EventListener property called whenever
    * an event of type statechange is fired; it is fired any time the ServiceWorkerRegistration. installing property
    * acquires a new service worker.
    */
  var onupdatefound: js.Function1[Event, _] = js.native

  /** The getNotifications() method of the ServiceWorkerRegistration interface returns a list of the notifications in
    * the order that they were created from the current origin via the current service worker registration. Origins can
    * have many active but differently-scoped service worker registrations. Notifications created by one service worker
    * on the same origin will not be available to other active services workers on that same origin.
    */
  def getNotifications(options: GetNotificationOptions = js.native): js.Promise[Sequence[Notification]] = js.native

  /** The showNotification() method of the ServiceWorkerRegistration interface creates a notification on an active
    * service worker.
    */
  def showNotification(title: String, options: NotificationOptions = js.native): js.Promise[Unit] = js.native
}

/** An object containing options to filter the notifications returned. */
trait GetNotificationOptions extends js.Object {

  /** A DOMString representing a notification tag. If specified, only notifications that have this tag will be returned.
    */
  var tag: js.UndefOr[String] = js.undefined
}

/** The ServiceWorkerContainer interface of the ServiceWorker API exposes the ServiceWorkerContainer.
  * register(scriptURL, scope[, base]) method used to register service workers, and the ServiceWorkerContainer.
  * controller property used to determine whether or not the current page is actively controlled.
  */
@js.native
trait ServiceWorkerContainer extends EventTarget {

  /** Creates or updates a ServiceWorkerRegistration for the given scriptURL. If successful, a service worker
    * registration ties the provided script URL to a scope, which is subsequently used for navigation matching. If the
    * method can't return a ServiceWorkerRegistration, it returns a Promise. You can call this method unconditionally
    * from the controlled page, i.e., you don't need to first check whether there's an active registration.
    */
  def register(scriptURL: String, options: js.Object = js.native): js.Promise[ServiceWorkerRegistration] = js.native

  /** The ServiceWorkerContainer.controller read-only property of the ServiceWorkerContainer interface returns the
    * ServiceWorker whose state is activated (the same object returned by ServiceWorkerRegistration.active). This
    * property returns null if the request is a force refresh (Shift + refresh) or if there is no active worker.
    */
  def controller: ServiceWorker = js.native

  /** Gets a ServiceWorkerRegistration object whose scope URL matches the document URL. If the method can't return a
    * ServiceWorkerRegistration, it returns a Promise.
    */
  def getRegistration(scope: String = js.native): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native

  /** The getRegistrations() method of the ServiceWorkerContainer interface returns all ServiceWorkerRegistrations
    * associated with a ServiceWorkerContainer in an array. If the method can't return ServiceWorkerRegistrations, it
    * returns a Promise.
    */
  def getRegistrations(): js.Promise[js.Array[ServiceWorkerRegistration]] = js.native

  /** The ready read-only property of the ServiceWorkerContainer interface defines whether a service worker is ready to
    * control a page or not. It returns a Promise that will never reject, which resolves to a ServiceWorkerRegistration
    * with an ServiceWorkerRegistration.active worker.
    */
  def ready: js.Promise[ServiceWorkerRegistration] = js.native

  /** The oncontrollerchange property of the ServiceWorkerContainer interface is an event handler fired whenever a
    * controllerchange event occurs — when the document's associated ServiceWorkerRegistratin acquires a new
    * ServiceWorkerRegistration.active worker.
    */
  var oncontrollerchange: js.Function1[Event, _] = js.native

  /** The onmessage property of the ServiceWorkerContainer interface is an event handler fired whenever a message event
    * occurs — when incoming messages are received to the ServiceWorkerContainer object (e.g., via a
    * MessagePort.postMessage() call).
    */
  var onmessage: js.Function1[MessageEvent, _] = js.native
}

trait ExtendableEventInit extends EventInit {}

/** See
  * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#extendable-event-interface ¶4.4 ExtendableEvent]]
  * of whatwg ServiceWorker spec.
  *
  * An ExtendableEvent object has an associated extend lifetime promises (an array of promises). It is initially set to
  * null.
  */
@js.native
@JSGlobal
class ExtendableEvent(typeArg: String, init: js.UndefOr[ExtendableEventInit]) extends Event(typeArg, init) {
  def waitUntil(promise: js.Promise[Any]): Unit = js.native
}

trait ExtendableMessageEventInit extends ExtendableEventInit {
  var data: js.UndefOr[Any] = js.undefined

  var origin: js.UndefOr[String] = js.undefined

  var lastEventId: js.UndefOr[String] = js.undefined

  var source: js.UndefOr[Client | ServiceWorker | MessagePort] = js.undefined

  var ports: js.UndefOr[js.Array[MessagePort]] = js.undefined
}

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

trait ServiceWorkerMessageEventInit extends EventInit {
  var data: js.UndefOr[Any] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var lastEventId: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[ServiceWorker | MessagePort] = js.undefined
  var ports: js.UndefOr[js.Array[MessagePort]] = js.undefined
}

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#service-worker-obj ¶3.1 ServiceWorker]] of
  * ServiceWorker whatwg spec.
  */
@js.native
sealed trait ServiceWorkerState extends js.Any

object ServiceWorkerState {

  /** The service worker in this state is considered an installing worker. During this state, event.waitUntil(f) can be
    * called inside the oninstall event handler to extend the life of the installing worker until the passed promise
    * resolves successfully. This is primarily used to ensure that the service worker is not active until all of the
    * core caches are populated.
    */
  val installing: ServiceWorkerState = "installing".asInstanceOf[ServiceWorkerState]

  /** The service worker in this state is considered a waiting worker. */
  val installed: ServiceWorkerState = "installed".asInstanceOf[ServiceWorkerState]

  /** The service worker in this state is considered an active worker. During this state, event.waitUntil(f) can be
    * called inside the onactivate event handler to extend the life of the active worker until the passed promise
    * resolves successfully. No functional events are dispatched until the state becomes activated.
    */
  val activating: ServiceWorkerState = "activating".asInstanceOf[ServiceWorkerState]

  /** The service worker in this state is considered an active worker ready to handle functional events. */
  val activated: ServiceWorkerState = "activated".asInstanceOf[ServiceWorkerState]

  /** A new service worker is replacing the current service worker, or the current service worker is being discarded due
    * to an install failure.
    */
  val redundant: ServiceWorkerState = "redundant".asInstanceOf[ServiceWorkerState]
}

@js.native
sealed trait ClientType extends js.Any

object ClientType {
  val window: ClientType = "window".asInstanceOf[ClientType]

  val worker: ClientType = "worker".asInstanceOf[ClientType]

  val sharedworker: ClientType = "sharedworker".asInstanceOf[ClientType]

  val all: ClientType = "all".asInstanceOf[ClientType]
}

/** [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client ¶4.2 Client]] of Service Workers 1 spec.
  */
@js.native
trait ClientQueryOptions extends js.Object {
  var includeUncontrolled: Boolean = js.native

  var `type`: ClientType = js.native
}

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

/** The ServiceWorkerGlobalScope interface of the ServiceWorker API represents the global execution context of a service
  * worker.
  *
  * Developers should keep in mind that the ServiceWorker.state is not persisted across the termination/restart cycle,
  * so each event handler should assume it's being invoked with a bare, default global state.
  *
  * Once successfully registered, a service worker can and will be terminated when idle to conserve memory and processor
  * power. An active service worker is automatically restarted to respond to events, such as
  * ServiceWorkerGlobalScope.onfetch or ServiceWorkerGlobalScope.onmessage.
  *
  * Additionally, synchronous requests are not allowed from within a service worker — only asynchronous requests, like
  * those initiated via the fetch() method, can be used.
  */
@js.native
trait ServiceWorkerGlobalScope extends WorkerGlobalScope {

  /** Returns the Clients object associated with the service worker. */
  def clients: Clients = js.native

  /** The registration read-only property of the ServiceWorkerGlobalScope interface returns a reference to the
    * ServiceWorkerRegistration object, which represents the service worker's registration.
    */
  def registration: ServiceWorkerRegistration = js.native

  /** An event handler fired whenever an activate event occurs (when the service worker activates). This happens after
    * installation, when the page to be controlled by the service worker refreshes.
    */
  var onactivate: js.Function1[ExtendableEvent, _] = js.native

  /** An event handler fired whenever a fetch event occurs — when a fetch() is called. */
  var onfetch: js.Function1[FetchEvent, _] = js.native

  /** An event handler fired whenever an install event occurs — when a ServiceWorkerRegistration acquires a new
    * ServiceWorkerRegistration.installing worker.
    */
  var oninstall: js.Function1[ExtendableEvent, _] = js.native

  /** An event handler fired whenever a message event occurs — when incoming messages are received. Controlled pages can
    * use the MessagePort.postMessage method to send messages to service workers. The service worker can optionally send
    * a response back via the MessagePort exposed in event.data.port, corresponding to the controlled page.
    */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /** Forces the waiting service worker to become the active service worker. This method can be used with
    * [[Clients.claim]] to ensure that updates to the underlying service worker take effect immediately for both the
    * current client and all other active clients.
    */
  def skipWaiting(): js.Promise[Unit] = js.native
}

@js.native
@JSGlobalScope
object ServiceWorkerGlobalScope extends js.Object {
  def self: ServiceWorkerGlobalScope = js.native
}

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#cache ¶5.4 cache]] of ServiceWorker whatwg
  * spec.
  */
@deprecated("Use org.scalajs.dom.experimental.cachestorage.Cache", "1.2.0")
@js.native
@JSGlobal
abstract class Cache extends org.scalajs.dom.experimental.cachestorage.Cache

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#cache ¶5.4 cache]] of ServiceWorker whatwg
  * spec.
  */
@deprecated("Use org.scalajs.dom.experimental.cachestorage.CacheQueryOptions", "1.2.0")
@js.native
trait CacheQueryOptions extends org.scalajs.dom.experimental.cachestorage.CacheQueryOptions

/** See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#cache-storage ¶5.5 cache]] of ServiceWorker
  * whatwg spec.
  */
@deprecated("Use org.scalajs.dom.experimental.cachestorage.CacheStorage", "1.2.0")
@js.native
trait CacheStorage extends org.scalajs.dom.experimental.cachestorage.CacheStorage
