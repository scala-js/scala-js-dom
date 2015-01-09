package org.scalajs.dom

/**
 * Short aliasas of all the dom.CSSThing classes
 */
object css {
  type FontFaceRule = raw.CSSFontFaceRule
  type ImportRule = raw.CSSImportRule
  type KeyframeRule = raw.CSSKeyframeRule
  type MediaRule = raw.CSSMediaRule
  type NamespaceRule = raw.CSSNamespaceRule
  type PageRule = raw.CSSPageRule
  type Rule = raw.CSSRule
  @inline def Rule = raw.CSSRule
  type RuleList = raw.CSSRuleList
  type StyleDeclaration = raw.CSSStyleDeclaration
  type StyleSheet = raw.CSSStyleSheet
  type StyleRule = raw.CSSStyleRule
}
