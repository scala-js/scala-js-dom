package org.scalajs.dom

import scala.scalajs.js

opaque type ReferrerPolicy <: String = String

object ReferrerPolicy {
  val empty: ReferrerPolicy = ""
  val `no-referrer`: ReferrerPolicy = "no-referrer"

  val `no-referrer-when-downgrade`: ReferrerPolicy =
    "no-referrer-when-downgrade"
  val `origin-only`: ReferrerPolicy = "origin-only"

  val `origin-when-cross-origin`: ReferrerPolicy =
    "origin-when-cross-origin"
  val `unsafe-url`: ReferrerPolicy = "unsafe-url"
}
