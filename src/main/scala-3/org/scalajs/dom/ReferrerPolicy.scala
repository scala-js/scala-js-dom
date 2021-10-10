package org.scalajs.dom

import scala.scalajs.js

opaque type ReferrerPolicy = String

object ReferrerPolicy {
  val empty: ReferrerPolicy = ""
  val `no-referrer` = "no-referrer"

  val `no-referrer-when-downgrade` =
    "no-referrer-when-downgrade"
  val `origin-only` = "origin-only"

  val `origin-when-cross-origin` =
    "origin-when-cross-origin"
  val `unsafe-url` = "unsafe-url"
}
