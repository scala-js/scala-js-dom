package org.scalajs.dom

import org.scalajs.dom.webgl.RenderingContext
import scala.scalajs.js

/** see [[https://html.spec.whatwg.org/multipage/scripting.html#canvasproxy ¶4.12.4.1 Proxying canvases to workers]] in
  * whatwg html spec.
  */
@js.native
trait CanvasProxy extends js.Any {
  def setContext(context: RenderingContext): Unit = js.native
}
