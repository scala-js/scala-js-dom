package org.scalajs.dom

import scala.scalajs.js

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
  var onmessage: js.Function1[MessageEvent[Any], _] = js.native
}
