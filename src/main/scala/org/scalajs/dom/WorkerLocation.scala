package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The WorkerLocation interface defines the absolute location of the script executed by the Worker. Such an object is
  * initialized for each worker and is available via the WorkerGlobalScope.location property obtained by calling
  * window.self.location.
  */
@js.native
trait WorkerLocation extends js.Object {

  /** Is a DOMString containing a '#' followed by the fragment identifier of the URL. */
  def hash: String = js.native

  /** Is a DOMString containing the protocol scheme of the URL, including the final ':'. */
  def protocol: String = js.native

  /** Is a DOMString containing a '?' followed by the parameters of the URL. */
  def search: String = js.native

  /** Is a DOMString containing the whole URL. */
  def href: String = js.native

  /** Is a DOMString containing the domain of the URL. */
  def hostname: String = js.native

  /** Is a DOMString containing the port number of the URL. */
  def port: String = js.native

  /** Is a DOMString containing an initial '/' followed by the path of the URL. */
  def pathname: String = js.native

  /** Is a DOMString containing the host, that is the hostname, a ':', and the port of the URL. */
  def host: String = js.native

  /** The origin read-only property is a String containing the Unicode serialization of the origin of the represented
    * URL, that is, for http and https, the scheme followed by '://', followed by the domain, followed by ':', followed
    * by the port (the default port, 80 and 443 respectively, if explicitly specified). For URL using file: scheme, the
    * value is browser dependant.
    */
  def origin: String = js.native
}
