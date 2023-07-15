/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLAnchorElement interface represents hyperlink elements and provides special properties and methods (beyond
  * those of the regular HTMLElement object interface they also have available to them by inheritance) for manipulating
  * the layout and presentation of such elements.
  */
@js.native
@JSGlobal
abstract class HTMLAnchorElement extends HTMLElement {

  /** A string indicating that the linked resource is intended to be downloaded rather than displayed in the browser.
    * The value represent the proposed name of the file. If the name is not a valid filename of the underlying OS,
    * browser will adapt it.
    */
  var download: String = js.native

  /** Is a DOMString that reflects the rel HTML attribute, specifying the relationship of the target object to the link
    * object.
    */
  var rel: String = js.native

  /** Is a DOMString representing the protocol component, including trailing colon (':'), of the referenced URL. */
  var protocol: String = js.native

  /** Is a DOMString representing the search element, including leading question mark ('?'), if any, of the referenced
    * URL.
    */
  var search: String = js.native

  /** Is a DOMString representing the hostname in the referenced URL. */
  var hostname: String = js.native

  /** Is a DOMString representing the path name component, if any, of the referenced URL. */
  var pathname: String = js.native

  /** Is a DOMString that reflects the target HTML attribute, indicating where to display the linked resource. */
  var target: String = js.native

  /** Is a DOMString that reflects the href HTML attribute, containing a valid URL of a linked resource. */
  var href: String = js.native

  /** Is a DOMString representing the character encoding of the linked resource. */
  var charset: String = js.native

  /** Is a DOMString that reflects the hreflang HTML attribute, indicating the language of the linked resource. */
  var hreflang: String = js.native

  /** Is a DOMString representing the port component, if any, of the referenced URL. */
  var port: String = js.native

  /** Is a DOMString representing the hostname and port (if it's not the default port) in the referenced URL. */
  var host: String = js.native

  /** Is a DOMString representing the fragment identifier, including the leading hash mark ('#'), if any, in the
    * referenced URL.
    */
  var hash: String = js.native

  var `type`: String = js.native
  var mimeType: String = js.native

  /** Is a DOMString being a synonym for the Node.textContent property. */
  var text: String = js.native
}
