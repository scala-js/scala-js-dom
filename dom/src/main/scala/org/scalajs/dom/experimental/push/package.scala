package org.scalajs.dom
package experimental

import org.scalajs.dom

/** The Push API is currently specified here: [[http://www.w3.org/TR/2015/WD-push-api-20151215/]] */
package object push {

  /** Implicit function for patching Push API support onto ServiceWorkerRegistration. */
  @deprecated("use dom.ServiceWorkerRegistration directly instead", "2.0.0")
  def pushServiceWorkerRegistration(swr: ServiceWorkerRegistration): PushServiceWorkerRegistration = {
    swr
  }

  /** Implicit function for patching Push API support onto ServiceWorkerGlobalScope */
  @deprecated("use dom.ServiceWorkerGlobalScope directly instead", "2.0.0")
  def pushServiceWorkerGlobalScope(swgs: ServiceWorkerGlobalScope): PushServiceWorkerGlobalScope = {
    swgs
  }

  /** A trait used for patching Push API support onto ServiceWorkerRegistration. */
  @deprecated("use dom.ServiceWorkerRegistration instead", "2.0.0")
  type PushServiceWorkerRegistration = ServiceWorkerRegistration

  /** A trait used for patching Push API support onto ServiceWorkerGlobalScope. */
  @deprecated("use dom.ServiceWorkerGlobalScope instead", "2.0.0")
  type PushServiceWorkerGlobalScope = ServiceWorkerGlobalScope

  @deprecated("use dom.PushEncryptionKeyName instead", "2.0.0")
  type PushEncryptionKeyName = dom.PushEncryptionKeyName

  @deprecated("use dom.PushEncryptionKeyName instead", "2.0.0")
  val PushEncryptionKeyName = dom.PushEncryptionKeyName

  @deprecated("use dom.PushEvent instead", "2.0.0")
  type PushEvent = dom.PushEvent

  @deprecated("use dom.PushManager instead", "2.0.0")
  type PushManager = dom.PushManager

  @deprecated("use dom.PushMessageData instead", "2.0.0")
  type PushMessageData = dom.PushMessageData

  @deprecated("use dom.PushPermissionState instead", "2.0.0")
  type PushPermissionState = dom.PushPermissionState

  @deprecated("use dom.PushPermissionState instead", "2.0.0")
  val PushPermissionState = dom.PushPermissionState

  @deprecated("use dom.PushSubscriptionJSON instead", "2.0.0")
  type PushSubscriptionJSON = dom.PushSubscriptionJSON

  @deprecated("use dom.PushSubscriptionOptions instead", "2.0.0")
  type PushSubscriptionOptions = dom.PushSubscriptionOptions

  @deprecated("use dom.PushSubscription instead", "2.0.0")
  type PushSubscription = dom.PushSubscription

}
