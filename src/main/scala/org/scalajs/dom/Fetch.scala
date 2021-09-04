package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

@js.native
@JSGlobalScope
object Fetch extends js.Object {

  /** [[https://fetch.spec.whatwg.org/#fetch-method ¶6.0 Fetch method]] defined in WhatWG spec
    *
    * @param info
    * @param init
    * @return
    */
  def fetch(info: RequestInfo, init: RequestInit = null): js.Promise[Response] = js.native
}

/** The Request interface of the Fetch API represents a resource request. MDN
  *
  * see [[https://fetch.spec.whatwg.org/#request-class ¶6.3 Request Class]] in whatwg spec
  *
  * @param input
  *   the url of the requested resource or an unused Request object.
  * @param init
  *   initialisation information
  */
@js.native
@JSGlobal
class Request(input: RequestInfo, init: RequestInit = null) extends Body {

  /** Contains the request's method (GET, POST, etc.)
    */
  def method: HttpMethod = js.native

  @JSName("type")
  def `mediaType`: RequestType = js.native

  /** Contains the URL of the request.
    */
  def url: String = js.native //should be USVString

  /** Contains the associated Headers object of the request.
    */
  def headers: Headers = js.native

  def destination: RequestDestination = js.native

  def referrer: String = js.native

  def referrerPolicy: ReferrerPolicy = js.native

  def mode: RequestMode = js.native

  def credentials: RequestCredentials = js.native

  def cache: RequestCache = js.native

  def redirect: RequestRedirect = js.native

  def integrity: String = js.native //should be DOMString

  def keepalive: Boolean = js.native

  def signal: AbortSignal = js.native
}

/** See [[https://fetch.spec.whatwg.org/#requestinit RequestInit]] in Fetch API The underlying object is a dictionary.
  * This trait is here to help encode the types.
  */
trait RequestInit extends js.Object {
  var method: js.UndefOr[HttpMethod] = js.undefined

  var headers: js.UndefOr[HeadersInit] = js.undefined

  var body: js.UndefOr[BodyInit] = js.undefined

  var referrer: js.UndefOr[String] = js.undefined

  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined

  var mode: js.UndefOr[RequestMode] = js.undefined

  var credentials: js.UndefOr[RequestCredentials] = js.undefined

  var cache: js.UndefOr[RequestCache] = js.undefined

  var redirect: js.UndefOr[RequestRedirect] = js.undefined

  var integrity: js.UndefOr[String] = js.undefined

  var keepalive: js.UndefOr[Boolean] = js.undefined

  var signal: js.UndefOr[AbortSignal] = js.undefined

  /** The whatwg spec section on [[https://fetch.spec.whatwg.org/#requestinit RequestInit dictionary]] has a comment
    * that states that this value "can only be set to null". In the detailed steps section for
    * [[https://fetch.spec.whatwg.org/#dom-request the Request(input,init) constructor]] it says even more clearly: "If
    * init's window member is present and it is not null, throw a TypeError."
    */
  var window: js.UndefOr[Null] = js.undefined
}

/** [[https://fetch.spec.whatwg.org/#response ¶6.4 Response class]] in whatwg spec
  *
  * @param content
  *   optional content
  * @param init
  *   optional response initialisiton
  */
@js.native
@JSGlobal
class Response(content: BodyInit = null, init: ResponseInit = null) extends Body {

  /** Contains the type of the response */
  def `type`: ResponseType = js.native

  /** Contains the URL of the response. */
  def url: String = js.native

  /** Contains a boolean stating whether the response was successful (status in the range 200-299) or not.
    */
  def ok: Boolean = js.native

  /** Contains the status code of the response (e.g., 200 for a success). */
  val status: Int = js.native //actually returns unsigned short

  /** Contains the status message corresponding to the status code (e.g., OK for 200). */
  def statusText: ByteString = js.native //actually returns ByteString

  /** Contains the Headers object associated with the response. */
  val headers: Headers = js.native

  val body: ReadableStream[Uint8Array] = js.native

  override def clone(): Response = js.native
}

/** static methods associated with a Response object in [[https://fetch.spec.whatwg.org/#response ¶6.4 Response class]]
  * of whatwg Fetch spec.
  */
@js.native
@JSGlobal
object Response extends js.Object {

  /** @return
    *   a new Response object associated with a network error.
    */
  def error(): Response = js.native

  /** @param url
    * @param status
    *   redirect status
    * @return
    *   a new Response
    */
  def redirect(url: String, status: Int = 302): Response = js.native
}

/** See [[https://fetch.spec.whatwg.org/#response-class ¶6.4 Response class]] definition in whatwg Fetch spec.
  */
trait ResponseInit extends js.Object {
  var status: Int
  var statusText: ByteString
  var headers: HeadersInit
}

