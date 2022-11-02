package org.scalajs.dom

import scala.scalajs.js

/**
  * Helps distinguish whether apps "pasting" a clipboard item should insert the contents of an appropriate representation inline at the point of paste or if it should be treated as an attachment.
  * See [[https://w3c.github.io/clipboard-apis/#enumdef-presentationstyle PresentationStyle enum]]
  */
@js.native
sealed trait PresentationStyle extends js.Any

object PresentationStyle{
  val unspecified: PresentationStyle = "unspecified".asInstanceOf[PresentationStyle]
  val inline: PresentationStyle = "inline".asInstanceOf[PresentationStyle]
  val attachment: PresentationStyle = "attachment".asInstanceOf[PresentationStyle]
}
