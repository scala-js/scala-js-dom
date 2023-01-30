package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait EffectAllowedValue extends js.Any

object EffectAllowedValue{
  val none: EffectAllowedValue = "none".asInstanceOf[EffectAllowedValue]
  val copy: EffectAllowedValue = "copy".asInstanceOf[EffectAllowedValue]
  val copyLink: EffectAllowedValue = "copyLink".asInstanceOf[EffectAllowedValue]
  val copyMove: EffectAllowedValue = "copyMove".asInstanceOf[EffectAllowedValue]
  val link: EffectAllowedValue = "link".asInstanceOf[EffectAllowedValue]
  val linkMove: EffectAllowedValue = "linkMove".asInstanceOf[EffectAllowedValue]
  val move: EffectAllowedValue = "move".asInstanceOf[EffectAllowedValue]
  val all: EffectAllowedValue = "all".asInstanceOf[EffectAllowedValue]
  val uninitialized: EffectAllowedValue = "uninitialized".asInstanceOf[EffectAllowedValue]
}
