package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait MIMEType extends js.Any

object MIMEType {
  val `text/html` = "text/html".asInstanceOf[MIMEType]
  val `text/xml` = "text/xml".asInstanceOf[MIMEType]
  val `application/xml` = "application/xml".asInstanceOf[MIMEType]

  val `application/xhtml+xml` =
    "application/xhtml+xml".asInstanceOf[MIMEType]
  val `image/svg+xml` = "image/svg+xml".asInstanceOf[MIMEType]
}
