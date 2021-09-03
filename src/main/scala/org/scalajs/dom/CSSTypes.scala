/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
object CSS extends js.Object {

  /**
   * The CSS.supports() method returns a boolean value indicating if the browser supports a given CSS feature, or not.
   * Allows to test the support of a pair property-value.
   *
   * MDN
   */
  def supports(propertyName: String, value: String): Boolean = js.native

  /**
   * The CSS.supports() method returns a boolean value indicating if the browser supports a given CSS feature, or not.
   * Takes one parameter matching the condition of @supports.
   *
   * MDN
   */
  def supports(supportCondition: String): Boolean = js.native

}

/**
 * A CSSStyleDeclaration is an interface to the declaration block returned by the
 * style property of a cssRule in a stylesheet, when the rule is a CSSStyleRule.
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSStyleDeclaration extends js.Object {
  var backgroundAttachment: String = js.native
  var visibility: String = js.native
  var textAlignLast: String = js.native
  var borderRightStyle: String = js.native
  var counterIncrement: String = js.native
  var orphans: String = js.native
  var cssText: String = js.native
  var borderStyle: String = js.native
  var pointerEvents: String = js.native
  var borderTopColor: String = js.native
  var markerEnd: String = js.native
  var textIndent: String = js.native
  var listStyleImage: String = js.native
  var cursor: String = js.native
  var listStylePosition: String = js.native
  var wordWrap: String = js.native
  var borderTopStyle: String = js.native
  var alignmentBaseline: String = js.native
  var opacity: String = js.native
  var direction: String = js.native
  var strokeMiterlimit: String = js.native
  var maxWidth: String = js.native
  var color: String = js.native
  var clip: String = js.native
  var borderRightWidth: String = js.native
  var verticalAlign: String = js.native
  var overflow: String = js.native
  var mask: String = js.native
  var borderLeftStyle: String = js.native
  var emptyCells: String = js.native
  var stopOpacity: String = js.native
  var paddingRight: String = js.native
  var parentRule: CSSRule = js.native
  var background: String = js.native
  var boxSizing: String = js.native
  var textJustify: String = js.native
  var height: String = js.native
  var paddingTop: String = js.native
  var length: Int = js.native
  var right: String = js.native
  var baselineShift: String = js.native
  var borderLeft: String = js.native
  var widows: String = js.native
  var lineHeight: String = js.native
  var left: String = js.native
  var textUnderlinePosition: String = js.native
  var glyphOrientationHorizontal: String = js.native
  var display: String = js.native
  var textAnchor: String = js.native
  var cssFloat: String = js.native
  var strokeDasharray: String = js.native
  var rubyAlign: String = js.native
  var fontSizeAdjust: String = js.native
  var borderLeftColor: String = js.native
  var backgroundImage: String = js.native
  var listStyleType: String = js.native
  var strokeWidth: String = js.native
  var textOverflow: String = js.native
  var fillRule: String = js.native
  var borderBottomColor: String = js.native
  var zIndex: String = js.native
  var position: String = js.native
  var listStyle: String = js.native
  var dominantBaseline: String = js.native
  var overflowY: String = js.native
  var fill: String = js.native
  var captionSide: String = js.native
  var borderCollapse: String = js.native
  var boxShadow: String = js.native
  var quotes: String = js.native
  var tableLayout: String = js.native
  var unicodeBidi: String = js.native
  var borderBottomWidth: String = js.native
  var backgroundSize: String = js.native
  var textDecoration: String = js.native
  var strokeDashoffset: String = js.native
  var fontSize: String = js.native
  var border: String = js.native
  var pageBreakBefore: String = js.native
  var borderTopRightRadius: String = js.native
  var borderBottomLeftRadius: String = js.native
  var textTransform: String = js.native
  var rubyPosition: String = js.native
  var strokeLinejoin: String = js.native
  var clipPath: String = js.native
  var borderRightColor: String = js.native
  var fontFamily: String = js.native
  var clear: String = js.native
  var content: String = js.native
  var backgroundClip: String = js.native
  var marginBottom: String = js.native
  var counterReset: String = js.native
  var outlineWidth: String = js.native
  var marginRight: String = js.native
  var paddingLeft: String = js.native
  var borderBottom: String = js.native
  var wordBreak: String = js.native
  var marginTop: String = js.native
  var top: String = js.native
  var fontWeight: String = js.native
  var borderRight: String = js.native
  var width: String = js.native
  var kerning: String = js.native
  var pageBreakAfter: String = js.native
  var borderBottomStyle: String = js.native
  var fontStretch: String = js.native
  var padding: String = js.native
  var strokeOpacity: String = js.native
  var markerStart: String = js.native
  var bottom: String = js.native
  var borderLeftWidth: String = js.native
  var clipRule: String = js.native
  var backgroundPosition: String = js.native
  var backgroundColor: String = js.native
  var pageBreakInside: String = js.native
  var backgroundOrigin: String = js.native
  var strokeLinecap: String = js.native
  var borderTopWidth: String = js.native
  var outlineStyle: String = js.native
  var borderTop: String = js.native
  var outlineColor: String = js.native
  var paddingBottom: String = js.native
  var marginLeft: String = js.native
  var font: String = js.native
  var outline: String = js.native
  var wordSpacing: String = js.native
  var maxHeight: String = js.native
  var fillOpacity: String = js.native
  var letterSpacing: String = js.native
  var borderSpacing: String = js.native
  var backgroundRepeat: String = js.native
  var borderRadius: String = js.native
  var borderWidth: String = js.native
  var borderBottomRightRadius: String = js.native
  var whiteSpace: String = js.native
  var fontStyle: String = js.native
  var minWidth: String = js.native
  var stopColor: String = js.native
  var borderTopLeftRadius: String = js.native
  var borderColor: String = js.native
  var marker: String = js.native
  var glyphOrientationVertical: String = js.native
  var markerMid: String = js.native
  var fontVariant: String = js.native
  var minHeight: String = js.native
  var stroke: String = js.native
  var rubyOverhang: String = js.native
  var overflowX: String = js.native
  var textAlign: String = js.native
  var margin: String = js.native

  def getPropertyPriority(propertyName: String): String = js.native

  def getPropertyValue(propertyName: String): String = js.native

  def removeProperty(propertyName: String): String = js.native

  def item(index: Int): String = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): String = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: String): Unit = js.native

  def setProperty(propertyName: String, value: String,
      priority: String = js.native): Unit = js.native

  var animationFillMode: String = js.native
  var floodColor: String = js.native
  var animationIterationCount: String = js.native
  var textShadow: String = js.native
  var backfaceVisibility: String = js.native
  var animationDelay: String = js.native
  var animationTimingFunction: String = js.native
  var columnWidth: js.Any = js.native
  var columnRuleColor: js.Any = js.native
  var columnRuleWidth: js.Any = js.native
  var transitionDelay: String = js.native
  var transition: String = js.native
  var enableBackground: String = js.native
  var columnRuleStyle: String = js.native
  var animation: String = js.native
  var transform: String = js.native
  var colorInterpolationFilters: String = js.native
  var transitionTimingFunction: String = js.native
  var animationPlayState: String = js.native
  var transformOrigin: String = js.native
  var columnGap: js.Any = js.native
  var transitionProperty: String = js.native
  var fontFeatureSettings: String = js.native
  var breakBefore: String = js.native
  var perspective: String = js.native
  var animationDirection: String = js.native
  var animationDuration: String = js.native
  var animationName: String = js.native
  var columnRule: String = js.native
  var columnFill: String = js.native
  var perspectiveOrigin: String = js.native
  var lightingColor: String = js.native
  var columns: String = js.native
  var floodOpacity: String = js.native
  var columnSpan: String = js.native
  var breakInside: String = js.native
  var transitionDuration: String = js.native
  var breakAfter: String = js.native
  var columnCount: js.Any = js.native
  var transformStyle: String = js.native
}

/**
 * An object implementing the CSSStyleSheet interface represents a single CSS style
 * sheet.
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSStyleSheet extends StyleSheet {
  var owningElement: Element = js.native
  var imports: StyleSheetList = js.native
  var isAlternate: Boolean = js.native
  var isPrefAlternate: Boolean = js.native
  var readOnly: Boolean = js.native
  var cssText: String = js.native

  /**
   * If this style sheet is imported into the document using an `@import` rule, the
   * ownerRule property will return that CSSImportRule, otherwise it returns null.
   *
   * MDN
   */
  var ownerRule: CSSRule = js.native

  /**
   * Returns a CSSRuleList of the CSS rules in the style sheet.
   *
   * MDN
   */
  var cssRules: CSSRuleList = js.native
  var id: String = js.native

  def addImport(bstrURL: String, lIndex: Int = js.native): Int = js.native

  def addPageRule(bstrSelector: String, bstrStyle: String,
      lIndex: Int = js.native): Int = js.native

  /**
   * The CSSStyleSheet.insertRule() method inserts a new style rule into the current
   * style sheet.
   *
   * MDN
   */
  def insertRule(rule: String, index: Int = js.native): Int = js.native

  def removeRule(lIndex: Int): Unit = js.native

  /**
   * Deletes a rule from the style sheet.
   *
   * MDN
   */
  def deleteRule(index: Int = js.native): Unit = js.native

  def addRule(bstrSelector: String, bstrStyle: String = js.native,
      lIndex: Int = js.native): Int = js.native

  def removeImport(lIndex: Int): Unit = js.native
}

