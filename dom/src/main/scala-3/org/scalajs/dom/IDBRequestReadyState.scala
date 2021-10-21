package org.scalajs.dom

opaque type IDBRequestReadyState <: String = String

object IDBRequestReadyState {
  val done: IDBRequestReadyState = "done"
  val pending: IDBRequestReadyState = "pending"
}
