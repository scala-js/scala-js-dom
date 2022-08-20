package org.scalajs.dom

import scala.scalajs.js

opaque type ScrollRestoration <: String = String

/**
  * see [[https://html.spec.whatwg.org/multipage/history.html#the-history-interface]] 
  * which contains the spec for ScrollRestoration
  */
object ScrollRestoration {
  val auto: ScrollRestoration = "auto"
  val manual: ScrollRestoration = "manual" 
}