package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait TextTrackMode extends js.Any

object TextTrackMode {
  val disabled: TextTrackMode = "disabled".asInstanceOf[TextTrackMode]
  val hidden: TextTrackMode = "hidden".asInstanceOf[TextTrackMode]
  val showing: TextTrackMode = "showing".asInstanceOf[TextTrackMode]
}
