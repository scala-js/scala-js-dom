package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Image creates a new HTMLImageElement instance. It is functionally equivalent to document.createElement('img').
  *
  * @param width
  *   The width of the image (i.e., the value for the width attribute).
  * @param height
  *   The height of the image (i.e., the value for the height attribute).
  */
@JSGlobal
@js.native
class Image(width: Int, height: Int) extends HTMLImageElement {
  def this(width: Int) = this(width, 0)
  def this() = this(0, 0)
}
