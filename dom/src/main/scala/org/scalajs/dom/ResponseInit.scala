package org.scalajs.dom

import scala.scalajs.js

/** See [[https://fetch.spec.whatwg.org/#response-class ¶6.4 Response class]] definition in whatwg Fetch spec. */
trait ResponseInit extends js.Object {
  var status: Int
  var statusText: ByteString
  var headers: HeadersInit
}
