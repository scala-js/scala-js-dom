/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** An object implementing the CSSStyleSheet interface represents a single CSS style sheet. */
@js.native
@JSGlobal
class CSSStyleSheet extends StyleSheet {
  var owningElement: Element = js.native
  var imports: StyleSheetList = js.native
  var isAlternate: Boolean = js.native
  var isPrefAlternate: Boolean = js.native
  var readOnly: Boolean = js.native
  var cssText: String = js.native

  /** If this style sheet is imported into the document using an `@import` rule, the ownerRule property will return that
    * CSSImportRule, otherwise it returns null.
    */
  var ownerRule: CSSRule = js.native

  /** Returns a CSSRuleList of the CSS rules in the style sheet. */
  var cssRules: CSSRuleList = js.native
  var id: String = js.native

  def addImport(bstrURL: String, lIndex: Int = js.native): Int = js.native

  def addPageRule(bstrSelector: String, bstrStyle: String, lIndex: Int = js.native): Int = js.native

  /** The CSSStyleSheet.insertRule() method inserts a new style rule into the current style sheet. */
  def insertRule(rule: String, index: Int = js.native): Int = js.native

  def removeRule(lIndex: Int): Unit = js.native

  /** Deletes a rule from the style sheet. */
  def deleteRule(index: Int = js.native): Unit = js.native

  def addRule(bstrSelector: String, bstrStyle: String = js.native, lIndex: Int = js.native): Int = js.native

  def removeImport(lIndex: Int): Unit = js.native
}
