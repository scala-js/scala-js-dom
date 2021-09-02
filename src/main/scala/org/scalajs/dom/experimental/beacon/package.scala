package org.scalajs.dom.experimental

import org.scalajs.dom.{Navigator, WorkerNavigator}
import scala.language.implicitConversions
import scala.scalajs.js

/**
 * The Beacon interface is used to schedule an asynchronous and non-blocking
 * request to a web server. Beacon requests use the HTTP PUT method and requests
 * typically do not require a response. Requests are guaranteed to be initiated
 * before a page is unloaded and they are run to completion without requiring a
 * blocking request (for example XMLHttpRequest).
 *
 * MDN
 *
 * @see [[https://www.w3.org/TR/2016/WD-beacon-20160204/ Beacon W3C Working Draft]]
 * @see [[https://developer.mozilla.org/en-US/docs/Web/API/Beacon_API MDN Beacon API]]
 */
package object beacon {

  implicit def toBeaconNavigator(n: Navigator): BeaconNavigator =
    n.asInstanceOf[BeaconNavigator]

  implicit def toBeaconWorkerNavigator(
      n: WorkerNavigator): BeaconWorkerNavigator = {
    n.asInstanceOf[BeaconWorkerNavigator]
  }

  @js.native
  trait BeaconNavigator extends js.Object {

    /**
     * The navigator.sendBeacon() method can be used to asynchronously transfer
     * small HTTP data from the User Agent to a web server.
     *
     * MDN
     *
     * @param url The url parameter indicates the resolved URL where the data
     *            is to be transmitted.
     * @param data The data parameter is the ArrayBufferView, Blob, DOMString,
     *             or FormData data that is to be transmitted.
     */
    def sendBeacon(url: String, data: BodyInit = null): Boolean = js.native
  }

  @js.native
  trait BeaconWorkerNavigator extends js.Object {

    /**
     * The navigator.sendBeacon() method can be used to asynchronously transfer
     * small HTTP data from the User Agent to a web server.
     *
     * MDN
     *
     * @param url The url parameter indicates the resolved URL where the data
     *            is to be transmitted.
     * @param data The data parameter is the ArrayBufferView, Blob, DOMString,
     *             or FormData data that is to be transmitted.
     */
    def sendBeacon(url: String, data: BodyInit = null): Boolean = js.native
  }
}
