/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait IDBVersionChangeEventInit extends EventInit {
  var newVersion: js.UndefOr[java.lang.Double] = js.undefined
  var oldVersion: js.UndefOr[Double] = js.undefined
}
