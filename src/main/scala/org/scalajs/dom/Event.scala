/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** Event handlers may be attached to various objects including DOM elements, document, the window object, etc. When an
  * event occurs, an event object is created and passed sequentially to the event listeners.
  *
  * The DOM Event interface is accessible from within the handler function, via the event object passed as the first
  * argument. The following simple example shows how an event object is passed to the event handler function, and can be
  * used from within one such function.
  */
@js.native
@JSGlobal
class Event(typeArg: String, init: js.UndefOr[EventInit] = js.undefined) extends js.Object {

  /** Returns the time (in milliseconds since the epoch) at which the event was created. */
  def timeStamp: Double = js.native

  /** Returns a boolean indicating whether or not event.preventDefault() was called on the event. */
  def defaultPrevented: Boolean = js.native

  /** Indicates whether or not the event was initiated by the browser (after a user click for instance) or by a script
    * (using an event creation method, like event.initEvent)
    */
  def isTrusted: Boolean = js.native

  /** Identifies the current target for the event, as the event traverses the DOM. It always refers to the element the
    * event handler has been attached to as opposed to event.target which identifies the element on which the event
    * occurred.
    */
  def currentTarget: EventTarget = js.native

  /** A boolean indicating whether the bubbling of the event has been canceled or not. */
  def cancelBubble: Boolean = js.native

  /** This property of event objects is the object the event was dispatched on. It is different than event.currentTarget
    * when the event handler is called in bubbling or capturing phase of the event.
    */
  def target: EventTarget = js.native

  /** Indicates which phase of the event flow is currently being evaluated. */
  def eventPhase: Int = js.native

  /** A boolean indicating whether the event is cancelable. */
  def cancelable: Boolean = js.native

  def `type`: String = js.native

  /** A boolean indicating whether the event bubbles up through the DOM or not. */
  def bubbles: Boolean = js.native

  /** Stops the propagation of events further along in the DOM. */
  def stopPropagation(): Unit = js.native

  /** For this particular event, no other listener will be called. Neither those attached on the same element, nor those
    * attached on elements which will be traversed later (in capture phase, for instance)
    */
  def stopImmediatePropagation(): Unit = js.native

  /** Cancels the event if it is cancelable, without stopping further propagation of the event. */
  def preventDefault(): Unit = js.native
}

@js.native
@JSGlobal
object Event extends js.Object {
  def CAPTURING_PHASE: Int = js.native

  def AT_TARGET: Int = js.native

  def BUBBLING_PHASE: Int = js.native
}
