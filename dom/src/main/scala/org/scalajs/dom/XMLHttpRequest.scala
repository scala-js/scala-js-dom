/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** XMLHttpRequest is a JavaScript object that was designed by Microsoft and adopted by Mozilla, Apple, and Google. It's
  * now being standardized in the W3C. It provides an easy way to retrieve data from a URL without having to do a full
  * page refresh. A Web page can update just a part of the page without disrupting what the user is doing.
  * XMLHttpRequest is used heavily in AJAX programming.
  *
  * Despite its name, XMLHttpRequest can be used to retrieve any type of data, not just XML, and it supports protocols
  * other than HTTP (including file and ftp).
  */
@js.native
@JSGlobal
class XMLHttpRequest extends EventTarget {

  /** The status of the response to the request. This is the HTTP result code (for example, status is 200 for a
    * successful request).
    */
  def status: Int = js.native

  /** The state of the request: Value State Description 0 UNSENT open()has not been called yet. 1 OPENED send()has not
    * been called yet. 2 HEADERS_RECEIVED send() has been called, and headers and status are available. 3 LOADING
    * Downloading; responseText holds partial data. 4 DONE The operation is complete.
    */
  def readyState: Int = js.native

  /** The response to the request as text, or null if the request was unsuccessful or has not yet been sent. */
  def responseText: String = js.native

  /** The response to the request as a DOM Document object, or null if the request was unsuccessful, has not yet been
    * sent, or cannot be parsed as XML or HTML. The response is parsed as if it were a text/xml stream. When the
    * responseType is set to "document" and the request has been made asynchronously, the response is parsed as a
    * text/html stream. Note: If the server doesn't apply the text/xml Content-Type header, you can use
    * overrideMimeType() to force XMLHttpRequest to parse it as XML anyway.
    */
  def responseXML: Document = js.native

  /** Returns the serialized URL of the response or the empty string if the URL is null. If the URL is returned, URL
    * fragment if present in the URL will be stripped away. The value of responseURL will be the final URL obtained
    * after any redirects.
    *
    * This property should be a String, but it isn't implemented by IE, even as new as IE11, hence it must be UndefOr.
    */
  def responseURL: js.UndefOr[String] = js.native

  var ontimeout: js.Function1[ProgressEvent, _] = js.native

  /** The response string returned by the HTTP server. Unlike status, this includes the entire text of the response
    * message ("200 OK", for example).
    */
  def statusText: String = js.native

  var onreadystatechange: js.Function1[Event, _] = js.native

  /** The number of milliseconds a request can take before automatically being terminated. A value of 0 (which is the
    * default) means there is no timeout. Note: You may not use a timeout for synchronous requests with an owning
    * window.
    */
  var timeout: Double = js.native
  var onload: js.Function1[ProgressEvent, _] = js.native

  /** Initializes a request. This method is to be used from JavaScript code; to initialize a request from native code,
    * use openRequest()instead.
    */
  def open(method: String, url: String, async: Boolean = js.native, user: String = js.native,
      password: String = js.native): Unit = js.native

  def create(): XMLHttpRequest = js.native

  /** Sends the request. If the request is asynchronous (which is the default), this method returns as soon as the
    * request is sent. If the request is synchronous, this method doesn't return until the response has arrived.
    */
  def send(data: js.Any = js.native): Unit = js.native

  /** Aborts the request if it has already been sent. */
  def abort(): Unit = js.native

  /** The XMLHttpRequest method overrideMimeType() specifies a MIME type other than the one provided by the server to be
    * used instead when interpreting the data being transferred in a request. This may be used, for example, to force a
    * stream to be treated and parsed as "text/xml", even if the server does not report it as such. This method must be
    * called before calling send().
    */
  def overrideMimeType(mimeType: String): Unit = js.native

  def getAllResponseHeaders(): String = js.native

  /** Sets the value of an HTTP request header. You must call setRequestHeader() after open(), but before send(). If
    * this method is called several times with the same header, the values are merged into one single request header.
    */
  def setRequestHeader(header: String, value: String): Unit = js.native

  def getResponseHeader(header: String): String = js.native

  /** The response entity body according to responseType, as an ArrayBuffer, Blob, Document, JavaScript object (for
    * "json"), or string. This is null if the request is not complete or was not successful.
    */
  def response: js.Any = js.native

  /** Indicates whether or not cross-site Access-Control requests should be made using credentials such as cookies or
    * authorization headers. The default is false. Note: This never affects same-site requests. Note: Starting with
    * Gecko 11.0 (Firefox 11.0 / Thunderbird 11.0 / SeaMonkey 2.8), Gecko no longer lets you use the withCredentials
    * attribute when performing synchronous requests. Attempting to do so throws an NS_ERROR_DOM_INVALID_ACCESS_ERR
    * exception.
    */
  var withCredentials: Boolean = js.native
  var onprogress: js.Function1[ProgressEvent, _] = js.native
  var onabort: js.Function1[ProgressEvent, _] = js.native

  /** Can be set to change the response type. Value Data type of response property "" (empty string) String (this is the
    * default) "arraybuffer" ArrayBuffer "blob" Blob "document" Document "json" JavaScript object, parsed from a JSON
    * string returned by the server "text" String "moz-blob" Used by Firefox to allow retrieving partial Blob data from
    * progress events. This lets your progress event handler start processing data while it's still being received.
    * "moz-chunked-text" Similar to "text", but is streaming. This means that the value in response is only available
    * during dispatch of the "progress" event and only contains the data received since the last "progress" event. When
    * response is accessed during a "progress" event it contains a string with the data. Otherwise it returns null. This
    * mode currently only works in Firefox. "moz-chunked-arraybuffer" Similar to "arraybuffer", but is streaming. This
    * means that the value in response is only available during dispatch of the "progress" event and only contains the
    * data received since the last "progress" event. When response is accessed during a "progress" event it contains a
    * string with the data. Otherwise it returns null. This mode currently only works in Firefox. Note: Starting with
    * Gecko 11.0 (Firefox 11.0 / Thunderbird 11.0 / SeaMonkey 2.8), as well as WebKit build 528, these browsers no
    * longer let you use the responseType attribute when performing synchronous requests. Attempting to do so throws an
    * NS_ERROR_DOM_INVALID_ACCESS_ERR exception. This change has been proposed to the W3C for standardization.
    */
  var responseType: String = js.native
  var onloadend: js.Function1[ProgressEvent, _] = js.native

  /** The upload process can be tracked by adding an event listener to upload. */
  var upload: XMLHttpRequestEventTarget = js.native
  var onerror: js.Function1[ProgressEvent, _] = js.native
  var onloadstart: js.Function1[ProgressEvent, _] = js.native
}

@js.native
@JSGlobal
object XMLHttpRequest extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLHttpRequest),List())))) */
  var LOADING: Int = js.native
  var DONE: Int = js.native
  var UNSENT: Int = js.native
  var OPENED: Int = js.native
  var HEADERS_RECEIVED: Int = js.native
}
