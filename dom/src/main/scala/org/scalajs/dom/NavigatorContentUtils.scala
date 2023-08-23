/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait NavigatorContentUtils extends js.Object {

  /** The Navigator method registerProtocolHandler() lets websites register their ability to open or handle particular
    * URL schemes (aka protocols).
    *
    * For example, this API lets webmail sites open mailto: URLs, or VoIP sites open tel: URLs.
    *
    * @see
    *   https://developer.mozilla.org/en-US/docs/Web/API/Navigator/registerProtocolHandler
    *
    * @param scheme
    *   A string containing the permitted scheme for the protocol that the site wishes to handle. For example, you can
    *   register to handle SMS text message links by passing the "sms" scheme.
    * @param url
    *   A string containing the URL of the handler. This URL must include %s, as a placeholder that will be replaced
    *   with the escaped URL to be handled.
    * @return
    *   undefined
    *
    * @throws DOMException.SECURITY_ERR
    *   The user agent blocked the registration. This might happen if:
    *   - The registered scheme (protocol) is invalid, such as a scheme the browser handles itself (https:, about:,
    *     etc.)
    *   - The handler URL's origin does not match the origin of the page calling this API.
    *   - The browser requires that this function is called from a secure context.
    *   - The browser requires that the handler's URL be over HTTPS.
    *
    * @throws DOMException.SYNTAX_ERR
    *   The %s placeholder is missing from the handler URL
    */
  def registerProtocolHandler(scheme: String, url: String): Unit = js.native
  def registerProtocolHandler(scheme: String, url: URL): Unit = js.native

  /** The Navigator method unregisterProtocolHandler() removes a protocol handler for a given URL scheme.
    *
    * This method is the inverse of registerProtocolHandler().
    *
    * @see
    *   https://developer.mozilla.org/en-US/docs/Web/API/Navigator/unregisterProtocolHandler
    *
    * @param scheme
    *   A string containing the permitted scheme in the protocol handler that will be unregistered. For example, you can
    *   unregister the handler for SMS text message links by passing the "sms" scheme.
    * @param url
    *   A string containing the URL of the handler. This URL should match the one that was used to register the handler
    *   (e.g. it must include %s).
    * @return
    *   undefined
    *
    * @throws DOMException.SECURITY_ERR
    *   The user agent blocked unregistration. This might happen if:
    *   - The registered scheme (protocol) is invalid, such as a scheme the browser handles itself (https:, about:,
    *     etc.)
    *   - The handler URL's origin does not match the origin of the page calling this API.
    *   - The browser requires that this function is called from a secure context.
    *   - The browser requires that the handler's URL be over HTTPS.
    *
    * @throws DOMException.SYNTAX_ERR
    *   The %s placeholder is missing from the handler URL
    */
  def unregisterProtocolHandler(scheme: String, url: String): Unit = js.native
  def unregisterProtocolHandler(scheme: String, url: URL): Unit = js.native
}
