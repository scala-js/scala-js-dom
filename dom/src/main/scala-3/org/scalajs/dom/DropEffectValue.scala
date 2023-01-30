package org.scalajs.dom

import scala.scalajs.js

opaque type DropEffectValue <: String = String

object DropEffectValue {
  val none: DropEffectValue = "none"
  val copy: DropEffectValue = "copy"
  val link: DropEffectValue = "link"
  val move: DropEffectValue = "move"
}
