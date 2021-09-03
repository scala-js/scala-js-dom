package org.scalajs.dom.experimental

import org.scalajs.dom.Navigator
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.|

/**
 * Service Workers
 *
 * @see [[https://www.w3.org/TR/2015/WD-service-workers-20150625/ Service Workers W3C Working Draft]]
 */
package object serviceworkers {

  /**
   * [[https://html.spec.whatwg.org/multipage/infrastructure.html#transferable ¶2.7.4 Transferable Objects]]
   * in whatwg html spec.
   */
  type Transferable = org.scalajs.dom.Transferable | CanvasProxy

  implicit def toServiceWorkerNavigator(n: Navigator): ServiceWorkerNavigator =
    n.asInstanceOf[ServiceWorkerNavigator]

  @js.native
  trait ServiceWorkerNavigator extends js.Any {

    /**
     * The Navigator.serviceWorker read-only property returns a
     * ServiceWorkerContainer object, which provides access to registration,
     * removal, upgrade, and communication with the ServiceWorker objects for
     * the associated document.
     *
     * MDN
     */
    val serviceWorker: ServiceWorkerContainer = js.native
  }
}
