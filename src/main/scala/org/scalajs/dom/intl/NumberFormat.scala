/*
 * Implements the Intl API. (ECMA-402 draft from March 1, 2016)
 *
 * [[http://tc39.github.io/ecma402/#intl-object The Intl Object]]
 */

package org.scalajs.dom.intl

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

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
