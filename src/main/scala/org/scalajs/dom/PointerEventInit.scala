/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait PointerEventInit extends MouseEventInit {

  /** Sets value of MouseEvent.pointerId. Defaults to 0. */
  var pointerId: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.width. Defaults to 1. */
  var width: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.height. Defaults to 0. */
  var height: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.pressure. Defaults to 0. */
  var pressure: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.tangentialPressure. Defaults to 0. */
  var tangentialPressure: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.tiltX. Defaults to 0. */
  var tiltX: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.tiltY. Defaults to 0. */
  var tiltY: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.twist. Defaults to 0. */
  var twist: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.pointerType. Defaults to 0. */
  var pointerType: js.UndefOr[String] = js.undefined

  /** Sets value of MouseEvent.isPrimary. Defaults to 0. */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
}
