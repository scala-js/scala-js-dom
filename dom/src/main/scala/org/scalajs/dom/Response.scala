package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.Uint8Array

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

  /** Contains a boolean stating whether the response was successful (status in the range 200-299) or not. */
  def ok: Boolean = js.native

  /** Contains the status code of the response (e.g., 200 for a success). */
  val status: Int = js.native // actually returns unsigned short

  /** Contains the status message corresponding to the status code (e.g., OK for 200). */
  def statusText: ByteString = js.native // actually returns ByteString

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
  def redirect(url: String, status: Int = js.native): Response = js.native
}
