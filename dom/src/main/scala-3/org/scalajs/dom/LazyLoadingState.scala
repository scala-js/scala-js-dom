package org.scalajs.dom

import scala.scalajs.js

/**
  * Possible values for an HTMLImageElement loading attribute
  *  [[https://html.spec.whatwg.org/multipage/embedded-content.html#dom-img-loading]]
  */
opaque type LazyLoadingState <: String = String

object LazyLoadingState {
  val eager: LazyLoadingState = "eager"
  val `lazy`: LazyLoadingState = "lazy"
}
