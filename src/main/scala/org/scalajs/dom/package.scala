package org.scalajs

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

package object dom {

  /** The Transferable interface represents an object that can be transfered between different execution contexts, like
    * the main thread and Web workers.
    *
    * This is an abstract interface and there isn't any object of this type. It also doesn't define any method or
    * property: it is merely a tag indicating objects that can be used in specific conditions, like to be transfered to
    * a Worker using the Worker.postMessage() method.
    */
  type Transferable = ArrayBuffer | MessagePort

  type BufferSource = ArrayBufferView | ArrayBuffer

  /** defined at [[https://fetch.spec.whatwg.org/#request-class ¶6.3 Request class]] of whatwg Fetch spec */
  type RequestInfo = String | Request

  /** defined at [[https://fetch.spec.whatwg.org/#headersinit ¶6.1 Header Class]] in whatwg Fetch spec todo: it should
    * be OpenEndedDictionary[ByteString]
    */
  type HeadersInit =
    Headers | Sequence[Sequence[ByteString]] | OpenEndedDictionary[ByteString]

  /** This type should capture strings consisting only of ASCII chars todo: is there a way to capture this type? */
  type ByteString = String

  /** defined at [[https://fetch.spec.whatwg.org/#body-mixin ¶6.2 Body mixin]] in whatwg Fetch spec */
  type BodyInit =
    Blob | BufferSource | FormData | String //todo: add URLSearchParams

  /** WebIDL sequence<T> is js.Array[T] | JSIterable[T]. However @mseddon knows at least Blink's IDL compiler treats
    * these as simply js.Array[T] for now. We keep this type as a reminder to check in more detail
    */
  type Sequence[T] = js.Array[T]

  /** see [[https://fetch.spec.whatwg.org/#headers-class ¶6.1 Headers class]] in whatwg Fetch spec. also see:
    * [[https://github.com/whatwg/fetch/issues/164 issue 164]] in Fetch API git repo, as this is not clearly defined
    */
  type OpenEndedDictionary[T] = js.Dictionary[T]

  @js.native
  @JSGlobal("window")
  val window: Window = js.native

  @js.native
  @JSGlobal("document")
  val document: html.Document = js.native

  @js.native
  @JSGlobal("console")
  val console: Console = js.native

  @js.native
  @JSGlobal("fetch")
  def fetch(info: RequestInfo, init: RequestInit = null): js.Promise[Response] = js.native

  @deprecated("directly use the dom.CSS* types and values instead", "2.0.0")
  lazy val css: DeprecatedCSSAliases.type = DeprecatedCSSAliases

  @deprecated("use DOMRect instead", "2.0.0")
  type ClientRect = DOMRect

  @deprecated("use DOMRectList instead", "2.0.0")
  type ClientRectList = DOMRectList

  @deprecated("use NodeList[T] instead", "2.0.0")
  type NodeListOf[+T <: Node] = NodeList[T]
}
