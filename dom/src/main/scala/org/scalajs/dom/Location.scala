/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The Location interface represents the location of the object it is linked to. Changes done on it are reflected on
  * the object it relates to. Both the Document and Window interface have such a linked Location, accessible via
  * Document.location and Window.location respectively.
  */
@js.native
trait Location extends js.Object {

  /** Is a DOMString containing a '#' followed by the fragment identifier of the URL. */
  var hash: String = js.native

  /** Is a DOMString containing the protocol scheme of the URL, including the final ':'. */
  var protocol: String = js.native

  /** Is a DOMString containing a '?' followed by the parameters of the URL. */
  var search: String = js.native

  /** Is a DOMString containing the whole URL. */
  var href: String = js.native

  /** Is a DOMString containing the domain of the URL. */
  var hostname: String = js.native

  /** Is a DOMString containing the port number of the URL. */
  var port: String = js.native

  /** Is a DOMString containing an initial '/' followed by the path of the URL. */
  var pathname: String = js.native

  /** Is a DOMString containing the host, that is the hostname, a ':', and the port of the URL. */
  var host: String = js.native

  /** The origin read-only property is a String containing the Unicode serialization of the origin of the represented
    * URL, that is, for http and https, the scheme followed by '://', followed by the domain, followed by ':', followed
    * by the port (the default port, 80 and 443 respectively, if explicitly specified). For URL using file: scheme, the
    * value is browser dependant.
    *
    * This property also does not exist consistently on IE, even as new as IE11, hence it must be UndefOr.
    */
  def origin: String = js.native

  /** The Location.reload()method Reloads the resource from the current URL. Its optional unique parameter is a Boolean,
    * which, when it is true, causes the page to always be reloaded from the server. If it is false or not specified,
    * the browser may reload the page from its cache.
    */
  def reload: Unit = js.native

  /** The Location.replace()method replaces the current resource with the one at the provided URL. The difference from
    * the assign() method is that after using replace() the current page will not be saved in session History, meaning
    * the user won't be able to use the back button to navigate to it.
    */
  def replace(url: String): Unit = js.native

  /** The Location.assign()method loading the object at the URL providing in parameter. */
  def assign(url: String): Unit = js.native
}
