package org.scalajs.dom.experimental

import org.scalajs.dom.raw.{Document, Element, Event}
import scala.language.implicitConversions
import scala.scalajs.js

/**
 * Full Screen API
 *
 * [[https://fullscreen.spec.whatwg.org/ Fullscreen API Living Standard]]
 */
object Fullscreen {

  implicit def toFullscreenElement(e: Element): FullscreenElement =
    e.asInstanceOf[FullscreenElement]

  implicit def toFullscreenDocument(d: Document): FullscreenDocument =
    d.asInstanceOf[FullscreenDocument]

  @js.native
  trait FullscreenElement extends js.Object {

    /**
     * The Element.requestFullscreen() method issues an asynchronous request to
     * make the element be displayed full-screen.
     *
     * It's not guaranteed that the element will be put into full screen mode.
     * If permission to enter full screen mode is granted, the document will
     * receive a `fullscreenchange` event to let it know that it's now in full
     * screen mode. If permission is denied, the document receives a
     * `fullscreenerror` event instead.
     *
     * Note: Returns `js.UndefOr` because implementations of older versions
     * of this spec may not return a Promise.
     *
     * MDN
     */
    def requestFullscreen(): js.UndefOr[js.Promise[Unit]] = js.native
  }

  @js.native
  trait FullscreenDocument extends js.Object {

    /**
     * The fullscreenEnabled attribute tells you whether or not the document is
     * currently in a state that would allow fullscreen mode to be requested.
     *
     * MDN
     */
    def fullscreenEnabled: Boolean = js.native

    /**
     * Returns the Element that is currently being presented in full-screen mode
     * in this document, or `null` if full-screen mode is not currently in use.
     *
     * MDN
     */
    def fullscreenElement: Element = js.native

    /**
     * Stops document's fullscreen element from being displayed fullscreen and
     * fulfills promise when done.
     *
     * Note: Returns `js.UndefOr` because implementations of older versions
     * of this spec may not return a Promise.
     *
     * MDN
     */
    def exitFullscreen(): js.UndefOr[js.Promise[Unit]] = js.native

    /**
     * Note: May not be available in implementations of older versions of
     * this spec.
     */
    var onfullscreenchange: js.Function1[Event, _] = js.native

    /**
     * Note: May not be available in implementations of older versions of
     * this spec.
     */
    var onfullscreenerror: js.Function1[Event, _] = js.native
  }
}
