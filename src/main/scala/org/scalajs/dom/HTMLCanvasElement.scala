/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.{MediaSource, MediaStream}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The HTMLCanvasElement interface provides properties and methods for manipulating the layout and presentation of
  * canvas elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement
  * interface.
  */
@js.native
@JSGlobal
abstract class HTMLCanvasElement extends HTMLElement {

  /** Reflects the width HTML attribute, specifying the width of the coordinate space in CSS pixels. */
  var width: Int = js.native

  /** Reflects the height HTML attribute, specifying the height of the coordinate space in CSS pixels. */
  var height: Int = js.native

  /** Returns a data: URL containing a representation of the image in the format specified by type (defaults to PNG).
    * The returned image is 96dpi. If the height or width of the canvas is 0, "data:," representing the empty string, is
    * returned. If the type requested is not image/png, and the returned value starts with data:image/png, then the
    * requested type is not supported. Chrome supports the image/webp type. If the requested type is image/jpeg or
    * image/webp, then the second argument, if it is between 0.0 and 1.0, is treated as indicating image quality; if the
    * second argument is anything else, the default value for image quality is used. Other arguments are ignored.
    */
  def toDataURL(`type`: String, args: js.Any*): String = js.native

  /** Returns a drawing context on the canvas, or null if the context ID is not supported. A drawing context lets you
    * draw on the canvas. Calling getContext with "2d" returns a CanvasRenderingContext2D object, whereas calling it
    * with "experimental-webgl" (or "webgl") returns a WebGLRenderingContext object. This context is only available on
    * browsers that implement WebGL.
    */
  def getContext(contextId: String, args: js.Any*): js.Dynamic = js.native
}
