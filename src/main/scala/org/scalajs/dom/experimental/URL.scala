package org.scalajs.dom.experimental

import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * The URL() constructor returns a newly created URL object representing the URL
 * defined by the parameters.
 *
 * MDN
 */
@js.native
@JSGlobal
class URL( url: String, base: String) extends js.Object {
  def this(url:String) = this(url, js.native)
  /**
   * Returns a DOMString containing the origin of the URL, that is its scheme,
   * its domain and its port.
   *
   * MDN
   */
  def origin: String = js.native

  /**
   * Is a DOMString containing the whole URL.
   *
   * MDN
   */
  var href: String = js.native

  /**
   * Is a DOMString containing the protocol scheme of the URL,
   * including the final ':'.
   *
   * MDN
   */
  var protocol: String = js.native

  /**
   * Is a DOMString containing the username specified before the domain name.
   *
   * MDN
   */
  var username: String = js.native

  /**
   * Is a DOMString containing the password specified before the domain name.
   *
   * MDN
   */
  var password: String = js.native

  /**
   * Is a DOMString containing the host, that is the hostname, a ':',
   * and the port of the URL.
   *
   * MDN
   */
  var host: String = js.native

  /**
   * Is a DOMString containing the domain of the URL.
   *
   * MDN
   */
  var hostname: String = js.native

  /**
   * Is a DOMString containing the port number of the URL.
   *
   * MDN
   */
  var port: String = js.native

  /**
   * Is a DOMString containing an initial '/' followed by the path of the URL.
   *
   * MDN
   */
  var pathname: String = js.native

  /**
   * Is a DOMString containing a '?' followed by the parameters of the URL.
   *
   * MDN
   */
  var search: String = js.native

  /**
   * Is a DOMString containing a '#' followed by the fragment identifier of the URL.
   *
   * MDN
   */
  var hash: String = js.native

  var searchParams: URLSearchParams = js.native
}

/**
 * The URLSearchParams defines utility methods to work with the query string of a URL.
 *
 * MDN
 */
@js.native
@JSGlobal
class URLSearchParams
    extends js.Iterable[js.Tuple2[String, String]] {

  /**
   * Leading '?' characters are ignored.
   *
   * MDN
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
