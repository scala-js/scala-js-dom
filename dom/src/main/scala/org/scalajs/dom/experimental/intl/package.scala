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

  @deprecated("use dom.intl.CollatorOptions instead", "2.0.0")
  type CollatorOptions = dom.intl.CollatorOptions

  @deprecated("use dom.intl.CollatorOptions instead", "2.0.0")
  val CollatorOptions = dom.intl.CollatorOptions

  @deprecated("use dom.intl.Collator instead", "2.0.0")
  type Collator = dom.intl.Collator

  @deprecated("use dom.intl.Collator instead", "2.0.0")
  val Collator = dom.intl.Collator

  @deprecated("use dom.intl.DateTimeFormatOptions instead", "2.0.0")
  type DateTimeFormatOptions = dom.intl.DateTimeFormatOptions

  @deprecated("use dom.intl.DateTimeFormatOptions instead", "2.0.0")
  val DateTimeFormatOptions = dom.intl.DateTimeFormatOptions

  @deprecated("use dom.intl.DateTimeFormat instead", "2.0.0")
  type DateTimeFormat = dom.intl.DateTimeFormat

  @deprecated("use dom.intl.DateTimeFormat instead", "2.0.0")
  val DateTimeFormat = dom.intl.DateTimeFormat

  @deprecated("use dom.intl.NumberFormatOptions instead", "2.0.0")
  type NumberFormatOptions = dom.intl.NumberFormatOptions

  @deprecated("use dom.intl.NumberFormatOptions instead", "2.0.0")
  val NumberFormatOptions = dom.intl.NumberFormatOptions

  @deprecated("use dom.intl.NumberFormat instead", "2.0.0")
  type NumberFormat = dom.intl.NumberFormat

  @deprecated("use dom.intl.NumberFormat instead", "2.0.0")
  val NumberFormat = dom.intl.NumberFormat

}
