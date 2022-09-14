package org.scalajs.dom

import scala.scalajs.js

/**
  * Possible values for the loading type of an `HTMLImageElement`: https://html.spec.whatwg.org/multipage/embedded-content.html#dom-img-loading
  */
opaque type ImageLoadingMode <: String = String

object ImageLoadingMode {
  val eager: ImageLoadingMode = "eager"
  val `lazy`: ImageLoadingMode = "lazy"
}
