/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** An object implementing the CSSRule DOM interface represents a single CSS at-rule. References to a
  * CSSRule-implementing object may be obtained by looking at a CSS style sheet's cssRules list.
  */
@js.native
@JSGlobal
class CSSRule extends js.Object {

  /** cssText returns the actual text of the style rule. To be able to set a stylesheet rule dynamically, see Using
    * dynamic styling information.
    */
  var cssText: String = js.native

  /** parentStyleSheet returns the stylesheet object in which the current rule is defined. */
  var parentStyleSheet: CSSStyleSheet = js.native

  /** Returns the containing rule, otherwise null. E.g. if this rule is a style rule inside an `@media` block, the
    * parent rule would be that CSSMediaRule.
    */
  var parentRule: CSSRule = js.native
  var `type`: Int = js.native
  var IMPORT_RULE: Int = js.native
  var MEDIA_RULE: Int = js.native
  var STYLE_RULE: Int = js.native
  var NAMESPACE_RULE: Int = js.native
  var PAGE_RULE: Int = js.native
  var UNKNOWN_RULE: Int = js.native
  var FONT_FACE_RULE: Int = js.native
  var CHARSET_RULE: Int = js.native
  var KEYFRAMES_RULE: Int = js.native
  var KEYFRAME_RULE: Int = js.native
  var VIEWPORT_RULE: Int = js.native
}

@js.native
@JSGlobal
object CSSRule extends js.Object {
  var IMPORT_RULE: Int = js.native
  var MEDIA_RULE: Int = js.native
  var STYLE_RULE: Int = js.native
  var NAMESPACE_RULE: Int = js.native
  var PAGE_RULE: Int = js.native
  var UNKNOWN_RULE: Int = js.native
  var FONT_FACE_RULE: Int = js.native
  var CHARSET_RULE: Int = js.native
}
