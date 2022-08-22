package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ScrollRestoration extends js.Any

/**
  * see [[https://html.spec.whatwg.org/multipage/history.html#the-history-interface]] 
  * which contains the spec for ScrollRestoration
  */
object ScrollRestoration {
  /** The location on the page to which the user has scrolled will be restored. */
  val auto: ScrollRestoration = "auto".asInstanceOf[ScrollRestoration]
  /** The location on the page is not restored. The user will have to scroll to the location manually. */
  val manual: ScrollRestoration = "manual".asInstanceOf[ScrollRestoration] 
}
