package org.scalajs.dom

opaque type DocumentReadyState <: String = String

object DocumentReadyState {
  val complete: DocumentReadyState = "complete"
  val interactive: DocumentReadyState = "interactive"
  val loading: DocumentReadyState = "loading"
}
