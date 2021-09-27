/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The CSSKeyframeRule interface describes an object representing a set of style for a given keyframe. It corresponds
  * to the contains of a single keyframe of a `@@keyframes` at-rule. It implements the CSSRule interface with a type
  * value of 8 (CSSRule.KEYFRAME_RULE).
  */
@js.native
@JSGlobal
class CSSKeyframeRule extends CSSRule {

  /** Represents the key of the keyframe, like '10%', '75%'. The from keyword maps to '0%' and the to keyword maps to
    * '100%'.
    */
  var keyText: String = js.native

  /** Returns a CSSStyleDeclaration of the CSS style associated with the keyfrom. */
  var style: CSSStyleDeclaration = js.native
}
