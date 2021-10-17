package org.scalajs.dom

import scala.scalajs.js

opaque type ClientType = String

object ClientType {
  val window: ClientType = "window"

  val worker: ClientType = "worker"

  val sharedworker: ClientType = "sharedworker"

  val all: ClientType = "all"
}
