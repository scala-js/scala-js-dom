package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait LockMode extends js.Any

object LockMode {
  val exclusive: LockMode = "exclusive".asInstanceOf[LockMode]

  val shared: LockMode = "shared".asInstanceOf[LockMode]
}
