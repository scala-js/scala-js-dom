package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The ResizeObserver constructor creates a new ResizeObserver object, which can be used to report changes to the
  * content or border box of an Element or the bounding box of an SVGElement - MDN
  *
  * @param callback
  *   The function called whenever an observed resize occurs. - MDN
  */
@js.native
@JSGlobal
class ResizeObserver(callback: js.Function2[js.Array[ResizeObserverEntry], ResizeObserver, _]) extends js.Object {

  /** Starts observing the specified Element or SVGElement.
    *
    * MDN
    */
  def observe(target: Node, options: js.UndefOr[ResizeObserverOptions] = js.native): Unit = js.native

  /** Unobserves all observed Element or SVGElement targets.
    *
    * MDN
    */
  def disconnect(): Unit = js.native

  /** Ends the observing of a specified Element or SVGElement.
    *
    * MDN
    */
  def unobserve(target: Node): Unit = js.native
}
