package org.scalajs.dom

import scala.scalajs.js

opaque type EffectAllowedValue <: String = String

object EffectAllowedValue {
  val none: EffectAllowedValue = "none"
  val copy: EffectAllowedValue = "copy"
  val copyLink: EffectAllowedValue = "copyLink"
  val copyMove: EffectAllowedValue = "copyMove"
  val link: EffectAllowedValue = "link"
  val linkMove: EffectAllowedValue = "linkMove"
  val move: EffectAllowedValue = "move"
  val all: EffectAllowedValue = "all"
  val uninitialized: EffectAllowedValue = "uninitialized"
}
