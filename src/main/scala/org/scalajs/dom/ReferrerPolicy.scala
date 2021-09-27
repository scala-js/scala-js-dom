package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ReferrerPolicy extends js.Any

object ReferrerPolicy {
  val empty: ReferrerPolicy = "".asInstanceOf[ReferrerPolicy]
  val `no-referrer` = "no-referrer".asInstanceOf[ReferrerPolicy]

  val `no-referrer-when-downgrade` =
    "no-referrer-when-downgrade".asInstanceOf[ReferrerPolicy]
  val `origin-only` = "origin-only".asInstanceOf[ReferrerPolicy]

  val `origin-when-cross-origin` =
    "origin-when-cross-origin".asInstanceOf[ReferrerPolicy]
  val `unsafe-url` = "unsafe-url".asInstanceOf[ReferrerPolicy]
}
