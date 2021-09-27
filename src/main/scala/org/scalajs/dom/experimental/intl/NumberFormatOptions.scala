/*
 * Implements the Intl API. (ECMA-402 draft from March 1, 2016)
 *
 * [[http://tc39.github.io/ecma402/#intl-object The Intl Object]]
 */

package org.scalajs.dom.experimental.intl

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The following properties fall into two groups:
  *
  *   - minimumIntegerDigits, minimumFractionDigits, and maximumFractionDigits in one group,
  *   - minimumSignificantDigits and maximumSignificantDigits in the other. If at least one property from the second
  *     group is defined, then the first group is ignored.
  */
trait NumberFormatOptions extends js.Object {

  /** The locale matching algorithm to use. Possible values are "lookup" and "best fit"; the default is "best fit". For
    * information about this option, see the Intl page.
    */
  var localeMatcher: js.UndefOr[String] = js.undefined

  /** The formatting style to use. Possible values are "decimal" for plain number formatting, "currency" for currency
    * formatting, and "percent" for percent formatting; the default is "decimal".
    */
  var style: js.UndefOr[String] = js.undefined

  /** The currency to use in currency formatting. Possible values are the ISO 4217 currency codes, such as "USD" for the
    * US dollar, "EUR" for the euro, or "CNY" for the Chinese RMB — see the Current currency & funds code list. There is
    * no default value; if the style is "currency", the currency property must be provided.
    */
  var currency: js.UndefOr[String] = js.undefined

  /** How to display the currency in currency formatting. Possible values are "symbol" to use a localized currency
    * symbol such as €, "code" to use the ISO currency code, "name" to use a localized currency name such as "dollar";
    * the default is "symbol".
    */
  var currencyDisplay: js.UndefOr[String] = js.undefined

  /** Whether to use grouping separators, such as thousands separators or thousand/lakh/crore separators. Possible
    * values are true and false; the default is true.
    */
  var useGrouping: js.UndefOr[Boolean] = js.undefined

  /** The minimum number of integer digits to use. Possible values are from 1 to 21; the default is 1. */
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined

  /** The minimum number of fraction digits to use. Possible values are from 0 to 20; the default for plain number and
    * percent formatting is 0; the default for currency formatting is the number of minor unit digits provided by the
    * ISO 4217 currency code list (2 if the list doesn't provide that information).
    */
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined

  /** The maximum number of fraction digits to use. Possible values are from 0 to 20; the default for plain number
    * formatting is the larger of minimumFractionDigits and 3; the default for currency formatting is the larger of
    * minimumFractionDigits and the number of minor unit digits provided by the ISO 4217 currency code list (2 if the
    * list doesn't provide that information); the default for percent formatting is the larger of minimumFractionDigits
    * and 0.
    */
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined

  /** The minimum number of significant digits to use. Possible values are from 1 to 21; the default is 1. */
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined

  /** The maximum number of significant digits to use. Possible values are from 1 to 21; the default is
    * minimumSignificantDigits.
    */
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
}

@deprecated("all the members of NumberFormatOptions are deprecated", "2.0.0")
object NumberFormatOptions {

  @deprecated("use `new NumberFormatOptions { ... }` instead", "2.0.0")
  def apply(
      localeMatcher: js.UndefOr[String] = js.undefined, style: js.UndefOr[String] = js.undefined,
      currency: js.UndefOr[String] = js.undefined, currencyDisplay: js.UndefOr[String] = js.undefined,
      useGrouping: js.UndefOr[Boolean] = js.undefined, minimumIntegerDigits: js.UndefOr[Double] = js.undefined,
      minimumFractionDigits: js.UndefOr[Double] = js.undefined,
      maximumFractionDigits: js.UndefOr[Double] = js.undefined,
      minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
      maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  ): NumberFormatOptions = {
    val localeMatcher0 = localeMatcher
    val style0 = style
    val currency0 = currency
    val currencyDisplay0 = currencyDisplay
    val useGrouping0 = useGrouping
    val minimumIntegerDigits0 = minimumIntegerDigits
    val minimumFractionDigits0 = minimumFractionDigits
    val maximumFractionDigits0 = maximumFractionDigits
    val minimumSignificantDigits0 = minimumSignificantDigits
    val maximumSignificantDigits0 = maximumSignificantDigits
    new NumberFormatOptions {
      this.localeMatcher = localeMatcher0
      this.style = style0
      this.currency = currency0
      this.currencyDisplay = currencyDisplay0
      this.useGrouping = useGrouping0
      this.minimumIntegerDigits = minimumIntegerDigits0
      this.minimumFractionDigits = minimumFractionDigits0
      this.maximumFractionDigits = maximumFractionDigits0
      this.minimumSignificantDigits = minimumSignificantDigits0
      this.maximumSignificantDigits = maximumSignificantDigits0
    }
  }
}
