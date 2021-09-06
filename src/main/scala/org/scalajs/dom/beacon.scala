package org.scalajs.dom

import org.scalajs.dom
import scala.scalajs.js

/** The Beacon interface is used to schedule an asynchronous and non-blocking request to a web server. Beacon requests
  * use the HTTP PUT method and requests typically do not require a response. Requests are guaranteed to be initiated
  * before a page is unloaded and they are run to completion without requiring a blocking request (for example
  * XMLHttpRequest).
  *
  * @see
  *   [[https://www.w3.org/TR/2016/WD-beacon-20160204/ Beacon W3C Working Draft]]
  * @see
  *   [[https://developer.mozilla.org/en-US/docs/Web/API/Beacon_API MDN Beacon API]]
  */
@js.native
trait BeaconNavigator extends js.Object {

  /** The navigator.sendBeacon() method can be used to asynchronously transfer small HTTP data from the User Agent to a
    * web server.
    *
    * @param url
    *   The url parameter indicates the resolved URL where the data is to be transmitted.
    * @param data
    *   The data parameter is the ArrayBufferView, Blob, DOMString, or FormData data that is to be transmitted.
    */
  def sendBeacon(url: String, data: dom.BodyInit = js.native): Boolean = js.native
}

/** The Beacon interface is used to schedule an asynchronous and non-blocking request to a web server. Beacon requests
  * use the HTTP PUT method and requests typically do not require a response. Requests are guaranteed to be initiated
  * before a page is unloaded and they are run to completion without requiring a blocking request (for example
  * XMLHttpRequest).
  *
  * @see
  *   [[https://www.w3.org/TR/2016/WD-beacon-20160204/ Beacon W3C Working Draft]]
  * @see
  *   [[https://developer.mozilla.org/en-US/docs/Web/API/Beacon_API MDN Beacon API]]
  */
@js.native
trait BeaconWorkerNavigator extends js.Object {

  /** The navigator.sendBeacon() method can be used to asynchronously transfer small HTTP data from the User Agent to a
    * web server.
    *
    * @param url
    *   The url parameter indicates the resolved URL where the data is to be transmitted.
    * @param data
    *   The data parameter is the ArrayBufferView, Blob, DOMString, or FormData data that is to be transmitted.
    */
  def sendBeacon(url: String, data: dom.BodyInit = js.native): Boolean = js.native
}