/** See [[https://fetch.spec.whatwg.org/#body body interface]] in whatwg Fetch spec.
  *
  * see also [[https://developer.mozilla.org/en-US/docs/Web/API/Body Body]] in MDN
  */
@js.native
trait Body extends js.Object {

  /** MDN: Contains a Boolean that indicates whether the body has been read.
    */
  def bodyUsed: Boolean = js.native

  /** MDN: Takes a Response stream and reads it to completion. It returns a promise that resolves with an ArrayBuffer.
    */
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with a Blob.
    */
  def blob(): js.Promise[Blob] = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with a FormData object.
    */
  def formData(): js.Promise[FormData] = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with a JSON object. //todo:
    * define the JSON type, and return a Promise[JSON] as per spec
    */
  def json(): js.Promise[js.Any] = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with a USVString (text).
    */
  def text(): js.Promise[String] = js.native
}

/** [[https://fetch.spec.whatwg.org/#headers-class ¶6.1 Headers Class]] of whatwg spec
  *
  * The Headers interface of the Fetch API allows you to perform various actions on HTTP request and response headers.
  * These actions include retrieving, setting, adding to, and removing. A Headers object has an associated header list,
  * which is initially empty and consists of zero or more name and value pairs. You can add to this using methods like
  * append() (see Examples.) In all methods of this interface, header names are matched by case-insensitive byte
  * sequence.
  *
  * For security reasons, some headers can only be controller by the user agent. These headers include the forbidden
  * header names and forbidden response header names.
  *
  * A Headers object also has an associated guard, which takes a value of immutable, request, request-no-cors, response,
  * or none. This affects whether the set(), delete(), and append() methods will mutate the header. For more information
  * see Guard.
  *
  * You can retrieve a Headers object via the Request.headers and Response.headers properties, and create a new Headers
  * object using the Headers.Headers() constructor.
  *
  * MDN
  */
@js.native
@JSGlobal
class Headers(map: HeadersInit = js.Array[js.Array[String]]()) extends js.Iterable[js.Array[ByteString]] {

  @JSName(js.Symbol.iterator)
  def jsIterator(): js.Iterator[js.Array[ByteString]] = js.native

  /** The append() method of the Headers interface appends a new value onto an existing header inside a Headers object,
    * or adds the header if it does not already exist.
    *
    * The difference between Headers.set and append() is that if the specified header already exists and accepts
    * multiple values, Headers.set will overwrite the existing value with the new one, whereas append() will append the
    * new value onto the end of the set of values.
    */
  def append(name: ByteString, value: ByteString): Unit = js.native

  /** The set() method of the Headers interface sets a new value for an existing header inside a Headers object, or adds
    * the header if it does not already exist.
    *
    * The difference between set() and Headers.append is that if the specified header already exists and accepts
    * multiple values, set() overwrites the existing value with the new one, whereas Headers.append appends the new
    * value to the end of the set of values.
    *
    * Not all headers can be set. See the list of forbidden header names in
    * https://fetch.spec.whatwg.org/#terminology-headers
    */
  def set(name: ByteString, value: ByteString): Unit = js.native

  /** The delete() method of the Headers interface deletes a header from the current Headers object.
    */
  def delete(name: ByteString): Unit = js.native

  /** The get() method of the Headers interface returns the first value of a given header from within a Headers object .
    * If the requested header doesn't exist in the Headers object, the call returns null.
    *
    * @param name
    *   a ByteString, ie. only ASCII chars
    */
  def get(name: ByteString): ByteString = js.native

  /** The getAll() method of the Headers interface returns an array of all the values of a header within a Headers
    * object with a given name. If the requested header doesn't exist in the Headers object, it returns an empty array.
    *
    * @param name
    *   a ByteString, ie. only ASCII chars
    */
  def getAll(name: ByteString): Sequence[ByteString] = js.native

  /** The has() method of the Headers interface returns a boolean stating whether a Headers object contains a certain
    * header.
    *
    * @param name
    *   a ByteString, ie. only ASCII chars
    */
  def has(name: ByteString): Boolean = js.native
}

@js.native
sealed trait ReferrerPolicy extends js.Any

object ReferrerPolicy {
  val empty: ReferrerPolicy = "".asInstanceOf[ReferrerPolicy]
  val `no-referrer` = "no-referrer".asInstanceOf[ReferrerPolicy]

  val `no-referrer-when-downgrade` =
    "no-referrer-when-downgrade".asInstanceOf[ReferrerPolicy]
  val `origin-only` = "origin-only".asInstanceOf[ReferrerPolicy]

  val `origin-when-cross-origin` =
    "origin-when-cross-origin".asInstanceOf[ReferrerPolicy]
  val `unsafe-url` = "unsafe-url".asInstanceOf[ReferrerPolicy]
}

