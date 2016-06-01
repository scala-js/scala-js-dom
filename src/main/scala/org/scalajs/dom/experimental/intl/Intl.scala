/*
 * Implements the Intl API. (ECMA-402 draft from March 1, 2016)
 *
 * [[http://tc39.github.io/ecma402/#intl-object The Intl Object]]
 */

package org.scalajs.dom.experimental.intl

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSName

/**
 * The Intl.Collator object is a constructor for collators, objects that enable language
 * sensitive string comparison.
 *
 * MDN
 */
@js.native
@JSName("Intl.Collator")
class Collator(locales: js.UndefOr[String | js.Array[String]] = js.undefined,
    options: js.UndefOr[CollatorOptions] = js.undefined)
    extends js.Object {
  def compare(string1: String, string2: String): Double = js.native
  def resolvedOptions(): CollatorOptions = js.native
  def supportedLocalesOf(locales: String | js.Array[String],
      options: js.Any): js.Array[String] = js.native
}

/**
 * The Intl.DateTimeFormat object is a constructor for objects that enable language sensitive
 * date and time formatting.
 *
 * MDN
 */
@js.native
@JSName("Intl.DateTimeFormat")
class DateTimeFormat(locales: String | js.Array[String],
    options: js.UndefOr[DateTimeFormatOptions] = js.undefined)
    extends js.Object {
  def format(date: js.Date): String = js.native
  def resolvedOptions(): DateTimeFormatOptions = js.native
  def supportedLocalesOf(locales: String | js.Array[String],
      options: js.Any): js.Array[String] = js.native
}

/**
 * The Intl.NumberFormat object is a constructor for objects that enable language sensitive
 * number formatting.
 *
 * MDN
 */
@js.native
@JSName("Intl.NumberFormat")
class NumberFormat(locales: String | js.Array[String],
    options: js.UndefOr[NumberFormatOptions])
    extends js.Object {
  def format(number: Double): String = js.native
  def resolvedOptions(): NumberFormatOptions = js.native
  def supportedLocalesOf(locales: String | js.Array[String],
      options: js.Any): js.Array[String] = js.native
}

@js.native
trait CollatorOptions extends js.Object {
  val localeMatcher: js.UndefOr[String]
  val usage: js.UndefOr[String]
  val sensivity: js.UndefOr[String]
  val ignore­Punctua­tion: js.UndefOr[Boolean]
  val numeric: js.UndefOr[Boolean]
  val caseFirst: js.UndefOr[String]
}

object CollatorOptions {

  /**
   * @param localeMatcher     The locale matching algorithm to use. Possible values are "lookup"
   *                          and "best fit"; the default is "best fit". For information about
   *                          this option, see the Intl page.
   * @param usage             Whether the comparison is for sorting or for searching for matching
   *                          strings. Possible values are "sort" and "search"; the default is "sort".
   * @param sensitivity       Which differences in the strings should lead to non-zero result values.
   *                          Possible values are:
   *                           - "base": Only strings that differ in base letters compare as unequal.
   *                             Examples: a ≠ b, a = á, a = A.
   *                           - "accent": Only strings that differ in base letters or accents and
   *                             other diacritic marks compare as unequal.
   *                             Examples: a ≠ b, a ≠ á, a = A.
   *                           - "case": Only strings that differ in base letters or case compare
   *                             as unequal. Examples: a ≠ b, a = á, a ≠ A.
   *                           - "variant": Strings that differ in base letters, accents and other
   *                              diacritic marks, or case compare as unequal. Other differences
   *                              may also be taken into consideration.
   *                              Examples: a ≠ b, a ≠ á, a ≠ A.
   *                          The default is "variant" for usage "sort"; it's locale dependent for
   *                          usage "search".
   * @param ignore­Punctua­tion Whether punctuation should be ignored. Possible values are true
   *                          and false; the default is false.
   * @param numeric           Whether numeric collation should be used, such that "1" < "2" < "10".
   *                          Possible values are true and false; the default is false.
   *                          This option can be set through an options property or through a
   *                          Unicode extension key; if both are provided, the options property
   *                          takes precedence.
   *                          Implementations are not required to support this property.
   * @param caseFirst         Whether upper case or lower case should sort first. Possible values
   *                          are "upper", "lower", or "false" (use the locale's default); the
   *                          default is "false". This option can be set through an options
   *                          property or through a Unicode extension key; if both are provided,
   *                          the options property takes precedence. Implementations are not
   *                          required to support this property. 
   *
   * MDN
   */
  def apply(
      localeMatcher: js.UndefOr[String]  = js.undefined,
      usage: js.UndefOr[String]  = js.undefined,
      sensivity: js.UndefOr[String]  = js.undefined,
      ignore­Punctua­tion: js.UndefOr[Boolean] = js.undefined,
      numeric: js.UndefOr[Boolean] = js.undefined,
      caseFirst: js.UndefOr[String]  = js.undefined): CollatorOptions = {
    js.Dynamic.literal(
      localeMatcher = localeMatcher,
      usage = usage,
      sensivity = sensivity,
      ignore­Punctua­tion = ignore­Punctua­tion,
      numeric = numeric,
      caseFirst = caseFirst
    ).asInstanceOf[CollatorOptions]
  }
}

