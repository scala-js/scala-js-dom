package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ReadyState extends js.Any

object ReadyState {
  val closed: ReadyState = "closed".asInstanceOf[ReadyState]
  val ended: ReadyState = "ended".asInstanceOf[ReadyState]
  val open: ReadyState = "open".asInstanceOf[ReadyState]
}
