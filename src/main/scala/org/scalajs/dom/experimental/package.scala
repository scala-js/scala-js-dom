package org.scalajs.dom

import org.scalajs.dom.crypto.BufferSource

import scala.scalajs.js
import scala.scalajs.js.|

package object experimental {

  /**
   * defined at [[https://fetch.spec.whatwg.org/#request-class ¶6.3 Request class]]
   * of whatwg Fetch spec
   */
  type RequestInfo = String | Request

  /**
   * defined at [[https://fetch.spec.whatwg.org/#headersinit ¶6.1 Header Class]]
   * in whatwg Fetch spec
   * todo: it should be OpenEndedDictionary[ByteString]
   */
  type HeadersInit = Headers | Sequence[Sequence[ByteString]] | OpenEndedDictionary[ByteString]

  /**
   * This type should capture strings consisting only of ASCII chars
   * todo: is there a way to capture this type?
   */
  type ByteString = String

  /**
   * defined at [[https://fetch.spec.whatwg.org/#body-mixin ¶6.2 Body mixin]]
   * in whatwg Fetch spec
   */
  type BodyInit = Blob | BufferSource | FormData | String //todo: add URLSearchParams

  /**
   * WebIDL sequence<T> is js.Array[T] | JSIterable[T]. However @mseddon knows
   * at least Blink's IDL compiler treats these as simply js.Array[T] for now.
   * We keep this type as a reminder to check in more detail
   */
  type Sequence[T] = js.Array[T]

  /**
   * see [[https://fetch.spec.whatwg.org/#headers-class ¶6.1 Headers class]] in
   * whatwg Fetch spec.
   * also see: [[https://github.com/whatwg/fetch/issues/164 issue 164]] in Fetch
   * API git repo, as this is not clearly defined
   */
  type OpenEndedDictionary[T] = js.Dictionary[T]

  /**
   * [[https://html.spec.whatwg.org/multipage/infrastructure.html#transferable ¶2.7.4 Transferable Objects]]
   * in whatwg html spec.
   */
  type Transferable = js.typedarray.ArrayBuffer | CanvasProxy | MessagePort
}
