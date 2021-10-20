package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The Request interface of the Fetch API represents a resource request.
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

  /** Contains the request's method (GET, POST, etc.) */
  def method: HttpMethod = js.native

  @JSName("type")
  def `mediaType`: RequestType = js.native

  /** Contains the URL of the request. */
  def url: String = js.native //should be USVString

  /** Contains the associated Headers object of the request. */
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
