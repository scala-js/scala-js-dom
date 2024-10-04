package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The MathMLElement interface represents any MathML element.
  */
@js.native
@JSGlobal
abstract class MathMLElement extends Element {
  var onclick: js.Function1[MouseEvent, _] = js.native
  var onmouseover: js.Function1[MouseEvent, _] = js.native
  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var onmousemove: js.Function1[MouseEvent, _] = js.native
  var onload: js.Function1[Event, _] = js.native
  var onfocusin: js.Function1[FocusEvent, _] = js.native
  var onfocusout: js.Function1[FocusEvent, _] = js.native

  /** Corresponds to attribute xml:base on the given element. */
  var xmlbase: String = js.native


  var autofocus: Boolean = js.native
  var `class`: String = js.native
  var dir: String = js.native
  var displaystyle: Boolean = js.native
  var mathbackground: String = js.native
  var mathcolor: String = js.native
  var mathsize: String = js.native
  var nonce: String = js.native
  var scriptlevel: Int = js.native
  var style: String = js.native
  var tabindex: Int = js.native


  var intent: String = js.native
  var arg: String = js.native

}
