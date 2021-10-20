/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLIFrameElement interface provides special properties and methods (beyond those of the HTMLElement interface
  * it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements.
  */
@js.native
@JSGlobal
abstract class HTMLIFrameElement extends HTMLElement with GetSVGDocument {

  /** Reflects the width HTML attribute, indicating the width of the frame. */
  var width: String = js.native

  /** The window proxy for the nested browsing context. */
  def contentWindow: Window = js.native

  /** Reflects the src HTML attribute, containing the address of the content to be embedded. */
  var src: String = js.native

  /** Reflects the name HTML attribute, containing a name by which to refer to the frame. */
  var name: String = js.native

  /** Reflects the height HTML attribute, indicating the height of the frame. */
  var height: String = js.native
  var border: String = js.native

  /** The active document in the inline frame's nested browsing context. */
  def contentDocument: Document = js.native

  var security: js.Any = js.native
  var onload: js.Function1[Event, _] = js.native

  /** Reflects the sandbox HTML attribute, indicating extra restrictions on the behavior of the nested content. */
  var sandbox: DOMSettableTokenList = js.native
}
