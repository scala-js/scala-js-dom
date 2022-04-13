package org.scalajs.dom

import scala.scalajs.js

@js.native
trait DOMRectReadOnly extends js.Object {

  /** The x coordinate of the DOMRect's origin.
    *
    * MDN
    */
  def x: Double = js.native

  /** The y coordinate of the DOMRect's origin.
    *
    * MDN
    */
  def y: Double = js.native

  /** The width of the DOMRect.
    *
    * MDN
    */
  def width: Double = js.native

  /** The height of the DOMRect.
    *
    * MDN
    */
  def height: Double = js.native

  /** Returns the top coordinate value of the DOMRect (usually the same as y.)
    *
    * MDN
    */
  def top: Double = js.native

  /** Returns the right coordinate value of the DOMRect (usually the same as x + width).
    *
    * MDN
    */
  def right: Double = js.native

  /** Returns the bottom coordinate value of the DOMRect (usually the same as y + height)
    *
    * MDN
    */
  def bottom: Double = js.native

  /** Returns the left coordinate value of the DOMRect (usually the same as x)
    *
    * MDN
    */
  def left: Double = js.native
}
