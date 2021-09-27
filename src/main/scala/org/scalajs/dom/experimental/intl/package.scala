package org.scalajs.dom.experimental

import org.scalajs.dom

/** The Intl object is the namespace for the ECMAScript Internationalization API, which provides language sensitive
  * string comparison, number formatting, and date and time formatting.
  *
  * The constructors for Collator, NumberFormat, and DateTimeFormat objects are properties of the Intl object. This page
  * documents these properties as well as functionality common to the internationalization constructors and other
  * language sensitive functions.
  */
package object intl {

  @deprecated("use dom.CollatorOptions instead", "2.0.0")
  type CollatorOptions = dom.CollatorOptions

  @deprecated("use dom.CollatorOptions instead", "2.0.0")
  val CollatorOptions = dom.CollatorOptions

  @deprecated("use dom.Collator instead", "2.0.0")
  type Collator = dom.Collator

  @deprecated("use dom.Collator instead", "2.0.0")
  val Collator = dom.Collator

  @deprecated("use dom.DateTimeFormatOptions instead", "2.0.0")
  type DateTimeFormatOptions = dom.DateTimeFormatOptions

  @deprecated("use dom.DateTimeFormatOptions instead", "2.0.0")
  val DateTimeFormatOptions = dom.DateTimeFormatOptions

  @deprecated("use dom.DateTimeFormat instead", "2.0.0")
  type DateTimeFormat = dom.DateTimeFormat

  @deprecated("use dom.DateTimeFormat instead", "2.0.0")
  val DateTimeFormat = dom.DateTimeFormat

  @deprecated("use dom.NumberFormatOptions instead", "2.0.0")
  type NumberFormatOptions = dom.NumberFormatOptions

  @deprecated("use dom.NumberFormatOptions instead", "2.0.0")
  val NumberFormatOptions = dom.NumberFormatOptions

  @deprecated("use dom.NumberFormat instead", "2.0.0")
  type NumberFormat = dom.NumberFormat

  @deprecated("use dom.NumberFormat instead", "2.0.0")
  val NumberFormat = dom.NumberFormat

}
