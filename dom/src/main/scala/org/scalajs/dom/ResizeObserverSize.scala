package org.scalajs.dom

import scala.scalajs.js

@js.native
trait ResizeObserverSize extends js.Object {

  /** The length of the observed element's border box in the block dimension. For boxes with a horizontal writing-mode,
    * this is the vertical dimension, or height; if the writing-mode is vertical, this is the horizontal dimension, or
    * width.
    *
    * MDN
    */
  def blockSize: Double = js.native

  /** The length of the observed element's border box in the inline dimension. For boxes with a horizontal writing-mode,
    * this is the horizontal dimension, or width; if the writing-mode is vertical, this is the vertical dimension, or
    * height.
    *
    * MDN
    */
  def inlineSize: Double = js.native
}
