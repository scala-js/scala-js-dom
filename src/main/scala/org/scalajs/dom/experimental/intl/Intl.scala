/*
 * Implements the Intl API. (ECMA-402 draft from March 1, 2016)
 *
 * [[http://tc39.github.io/ecma402/#intl-object The Intl Object]]
 */

package org.scalajs.dom.experimental.intl

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The Intl.Collator object is a constructor for collators, objects that enable language sensitive string comparison.
  */
@js.native
@JSGlobal("Intl.Collator")
class Collator(locales: js.UndefOr[String | js.Array[String]] = js.undefined,
    options: js.UndefOr[CollatorOptions] = js.undefined)
    extends js.Object {
  def compare(string1: String, string2: String): Double = js.native
  def resolvedOptions(): CollatorOptions = js.native
  def supportedLocalesOf(locales: String | js.Array[String], options: js.Any): js.Array[String] = js.native
}

/** The Intl.DateTimeFormat object is a constructor for objects that enable language sensitive date and time formatting.
  */
@js.native
@JSGlobal("Intl.DateTimeFormat")
class DateTimeFormat(locales: js.UndefOr[String | js.Array[String]] = js.undefined,
    options: js.UndefOr[DateTimeFormatOptions] = js.undefined)
    extends js.Object {
  def format(date: js.Date): String = js.native
  def resolvedOptions(): DateTimeFormatOptions = js.native
  def supportedLocalesOf(locales: String | js.Array[String], options: js.Any): js.Array[String] = js.native
}

/** The Intl.NumberFormat object is a constructor for objects that enable language sensitive number formatting. */
@js.native
@JSGlobal("Intl.NumberFormat")
class NumberFormat(locales: js.UndefOr[String | js.Array[String]] = js.undefined,
    options: js.UndefOr[NumberFormatOptions] = js.undefined)
    extends js.Object {
  def format(number: Double): String = js.native
  def resolvedOptions(): NumberFormatOptions = js.native
  def supportedLocalesOf(locales: String | js.Array[String], options: js.Any): js.Array[String] = js.native
}

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

trait DateTimeFormatOptions extends js.Object {

  /** The locale matching algorithm to use. Possible values are "lookup" and "best fit"; the default is "best fit". For
    * information about this option, see the Intl page.
    */
  var localeMatcher: js.UndefOr[String] = js.undefined

  /** The time zone to use. The only value implementations must recognize is "UTC"; the default is the runtime's default
    * time zone. Implementations may also recognize the time zone names of the IANA time zone database, such as
    * "Asia/Shanghai", "Asia/Kolkata", "America/New_York".
    */
  var timeZone: js.UndefOr[String] = js.undefined

  /** Whether to use 12-hour time (as opposed to 24-hour time). Possible values are true and false; the default is
    * locale dependent.
    */
  var hour12: js.UndefOr[Boolean] = js.undefined

  /** The format matching algorithm to use. Possible values are "basic" and "best fit"; the default is "best fit". See
    * the following paragraphs for information about the use of this property.
    */
  var formatMatcher: js.UndefOr[String] = js.undefined

  /** The representation of the weekday. Possible values are "narrow", "short", "long". */
  var weekday: js.UndefOr[String] = js.undefined

  /** The representation of the era. Possible values are "narrow", "short", "long". */
  var era: js.UndefOr[String] = js.undefined

  /** The representation of the year. Possible values are "numeric", "2-digit". */
  var year: js.UndefOr[String] = js.undefined

  /** The representation of the month. Possible values are "numeric", "2-digit", "narrow", "short", "long". */
  var month: js.UndefOr[String] = js.undefined

  /** The representation of the day. Possible values are "numeric", "2-digit". */
  var day: js.UndefOr[String] = js.undefined

  /** The representation of the hour. Possible values are "numeric", "2-digit". */
  var hour: js.UndefOr[String] = js.undefined

  /** The representation of the minute. Possible values are "numeric", "2-digit". */
  var minute: js.UndefOr[String] = js.undefined

  /** The representation of the second. Possible values are "numeric", "2-digit". */
  var second: js.UndefOr[String] = js.undefined

  /** The representation of the time zone name. Possible values are "short", "long". */
  var timeZoneName: js.UndefOr[String] = js.undefined
}

@deprecated("all members of DateTimeFormatOptions are deprecated", "2.0.0")
object DateTimeFormatOptions {

  @deprecated("use `new DateTimeFormatOptions { ... }` instead", "2.0.0")
  def apply(
      localeMatcher: js.UndefOr[String] = js.undefined, timeZone: js.UndefOr[String] = js.undefined,
      hour12: js.UndefOr[Boolean] = js.undefined, formatMatcher: js.UndefOr[String] = js.undefined,
      weekday: js.UndefOr[String] = js.undefined, era: js.UndefOr[String] = js.undefined,
      year: js.UndefOr[String] = js.undefined, month: js.UndefOr[String] = js.undefined,
      day: js.UndefOr[String] = js.undefined, hour: js.UndefOr[String] = js.undefined,
      minute: js.UndefOr[String] = js.undefined, second: js.UndefOr[String] = js.undefined,
      timeZoneName: js.UndefOr[String] = js.undefined
  ): DateTimeFormatOptions = {
    val localeMatcher0 = localeMatcher
    val timeZone0 = timeZone
    val hour12_0 = hour12
    val formatMatcher0 = formatMatcher
    val weekday0 = weekday
    val era0 = era
    val year0 = year
    val month0 = month
    val day0 = day
    val hour0 = hour
    val minute0 = minute
    val second0 = second
    val timeZoneName0 = timeZoneName
    new DateTimeFormatOptions {
      this.localeMatcher = localeMatcher0
      this.timeZone = timeZone0
      this.hour12 = hour12_0
      this.formatMatcher = formatMatcher0
      this.weekday = weekday0
      this.era = era0
      this.year = year0
      this.month = month0
      this.day = day0
      this.hour = hour0
      this.minute = minute0
      this.second = second0
      this.timeZoneName = timeZoneName0
    }
  }
}

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
