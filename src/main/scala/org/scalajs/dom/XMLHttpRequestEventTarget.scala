/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** XMLHttpRequestEventTarget is the interface that describes the event handlers you can implement in an object that
  * will handle events for an XMLHttpRequest.
  */
@js.native
trait XMLHttpRequestEventTarget extends EventTarget {

  /** A function that is called periodically with information about the progress of the request. */
  var onprogress: js.Function1[ProgressEvent, _] = js.native

  /** The function to call when a request encounters an error. */
  var onerror: js.Function1[ProgressEvent, _] = js.native

  /** The function to call when an HTTP request returns after successfully loading content. */
  var onload: js.Function1[ProgressEvent, _] = js.native

  /** A function that is called if the event times out; this only happens if a timeout has been previously established
    * by setting the value of the XMLHttpRequest object's timeout attribute.
    */
  var ontimeout: js.Function1[ProgressEvent, _] = js.native

  /** The function to call when a request is aborted. */
  var onabort: js.Function1[ProgressEvent, _] = js.native

  /** A function that gets called when the HTTP request first begins loading data. */
  var onloadstart: js.Function1[ProgressEvent, _] = js.native

  /** A function that is called when the load is completed, even if the request failed. */
  var onloadend: js.Function1[ProgressEvent, _] = js.native
}
