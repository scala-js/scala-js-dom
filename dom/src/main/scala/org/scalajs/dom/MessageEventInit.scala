/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait MessageEventInit extends EventInit {
  var source: js.UndefOr[Window] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[Any] = js.undefined
}
