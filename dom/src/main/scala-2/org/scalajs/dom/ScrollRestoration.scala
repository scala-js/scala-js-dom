package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ScrollRestoration extends js.Any

/**
  * see [[https://html.spec.whatwg.org/multipage/history.html#the-history-interface]] 
  * which contains the spec for ScrollRestoration
  */
object ScrollRestoration {
  val auto: ScrollRestoration = "auto".asInstanceOf[ScrollRestoration]
  val manual: ScrollRestoration = "manual".asInstanceOf[ScrollRestoration] 
}