package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait DropEffectValue extends js.Any

object DropEffectValue {
  val none: DropEffectValue = "none".asInstanceOf[DropEffectValue]
  val copy: DropEffectValue = "copy".asInstanceOf[DropEffectValue]
  val link: DropEffectValue = "link".asInstanceOf[DropEffectValue]
  val move: DropEffectValue = "move".asInstanceOf[DropEffectValue]
}
