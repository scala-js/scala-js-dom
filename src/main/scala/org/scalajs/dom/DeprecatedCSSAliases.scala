package org.scalajs.dom

import org.scalajs.dom

/** Short aliases of all the dom.CSSThing classes */
@deprecated("directly use the dom.CSS* types and values instead", "2.0.0")
object DeprecatedCSSAliases {

  @deprecated("use dom.CSS instead", "2.0.0")
  @inline def CSS = dom.CSS

  @deprecated("use dom.FontFaceRule instead", "2.0.0")
  type FontFaceRule = CSSFontFaceRule

  @deprecated("use dom.ImportRule instead", "2.0.0")
  type ImportRule = CSSImportRule

  @deprecated("use dom.KeyframeRule instead", "2.0.0")
  type KeyframeRule = CSSKeyframeRule

  @deprecated("use dom.MediaRule instead", "2.0.0")
  type MediaRule = CSSMediaRule

  @deprecated("use dom.NamespaceRule instead", "2.0.0")
  type NamespaceRule = CSSNamespaceRule

  @deprecated("use dom.PageRule instead", "2.0.0")
  type PageRule = CSSPageRule

  @deprecated("use dom.Rule instead", "2.0.0")
  type Rule = CSSRule

  @deprecated("use dom.Rule instead", "2.0.0")
  @inline def Rule = CSSRule

  @deprecated("use dom.RuleList instead", "2.0.0")
  type RuleList = CSSRuleList

  @deprecated("use dom.StyleDeclaration instead", "2.0.0")
  type StyleDeclaration = CSSStyleDeclaration

  @deprecated("use dom.StyleSheet instead", "2.0.0")
  type StyleSheet = CSSStyleSheet

  @deprecated("use dom.StyleRule instead", "2.0.0")
  type StyleRule = CSSStyleRule
}
