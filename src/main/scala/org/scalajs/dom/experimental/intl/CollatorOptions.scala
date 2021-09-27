/*
 * Implements the Intl API. (ECMA-402 draft from March 1, 2016)
 *
 * [[http://tc39.github.io/ecma402/#intl-object The Intl Object]]
 */

package org.scalajs.dom.experimental.intl

import scala.scalajs.js

trait CollatorOptions extends js.Object {

  /** The locale matching algorithm to use. Possible values are "lookup" and "best fit"; the default is "best fit". For
    * information about this option, see the Intl page.
    */
  var localeMatcher: js.UndefOr[String] = js.undefined

  /** Whether the comparison is for sorting or for searching for matching strings. Possible values are "sort" and
    * "search"; the default is "sort".
    */
  var usage: js.UndefOr[String] = js.undefined

  /** Which differences in the strings should lead to non-zero result values.
    *
    * Possible values are:
    *   - "base": Only strings that differ in base letters compare as unequal. Examples: a ≠ b, a = á, a = A.
    *   - "accent": Only strings that differ in base letters or accents and other diacritic marks compare as unequal.
    *     Examples: a ≠ b, a ≠ á, a = A.
    *   - "case": Only strings that differ in base letters or case compare as unequal. Examples: a ≠ b, a = á, a ≠ A.
    *   - "variant": Strings that differ in base letters, accents and other diacritic marks, or case compare as unequal.
    *     Other differences may also be taken into consideration. Examples: a ≠ b, a ≠ á, a ≠ A. The default is
    *     "variant" for usage "sort"; it's locale dependent for usage "search".
    */
  var sensitivity: js.UndefOr[String] = js.undefined

  /** Whether punctuation should be ignored. Possible values are true and false; the default is false. */
  var ignorePunctuation: js.UndefOr[Boolean] = js.undefined

  /** Whether numeric collation should be used, such that "1" < "2" < "10". Possible values are true and false; the
    * default is false. This option can be set through an options property or through a Unicode extension key; if both
    * are provided, the options property takes precedence. Implementations are not required to support this property.
    */
  var numeric: js.UndefOr[Boolean] = js.undefined

  /** Whether upper case or lower case should sort first. Possible values are "upper", "lower", or "false" (use the
    * locale's default); the default is "false". This option can be set through an options property or through a Unicode
    * extension key; if both are provided, the options property takes precedence. Implementations are not required to
    * support this property.
    */
  var caseFirst: js.UndefOr[String] = js.undefined
}

@deprecated("all the members of CollatorOptions are deprecated", "2.0.0")
object CollatorOptions {

  @deprecated("use `new CollatorOptions { ... }` instead", "2.0.0")
  def apply(
      localeMatcher: js.UndefOr[String] = js.undefined, usage: js.UndefOr[String] = js.undefined,
      sensitivity: js.UndefOr[String] = js.undefined, ignorePunctuation: js.UndefOr[Boolean] = js.undefined,
      numeric: js.UndefOr[Boolean] = js.undefined, caseFirst: js.UndefOr[String] = js.undefined
  ): CollatorOptions = {
    val localeMatcher0 = localeMatcher
    val usage0 = usage
    val sensitivity0 = sensitivity
    val ignorePunctuation0 = ignorePunctuation
    val numeric0 = numeric
    val caseFirst0 = caseFirst
    new CollatorOptions {
      this.localeMatcher = localeMatcher0
      this.usage = usage0
      this.sensitivity = sensitivity0
      this.ignorePunctuation = ignorePunctuation0
      this.numeric = numeric0
      this.caseFirst = caseFirst0
    }
  }
}
