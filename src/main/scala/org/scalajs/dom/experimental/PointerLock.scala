package org.scalajs
package dom.experimental

@deprecated("the extensions provided by PointerLock are now available by default", "2.0.0")
object PointerLock {

  @deprecated("Use dom.Document directly instead", "2.0.0")
  def toPointerLockDocument(document: dom.Document): PointerLockDocument =
    document

  @deprecated("Use dom.Element directly instead", "2.0.0")
  def toPointerLockElement(element: dom.Element): PointerLockElement =
    element

  @deprecated("Use dom.MouseEvent directly instead", "2.0.0")
  def toPointerLockMouseEvent(me: dom.MouseEvent): PointerLockMouseEvent =
    me

  @deprecated("Use dom.Document instead", "2.0.0")
  type PointerLockDocument = dom.Document

  @deprecated("Use dom.Element instead", "2.0.0")
  type PointerLockElement = dom.Element

  @deprecated("Use dom.MouseEvent instead", "2.0.0")
  type PointerLockMouseEvent = dom.MouseEvent
}
