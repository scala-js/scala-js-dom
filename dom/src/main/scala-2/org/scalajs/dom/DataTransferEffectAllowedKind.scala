package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait DataTransferEffectAllowedKind extends js.Any

object DataTransferEffectAllowedKind {
  val none: DataTransferEffectAllowedKind= "none".asInstanceOf[DataTransferEffectAllowedKind]
  val copy: DataTransferEffectAllowedKind= "copy".asInstanceOf[DataTransferEffectAllowedKind]
  val copyLink: DataTransferEffectAllowedKind= "copyLink".asInstanceOf[DataTransferEffectAllowedKind]
  val copyMove: DataTransferEffectAllowedKind= "copyMove".asInstanceOf[DataTransferEffectAllowedKind]
  val link: DataTransferEffectAllowedKind= "link".asInstanceOf[DataTransferEffectAllowedKind]
  val linkMove: DataTransferEffectAllowedKind= "linkMove".asInstanceOf[DataTransferEffectAllowedKind]
  val move: DataTransferEffectAllowedKind= "move".asInstanceOf[DataTransferEffectAllowedKind]
  val all: DataTransferEffectAllowedKind= "all".asInstanceOf[DataTransferEffectAllowedKind]
  val uninitialized: DataTransferEffectAllowedKind= "uninitialized".asInstanceOf[DataTransferEffectAllowedKind]
}
