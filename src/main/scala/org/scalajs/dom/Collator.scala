/*
 * Implements the Intl API. (ECMA-402 draft from March 1, 2016)
 *
 * [[http://tc39.github.io/ecma402/#intl-object The Intl Object]]
 */

package org.scalajs.dom

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
