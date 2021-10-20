/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** CSSPageRule is an object representing a single CSS `@page` rule. It implements the CSSRule interface with a type
  * value of 6 (CSSRule.PAGE_RULE).
  */
@js.native
@JSGlobal
class CSSPageRule extends CSSRule {
  var pseudoClass: String = js.native

  /** Represents the text of the page selector associated with the at-rule. */
  var selectorText: String = js.native
  var selector: String = js.native

  /** Returns the declaration block associated with the at-rule. */
  var style: CSSStyleDeclaration = js.native
}
