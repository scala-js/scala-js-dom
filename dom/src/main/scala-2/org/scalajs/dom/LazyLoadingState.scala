package org.scalajs.dom

import scala.scalajs.js

/**
  * Possible values for an HTMLImageElement loading attribute
  *  [[https://html.spec.whatwg.org/multipage/embedded-content.html#dom-img-loading]]
  */
@js.native
sealed trait LazyLoadingState extends js.Any

object LazyLoadingState {
  val eager: LazyLoadingState = "eager".asInstanceOf[LazyLoadingState]
  val `lazy`: LazyLoadingState = "lazy".asInstanceOf[LazyLoadingState]
}
