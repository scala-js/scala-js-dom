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

/**
 * A CSSStyleDeclaration is an interface to the declaration block returned by the
 * style property of a cssRule in a stylesheet, when the rule is a CSSStyleRule.
 *
 * MDN
 */
class CSSStyleDeclaration extends js.Object {
  var backgroundAttachment: js.String = _
  var visibility: js.String = _
  var textAlignLast: js.String = _
  var borderRightStyle: js.String = _
  var counterIncrement: js.String = _
  var orphans: js.String = _
  var cssText: js.String = _
  var borderStyle: js.String = _
  var pointerEvents: js.String = _
  var borderTopColor: js.String = _
  var markerEnd: js.String = _
  var textIndent: js.String = _
  var listStyleImage: js.String = _
  var cursor: js.String = _
  var listStylePosition: js.String = _
  var wordWrap: js.String = _
  var borderTopStyle: js.String = _
  var alignmentBaseline: js.String = _
  var opacity: js.String = _
  var direction: js.String = _
  var strokeMiterlimit: js.String = _
  var maxWidth: js.String = _
  var color: js.String = _
  var clip: js.String = _
  var borderRightWidth: js.String = _
  var verticalAlign: js.String = _
  var overflow: js.String = _
  var mask: js.String = _
  var borderLeftStyle: js.String = _
  var emptyCells: js.String = _
  var stopOpacity: js.String = _
  var paddingRight: js.String = _
  var parentRule: CSSRule = _
  var background: js.String = _
  var boxSizing: js.String = _
  var textJustify: js.String = _
  var height: js.String = _
  var paddingTop: js.String = _
  var length: js.Number = _
  var right: js.String = _
  var baselineShift: js.String = _
  var borderLeft: js.String = _
  var widows: js.String = _
  var lineHeight: js.String = _
  var left: js.String = _
  var textUnderlinePosition: js.String = _
  var glyphOrientationHorizontal: js.String = _
  var display: js.String = _
  var textAnchor: js.String = _
  var cssFloat: js.String = _
  var strokeDasharray: js.String = _
  var rubyAlign: js.String = _
  var fontSizeAdjust: js.String = _
  var borderLeftColor: js.String = _
  var backgroundImage: js.String = _
  var listStyleType: js.String = _
  var strokeWidth: js.String = _
  var textOverflow: js.String = _
  var fillRule: js.String = _
  var borderBottomColor: js.String = _
  var zIndex: js.String = _
  var position: js.String = _
  var listStyle: js.String = _
  var msTransformOrigin: js.String = _
  var dominantBaseline: js.String = _
  var overflowY: js.String = _
  var fill: js.String = _
  var captionSide: js.String = _
  var borderCollapse: js.String = _
  var boxShadow: js.String = _
  var quotes: js.String = _
  var tableLayout: js.String = _
  var unicodeBidi: js.String = _
  var borderBottomWidth: js.String = _
  var backgroundSize: js.String = _
  var textDecoration: js.String = _
  var strokeDashoffset: js.String = _
  var fontSize: js.String = _
  var border: js.String = _
  var pageBreakBefore: js.String = _
  var borderTopRightRadius: js.String = _
  var msTransform: js.String = _
  var borderBottomLeftRadius: js.String = _
  var textTransform: js.String = _
  var rubyPosition: js.String = _
  var strokeLinejoin: js.String = _
  var clipPath: js.String = _
  var borderRightColor: js.String = _
  var fontFamily: js.String = _
  var clear: js.String = _
  var content: js.String = _
  var backgroundClip: js.String = _
  var marginBottom: js.String = _
  var counterReset: js.String = _
  var outlineWidth: js.String = _
  var marginRight: js.String = _
  var paddingLeft: js.String = _
  var borderBottom: js.String = _
  var wordBreak: js.String = _
  var marginTop: js.String = _
  var top: js.String = _
  var fontWeight: js.String = _
  var borderRight: js.String = _
  var width: js.String = _
  var kerning: js.String = _
  var pageBreakAfter: js.String = _
  var borderBottomStyle: js.String = _
  var fontStretch: js.String = _
  var padding: js.String = _
  var strokeOpacity: js.String = _
  var markerStart: js.String = _
  var bottom: js.String = _
  var borderLeftWidth: js.String = _
  var clipRule: js.String = _
  var backgroundPosition: js.String = _
  var backgroundColor: js.String = _
  var pageBreakInside: js.String = _
  var backgroundOrigin: js.String = _
  var strokeLinecap: js.String = _
  var borderTopWidth: js.String = _
  var outlineStyle: js.String = _
  var borderTop: js.String = _
  var outlineColor: js.String = _
  var paddingBottom: js.String = _
  var marginLeft: js.String = _
  var font: js.String = _
  var outline: js.String = _
  var wordSpacing: js.String = _
  var maxHeight: js.String = _
  var fillOpacity: js.String = _
  var letterSpacing: js.String = _
  var borderSpacing: js.String = _
  var backgroundRepeat: js.String = _
  var borderRadius: js.String = _
  var borderWidth: js.String = _
  var borderBottomRightRadius: js.String = _
  var whiteSpace: js.String = _
  var fontStyle: js.String = _
  var minWidth: js.String = _
  var stopColor: js.String = _
  var borderTopLeftRadius: js.String = _
  var borderColor: js.String = _
  var marker: js.String = _
  var glyphOrientationVertical: js.String = _
  var markerMid: js.String = _
  var fontVariant: js.String = _
  var minHeight: js.String = _
  var stroke: js.String = _
  var rubyOverhang: js.String = _
  var overflowX: js.String = _
  var textAlign: js.String = _
  var margin: js.String = _

