package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import org.scalajs.dom.webgl.RenderingContext
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

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