/**
 * CSSStyleRule represents a single CSS style rule. It implements the CSSRule
 * interface with a type value of 1 (CSSRule.STYLE_RULE).
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSStyleRule extends CSSRule {

  /**
   * Gets/sets the textual representation of the selector for this rule, e.g. "h1,h2".
   *
   * MDN
   */
  var selectorText: String = js.native
  var readOnly: Boolean = js.native

  /**
   * Returns the CSSStyleDeclaration object for the rule.
   *
   * MDN
   */
  val style: CSSStyleDeclaration = js.native
}

/**
 * CSSMediaRule is an object representing a single CSS `@media` rule. It implements the
 * CSSConditionRule interface, and therefore the CSSGroupingRule and the CSSRule
 * interface with a type value of 4 (CSSRule.MEDIA_RULE).
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSMediaRule extends CSSRule {

  /**
   * Specifies a MediaList representing the intended destination medium for style
   * information.
   *
   * MDN
   */
  var media: MediaList = js.native
  var cssRules: CSSRuleList = js.native

  def insertRule(rule: String, index: Int = js.native): Int = js.native

  def deleteRule(index: Int = js.native): Unit = js.native
}

/**
 * The CSSNamespaceRule interface describes an object representing a single CSS
 * `@@namespace` at-rule. It implements the CSSRule interface, with a type value of 10
 * (CSSRule.NAMESPACE_RULE).
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSNamespaceRule extends CSSRule {

  /**
   * Returns a DOMString containing the text of the URI of the given namespace.
   *
   * MDN
   */
  var namespaceURI: String = js.native

  /**
   * Returns a DOMString with the name of the prefix associated to this namespace. If
   * there is no such prefix, returns  null.
   *
   * MDN
   */
  var prefix: String = js.native
}

