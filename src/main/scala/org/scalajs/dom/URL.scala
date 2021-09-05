package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The URL object provides static methods used for creating object URLs.
  */
@js.native
@JSGlobal
object URL extends js.Object {

  /** The URL.revokeObjectURL() static method releases an existing object URL which was previously created by calling
    * window.URL.createObjectURL().  Call this method when you've finished using a object URL, in order to let the
    * browser know it doesn't need to keep the reference to the file any longer.
    */
  def revokeObjectURL(url: String): Unit = js.native

  /** The URL.createObjectURL() static method creates a DOMString containing an URL representing the object given in
    * parameter. The URL lifetime is tied to the document in the window on which it was created. The new object URL
    * represents the specified File object or Blob object.
    */
  def createObjectURL(blob: Blob): String = js.native
}

/** The URL() constructor returns a newly created URL object representing the URL defined by the parameters.
  */
@js.native
@JSGlobal
class URL(url: String, base: String = js.native) extends js.Object {

  /** Returns a DOMString containing the origin of the URL, that is its scheme, its domain and its port.
    */
  def origin: String = js.native

  /** Is a DOMString containing the whole URL.
    */
  var href: String = js.native

  /** Is a DOMString containing the protocol scheme of the URL, including the final ':'.
    */
  var protocol: String = js.native

  /** Is a DOMString containing the username specified before the domain name.
    */
  var username: String = js.native

  /** Is a DOMString containing the password specified before the domain name.
    */
  var password: String = js.native

  /** Is a DOMString containing the host, that is the hostname, a ':', and the port of the URL.
    */
  var host: String = js.native

  /** Is a DOMString containing the domain of the URL.
    */
  var hostname: String = js.native

  /** Is a DOMString containing the port number of the URL.
    */
  var port: String = js.native

  /** Is a DOMString containing an initial '/' followed by the path of the URL.
    */
  var pathname: String = js.native

  /** Is a DOMString containing a '?' followed by the parameters of the URL.
    */
  var search: String = js.native

  /** Is a DOMString containing a '#' followed by the fragment identifier of the URL.
    */
  var hash: String = js.native

  var searchParams: URLSearchParams = js.native
}

/** The URLSearchParams defines utility methods to work with the query string of a URL.
  */
@js.native
@JSGlobal
class URLSearchParams extends js.Iterable[js.Tuple2[String, String]] {

  /** Leading '?' characters are ignored.
    */
  def this(init: String) = this()
  def this(init: Sequence[String]) = this()
  def this(init: js.Dictionary[String]) = this()

  def append(name: String, value: String): Unit = js.native

  def delete(name: String): Unit = js.native

  def get(name: String): String = js.native

  def getAll(name: String): Sequence[String] = js.native

  def has(name: String): Boolean = js.native

  def set(name: String, value: String): Unit = js.native

  def sort(): Unit = js.native

  @JSName(js.Symbol.iterator)
  override def jsIterator(): js.Iterator[js.Tuple2[String, String]] = js.native

  def entries(): js.Iterator[js.Tuple2[String, String]] = js.native

  def keys(): js.Iterator[String] = js.native

  def values(): js.Iterator[String] = js.native

  def forEach(callback: js.Function2[String, String, Unit]): Unit = js.native

}
