package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.typedarray.ArrayBuffer

/** See [[https://fetch.spec.whatwg.org/#body body interface]] in whatwg Fetch spec.
  *
  * see also [[https://developer.mozilla.org/en-US/docs/Web/API/Body Body]] in MDN
  */
@js.native
trait Body extends js.Object {

  /** Contains a Boolean that indicates whether the body has been read. */
  def bodyUsed: Boolean = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with an ArrayBuffer. */
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with a Blob. */
  def blob(): js.Promise[Blob] = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with a FormData object. */
  def formData(): js.Promise[FormData] = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with a JSON object. //todo:
    * define the JSON type, and return a Promise[JSON] as per spec
    */
  def json(): js.Promise[js.Any] = js.native

  /** Takes a Response stream and reads it to completion. It returns a promise that resolves with a USVString (text). */
  def text(): js.Promise[String] = js.native
}
