package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait IDBRequestReadyState extends js.Any

object IDBRequestReadyState {
  val done: IDBRequestReadyState = "done".asInstanceOf[IDBRequestReadyState]
  val pending: IDBRequestReadyState = "pending".asInstanceOf[IDBRequestReadyState]
}
