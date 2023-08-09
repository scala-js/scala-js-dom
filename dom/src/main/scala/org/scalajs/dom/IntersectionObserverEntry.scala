package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The IntersectionObserverEntry interface of the Intersection Observer API describes the intersection between the
  * target element and its root container at a specific moment of transition.
  */
@js.native
@JSGlobal
class IntersectionObserverEntry(init: IntersectionObserverEntryInit) extends js.Object {

  /** The bounds rectangle of the target element as a DOMRectReadOnly. */
  def boundingClientRect: DOMRectReadOnly = js.native

  /** The ratio of the intersectionRect to the boundingClientRect. */
  def intersectionRatio: Double = js.native

  /** A DOMRectReadOnly representing the target's visible area. */
  def intersectionRect: DOMRectReadOnly = js.native

  /** A Boolean value which is true if the target element intersects with the intersection observer's root. If this is
    * true, then, the IntersectionObserverEntry describes a transition into a state of intersection; if it's false, then
    * you know the transition is from intersecting to not-intersecting.
    */
  def isIntersecting: Boolean = js.native

  /** A DOMRectReadOnly for the intersection observer's root. */
  def rootBounds: DOMRectReadOnly = js.native

  /** The Element whose intersection with the root changed. */
  def target: Element = js.native

  /** A DOMHighResTimeStamp indicating the time at which the intersection was recorded, relative to the
    * IntersectionObserver's time origin.
    */
  def time: Double = js.native
}
