/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the SVGElement
  * interface.
  */
@js.native
@JSGlobal
abstract class SVGElement extends Element {
  var onmouseover: js.Function1[MouseEvent, _] = js.native

  /** The element which established the current viewport. Often, the nearest ancestor &lt;svg&gt; element. Null if the
    * given element is the outermost svg element.
    */
  def viewportElement: SVGElement = js.native

  var onmousemove: js.Function1[MouseEvent, _] = js.native
  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var ondblclick: js.Function1[MouseEvent, _] = js.native
  var onfocusout: js.Function1[FocusEvent, _] = js.native
  var onfocusin: js.Function1[FocusEvent, _] = js.native

  /** Corresponds to attribute xml:base on the given element. */
  var xmlbase: String = js.native
  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onload: js.Function1[Event, _] = js.native
  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var onclick: js.Function1[MouseEvent, _] = js.native

  /** The nearest ancestor &lt;svg&gt; element. Null if the given element is the outermost svg element. */
  def ownerSVGElement: SVGSVGElement = js.native
}
