package org.scalajs.dom

import scala.scalajs.js

/**
  * Helps distinguish whether apps "pasting" a clipboard item should insert the contents of an appropriate representation inline at the point of paste or if it should be treated as an attachment.
  * See [[https://w3c.github.io/clipboard-apis/#enumdef-presentationstyle PresentationStyle enum]]
  */
opaque type PresentationStyle <: String = String

object PresentationStyle {
  val unspecified: PresentationStyle = "unspecified"
  val inline: PresentationStyle = "inline"
  val attachment: PresentationStyle = "attachment"
}