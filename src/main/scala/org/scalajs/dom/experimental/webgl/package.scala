package org.scalajs.dom.experimental

import org.scalajs.dom.WebGLRenderingContext
import scala.scalajs.js

package object webgl {

  implicit class WebGLRenderingContextOps(val webGL: WebGLRenderingContext) extends AnyVal {

    /** Returns the WebGL extension for the given identifier, if present on this browser.
      *
      * @param id
      *   the identifier singleton.
      * @tparam T
      *   The type of the result for this extension.
      * @return
      *   `Some(extension)` or `None`
      */
    def getExtension[T](id: WebGLExtensionIdentifier[T]): js.UndefOr[T] =
      webGL.getExtension(id.value).asInstanceOf[js.UndefOr[T]]
  }
}
