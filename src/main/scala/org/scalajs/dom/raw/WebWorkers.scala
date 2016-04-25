package org.scalajs.dom.raw

import scala.scalajs.js

/**
 * The AbstractWorker interface abstracts properties and methods common to all
 * kind of workers, being Worker or SharedWorker.
 *
 * MDN
 */
@js.native
trait AbstractWorker extends EventTarget {
  /**
   * The AbstractWorker.onerror property represents an EventHandler, that is a
   * function to be called when the error event occurs and bubbles through the
   * Worker.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, _] = js.native
}

/**
 * The Worker interface represents a background task that can be easily created
 * and can send messages back to their creators. Creating a worker is as simple
 * as calling the Worker() constructor, specifying a script to be run in the
 * worker thread.
 *
 * Of note is the fact that workers may in turn spawn new workers as long as
 * those workers are hosted within the same origin as the parent page.  In
 * addition, workers may use XMLHttpRequest for network I/O, with the exception
 * that the responseXML and channel attributes on XMLHttpRequest always return
 * null.
 *
 * MDN
 */
@js.native
class Worker(stringUrl: String) extends AbstractWorker {
  /**
   * The Worker.onmessage property represents an EventHandler, that is a
   * function to be called when the message event occurs. These events are of
   * type MessageEvent and will be called when the worker calls its own
   * postMessage() method: it is the way that a Worker has to give back
   * information to the thread that created it.
   *
   * MDN
   */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /**
   * The postMessage() method of the Worker interface sends a message to the
   * worker's inner scope. This accepts a single parameter, which is the data to
   * send to the worker. The data may be any value or JavaScript object handled
   * by the structured clone algorithm, which includes cyclical references.
   *
   * The Worker can send back information to the thread that spawned it using
   * the DedicatedWorkerGlobalScope.postMessage method.
   *
   * MDN
   *
   * @param aMessage The object to deliver to the worker; this will be in the
   *                 data field in the event delivered to the
   *                 DedicatedWorkerGlobalScope.onmessage handler. This may be
   *                 any value or JavaScript object handled by the structured
   *                 clone algorithm, which includes cyclical references.
   *
   * @param transferList An optional array of Transferable objects to transfer
   *                     ownership of. If the ownership of an object is
   *                     transferred, it becomes unusable (neutered) in the
   *                     context it was sent from and it becomes available only
   *                     to the main thread it was sent to.
   *
   *                     Only MessagePort and ArrayBuffer objects can be
   *                     transferred. null is not an acceptable value for the
   *                     transferList.
   */
  def postMessage(aMessage: js.Any,
      transferList: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native

  /**
   * The Worker.terminate() method immediately terminates the Worker. This does
   * not offer the worker an opportunity to finish its operations; it is simply
   * stopped at once.
   *
   * MDN
   */
  def terminate(): Unit = js.native
}

/**
 * The WorkerGlobalScope interface of the Web Workers API is an interface
 * representing the scope of any worker. Workers have no browsing context;
 * this scope contains the information usually conveyed by Window objects —
 * in this case event handlers, the console or the associated WorkerNavigator
 * object. Each WorkerGlobalScope has its own event loop.
 *
 * This interface is usually specialized by each worker type:
 * [[DedicatedWorkerGlobalScope]] for dedicated workers, SharedWorkerGlobalScope
 * for shared workers, and ServiceWorkerGlobalScope for ServiceWorker.
 * The self property returns the specialized scope for each context.
 *
 * MDN
 */
@js.native
trait WorkerGlobalScope extends EventTarget {
  /**
   * The caches read-only property of the WorkerGlobalScope interface returns
   * the CacheStorage object associated with the current worker context.
   * This object enables service worker functionality such as storing assets
   * for offline use, and generating custom responses to requests.
   *
   * MDN
   */
  def caches: js.Any = js.native

  /**
   * The self read-only property of the WorkerGlobalScope interface returns a
   * reference to the WorkerGlobalScope itself. Most of the time it is a specific
   * scope like DedicatedWorkerGlobalScope,  SharedWorkerGlobalScope,
   * or ServiceWorkerGlobalScope.
   *
   * MDN
   */
  def self: this.type = js.native

  /**
   * The location read-only property of the WorkerGlobalScope interface returns
   * the WorkerLocation associated with the worker. It is a specific location
   * object, mostly a subset of the Location for browsing scopes,
   * but adapted to workers.
   *
   * MDN
   */
  def location: WorkerLocation = js.native

  /**
   * The navigator read-only property of the WorkerGlobalScope interface returns
   * the WorkerNavigator associated with the worker. It is a specific navigator
   * object, mostly a subset of the Navigator for browsing scopes,
   * but adapted to workers.
   *
   * MDN
   */
  def navigator: WorkerNavigator = js.native

  /**
   * The importScripts() method of the WorkerGlobalScope interface imports
   * one or more scripts into the worker's scope.
   *
   * MDN
   */
  def importScripts(urls: js.Array[String]): Unit = js.native

  /**
   * The close() method of the WorkerGlobalScope interface discards any tasks
   * queued in the WorkerGlobalScope's event loop, effectively closing this
   * particular scope.
   *
   * MDN
   */
  def close(): Unit = js.native

