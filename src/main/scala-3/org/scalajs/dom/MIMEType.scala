package org.scalajs.dom

import scala.scalajs.js

opaque type MIMEType = String

object MIMEType {
  val `text/html` = "text/html"
  val `text/xml` = "text/xml"
  val `application/xml` = "application/xml"

  val `application/xhtml+xml` =
    "application/xhtml+xml"
  val `image/svg+xml` = "image/svg+xml"
}
