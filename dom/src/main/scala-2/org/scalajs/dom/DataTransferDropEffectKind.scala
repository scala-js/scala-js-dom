package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait DataTransferDropEffectKind extends js.Any

object DataTransferDropEffectKind {
  val none: DataTransferDropEffectKind = "none".asInstanceOf[DataTransferDropEffectKind]
  val copy: DataTransferDropEffectKind = "copy".asInstanceOf[DataTransferDropEffectKind]
  val link: DataTransferDropEffectKind = "link".asInstanceOf[DataTransferDropEffectKind]
  val move: DataTransferDropEffectKind = "move".asInstanceOf[DataTransferDropEffectKind]
}
