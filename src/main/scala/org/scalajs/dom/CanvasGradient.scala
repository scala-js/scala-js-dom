/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The CanvasGradient interface represents an opaque object describing a gradient and returned by
  * CanvasRenderingContext2D.createLinearGradient or CanvasRenderingContext2D.createRadialGradient methods.
  */
@js.native
@JSGlobal
class CanvasGradient extends js.Object {

  /** Add a new stop, defined by an offset and a color, to the gradient. If the offset is not between 0 and 1 an
    * INDEX_SIZE_ERR is raised, if the color can't be parsed as a CSS &lt;color&gt;, a SYNTAX_ERR is raised.
    */
  def addColorStop(offset: Double, color: String): Unit = js.native
}
