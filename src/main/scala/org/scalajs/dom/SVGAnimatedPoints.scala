/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The SVGAnimatedPoints interface supports elements which have a points attribute which holds a list of coordinate
  * values and which support the ability to animate that attribute.
  */
@js.native
trait SVGAnimatedPoints extends js.Object {

  /** Provides access to the base (i.e., static) contents of the points attribute. */
  var points: SVGPointList = js.native

  /** Provides access to the current animated contents of the points attribute. If the given attribute or property is
    * being animated, contains the current animated value of the attribute or property. If the given attribute or
    * property is not currently being animated, contains the same value as points.
    */
  def animatedPoints: SVGPointList = js.native
}
