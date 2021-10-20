/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The TextMetrics interface represents the dimension of a text in the canvas, as created by the
  * CanvasRenderingContext2D.measureText() method.
  */
@js.native
@JSGlobal
class TextMetrics extends js.Object {

  /** Is a double giving the calculated width of a segment of inline text in CSS pixels. It takes into account the
    * current font of the context.
    */
  var width: Double = js.native
}
