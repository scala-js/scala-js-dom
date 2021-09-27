/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGAnimatedPreserveAspectRatio interface is used for attributes of type SVGPreserveAspectRatio which can be
  * animated.
  */
@js.native
@JSGlobal
class SVGAnimatedPreserveAspectRatio extends js.Object {

  /** A read only SVGPreserveAspectRatio representing the current animated value of the given attribute. If the given
    * attribute is not currently being animated, then the SVGPreserveAspectRatio will have the same contents as baseVal.
    * The object referenced by animVal is always distinct from the one referenced by baseVal, even when the attribute is
    * not animated.
    */
  def animVal: SVGPreserveAspectRatio = js.native

  /** The base value of the given attribute before applying any animations. */
  var baseVal: SVGPreserveAspectRatio = js.native
}
