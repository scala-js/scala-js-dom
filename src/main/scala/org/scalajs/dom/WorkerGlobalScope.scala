package org.scalajs.dom

import scala.scalajs.js

/** The WorkerGlobalScope interface of the Web Workers API is an interface representing the scope of any worker. Workers
  * have no browsing context; this scope contains the information usually conveyed by Window objects — in this case
  * event handlers, the console or the associated WorkerNavigator object. Each WorkerGlobalScope has its own event loop.
  *
  * This interface is usually specialized by each worker type: [[DedicatedWorkerGlobalScope]] for dedicated workers,
  * SharedWorkerGlobalScope for shared workers, and ServiceWorkerGlobalScope for ServiceWorker. The self property
  * returns the specialized scope for each context.
  */
@js.native
trait WorkerGlobalScope extends EventTarget with WindowOrWorkerGlobalScope {

  /** The self read-only property of the WorkerGlobalScope interface returns a reference to the WorkerGlobalScope
    * itself. Most of the time it is a specific scope like DedicatedWorkerGlobalScope, SharedWorkerGlobalScope, or
    * ServiceWorkerGlobalScope.
    */
  def self: this.type = js.native

  /** The location read-only property of the WorkerGlobalScope interface returns the WorkerLocation associated with the
    * worker. It is a specific location object, mostly a subset of the Location for browsing scopes, but adapted to
    * workers.
    */
  def location: WorkerLocation = js.native

  /** The navigator read-only property of the WorkerGlobalScope interface returns the WorkerNavigator associated with
    * the worker. It is a specific navigator object, mostly a subset of the Navigator for browsing scopes, but adapted
    * to workers.
    */
  def navigator: WorkerNavigator = js.native

  /** The importScripts() method of the WorkerGlobalScope interface imports one or more scripts into the worker's scope.
    */
  def importScripts(urls: js.Array[String]): Unit = js.native

  /** The close() method of the WorkerGlobalScope interface discards any tasks queued in the WorkerGlobalScope's event
    * loop, effectively closing this particular scope.
    */
  def close(): Unit = js.native

  /** The onerror property of the WorkerGlobalScope interface represents an EventHandler to be called when the error
    * event occurs and bubbles through the Worker.
    */
  var onError: js.Function1[ErrorEvent, _] = js.native

  /** The onlanguagechange property of the WorkerGlobalScope interface represents an EventHandler to be called when the
    * languagechange event occurs and bubbles through the Worker.
    */
  var onlanguagechange: js.Function1[Event, _] = js.native

  /** The onoffline property of the WorkerGlobalScope interface represents an EventHandler to be called when the offline
    * event occurs and bubbles through the Worker.
    */
  var onoffline: js.Function1[Event, _] = js.native

  /** The ononline property of the WorkerGlobalScope interface represents an EventHandler to be called when the online
    * event occurs and bubbles through the Worker.
    */
  var ononline: js.Function1[Event, _] = js.native
}
