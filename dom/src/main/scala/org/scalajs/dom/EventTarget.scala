/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** EventTarget is a DOM interface implemented by objects that can receive DOM events and have listeners for them.
  *
  * Element, document, and window are the most common event targets, but other objects can be event targets too, for
  * example XMLHttpRequest, AudioNode, AudioContext and others.
  *
  * Many event targets (including elements, documents, and windows) also support setting event handlers via on...
  * properties and attributes.
  */
@js.native
@JSGlobal
class EventTarget extends js.Object {

  /** Removes the event listener previously registered with EventTarget.addEventListener. */
  def removeEventListener[T <: Event](`type`: String, listener: js.Function1[T, _],
      useCapture: Boolean = js.native): Unit = js.native

  /** The EventTarget.addEventListener() method registers the specified listener on the EventTarget it's called on. The
    * event target may be an Element in a document, the Document itself, a Window, or any other object that supports
    * events (such as XMLHttpRequest).
    */
  def addEventListener[T <: Event](`type`: String, listener: js.Function1[T, _],
      useCapture: Boolean = js.native): Unit = js.native

  /** Removes the event listener previously registered with EventTarget.addEventListener.
    *
    * This implementation accepts a settings object of type EventListenerOptions.
    */
  def removeEventListener[T <: Event](`type`: String, listener: js.Function1[T, _],
      options: EventListenerOptions): Unit = js.native

  /** The EventTarget.addEventListener() method registers the specified listener on the EventTarget it's called on. The
    * event target may be an Element in a document, the Document itself, a Window, or any other object that supports
    * events (such as XMLHttpRequest).
    *
    * This implementation accepts a settings object of type EventListenerOptions.
    */
  def addEventListener[T <: Event](`type`: String, listener: js.Function1[T, _],
      options: EventListenerOptions): Unit = js.native

  /** Dispatches an Event at the specified EventTarget, invoking the affected EventListeners in the appropriate order.
    * The normal event processing rules (including the capturing and optional bubbling phase) apply to events dispatched
    * manually with dispatchEvent().
    */
  def dispatchEvent(evt: Event): Boolean = js.native
}