@js.native
trait DateTimeFormatOptions extends js.Object {
  val localeMatcher: js.UndefOr[String]
  val timeZone: js.UndefOr[String]
  val hour12: js.UndefOr[Boolean]
  val formatMatcher: js.UndefOr[String]

  val weekday: js.UndefOr[String]
  val era: js.UndefOr[String]
  val year: js.UndefOr[String]
  val month: js.UndefOr[String]
  val day: js.UndefOr[String]
  val hour: js.UndefOr[String]
  val minute: js.UndefOr[String]
  val second: js.UndefOr[String]
  val timeZoneName: js.UndefOr[String]
}

object DateTimeFormatOptions {

  /** 
   * @param localeMatcher The locale matching algorithm to use. Possible values are "lookup" and
   *                      "best fit"; the default is "best fit".
   *                      For information about this option, see the Intl page.
   * @param timeZone      The time zone to use. The only value implementations must recognize is
   *                      "UTC"; the default is the runtime's default time zone. Implementations
   *                      may also recognize the time zone names of the IANA time zone database,
   *                      such as "Asia/Shanghai", "Asia/Kolkata", "America/New_York".
   * @param hour12        Whether to use 12-hour time (as opposed to 24-hour time). Possible
   *                      values are true and false; the default is locale dependent.
   * @param formatMatcher The format matching algorithm to use. Possible values are "basic" and
   *                      "best fit"; the default is "best fit". See the following paragraphs for
   *                      information about the use of this property.
   * @param weekday       The representation of the weekday. Possible values are "narrow",
   *                      "short", "long".
   * @param era           The representation of the era. Possible values are "narrow", "short",
   *                      "long".
   * @param year          The representation of the year. Possible values are "numeric", "2-digit".
   * @param month         The representation of the month. Possible values are "numeric",
   *                      "2-digit", "narrow", "short", "long".
   * @param day           The representation of the day. Possible values are "numeric", "2-digit".
   * @param hour          The representation of the hour. Possible values are "numeric", "2-digit".
   * @param minute        The representation of the minute. Possible values are "numeric", "2-digit".
   * @param second        The representation of the second. Possible values are "numeric", "2-digit".
   * @param timeZoneName  The representation of the time zone name. Possible values are "short", "long".
   *
   * MDN
   */
  def apply(
      localeMatcher: js.UndefOr[String]  = js.undefined,
      timeZone: js.UndefOr[String]  = js.undefined,
      hour12: js.UndefOr[Boolean] = js.undefined,
      formatMatcher: js.UndefOr[String]  = js.undefined,

      weekday: js.UndefOr[String]  = js.undefined,
      era: js.UndefOr[String]  = js.undefined,
      year: js.UndefOr[String]  = js.undefined,
      month: js.UndefOr[String]  = js.undefined,
      day: js.UndefOr[String]  = js.undefined,
      hour: js.UndefOr[String]  = js.undefined,
      minute: js.UndefOr[String]  = js.undefined,
      second: js.UndefOr[String]  = js.undefined,
      timeZoneName:  js.UndefOr[String]  = js.undefined): DateTimeFormatOptions = {
    js.Dynamic.literal(
      localeMatcher = localeMatcher,
      timeZone = timeZone,
      hour12 = hour12,
      formatMatcher = formatMatcher,
      weekday = weekday,
      era = era,
      year = year,
      month = month,
      day = day,
      hour = hour,
      minute = minute,
      second = second,
      timeZoneName  = timeZoneName
    ).asInstanceOf[DateTimeFormatOptions]
  }
}

@js.native
trait NumberFormatOptions extends js.Object {
  val localeMatcher: js.UndefOr[String]
  val style: js.UndefOr[String]
  val currency: js.UndefOr[String]
  val currencyDisplay: js.UndefOr[String]
  val useGrouping: js.UndefOr[Boolean]

