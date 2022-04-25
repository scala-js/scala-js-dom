package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ShadowRootMode extends js.Any

object ShadowRootMode {
  val open: ShadowRootMode = "open".asInstanceOf[ShadowRootMode]
  val closed: ShadowRootMode = "closed".asInstanceOf[ShadowRootMode]
}
