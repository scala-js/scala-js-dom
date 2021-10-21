package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait DocumentReadyState extends js.Any

object DocumentReadyState {
  val complete: DocumentReadyState = "complete".asInstanceOf[DocumentReadyState]
  val interactive: DocumentReadyState = "interactive".asInstanceOf[DocumentReadyState]
  val loading: DocumentReadyState = "loading".asInstanceOf[DocumentReadyState]
}