@js.native
@JSGlobal
class CSSImportRule extends CSSRule {
  var styleSheet: CSSStyleSheet = js.native
  var href: String = js.native
  var media: MediaList = js.native
}

/**
 * An object implementing the CSSRule DOM interface represents a single CSS at-rule.
 * References to a CSSRule-implementing object may be obtained by looking at a CSS
 * style sheet's cssRules list.
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSRule extends js.Object {

  /**
   * cssText returns the actual text of the style rule. To be able to set a stylesheet rule
   * dynamically, see Using dynamic styling information.
   *
   * MDN
   */
  var cssText: String = js.native

  /**
   * parentStyleSheet returns the stylesheet object in which the current rule is
   * defined.
   *
   * MDN
   */
  var parentStyleSheet: CSSStyleSheet = js.native

  /**
   * Returns the containing rule, otherwise null. E.g. if this rule is a style rule
   * inside an `@media` block, the parent rule would be that CSSMediaRule.
   *
   * MDN
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

@js.native
@JSGlobal
class CSSFontFaceRule extends CSSRule {
  var style: CSSStyleDeclaration = js.native
}

/**
 * CSSPageRule is an object representing a single CSS `@page` rule. It implements the
 * CSSRule interface with a type value of 6 (CSSRule.PAGE_RULE).
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSPageRule extends CSSRule {
  var pseudoClass: String = js.native

  /**
   * Represents the text of the page selector associated with the at-rule.
   *
   * MDN
   */
  var selectorText: String = js.native
  var selector: String = js.native

  /**
   * Returns the declaration block associated with the at-rule.
   *
   * MDN
   */
  var style: CSSStyleDeclaration = js.native
}