  /**
   * The onerror property of the WorkerGlobalScope interface represents an
   * EventHandler to be called when the error event occurs and bubbles through
   * the Worker.
   *
   * MDN
   */
  var onError: js.Function1[ErrorEvent, _] = js.native
  /**
   * The onlanguagechange property of the WorkerGlobalScope interface represents
   * an EventHandler to be called when the languagechange event occurs and
   * bubbles through the Worker.
   *
   * MDN
   */
  var onlanguagechange: js.Function1[Event, _] = js.native

  /**
   * The onoffline property of the WorkerGlobalScope interface represents an
   * EventHandler to be called when the offline event occurs and bubbles through
   * the Worker.
   *
   * MDN
   */
  var onoffline: js.Function1[Event, _] = js.native
  /**
   * The ononline property of the WorkerGlobalScope interface represents an
   * EventHandler to be called when the online event occurs and bubbles through
   * the Worker.
   *
   * MDN
   */
  var ononline: js.Function1[Event, _] = js.native
}

/**
 * The DedicatedWorkerGlobalScope object (the Worker global scope) is accessible
 * through the self keyword. Some additional global functions, namespaces
 * objects, and constructors, not typically associated with the worker global
 * scope, but available on it, are listed in the JavaScript Reference. See also:
 * Functions available to workers.
 *
 * MDN
 */
@js.native
trait DedicatedWorkerGlobalScope extends WorkerGlobalScope {
  /**
   * The onmessage property of the DedicatedWorkerGlobalScope interface
   * represents an EventHandler to be called when the message event occurs and
   * bubbles through the Worker — i.e. when a message is sent to the worker
   * using the Worker.postMessage method.
   *
   * MDN
   */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends
   * a message to the main thread that spawned it. This accepts a single
   * parameter, which is the data to send to the worker. The data may be any
   * value or JavaScript object handled by the structured clone algorithm,
   * which includes cyclical references.
   *
   * The main scope that spawned the worker can send back information to the
   * thread that spawned it using the Worker.postMessage method.
   *
   * MDN
   *
   * @param aMessage The object to deliver to the main thread; this will be in
   *                 the data field in the event delivered to the Worker.onmessage
   *                 handler. This may be any value or JavaScript object handled
   *                 by the structured clone algorithm, which includes cyclical
   *                 references.
   * @param transferList An optional array of Transferable objects to transfer
   *                     ownership of. If the ownership of an object is
   *                     transferred, it becomes unusable (neutered) in the
   *                     context it was sent from and it becomes available only
   *                     to the main thread it was sent to.
   *
   */
  def postMessage(aMessage: js.Any,
      transferList: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native
}

@js.native
object DedicatedWorkerGlobalScope extends js.GlobalScope {

  /**
   * Returns an object reference to the DedicatedWorkerGlobalScope object itself.
   *
   * MDN
   */
  def self: DedicatedWorkerGlobalScope = js.native
}

/**
 * The WorkerNavigator interface represents a subset of the [[Navigator]]
 * interface allowed to be accessed from a Worker. Such an object is
 * initialized for each worker and is available via the
 * WorkerGlobalScope.navigator property obtained by calling
 * window.self.navigator
 *
 * MDN
 */
@js.native
trait WorkerNavigator extends NavigatorID with NavigatorOnLine with NavigatorLanguage

/**
 * The WorkerLocation interface defines the absolute location of the script
 * executed by the Worker. Such an object is initialized for each worker
 * and is available via the WorkerGlobalScope.location property obtained
 * by calling window.self.location.
 *
 * MDN
 */
@js.native
trait WorkerLocation extends js.Object {
  /**
   * Is a DOMString containing a '#' followed by the fragment identifier of the
   * URL.
   *
   * MDN
   */
  def hash: String = js.native

  /**
   * Is a DOMString containing the protocol scheme of the URL, including the
   * final ':'.
   *
   * MDN
   */
  def protocol: String = js.native

  /**
   * Is a DOMString containing a '?' followed by the parameters of the URL.
   *
   * MDN
   */
  def search: String = js.native

  /**
   * Is a DOMString containing the whole URL.
   *
   * MDN
   */
  def href: String = js.native

  /**
   * Is a DOMString containing the domain of the URL.
   *
   * MDN
   */
  def hostname: String = js.native

  /**
   * Is a DOMString containing the port number of the URL.
   *
   * MDN
   */
  def port: String = js.native

  /**
   * Is a DOMString containing an initial '/' followed by the path of the URL.
   *
   * MDN
   */
  def pathname: String = js.native

  /**
   * Is a DOMString containing the host, that is the hostname, a ':', and the
   * port of the URL.
   *
   * MDN
   */
  def host: String = js.native

  /**
   * The origin read-only property is a String containing the Unicode
   * serialization of the origin of the represented URL, that is, for http and
   * https, the scheme followed by '://', followed by the domain, followed by
   * ':', followed by the port (the default port, 80 and 443 respectively,
   * if explicitely specified). For URL using file: scheme, the value is browser
   * dependant.
   *
   * MDN
   */
  def origin: String = js.native
}
