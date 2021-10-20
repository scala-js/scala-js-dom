/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The CSSNamespaceRule interface describes an object representing a single CSS `@@namespace` at-rule. It implements
  * the CSSRule interface, with a type value of 10 (CSSRule.NAMESPACE_RULE).
  */
@js.native
@JSGlobal
class CSSNamespaceRule extends CSSRule {

  /** Returns a DOMString containing the text of the URI of the given namespace. */
  var namespaceURI: String = js.native

  /** Returns a DOMString with the name of the prefix associated to this namespace. If there is no such prefix, returns 
    * null.
    */
  var prefix: String = js.native
}