/**
 * A CSSRuleList is an array-like object containing an ordered collection of CSSRule
 * objects.
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSRuleList private[this] () extends DOMList[CSSRule] {
  def item(index: Int): CSSRule = js.native
}

/**
 * The CSSKeyframesRule interface describes an object representing a complete set
 * of keyframes for a CSS animation. It corresponds to the contains of a whole
 * `@@keyframes` at-rule. It implements the CSSRule interface with a type value of 7
 * (CSSRule.KEYFRAMES_RULE).
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSKeyframesRule extends CSSRule {

  /**
   * Represents the name of the animation, used by the animation-name property.
   *
   * MDN
   */
  var name: String = js.native

  /**
   * Returns a CSSRuleList of the CSS rules in the media rule.
   *
   * MDN
   */
  var cssRules: CSSRuleList = js.native

  /**
   * Returns a keyframe rule corresponding to the given key. The key is a DOMString
   * containing an index of the keyframe o be returned, resolving to a number between 0
   * and 1. If no such keyframe exists, findRule returns null.
   *
   * MDN
   */
  def findRule(rule: String): CSSKeyframeRule = js.native

  /**
   * Deletes a keyframe rule from the current CSSKeyframesRule. The parameter is the
   * index of the keyframe to be deleted, expressed as a DOMString resolving as a number
   * between 0 and 1.
   *
   * MDN
   */
  def deleteRule(rule: String): Unit = js.native

  /**
   * Inserts a new keyframe rule into the current CSSKeyframesRule. The parameter is a
   * DOMString containing a keyframe in the same format as an entry of a `@keyframes`
   * at-rule. If it contains more than one keyframe rule, a DOMException with a
   * SYNTAX_ERR is thrown.
   *
   * MDN
   */
  def appendRule(rule: String): Unit = js.native
}

/**
 * The CSSKeyframeRule interface describes an object representing a set of style for
 * a given keyframe. It corresponds to the contains of a single keyframe of a
 * `@@keyframes` at-rule. It implements the CSSRule interface with a type value of 8
 * (CSSRule.KEYFRAME_RULE).
 *
 * MDN
 */
@js.native
@JSGlobal
class CSSKeyframeRule extends CSSRule {

  /**
   * Represents the key of the keyframe, like '10%', '75%'. The from keyword maps to '0%'
   * and the to keyword maps to '100%'.
   *
   * MDN
   */
  var keyText: String = js.native

  /**
   * Returns a CSSStyleDeclaration of the CSS style associated with the keyfrom.
   *
   * MDN
   */
  var style: CSSStyleDeclaration = js.native
}
