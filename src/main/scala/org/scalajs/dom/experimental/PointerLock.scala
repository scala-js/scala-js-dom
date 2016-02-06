package org.scalajs.dom.experimental

import org.scalajs.dom.raw.{Event, MouseEvent, Element, Document}

import scala.language.implicitConversions
import scala.scalajs.js

/**
 * Pointer Lock API
 *
 * @see [[https://www.w3.org/TR/2013/CR-pointerlock-20131217/ Pointer Lock W3C Candidate Recommendation]]
 */
object PointerLock {

  implicit def toPointerLockDocument(document: Document): PointerLockDocument =
    document.asInstanceOf[PointerLockDocument]

  implicit def toPointerLockElement(element: Element): PointerLockElement =
    element.asInstanceOf[PointerLockElement]

  implicit def toPointerLockMouseEvent(me: MouseEvent): PointerLockMouseEvent =
    me.asInstanceOf[PointerLockMouseEvent]

  @js.native
  trait PointerLockDocument extends js.Object {

    /**
     * When the Pointer lock state changes—for example, when calling
     * requestPointerLock, exitPointerLock, the user pressing the ESC key,
     * etc.—the pointerlockchange event is dispatched to the document.
     * This is a simple event and contains no extra data.
     *
     * MDN
     */
    var onpointerlockchange: js.Function1[Event, _] = js.native

    /**
     * When there is an error caused by calling requestPointerLock or
     * exitPointerLock, the pointerlockerror event is dispatched to the document.
     * This is a simple event and contains no extra data.
     *
     * MDN
     */
    var onpointerlockerror: js.Function1[Event, _] = js.native

    /**
     * The pointerLockElement property provides the element set as the target
     * for mouse events while the pointer is locked.
     * It is `null` if lock is pending, pointer is unlocked, or the target is
     * in another document.
     *
     * MDN
     */
    def pointerLockElement: Element = js.native

    /**
     * The exitPointerLock asynchronously releases a pointer lock previously
     * requested through Element.requestPointerLock.
     *
     * To track the success or failure of the request, it is necessary to listen
     * for the pointerlockchange and pointerlockerror events.
     *
     * MDN
     */
    def exitPointerLock(): Unit = js.native
  }

  @js.native
  trait PointerLockElement extends js.Object {
    /**
     * The Element.requestPointerLock() method allows to asynchronously ask for
     * the pointer to be locked on the given element.
     *
     * To track the success or failure of the request, it is necessary to listen
     * for the pointerlockchange and pointerlockerror events at the Document
     * level.
     *
     * MDN
     */
    def requestPointerLock(): Unit = js.native
  }

  /**
   * Two new parameters to mouse events—movementX and movementY—provide the
   * change in mouse positions. The values of the parameters are the same as
   * the difference between the values of MouseEvent properties, screenX and
   * screenY, which are stored in two subsequent mousemove events, eNow and
   * ePrevious. In other words, the Pointer lock parameter
   * `movementX = eNow.screenX - ePrevious.screenX`.
   *
   * When Pointer lock is enabled, the standard MouseEvent properties clientX,
   * clientY, screenX, and screenY are held constant, as if the mouse is not
   * moving. The movementX and movementY properties continue to provide the
   * mouse's change in position. There is no limit to movementX and movementY
   * values if the mouse is continuously moving in a single direction.
   * The concept of the mouse cursor does not exist and the cursor cannot move
   * off the window or be clamped by a screen edge.
   *
   * The parameters movementX and movementY are valid regardless of the mouse
   * lock state, and are available even when unlocked for convenience.
   *
   * MDN
   */
  @js.native
  trait PointerLockMouseEvent extends js.Object {
    def movementX: Double = js.native
    def movementY: Double = js.native
  }

}
