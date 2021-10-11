package org.scalajs.dom

import scala.scalajs.js

opaque type MIMEType = String

object MIMEType {
  val `text/html`: MIMEType = "text/html"
  val `text/xml`: MIMEType = "text/xml"
  val `application/xml`: MIMEType = "application/xml"

  val `application/xhtml+xml`: MIMEType =
    "application/xhtml+xml"
  val `image/svg+xml`: MIMEType = "image/svg+xml"
}
