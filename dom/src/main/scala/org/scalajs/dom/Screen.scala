/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class Screen extends js.Object {

  /** Note that not all of the width given by this property may be available to the window itself. When other widgets
    * occupy space that cannot be used by the window object, there is a difference in window.screen.width and
    * window.screen.availWidth. See also window.screen.height.
    */
  def width: Double = js.native

  /** Returns the amount of vertical space available to the window on the screen. */
  def availHeight: Double = js.native

  /** Returns the height of the screen in pixels. */
  def height: Double = js.native

  /** Returns the color depth of the screen. */
  def colorDepth: Int = js.native

  /** Returns the amount of horizontal space in pixels available to the window. */
  def availWidth: Double = js.native

  /** Returns the bit depth of the screen. */
  def pixelDepth: Int = js.native
}
