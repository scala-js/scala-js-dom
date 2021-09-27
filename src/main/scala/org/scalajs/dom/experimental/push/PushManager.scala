package org.scalajs.dom.experimental.push

import scala.scalajs.js

/** The PushManager interface of the Push API provides a way to receive notifications from third-party servers as well
  * as request URLs for push notifications.
  *
  * This interface is accessed via the ServiceWorkerRegistration.pushManager property.
  *
  * The Push API is currently specified here: [[https://www.w3.org/TR/2018/WD-push-api-20181026/]]
  */
@js.native
trait PushManager extends js.Object {

  /** Retrieves an existing push subscription. It returns a Promise that resolves to a PushSubscription object
    * containing details of an existing subscription. If no existing subscription exists, this resolves to a null value.
    */
  def getSubscription(): js.Promise[PushSubscription] = js.native

  /** The permissionState() method of the PushManager interface returns a Promise that resolves to a DOMString
    * indicating the permission state of the push manager. Possible values are 'prompt', 'denied', or 'granted'.
    *
    * @param options
    *   An object containing optional configuration parameters. It can have the following properties:
    *   - userVisibleOnly: A boolean indicating that the returned push subscription will only be used for messages whose
    *     effect is made visible to the user.
    */
  def permissionState(options: PushSubscriptionOptions = js.native): js.Promise[PushPermissionState] = js.native

  /** The subscribe() method of the PushManager interface subscribes to a push service.
    *
    * It returns a Promise that resolves to a PushSubscription object containing details of a push subscription. A new
    * push subscription is created if the current service worker does not have an existing subscription.
    */
  def subscribe(options: PushSubscriptionOptions = js.native): js.Promise[PushSubscription] = js.native
}
