package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait EncapsulationMode extends js.Any

object EncapsulationMode {
  val open: EncapsulationMode = "open".asInstanceOf[EncapsulationMode]
  val closed: EncapsulationMode = "closed".asInstanceOf[EncapsulationMode]
}
