/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The ShadowRoot interface of the Shadow DOM API is the root node of a DOM subtree that is rendered separately from a
  * document's main DOM tree.
  *
  * You can retrieve a reference to an element's shadow root using its Element.shadowRoot property, provided it was
  * created using Element.attachShadow() with the mode option set to open.
  */
@js.native
@JSGlobal
abstract class ShadowRoot extends DocumentFragment {

  /** Returns the Element within the shadow tree that has focus. */
  def activeElement: Element = js.native
}
