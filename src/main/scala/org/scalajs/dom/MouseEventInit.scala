/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait MouseEventInit extends UIEventInit with ModifierKeyEventInit {
  var screenX: js.UndefOr[Double] = js.undefined
  var pageX: js.UndefOr[Double] = js.undefined
  var pageY: js.UndefOr[Double] = js.undefined
  var clientY: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var relatedTarget: js.UndefOr[EventTarget] = js.undefined
  var button: js.UndefOr[Int] = js.undefined
  var buttons: js.UndefOr[Int] = js.undefined
  var clientX: js.UndefOr[Double] = js.undefined
}
