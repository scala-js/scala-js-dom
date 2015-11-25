package org.scalajs.dom.experimental

import org.scalajs.dom.{MessagePort, raw}
import org.scalajs.dom.webgl.RenderingContext

import scala.scalajs.js
import scala.scalajs.js.|

//todo: move all ServiceWorker code together ( currently some code in raw )
//todo: some of the ServiceWorker code in raw there could be typed a bit more precisely using some classes defined here

@js.native
sealed trait FrameType extends js.Any

/**
 * part of ServiceWorker
 * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client-frametype ¶4.2.2 frameType]]
 * of serviceWorker spec
 */
object FrameType {
  /**
   * The window client's global object's browsing context is an auxiliary browsing context.
   */
  val auxiliary = "auxiliary".asInstanceOf[FrameType]

  /** The window client's global object's browsing context is a top-level browsing context. */
  val `top-level` = "top-level".asInstanceOf[FrameType]

  /** The window client's global object's browsing context is a nested browsing context. */
  val nested = "nested".asInstanceOf[FrameType]

  val none = "none".asInstanceOf[FrameType]
}

/**
 * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client ¶4.2 Client]]
 * of Service Workers 1 spec.
 */
@js.native
trait Client extends js.Object {
  /**
   * The url attribute must return the context object's associated service worker
   * client's serialized creation url.
   */
  def url: String = js.native

  def frameType: FrameType = js.native

  /**
   * The id attribute must return its associated service worker client's id.
   */
  def id: String = js.native

  /**
   *
   * @param message the spec says this is of type any (?!)
   * @param transfer https://html.spec.whatwg.org/multipage/infrastructure.html#transferable-objects
   *
   */
  def postMessage(message: Any, transfer: Sequence[Transferable] = null): Unit = js.native
}

/**
 * see [[https://html.spec.whatwg.org/multipage/scripting.html#canvasproxy ¶4.12.4.1 Proxying canvases to workers]]
 * in whatwg html spec.
 */
@js.native
trait CanvasProxy extends js.Any {
  def setContext(context: RenderingContext): Unit = js.native
}

/**
 * See [[https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent FetchEvent]] on MDN
 *
 * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#fetch-event-section ¶4.5 FetchEvent]]
 * on whatwg ServiceWorker spec.
 */
@js.native
class FetchEvent extends raw.Event {
  /**
   * @return Boolean that is true if the event was dispatched with the user's
   *         intention for the page to reload, and false otherwise. Typically,
   *         pressing the refresh button in a browser is a reload, while clicking a
   *         link and pressing the back button is not.
   */
  def isReload: Boolean = js.native

  /**
   * @return the Request that triggered the event handler.
   */
  def request: Request = js.native

  /**
   * See [[https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/respondWith respondWith]]
   * page on MDN.
   *
   * The respondWith() method of the FetchEvent interface is intended for
   * containing code that generates custom responses to the requests coming
   * from the controlled page. This code will resolve by returning a Response
   * or network error to Fetch.
   *
   * Renderer-side security checks about tainting for cross-origin content are
   * tied to the transparency (or opacity) of the Response body, not URLs. If
   * the request is a top-level navigation and the return value is a Response
   * whose type attribute is opaque (i.e. an opaque response body), a network
   * error is returned to Fetch. The final URL of all successful (non
   * network-error) responses is the requested URL.
   */
  def respondWith(promisedResponse: raw.Promise[Response]): Unit = js.native
}

object ServiceWorker {

  /**
   * typed methods to set event handlers on ServiceWorkers. See
   * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#service-worker-global-scope-activate-event ¶4.7 Events]]
   * of whatwg ServiceWorker spec.
   */
  implicit class ServiceWorkerOpts(serviceWorker: raw.ServiceWorker) {

    def addInstallListener(fn: ExtendableEvent => Unit) =
      serviceWorker.addEventListener("install", fn)

    def addActivateListener(fn: ExtendableEvent => Unit) =
      serviceWorker.addEventListener("activate", fn)

    def addFetchListener(fn: FetchEvent => Unit) =
      serviceWorker.addEventListener("fetch", fn)

    def addMessageListener(fn: MessageEvent => Unit) =
      serviceWorker.addEventListener("message", fn)

  }
}

/**
 * See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#extendable-event-interface ¶4.4 ExtendableEvent]]
 * of whatwg ServiceWorker spec.
 *
 * An ExtendableEvent object has an associated extend lifetime promises (an
 * array of promises). It is initially set to null.
 */
@js.native
class ExtendableEvent extends raw.Event {
  def waitUntil(promise: raw.Promise[Any]): Unit = js.native
}

/**
 * See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#extendablemessage-event-interface ¶4.6 ExtendableMessageEvent]]
 * of whatwg ServiceWorker spec.
 *
 * Service workers define the extendable message event that extends the
 * message event defined in HTML to allow extending the lifetime of the event.
 *
 * See also: [[https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerMessageEvent ServiceWorkerMessageEvent]] on MDN
 */
@js.native
class MessageEvent extends ExtendableEvent {

  /**
   * Returns the event's data. It can be any data type.
   */
  val data: Any = js.native

  /**
   * Returns the origin of the service worker's environment settings object.
   */
  val origin: String = js.native //should be type DOMString

  /**
   * Represents, in server-sent events, the last event ID of the event source.
   */
  val lastEventId: String = js.native //should be String

  /**
   * @return a reference to the service worker that sent the message.
   */
  def source: Client | raw.ServiceWorker | MessagePort = js.native

  /**
   *  It represents the MessagePort array being sent, if any.
   */
  def ports: js.Array[MessagePort] = js.native
}
/**
 * See [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#service-worker-obj ¶3.1 ServiceWorker]]
 * of ServiceWorker whatwg spec.
 */
@js.native
sealed trait ServiceWorkerState extends js.Any

object ServiceWorkerState {
  /**
   * The service worker in this state is considered an installing worker.
   * During this state, event.waitUntil(f) can be called inside the oninstall
   * event handler to extend the life of the installing worker until the
   * passed promise resolves successfully. This is primarily used to ensure
   * that the service worker is not active until all of the core caches are
   * populated.
   */
  val installing = "installing".asInstanceOf[ServiceWorkerState]

  /**
   * The service worker in this state is considered a waiting worker.
   */
  val installed = "installed".asInstanceOf[ServiceWorkerState]

  /**
   * The service worker in this state is considered an active worker. During
   * this state, event.waitUntil(f) can be called inside the onactivate event
   * handler to extend the life of the active worker until the passed promise
   * resolves successfully. No functional events are dispatched until the
   * state becomes activated.
   */
  val activating = "activating".asInstanceOf[ServiceWorkerState]

  /**
   * The service worker in this state is considered an active worker ready to
   * handle functional events.
   */
  val activated = "activated".asInstanceOf[ServiceWorkerState]

  /**
   * A new service worker is replacing the current service worker, or the
   * current service worker is being discarded due to an install failure.
   */
  val redundant = "redundant".asInstanceOf[ServiceWorkerState]
}
