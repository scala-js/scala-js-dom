/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The PerformanceTiming interface represents timing-related performance information for the given page. */
@js.native
@JSGlobal
class PerformanceTiming extends js.Object {

  /** The PerformanceTiming.redirectStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, the first HTTP redirect starts. If there is no redirect, or if one of the
    * redirect is not of the same origin, the value returned is 0.
    */
  def redirectStart: Double = js.native

  /** The PerformanceTiming.domainLookupEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, where the domain lookup is finished. If a persistent connection is used, or the
    * information is stored in a cache or a local resource, the value will be the same as PerformanceTiming.fetchStart.
    */
  def domainLookupEnd: Double = js.native

  /** The PerformanceTiming.responseStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the browser received the first byte of the response, from the server from
    * a cache, of from a local resource.
    */
  def responseStart: Double = js.native

  /** The PerformanceTiming.domComplete read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the parser finished its work on the main document, that is when its
    * Document.readyState changes to 'complete' and the corresponding readystatechange event is thrown.
    */
  def domComplete: Double = js.native

  /** The PerformanceTiming.domainLookupStart read-only property returns an unsigned long long representing the moment,
    * in milliseconds since the UNIX epoch, where the domain lookup starts. If a persistent connection is used, or the
    * information is stored in a cache or a local resource, the value will be the same as PerformanceTiming.fetchStart.
    */
  def domainLookupStart: Double = js.native

  /** The PerformanceTiming.loadEventStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the load event was sent for the current document. If this event has not
    * yet been sent, it returns 0.
    */
  def loadEventStart: Double = js.native

  /** The PerformanceTiming.unloadEventEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, the unload event handler finishes. If there is no previous document, or if the
    * previous document, or one of the needed redirects, is not of the same origin, the value returned is 0.
    */
  def unloadEventEnd: Double = js.native

  /** The PerformanceTiming.fetchStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, the browser is ready to fetch the document using an HTTP request. This moment
    * is before the check to any application cache.
    */
  def fetchStart: Double = js.native

  /** The PerformanceTiming.requestStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the browser sent the request to obtain the actual document, from the
    * server or from a cache. If the transport layer fails after the start of the request and the connection is
    * reopened, this property will be set to the time corresponding to the new request.
    */
  def requestStart: Double = js.native

  /** The PerformanceTiming.domInteractive read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the parser finished its work on the main document, that is when its
    * Document.readyState changes to 'interactive' and the corresponding readystatechange event is thrown.
    */
  def domInteractive: Double = js.native

  /** The PerformanceTiming.navigationStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, right after the prompt for unload terminates on the previous document in the
    * same browsing context. If there is no previous document, this value will be the same as
    * PerformanceTiming.fetchStart.
    */
  def navigationStart: Double = js.native

  /** The PerformanceTiming.connectEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, where the connection is opened network. If the transport layer reports an error
    * and the connection establishment is started again, the last connection establisment end time is given. If a
    * persistent connection is used, the value will be the same as PerformanceTiming.fetchStart. A connection is
    * considered as opened when all secure connection handshake, or SOCKS authentication, is terminated.
    */
  def connectEnd: Double = js.native

  /** The PerformanceTiming.loadEventEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the load event handler terminated, that is when the load event is
    * completed. If this event has not yet been sent, or is not yet completed, it returns 0.
    */
  def loadEventEnd: Double = js.native

  /** The PerformanceTiming.connectStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, where the request to open a connection is sent to the network. If the transport
    * layer reports an error and the connection establishment is started again, the last connection establisment start
    * time is given. If a persistent connection is used, the value will be the same as PerformanceTiming.fetchStart.
    */
  def connectStart: Double = js.native

  /** The PerformanceTiming.responseEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the browser received the last byte of the response, or when the connection
    * is closed if this happened first, from the server from a cache, of from a local resource.
    */
  def responseEnd: Double = js.native

  /** The PerformanceTiming.domLoading read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the parser started its work, that is when its Document.readyState changes
    * to 'loading' and the corresponding readystatechange event is thrown.
    */
  def domLoading: Double = js.native

  /** The PerformanceTiming.redirectEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, the last HTTP redirect is completed, that is when the last byte of the HTTP
    * response has been received. If there is no redirect, or if one of the redirect is not of the same origin, the
    * value returned is 0.
    */
  def redirectEnd: Double = js.native

  /** The PerformanceTiming.unloadEventStart read-only property returns an unsigned long long representing the moment,
    * in milliseconds since the UNIX epoch, the unload event has been thrown. If there is no previous document, or if
    * the previous document, or one of the needed redirects, is not of the same origin, the value returned is 0.
    */
  def unloadEventStart: Double = js.native

  /** The PerformanceTiming.domContentLoadedEventStart read-only property returns an unsigned long long representing the
    * moment, in milliseconds since the UNIX epoch, right before the parser sent the DOMContentLoaded event, that is
    * right after all the scripts that need to be executed right after parsing has been executed.
    */
  def domContentLoadedEventStart: Double = js.native

  /** The PerformanceTiming.domContentLoadedEventEnd read-only property returns an unsigned long long representing the
    * moment, in milliseconds since the UNIX epoch, right after all the scripts that need to be executed as soon as
    * possible, in order or not, has been executed.
    */
  def domContentLoadedEventEnd: Double = js.native

  /** Is a jsonizer returning a JSON object representing the specific PerformanceTiming object. */
  def toJSON(): js.Dynamic = js.native
}
