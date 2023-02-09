package org.scalajs.dom

import scala.scalajs.js

opaque type DataTransferEffectAllowedKind <: String = String

object DataTransferEffectAllowedKind {
  val none: DataTransferEffectAllowedKind = "none"
  val copy: DataTransferEffectAllowedKind = "copy"
  val copyLink: DataTransferEffectAllowedKind = "copyLink"
  val copyMove: DataTransferEffectAllowedKind = "copyMove"
  val link: DataTransferEffectAllowedKind = "link"
  val linkMove: DataTransferEffectAllowedKind = "linkMove"
  val move: DataTransferEffectAllowedKind = "move"
  val all: DataTransferEffectAllowedKind = "all"
  val uninitialized: DataTransferEffectAllowedKind = "uninitialized"
}
