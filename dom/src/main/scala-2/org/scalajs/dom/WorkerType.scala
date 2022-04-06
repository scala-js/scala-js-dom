package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait WorkerType extends js.Any

object WorkerType {
  val classic: WorkerType = "classic".asInstanceOf[WorkerType]
  val module: WorkerType = "module".asInstanceOf[WorkerType]
}
