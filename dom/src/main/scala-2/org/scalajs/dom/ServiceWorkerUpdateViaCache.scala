package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ServiceWorkerUpdateViaCache extends js.Any

object ServiceWorkerUpdateViaCache {
  /** The service worker script and all of its imports will be updated. */
  val all: ServiceWorkerUpdateViaCache = "all".asInstanceOf[ServiceWorkerUpdateViaCache]

  /** Only imports referenced by the service worker script will be updated. This is the default. */
  val imports: ServiceWorkerUpdateViaCache = "imports".asInstanceOf[ServiceWorkerUpdateViaCache]

  /** Neither the service worker, nor its imports will be updated. */
  val none: ServiceWorkerUpdateViaCache = "none".asInstanceOf[ServiceWorkerUpdateViaCache]
}
