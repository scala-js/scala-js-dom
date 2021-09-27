/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The CSSKeyframesRule interface describes an object representing a complete set of keyframes for a CSS animation. It
  * corresponds to the contains of a whole `@@keyframes` at-rule. It implements the CSSRule interface with a type value
  * of 7 (CSSRule.KEYFRAMES_RULE).
  */
@js.native
@JSGlobal
class CSSKeyframesRule extends CSSRule {

  /** Represents the name of the animation, used by the animation-name property. */
  var name: String = js.native

  /** Returns a CSSRuleList of the CSS rules in the media rule. */
  var cssRules: CSSRuleList = js.native

  /** Returns a keyframe rule corresponding to the given key. The key is a DOMString containing an index of the keyframe
    * o be returned, resolving to a number between 0 and 1. If no such keyframe exists, findRule returns null.
    */
  def findRule(rule: String): CSSKeyframeRule = js.native

  /** Deletes a keyframe rule from the current CSSKeyframesRule. The parameter is the index of the keyframe to be
    * deleted, expressed as a DOMString resolving as a number between 0 and 1.
    */
  def deleteRule(rule: String): Unit = js.native

  /** Inserts a new keyframe rule into the current CSSKeyframesRule. The parameter is a DOMString containing a keyframe
    * in the same format as an entry of a `@keyframes` at-rule. If it contains more than one keyframe rule, a
    * DOMException with a SYNTAX_ERR is thrown.
    */
  def appendRule(rule: String): Unit = js.native
}
