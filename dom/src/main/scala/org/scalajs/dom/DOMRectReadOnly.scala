package org.scalajs.dom

import scala.scalajs.js

@js.native
trait DOMRectReadOnly extends js.Object {

  /** The x coordinate of the DOMRect's origin. */
  def x: Double = js.native

  /** The y coordinate of the DOMRect's origin. */
  def y: Double = js.native

  /** The width of the DOMRect. */
  def width: Double = js.native

  /** The height of the DOMRect. */
  def height: Double = js.native

  /** Returns the top coordinate value of the DOMRect (usually the same as y.) */
  def top: Double = js.native

  /** Returns the right coordinate value of the DOMRect (usually the same as x + width). */
  def right: Double = js.native

  /** Returns the bottom coordinate value of the DOMRect (usually the same as y + height) */
  def bottom: Double = js.native

  /** Returns the left coordinate value of the DOMRect (usually the same as x) */
  def left: Double = js.native
}
