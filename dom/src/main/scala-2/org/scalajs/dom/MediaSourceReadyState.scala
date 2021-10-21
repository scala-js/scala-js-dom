package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait MediaSourceReadyState extends js.Any

object MediaSourceReadyState {
  val closed: MediaSourceReadyState = "closed".asInstanceOf[MediaSourceReadyState]
  val ended: MediaSourceReadyState = "ended".asInstanceOf[MediaSourceReadyState]
  val open: MediaSourceReadyState = "open".asInstanceOf[MediaSourceReadyState]
}
