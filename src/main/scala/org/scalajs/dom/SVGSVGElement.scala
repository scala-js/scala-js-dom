/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGSVGElement interface provides access to the properties of &lt;svg&gt; elements, as well as methods to
  * manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix
  * operations and the ability to control the time of redraw on visual rendering devices.
  */
@js.native
@JSGlobal
abstract class SVGSVGElement
    extends SVGElement with SVGStylable with SVGZoomAndPan with DocumentEvent with SVGLangSpace with SVGLocatable
    with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired {

  /** Corresponds to attribute width on the given &lt;svg&gt; element. */
  def width: SVGAnimatedLength = js.native

  /** Corresponds to attribute x on the given &lt;svg&gt; element. */
  def x: SVGAnimatedLength = js.native

  /** Corresponds to attribute contentStyleType on the given &lt;svg&gt; element. */
  var contentStyleType: String = js.native
  var onzoom: js.Function1[js.Any, _] = js.native

  /** Corresponds to attribute y on the given &lt;svg&gt; element. */
  def y: SVGAnimatedLength = js.native

  /** The position and size of the viewport (implicit or explicit) that corresponds to this &lt;svg&gt; element. When
    * the browser is actually rendering the content, then the position and size values represent the actual values when
    * rendering. The position and size values are unitless values in the coordinate system of the parent element. If no
    * parent element exists (i.e., &lt;svg&gt; element represents the root of the document tree), if this SVG document
    * is embedded as part of another document (e.g., via the HTML &lt;object&gt; element), then the position and size
    * are unitless values in the coordinate system of the parent document. (If the parent uses CSS or XSL layout, then
    * unitless values represent pixel units for the current CSS or XSL viewport.)
    */
  def viewport: SVGRect = js.native

  var onerror: js.Function1[Event, _] = js.native

  /** Corresponding size of a pixel unit along the y-axis of the viewport. */
  def pixelUnitToMillimeterY: Double = js.native

  var onresize: js.Function1[UIEvent, _] = js.native

  /** Corresponding size of a screen pixel along the y-axis of the viewport. */
  def screenPixelToMillimeterY: Double = js.native

  /** Corresponds to attribute height on the given &lt;svg&gt; element. */
  def height: SVGAnimatedLength = js.native

  var onabort: js.Function1[UIEvent, _] = js.native

  /** Corresponds to attribute contentScriptType on the given &lt;svg&gt; element. */
  var contentScriptType: String = js.native

  /** Size of a pixel units (as defined by CSS2) along the x-axis of the viewport, which represents a unit somewhere in
    * the range of 70dpi to 120dpi, and, on systems that support this, might actually match the characteristics of the
    * target medium. On systems where it is impossible to know the size of a pixel, a suitable default pixel size is
    * provided.
    */
  def pixelUnitToMillimeterX: Double = js.native

  /** On an outermost &lt;svg&gt; element, the corresponding translation factor that takes into account user
    * "magnification".
    */
  def currentTranslate: SVGPoint = js.native

  var onunload: js.Function1[Event, _] = js.native

  /** On an outermost &lt;svg&gt; element, this attribute indicates the current scale factor relative to the initial
    * view to take into account user magnification and panning operations. DOM attributes currentScale and
    * currentTranslate are equivalent to the 2x3 matrix [a b c d e f] = [currentScale 0 0 currentScale
    * currentTranslate.x currentTranslate.y]. If "magnification" is enabled (i.e., zoomAndPan="magnify"), then the
    * effect is as if an extra transformation were placed at the outermost level on the SVG document fragment (i.e.,
    * outside the outermost &lt;svg&gt; element).
    */
  def currentScale: Double = js.native

  var onscroll: js.Function1[UIEvent, _] = js.native

  /** User interface (UI) events in DOM Level 2 indicate the screen positions at which the given UI event occurred. When
    * the browser actually knows the physical size of a "screen unit", this attribute will express that information;
    * otherwise, user agents will provide a suitable default value such as .28mm.
    */
  def screenPixelToMillimeterX: Double = js.native

  /** Adjusts the clock for this SVG document fragment, establishing a new current time. If setCurrentTime is called
    * before the document timeline has begun (for example, by script running in a &lt;script&gt; element before the
    * document's SVGLoad event is dispatched), then the value of seconds in the last invocation of the method gives the
    * time that the document will seek to once the document timeline has begun.
    */
  def setCurrentTime(seconds: Double): Unit = js.native

  /** Creates an SVGLength object outside of any document trees. The object is initialized to a value of zero user
    * units.
    */
  def createSVGLength(): SVGLength = js.native

  /** Returns the list of graphics elements whose rendered content intersects the supplied rectangle. Each candidate
    * graphics element is to be considered a match only if the same graphics element can be a target of pointer events
    * as defined in pointer-events processing.
    */
  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeList[Node] = js.native

  /** Unsuspends (i.e., unpauses) currently running animations that are defined within the SVG document fragment,
    * causing the animation clock to continue from the time at which it was suspended.
    */
  def unpauseAnimations(): Unit = js.native

  /** Creates an SVGRect object outside of any document trees. The object is initialized such that all values are set to
    * 0 user units.
    */
  def createSVGRect(): SVGRect = js.native

  /** Returns true if the rendered content of the given element intersects the supplied rectangle. Each candidate
    * graphics element is to be considered a match only if the same graphics element can be a target of pointer events
    * as defined in pointer-events processing.
    */
  def checkIntersection(element: SVGElement, rect: SVGRect): Boolean = js.native

  /** Cancels all currently active suspendRedraw() method calls. This method is most useful at the very end of a set of
    * SVG DOM calls to ensure that all pending suspendRedraw() method calls have been cancelled.
    */
  def unsuspendRedrawAll(): Unit = js.native

  /** Suspends (i.e., pauses) all currently running animations that are defined within the SVG document fragment
    * corresponding to this &lt;svg&gt; element, causing the animation clock corresponding to this document fragment to
    * stand still until it is unpaused.
    */
  def pauseAnimations(): Unit = js.native

  /** Takes a time-out value which indicates that redraw shall not occur until: the corresponding unsuspendRedraw() call
    * has been made, an unsuspendRedrawAll() call has been made, or its timer has timed out. In environments that do not
    * support interactivity (e.g., print media), then redraw shall not be suspended. Calls to suspendRedraw() and
    * unsuspendRedraw() should, but need not be, made in balanced pairs. To suspend redraw actions as a collection of
    * SVG DOM changes occur, precede the changes to the SVG DOM with a method call similar to: suspendHandleID =
    * suspendRedraw(maxWaitMilliseconds); and follow the changes with a method call similar to:
    * unsuspendRedraw(suspendHandleID); Note that multiple suspendRedraw calls can be used at once and that each such
    * method call is treated independently of the other suspendRedraw method calls.
    */
  def suspendRedraw(maxWaitMilliseconds: Int): Int = js.native

  /** Unselects any selected objects, including any selections of text strings and type-in bars. */
  def deselectAll(): Unit = js.native

  /** Creates an SVGAngle object outside of any document trees. The object is initialized to a value of zero degrees
    * (unitless).
    */
  def createSVGAngle(): SVGAngle = js.native

  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeList[Node] = js.native

  /** Creates an SVGTransform object outside of any document trees. The object is initialized to an identity matrix
    * transform (SVG_TRANSFORM_MATRIX).
    */
  def createSVGTransform(): SVGTransform = js.native

  /** Cancels a specified suspendRedraw() by providing a unique suspend handle ID that was returned by a previous
    * suspendRedraw() call.
    */
  def unsuspendRedraw(suspendHandleID: Int): Unit = js.native

  /** In rendering environments supporting interactivity, forces the user agent to immediately redraw all regions of the
    * viewport that require updating.
    */
  def forceRedraw(): Unit = js.native

  /** Returns the current time in seconds relative to the start time for the current SVG document fragment. If
    * getCurrentTime is called before the document timeline has begun (for example, by script running in a
    * &lt;script&gt; element before the document's SVGLoad event is dispatched), then 0 is returned.
    */
  def getCurrentTime(): Int = js.native

  /** Returns true if the rendered content of the given element is entirely contained within the supplied rectangle.
    * Each candidate graphics element is to be considered a match only if the same graphics element can be a target of
    * pointer events as defined in pointer-events processing.
    */
  def checkEnclosure(element: SVGElement, rect: SVGRect): Boolean = js.native

  /** Creates an SVGMatrix object outside of any document trees. The object is initialized to the identity matrix. */
  def createSVGMatrix(): SVGMatrix = js.native

  /** Creates an SVGPoint object outside of any document trees. The object is initialized to the point (0,0) in the user
    * coordinate system.
    */
  def createSVGPoint(): SVGPoint = js.native

  /** Creates an SVGNumber object outside of any document trees. The object is initialized to a value of zero. */
  def createSVGNumber(): SVGNumber = js.native

  /** Creates an SVGTransform object outside of any document trees. The object is initialized to the given matrix
    * transform (i.e., SVG_TRANSFORM_MATRIX). The values from the parameter matrix are copied, the matrix parameter is
    * not adopted as SVGTransform::matrix.
    */
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native

  def getComputedStyle(elt: Element, pseudoElt: String = js.native): CSSStyleDeclaration = js.native

  /** Searches this SVG document fragment (i.e., the search is restricted to a subset of the document tree) for an
    * Element whose id is given by elementId. If an Element is found, that Element is returned. If no such element
    * exists, returns null. Behavior is not defined if more than one element has this id.
    */
  def getElementById(elementId: String): Element = js.native
}
