/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A CSSStyleDeclaration is an interface to the declaration block returned by the style property of a cssRule in a
  * stylesheet, when the rule is a CSSStyleRule.
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

  def setProperty(propertyName: String, value: String, priority: String = js.native): Unit = js.native

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
