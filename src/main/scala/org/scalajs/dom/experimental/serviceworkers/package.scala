package org.scalajs.dom
package experimental

import org.scalajs.dom
import scala.language.implicitConversions

/** Service Workers
  *
  * @see
  *   [[https://www.w3.org/TR/2015/WD-service-workers-20150625/ Service Workers W3C Working Draft]]
  */
package object serviceworkers {

  /** [[https://html.spec.whatwg.org/multipage/infrastructure.html#transferable ¶2.7.4 Transferable Objects]] in whatwg
    * html spec.
    */
  @deprecated("use dom.Transferable instead", "2.0.0")
  type Transferable = dom.Transferable

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  implicit def toServiceWorkerNavigator(n: Navigator): ServiceWorkerNavigator =
    n

  @deprecated("use dom.Navigator instead", "2.0.0")
  type ServiceWorkerNavigator = dom.Navigator

  @deprecated("use dom.CacheQueryOptions instead", "2.0.0")
  type CacheQueryOptions = dom.CacheQueryOptions

  @deprecated("use dom.Cache instead", "2.0.0")
  type Cache = dom.Cache

  @deprecated("use dom.CacheStorage instead", "2.0.0")
  type CacheStorage = dom.CacheStorage

  @deprecated("use dom.CanvasProxy instead", "2.0.0")
  type CanvasProxy = dom.CanvasProxy

  @deprecated("use dom.ClientQueryOptions instead", "2.0.0")
  type ClientQueryOptions = dom.ClientQueryOptions

  @deprecated("use dom.Client instead", "2.0.0")
  type Client = dom.Client

  @deprecated("use dom.Clients instead", "2.0.0")
  type Clients = dom.Clients

  @deprecated("use dom.ClientType instead", "2.0.0")
  type ClientType = dom.ClientType

  @deprecated("use dom.ClientType instead", "2.0.0")
  val ClientType = dom.ClientType

  @deprecated("use dom.ExtendableEventInit instead", "2.0.0")
  type ExtendableEventInit = dom.ExtendableEventInit

  @deprecated("use dom.ExtendableEvent instead", "2.0.0")
  type ExtendableEvent = dom.ExtendableEvent

  @deprecated("use dom.ExtendableMessageEventInit instead", "2.0.0")
  type ExtendableMessageEventInit = dom.ExtendableMessageEventInit

  @deprecated("use dom.ExtendableMessageEvent instead", "2.0.0")
  type ExtendableMessageEvent = dom.ExtendableMessageEvent

  @deprecated("use dom.FetchEventInit instead", "2.0.0")
  type FetchEventInit = dom.FetchEventInit

  @deprecated("use dom.FetchEvent instead", "2.0.0")
  type FetchEvent = dom.FetchEvent

  @deprecated("use dom.FrameType instead", "2.0.0")
  type FrameType = dom.FrameType

  @deprecated("use dom.FrameType instead", "2.0.0")
  val FrameType = dom.FrameType

  @deprecated("use dom.GetNotificationOptions instead", "2.0.0")
  type GetNotificationOptions = dom.GetNotificationOptions

  @deprecated("use dom.ServiceWorkerContainer instead", "2.0.0")
  type ServiceWorkerContainer = dom.ServiceWorkerContainer

  @deprecated("use dom.ServiceWorkerGlobalScope instead", "2.0.0")
  type ServiceWorkerGlobalScope = dom.ServiceWorkerGlobalScope

  @deprecated("use dom.ServiceWorkerMessageEventInit instead", "2.0.0")
  type ServiceWorkerMessageEventInit = dom.ServiceWorkerMessageEventInit

  @deprecated("use dom.ServiceWorkerRegistration instead", "2.0.0")
  type ServiceWorkerRegistration = dom.ServiceWorkerRegistration

  @deprecated("use dom.ServiceWorker instead", "2.0.0")
  type ServiceWorker = dom.ServiceWorker

  @deprecated("use dom.ServiceWorkerState instead", "2.0.0")
  type ServiceWorkerState = dom.ServiceWorkerState

  @deprecated("use dom.ServiceWorkerState instead", "2.0.0")
  val ServiceWorkerState = dom.ServiceWorkerState

  @deprecated("use dom.WindowClient instead", "2.0.0")
  type WindowClient = dom.WindowClient
}
