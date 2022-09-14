package org.scalajs.dom

import scala.scalajs.js

/**
  * Possible values for the loading type of an `HTMLImageElement`: https://html.spec.whatwg.org/multipage/embedded-content.html#dom-img-loading
  */
@js.native
sealed trait ImageLoadingMode extends js.Any

object ImageLoadingMode {
  val eager: ImageLoadingMode = "eager".asInstanceOf[ImageLoadingMode]
  val `lazy`: ImageLoadingMode = "lazy".asInstanceOf[ImageLoadingMode]
}
