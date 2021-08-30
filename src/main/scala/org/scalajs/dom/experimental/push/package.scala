package org.scalajs.dom.experimental

import org.scalajs.dom.experimental.serviceworkers.{
  ServiceWorkerGlobalScope, ServiceWorkerRegistration
}
import scala.language.implicitConversions
import scala.scalajs.js

/**
 * The Push API is currently specified here: [[http://www.w3.org/TR/2015/WD-push-api-20151215/]]
 */
package object push {

  /**
   * Implicit function for patching Push API support onto ServiceWorkerRegistration.
   */
  implicit def pushServiceWorkerRegistration(
      swr: ServiceWorkerRegistration): PushServiceWorkerRegistration = {
    swr.asInstanceOf[PushServiceWorkerRegistration]
  }

  /**
   * Implicit function for patching Push API support onto ServiceWorkerGlobalScope
   */
  implicit def pushServiceWorkerGlobalScope(
      swgs: ServiceWorkerGlobalScope): PushServiceWorkerGlobalScope = {
    swgs.asInstanceOf[PushServiceWorkerGlobalScope]
  }

  /**
   * A trait used for patching Push API support onto ServiceWorkerRegistration.
   */
  @js.native
  trait PushServiceWorkerRegistration extends js.Any {

    /**
     * The pushManager property of the ServiceWorkerRegistration interface returns
     * a reference to the PushManager interface for managing push subscriptions;
     * this includes support for subscribing, getting an active subscription, and
     * accessing push permission status.
     *
     * MDN
     */
    val pushManager: PushManager = js.native
  }

  /**
   * A trait used for patching Push API support onto ServiceWorkerGlobalScope.
   */
  @js.native
  trait PushServiceWorkerGlobalScope extends js.Any {

    /**
     * The ServiceWorkerGlobalScope.onpush event of the ServiceWorkerGlobalScope
     * interface is fired whenever a push message is received by a service worker
     * via a push server.
     *
     * MDN
     */
    var onpush: js.Function1[PushEvent, _] = js.native

    /**
     * The ServiceWorkerGlobalScope.onpushsubscriptionchange event of the
     * ServiceWorkerGlobalScope interface is fired whenever a push subscription has
     * been invalidated (or is about to become so). This offers an opportunity to
     * resubscribe in order to continue receiving push messages, if desired. This
     * might happen if, for example, the push service sets an expiration time a
     * subscription.
     *
     * MDN
     */
    var onpushsubscriptionchange: js.Function1[PushEvent, _] = js.native
  }
}