  val minimumIntegerDigits: js.UndefOr[Double]
  val minimumFractionDigits: js.UndefOr[Double]
  val maximumFractionDigits: js.UndefOr[Double]

  val minimumSignificantDigits: js.UndefOr[Double]
  val maximumSignificantDigits: js.UndefOr[Double]
}

object NumberFormatOptions {

  /**
   * The following properties fall into two groups:
   *  - minimumIntegerDigits, minimumFractionDigits, and maximumFractionDigits in one group,
   *  - minimumSignificantDigits and maximumSignificantDigits in the other.
   * If at least one property from the second group is defined, then the first group is ignored.
   *
   * @param localeMatcher            The locale matching algorithm to use. Possible values are
   *                                 "lookup" and "best fit"; the default is "best fit".
   *                                 For information about this option, see the Intl page.
   * @param style                    The formatting style to use. Possible values are "decimal"
   *                                 for plain number formatting, "currency" for currency
   *                                 formatting, and "percent" for percent formatting; the default
   *                                 is "decimal".
   * @param currency                 The currency to use in currency formatting. Possible values
   *                                 are the ISO 4217 currency codes, such as "USD" for the US
   *                                 dollar, "EUR" for the euro, or "CNY" for the Chinese RMB —
   *                                 see the Current currency & funds code list.
   *                                 There is no default value; if the style is "currency", the
   *                                 currency property must be provided.
   * @param currencyDisplay          How to display the currency in currency formatting. Possible
   *                                 values are "symbol" to use a localized currency symbol such
   *                                 as €, "code" to use the ISO currency code, "name" to use a
   *                                 localized currency name such as "dollar"; the default is
   *                                 "symbol".
   * @param useGrouping              Whether to use grouping separators, such as thousands
   *                                 separators or thousand/lakh/crore separators. Possible values
   *                                 are true and false; the default is true.
   * @param minimumIntegerDigits     The minimum number of integer digits to use. Possible values
   *                                 are from 1 to 21; the default is 1.
   * @param minimumFractionDigits    The minimum number of fraction digits to use. Possible values
   *                                 are from 0 to 20; the default for plain number and percent
   *                                 formatting is 0; the default for currency formatting is the
   *                                 number of minor unit digits provided by the ISO 4217 currency
   *                                 code list (2 if the list doesn't provide that information).
   * @param maximumFractionDigits    The maximum number of fraction digits to use. Possible values
   *                                 are from 0 to 20; the default for plain number formatting is
   *                                 the larger of minimumFractionDigits and 3; the default for
   *                                 currency formatting is the larger of minimumFractionDigits
   *                                 and the number of minor unit digits provided by the ISO 4217
   *                                 currency code list (2 if the list doesn't provide that
   *                                 information); the default for percent formatting is the
   *                                 larger of minimumFractionDigits and 0.
   * @param minimumSignificantDigits The minimum number of significant digits to use. Possible
   *                                 values are from 1 to 21; the default is 1.
   * @param maximumSignificantDigits The maximum number of significant digits to use. Possible
   *                                 values are from 1 to 21; the default is minimumSignificantDigits. 
   *
   * MDN
   */
  def apply(
      localeMatcher: js.UndefOr[String]  = js.undefined,
      style: js.UndefOr[String]  = js.undefined,
      currency: js.UndefOr[String]  = js.undefined,
      currencyDisplay: js.UndefOr[String]  = js.undefined,
      useGrouping: js.UndefOr[Boolean] = js.undefined,

      minimumIntegerDigits: js.UndefOr[Double]  = js.undefined,
      minimumFractionDigits: js.UndefOr[Double]  = js.undefined,
      maximumFractionDigits: js.UndefOr[Double]  = js.undefined,

      minimumSignificantDigits: js.UndefOr[Double]  = js.undefined,
      maximumSignificantDigits: js.UndefOr[Double]  = js.undefined): NumberFormatOptions = {
    js.Dynamic.literal(
      localeMatcher = localeMatcher,
      style = style,
      currency = currency,
      currencyDisplay  = currencyDisplay,
      useGrouping = useGrouping,
      minimumIntegerDigits = minimumIntegerDigits,
      minimumFractionDigits = minimumFractionDigits,
      maximumFractionDigits = maximumFractionDigits,
      minimumSignificantDigits = minimumSignificantDigits,
      maximumSignificantDigits = maximumSignificantDigits
    ).asInstanceOf[NumberFormatOptions]
  }
}
