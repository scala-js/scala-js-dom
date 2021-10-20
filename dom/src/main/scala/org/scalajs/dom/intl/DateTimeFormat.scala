/*
 * Implements the Intl API. (ECMA-402 draft from March 1, 2016)
 *
 * [[http://tc39.github.io/ecma402/#intl-object The Intl Object]]
 */

package org.scalajs.dom.intl

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

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