/** This is not typed in the Fetch API but it is easy to create the most common defaults.
  */
@js.native
trait HttpMethod extends js.Any

object HttpMethod {
  val GET: HttpMethod = "GET".asInstanceOf[HttpMethod]
  val POST: HttpMethod = "POST".asInstanceOf[HttpMethod]
  val PUT: HttpMethod = "PUT".asInstanceOf[HttpMethod]
  val PATCH: HttpMethod = "PATCH".asInstanceOf[HttpMethod]
  val DELETE: HttpMethod = "DELETE".asInstanceOf[HttpMethod]
  val QUERY: HttpMethod = "QUERY".asInstanceOf[HttpMethod]
  val HEAD: HttpMethod = "HEAD".asInstanceOf[HttpMethod]
  val OPTIONS: HttpMethod = "OPTIONS".asInstanceOf[HttpMethod]
}

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requesttype RequestType enum]]
  */
@js.native
sealed trait RequestType extends js.Any

object RequestType {
  val empty: RequestType = "".asInstanceOf[RequestType]
  val audio: RequestType = "audio".asInstanceOf[RequestType]
  val font: RequestType = "font".asInstanceOf[RequestType]
  val image: RequestType = "image".asInstanceOf[RequestType]
  val script: RequestType = "script".asInstanceOf[RequestType]
  val style: RequestType = "style".asInstanceOf[RequestType]
  val track: RequestType = "track".asInstanceOf[RequestType]
  val video: RequestType = "video".asInstanceOf[RequestType]
}

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestdestination RequestDestination enum]]
  */
@js.native
sealed trait RequestDestination extends js.Any

object RequestDestination {
  val empty: RequestDestination = "".asInstanceOf[RequestDestination]
  val document: RequestDestination = "document".asInstanceOf[RequestDestination]
  val sharedworker: RequestDestination = "sharedworker".asInstanceOf[RequestDestination]
  val subresource: RequestDestination = "subresource".asInstanceOf[RequestDestination]
  val unknown: RequestDestination = "unknown".asInstanceOf[RequestDestination]
  val worker: RequestDestination = "worker".asInstanceOf[RequestDestination]
}

/** Fetch API's [[https://fetch.spec.whatwg.org/#requestmode RequestMode enum]]
  */
@js.native
sealed trait RequestMode extends js.Any

object RequestMode {
  val navigate: RequestMode = "navigate".asInstanceOf[RequestMode]
  val `same-origin` = "same-origin".asInstanceOf[RequestMode]
  val `no-cors` = "no-cors".asInstanceOf[RequestMode]
  val cors: RequestMode = "cors".asInstanceOf[RequestMode]
}

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestcredentials RequestCredentials enum]]
  */
@js.native
sealed trait RequestCredentials extends js.Any

object RequestCredentials {
  val omit: RequestCredentials = "omit".asInstanceOf[RequestCredentials]
  val `same-origin` = "same-origin".asInstanceOf[RequestCredentials]
  val include: RequestCredentials = "include".asInstanceOf[RequestCredentials]
}

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestcache RequestCache enum]]
  */
@js.native
sealed trait RequestCache extends js.Any

object RequestCache {
  val default: RequestCache = "default".asInstanceOf[RequestCache]
  val `no-store` = "no-store".asInstanceOf[RequestCache]
  val reload: RequestCache = "reload".asInstanceOf[RequestCache]
  val `no-cache` = "no-cache".asInstanceOf[RequestCache]
  val `force-cache` = "force-cache".asInstanceOf[RequestCache]
  val `only-if-cached` = "only-if-cached".asInstanceOf[RequestCache]
}

/** Fetch API's [[https://fetch.spec.whatwg.org/#requestredirect RequestRedirect enum]]
  */
@js.native
sealed trait RequestRedirect extends js.Any

object RequestRedirect {
  val follow: RequestRedirect = "follow".asInstanceOf[RequestRedirect]
  val error: RequestRedirect = "error".asInstanceOf[RequestRedirect]
  val manual: RequestRedirect = "manual".asInstanceOf[RequestRedirect]
}

@js.native
sealed trait ResponseType extends js.Any

/** see [[https://fetch.spec.whatwg.org/#responsetype]] of whatwg Fetch spec
  */
object ResponseType {
  val basic: ResponseType = "basic".asInstanceOf[ResponseType]
  val cors: ResponseType = "cors".asInstanceOf[ResponseType]
  val default: ResponseType = "default".asInstanceOf[ResponseType]
  val error: ResponseType = "error".asInstanceOf[ResponseType]
  val opaque: ResponseType = "opaque".asInstanceOf[ResponseType]
  val opaqueredirect: ResponseType = "opaqueredirect".asInstanceOf[ResponseType]
}