  def getPropertyPriority(propertyName: js.String): js.String = ???

  def getPropertyValue(propertyName: js.String): js.String = ???

  def removeProperty(propertyName: js.String): js.String = ???

  def item(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???

  def setProperty(propertyName: js.String, value: js.String, priority: js.String = ???): Unit = ???

  var animationFillMode: js.String = _
  var floodColor: js.String = _
  var animationIterationCount: js.String = _
  var textShadow: js.String = _
  var backfaceVisibility: js.String = _
  var msAnimationIterationCount: js.String = _
  var animationDelay: js.String = _
  var animationTimingFunction: js.String = _
  var columnWidth: js.Any = _
  var msScrollSnapX: js.String = _
  var columnRuleColor: js.Any = _
  var columnRuleWidth: js.Any = _
  var transitionDelay: js.String = _
  var transition: js.String = _
  var msFlowFrom: js.String = _
  var msScrollSnapType: js.String = _
  var msContentZoomSnapType: js.String = _
  var msGridColumns: js.String = _
  var msAnimationName: js.String = _
  var msGridRowAlign: js.String = _
  var msContentZoomChaining: js.String = _
  var msGridColumn: js.Any = _
  var msHyphenateLimitZone: js.Any = _
  var msScrollRails: js.String = _
  var msAnimationDelay: js.String = _
  var enableBackground: js.String = _
  var msWrapThrough: js.String = _
  var columnRuleStyle: js.String = _
  var msAnimation: js.String = _
  var msFlexFlow: js.String = _
  var msScrollSnapY: js.String = _
  var msHyphenateLimitLines: js.Any = _
  var msTouchAction: js.String = _
  var msScrollLimit: js.String = _
  var animation: js.String = _
  var transform: js.String = _
  var colorInterpolationFilters: js.String = _
  var transitionTimingFunction: js.String = _
  var msBackfaceVisibility: js.String = _
  var animationPlayState: js.String = _
  var transformOrigin: js.String = _
  var msScrollLimitYMin: js.Any = _
  var msFontFeatureSettings: js.String = _
  var msContentZoomLimitMin: js.Any = _
  var columnGap: js.Any = _
  var transitionProperty: js.String = _
  var msAnimationDuration: js.String = _
  var msAnimationFillMode: js.String = _
  var msFlexDirection: js.String = _
  var msTransitionDuration: js.String = _
  var fontFeatureSettings: js.String = _
  var breakBefore: js.String = _
  var msFlexWrap: js.String = _
  var perspective: js.String = _
  var msFlowInto: js.String = _
  var msTransformStyle: js.String = _
  var msScrollTranslation: js.String = _
  var msTransitionProperty: js.String = _
  var msUserSelect: js.String = _
  var msOverflowStyle: js.String = _
  var msScrollSnapPointsY: js.String = _
  var animationDirection: js.String = _
  var animationDuration: js.String = _
  var msFlex: js.String = _
  var msTransitionTimingFunction: js.String = _
  var animationName: js.String = _
  var columnRule: js.String = _
  var msGridColumnSpan: js.Any = _
  var msFlexNegative: js.String = _
  var columnFill: js.String = _
  var msGridRow: js.Any = _
  var msFlexOrder: js.String = _
  var msFlexItemAlign: js.String = _
  var msFlexPositive: js.String = _
  var msContentZoomLimitMax: js.Any = _
  var msScrollLimitYMax: js.Any = _
  var msGridColumnAlign: js.String = _
  var perspectiveOrigin: js.String = _
  var lightingColor: js.String = _
  var columns: js.String = _
  var msScrollChaining: js.String = _
  var msHyphenateLimitChars: js.String = _
  var msTouchSelect: js.String = _
  var floodOpacity: js.String = _
  var msAnimationDirection: js.String = _
  var msAnimationPlayState: js.String = _
  var columnSpan: js.String = _
  var msContentZooming: js.String = _
  var msPerspective: js.String = _
  var msFlexPack: js.String = _
  var msScrollSnapPointsX: js.String = _
  var msContentZoomSnapPoints: js.String = _
  var msGridRowSpan: js.Any = _
  var msContentZoomSnap: js.String = _
  var msScrollLimitXMin: js.Any = _
  var breakInside: js.String = _
  var msHighContrastAdjust: js.String = _
  var msFlexLinePack: js.String = _
  var msGridRows: js.String = _
  var transitionDuration: js.String = _
  var msHyphens: js.String = _
  var breakAfter: js.String = _
  var msTransition: js.String = _
  var msPerspectiveOrigin: js.String = _
  var msContentZoomLimit: js.String = _
  var msScrollLimitXMax: js.Any = _
  var msFlexAlign: js.String = _
  var msWrapMargin: js.Any = _
  var columnCount: js.Any = _
  var msAnimationTimingFunction: js.String = _
  var msTransitionDelay: js.String = _
  var transformStyle: js.String = _
  var msWrapFlow: js.String = _
  var msFlexPreferredSize: js.String = _
}

/**
 * An object implementing the CSSStyleSheet interface represents a single CSS style
 * sheet.
 *
 * MDN
 */
class CSSStyleSheet extends StyleSheet {
  var owningElement: Element = _
  var imports: StyleSheetList = _
  var isAlternate: js.Boolean = _
  var isPrefAlternate: js.Boolean = _
  var readOnly: js.Boolean = _
  var cssText: js.String = _
  /**
   * If this style sheet is imported into the document using an @import rule, the
   * ownerRule property will return that CSSImportRule, otherwise it returns null.
   *
   * MDN
   */
  var ownerRule: CSSRule = _
  var href: js.String = _
  /**
   * Returns a CSSRuleList of the CSS rules in the style sheet.
   *
   * MDN
   */
  var cssRules: CSSRuleList = _
  var id: js.String = _

