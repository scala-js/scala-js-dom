/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

trait SVGZoomEventInit extends UIEventInit {
  var zoomRectScreen: js.UndefOr[SVGRect] = js.undefined
  var previousScale: js.UndefOr[Double] = js.undefined
  var newScale: js.UndefOr[Double] = js.undefined
  var previousTranslate: js.UndefOr[SVGPoint] = js.undefined
  var newTranslate: js.UndefOr[SVGPoint] = js.undefined
}
