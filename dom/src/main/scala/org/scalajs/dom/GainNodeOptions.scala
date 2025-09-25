/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait GainNodeOptions extends js.Object {

  /** The amount of gain to apply. This parameter is a- rate and it's nominal range is (-∞,+∞). The default is 1 */
  var gain: js.UndefOr[Double] = js.undefined
}