  def addImport(bstrURL: js.String, lIndex: js.Number = ???): js.Number = ???

  def addPageRule(bstrSelector: js.String, bstrStyle: js.String, lIndex: js.Number = ???): js.Number = ???
  /**
   * The CSSStyleSheet.insertRule() method inserts a new style rule into the current
   * style sheet.
   *
   * MDN
   */
  def insertRule(rule: js.String, index: js.Number = ???): js.Number = ???


  def removeRule(lIndex: js.Number): Unit = ???
  /**
   * Deletes a rule from the style sheet.
   *
   * MDN
   */
  def deleteRule(index: js.Number = ???): Unit = ???


  def addRule(bstrSelector: js.String, bstrStyle: js.String = ???, lIndex: js.Number = ???): js.Number = ???

  def removeImport(lIndex: js.Number): Unit = ???
}

/**
 * CSSStyleRule represents a single CSS style rule. It implements the CSSRule
 * interface with a type value of 1 (CSSRule.STYLE_RULE).
 *
 * MDN
 */
class CSSStyleRule extends CSSRule {
  /**
   * Gets/sets the textual representation of the selector for this rule, e.g. "h1,h2".
   *
   * MDN
   */
  var selectorText: js.String = _
  var readOnly: js.Boolean = _
}

/**
 * CSSMediaRule is an object representing a single CSS @media rule. It implements the
 * CSSConditionRule interface, and therefore the CSSGroupingRule and the CSSRule
 * interface with a type value of 4 (CSSRule.MEDIA_RULE).
 *
 * MDN
 */
class CSSMediaRule extends CSSRule {
  /**
   * Specifies a MediaList representing the intended destination medium for style
   * information.
   *
   * MDN
   */
  var media: MediaList = _
  var cssRules: CSSRuleList = _

