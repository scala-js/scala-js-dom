/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGRect represents rectangular geometry. Rectangles are defined as consisting of a (x,y) coordinate pair
  * identifying a minimum X value, a minimum Y value, and a width and height, which are usually constrained to be
  * non-negative.
  */
@js.native
@JSGlobal
class SVGRect extends js.Object {

  /** The y coordinate of the rectangle, in user units. */
  var y: Double = js.native

  /** The width coordinate of the rectangle, in user units. */
  var width: Double = js.native

  /** The x coordinate of the rectangle, in user units. */
  var x: Double = js.native

  /** The height coordinate of the rectangle, in user units. */
  var height: Double = js.native
}
