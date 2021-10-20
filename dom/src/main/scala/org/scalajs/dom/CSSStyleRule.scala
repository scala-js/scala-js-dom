/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1
  * (CSSRule.STYLE_RULE).
  */
@js.native
@JSGlobal
class CSSStyleRule extends CSSRule {

  /** Gets/sets the textual representation of the selector for this rule, e.g. "h1,h2". */
  var selectorText: String = js.native
  var readOnly: Boolean = js.native

  /** Returns the CSSStyleDeclaration object for the rule. */
  val style: CSSStyleDeclaration = js.native
}