  def insertRule(rule: js.String, index: js.Number = ???): js.Number = ???


  def deleteRule(index: js.Number = ???): Unit = ???
}

/**
 * The CSSNamespaceRule interface describes an object representing a single CSS
 * @@namespace at-rule. It implements the CSSRule interface, with a type value of 10
 * (CSSRule.NAMESPACE_RULE).
 *
 * MDN
 */
class CSSNamespaceRule extends CSSRule {
  /**
   * Returns a DOMString containing the text of the URI of the given namespace.
   *
   * MDN
   */
  var namespaceURI: js.String = _
  /**
   * Returns a DOMString with the name of the prefix associated to this namespace. If
   * there is no such prefix, returns  null.
   *
   * MDN
   */
  var prefix: js.String = _
}

class CSSImportRule extends CSSRule {
  var styleSheet: CSSStyleSheet = _
  var href: js.String = _
  var media: MediaList = _
}

/**
 * An object implementing the CSSRule DOM interface represents a single CSS at-rule.
 * References to a CSSRule-implementing object may be obtained by looking at a CSS
 * style sheet's cssRules list.
 *
 * MDN
 */
class CSSRule extends js.Object {
  /**
   * cssText returns the actual text of the style rule. To be able to set a stylesheet rule
   * dynamically, see Using dynamic styling information.
   *
   * MDN
   */
  var cssText: js.String = _
  /**
   * parentStyleSheet returns the stylesheet object in which the current rule is
   * defined.
   *
   * MDN
   */
  var parentStyleSheet: CSSStyleSheet = _
  /**
   * Returns the containing rule, otherwise null. E.g. if this rule is a style rule
   * inside an @media block, the parent rule would be that CSSMediaRule.
   *
   * MDN
   */
  var parentRule: CSSRule = _
  var `type`: js.Number = _
  var IMPORT_RULE: js.Number = _
  var MEDIA_RULE: js.Number = _
  var STYLE_RULE: js.Number = _
  var NAMESPACE_RULE: js.Number = _
  var PAGE_RULE: js.Number = _
  var UNKNOWN_RULE: js.Number = _
  var FONT_FACE_RULE: js.Number = _
  var CHARSET_RULE: js.Number = _
  var KEYFRAMES_RULE: js.Number = _
  var KEYFRAME_RULE: js.Number = _
  var VIEWPORT_RULE: js.Number = _
}

object CSSRule extends js.Object {
  var IMPORT_RULE: js.Number = _
  var MEDIA_RULE: js.Number = _
  var STYLE_RULE: js.Number = _
  var NAMESPACE_RULE: js.Number = _
  var PAGE_RULE: js.Number = _
  var UNKNOWN_RULE: js.Number = _
  var FONT_FACE_RULE: js.Number = _
  var CHARSET_RULE: js.Number = _
}

class CSSFontFaceRule extends CSSRule {
  var style: CSSStyleDeclaration = _
}


/**
 * CSSPageRule is an object representing a single CSS @page rule. It implements the
 * CSSRule interface with a type value of 6 (CSSRule.PAGE_RULE).
 *
 * MDN
 */
class CSSPageRule extends CSSRule {
  var pseudoClass: js.String = _
  /**
   * Represents the text of the page selector associated with the at-rule.
   *
   * MDN
   */
  var selectorText: js.String = _
  var selector: js.String = _
  /**
   * Returns the declaration block associated with the at-rule.
   *
   * MDN
   */
  var style: CSSStyleDeclaration = _
}


/**
 * A CSSRuleList is an array-like object containing an ordered collection of CSSRule
 * objects.
 *
 * MDN
 */
class CSSRuleList extends js.Object {
  var length: js.Number = _

