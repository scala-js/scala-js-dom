/*
 * Implements the Intl API. (ECMA-402 draft from March 1, 2016)
 *
 * [[http://tc39.github.io/ecma402/#intl-object The Intl Object]]
 */

package org.scalajs.dom.intl

import scala.scalajs.js

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

  /** The number of digits used to represent fractions of a second (any additional digits are truncated). Possible
    * values are 1, 2, 3.
    */
  var fractionalSecondDigits: js.UndefOr[Int] = js.undefined
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
