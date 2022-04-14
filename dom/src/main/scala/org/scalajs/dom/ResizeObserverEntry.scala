package org.scalajs.dom

import scala.scalajs.js

/** The ResizeObserverEntry interface represents the object passedto the ResizeObserver() constructor's callback
  * function, which allows you to access the new dimensions of the Element or SVGElement being observed.
  */
@js.native
trait ResizeObserverEntry extends js.Object {

  /** A reference to the Element or SVGElement being observed */
  def target: Element = js.native
  
  /** An array containing objects with the new border box size of the observed element. The array is necessary to
    * support elements that have multiple fragments, which occur in multi-column scenarios.
    */
  def borderBoxSize: js.Array[ResizeObserverSize] = js.native

  /** An array containing objects with the new content box size of the observed element. The array is necessary to
    * support elements that have multiple fragments, which occur in multi-column scenarios.
    */
  def contentBoxSize: js.Array[ResizeObserverSize] = js.native

  /** A [[DOMRectReadOnly]] object containing the new size of the observed element when the callback is run. Note that
    * this is better supported than the above two properties, but it is left over from an earlier implementation of the
    * Resize Observer API, is still included in the spec for web compat reasons, and may be deprecated in future
    * versions.
    */
  def contentRect: DOMRectReadOnly = js.native
}
