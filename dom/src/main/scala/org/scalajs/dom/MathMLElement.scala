package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The MathMLElement interface represents any MathML element. */
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

  var autofocus: Boolean = js.native
  var className: String = js.native
  var style: CSSStyleDeclaration = js.native
  var tabIndex: Int = js.native

}
