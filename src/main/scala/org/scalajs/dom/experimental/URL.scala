package org.scalajs.dom.experimental

import scala.scalajs.js

/**
  * The URL() constructor returns a newly created URL object representing the URL
  * defined by the parameters.
  *
  * MDN
  */
@js.native
class URL(url: String, base: String = js.native) extends js.Object {

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
}
