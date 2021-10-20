/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLBaseElement interface contains the base URI for a document. This object inherits all of the properties and
  * methods as described in the HTMLElement interface.
  */
@js.native
@JSGlobal
abstract class HTMLBaseElement extends HTMLElement {

  /** Is a DOMString that reflects the target HTML attribute, containing a default target browsing context or frame for
    * elements that do not have a target reference specified.
    */
  var target: String = js.native

  /** Is a DOMString that reflects the href HTML attribute, containing a base URL for relative URLs in the document. */
  var href: String = js.native
}
