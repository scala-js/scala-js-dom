package org.scalajs

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView, Uint8Array}
import scala.scalajs.js.|

package object dom {

  /** The Transferable interface represents an object that can be transfered between different execution contexts, like
    * the main thread and Web workers.
    *
    * This is an abstract interface and there isn't any object of this type. It also doesn't define any method or
    * property: it is merely a tag indicating objects that can be used in specific conditions, like to be transfered to
    * a Worker using the Worker.postMessage() method.
    */
  type Transferable = ArrayBuffer | MessagePort | CanvasProxy

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

  /** defined at [[https://fetch.spec.whatwg.org/#bodyinit-unions]] in whatwg Fetch spec */
  type BodyInit =
    Blob | BufferSource | FormData | String | ReadableStream[Uint8Array] | URLSearchParams

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

  type IDBKey = Any

  /** A valid key path can include one of the following: an empty string, a JavaScript identifier, or multiple
    * JavaScript identifiers separated by periods or an array containing any of those. It cannot include spaces.
    *
    * @see
    *   https://developer.mozilla.org/en-US/docs/Web/API/IndexedDB_API/Basic_Terminology#key_path
    */
  type IDBKeyPath = Any

  type IDBValue = Any

  type BigInteger = js.typedarray.Uint8Array

  /** According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]] of the
    * WebCryptoAPI an AlgorithmIdentifier is an `object or DOMString`. We make this more precise here and specify an
    * Algorithm. note: it may be that we can do only with KeyAlgorithmIdentifier and HashAlgorithmIdentifier
    */
  type AlgorithmIdentifier = Algorithm | String

  /** According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]] of the
    * WebCryptoAPI an AlgorithmIdentifier is an `object or DOMString`. We make this more precise here and distinguish
    * the non overlapping classes of Key and Hash Algorithms.
    */
  type KeyAlgorithmIdentifier = KeyAlgorithm | String

  /** According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]] a
    * HashAlgorithmIdentifier is an AlgorithmIdentifier. Here we distinguish between Hash and Key Algorithm Identifiers.
    * At the JS layer these have the same structure.
    */
  type HashAlgorithmIdentifier = HashAlgorithm | String

  /** This is the same as `crypto` in JS.
    *
    * To maintain backwards-source-compatibility with scala-js-dom v1, `crypto` in scala-js-dom is retained as a package
    * object.
    */
  @js.native
  @JSGlobal("crypto")
  val webcrypto: Crypto = js.native

  type BlobPart = BufferSource | Blob | String

  type ClipboardItemData = js.Promise[String | Blob]
}
