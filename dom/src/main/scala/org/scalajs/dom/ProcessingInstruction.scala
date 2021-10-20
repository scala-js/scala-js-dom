/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A processing instruction provides an opportunity for application-specific instructions to be embedded within XML and
  * which can be ignored by XML processors which do not support processing their instructions (outside of their having a
  * place in the DOM).
  */
@js.native
@JSGlobal
abstract class ProcessingInstruction extends Node {
  def target: String = js.native

  def data: String = js.native
}
