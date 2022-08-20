package org.scalajs.dom

import scala.scalajs.js

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

  /** "half" is the only valid value and it is for initiating a half-duplex fetch (i.e., the user agent sends the entire
    * request before processing the response).
    */
  var duplex: js.UndefOr[RequestDuplex] = js.undefined

  /** The whatwg spec section on [[https://fetch.spec.whatwg.org/#requestinit RequestInit dictionary]] has a comment
    * that states that this value "can only be set to null". In the detailed steps section for
    * [[https://fetch.spec.whatwg.org/#dom-request the Request(input,init) constructor]] it says even more clearly: "If
    * init's window member is present and it is not null, throw a TypeError."
    */
  var window: js.UndefOr[Null] = js.undefined
}
