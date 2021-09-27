/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** CSSMediaRule is an object representing a single CSS `@media` rule. It implements the CSSConditionRule interface, and
  * therefore the CSSGroupingRule and the CSSRule interface with a type value of 4 (CSSRule.MEDIA_RULE).
  */
@js.native
@JSGlobal
class CSSMediaRule extends CSSRule {

  /** Specifies a MediaList representing the intended destination medium for style information. */
  var media: MediaList = js.native
  var cssRules: CSSRuleList = js.native

  def insertRule(rule: String, index: Int = js.native): Int = js.native

  def deleteRule(index: Int = js.native): Unit = js.native
}