  def item(index: js.Number): CSSRule = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): CSSRule = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: CSSRule): Unit = ???
}

/**
 * The CSSKeyframesRule interface describes an object representing a complete set
 * of keyframes for a CSS animation. It corresponds to the contains of a whole
 * @@keyframes at-rule. It implements the CSSRule interface with a type value of 7
 * (CSSRule.KEYFRAMES_RULE).
 *
 * MDN
 */
class CSSKeyframesRule extends CSSRule {
  /**
   * Represents the name of the animation, used by the animation-name property.
   *
   * MDN
   */
  var name: js.String = _
  /**
   * Returns a CSSRuleList of the CSS rules in the media rule.
   *
   * MDN
   */
  var cssRules: CSSRuleList = _

  /**
   * Returns a keyframe rule corresponding to the given key. The key is a DOMString
   * containing an index of the keyframe o be returned, resolving to a number between 0
   * and 1. If no such keyframe exists, findRule returns null.
   *
   * MDN
   */
  def findRule(rule: js.String): CSSKeyframeRule = ???

  /**
   * Deletes a keyframe rule from the current CSSKeyframesRule. The parameter is the
   * index of the keyframe to be deleted, expressed as a DOMString resolving as a number
   * between 0 and 1.
   *
   * MDN
   */
  def deleteRule(rule: js.String): Unit = ???

  /**
   * Inserts a new keyframe rule into the current CSSKeyframesRule. The parameter is a
   * DOMString containing a keyframe in the same format as an entry of a @keyframes
   * at-rule. If it contains more than one keyframe rule, a DOMException with a
   * SYNTAX_ERR is thrown.
   *
   * MDN
   */
  def appendRule(rule: js.String): Unit = ???
}


/**
 * The CSSKeyframeRule interface describes an object representing a set of style for
 * a given keyframe. It corresponds to the contains of a single keyframe of a
 * @@keyframes at-rule. It implements the CSSRule interface with a type value of 8
 * (CSSRule.KEYFRAME_RULE).
 *
 * MDN
 */
class CSSKeyframeRule extends CSSRule {
  /**
   * Represents the key of the keyframe, like '10%', '75%'. The from keyword maps to '0%'
   * and the to keyword maps to '100%'.
   *
   * MDN
   */
  var keyText: js.String = _
  /**
   * Returns a CSSStyleDeclaration of the CSS style associated with the keyfrom.
   *
   * MDN
   */
  var style: CSSStyleDeclaration = _
}