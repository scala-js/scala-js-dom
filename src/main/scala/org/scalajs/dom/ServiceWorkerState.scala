package org.scalajs.dom

import scala.scalajs.js

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
