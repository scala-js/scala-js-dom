/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLProgressElement interface provides special properties and methods (beyond the regular HTMLElement interface
  * it also has available to it by inheritance) for manipulating the layout and presentation of &lt;progress&gt;
  * elements.
  */
@js.native
@JSGlobal
abstract class HTMLProgressElement extends HTMLElement {

  /** If the progress bar is an indeterminate progress bar, then this property return 0. Otherwise, it returns the
    * current value.
    */
  var value: Double = js.native

  /** This property reflect the content attribute of the same name, limited to numbers greater than zero. Its default
    * value is 1.0.
    */
  var max: Double = js.native

  /** If the progress bar is an indeterminate progress bar, then the position property return −1. Otherwise, it returns
    * the result of dividing the current value by the maximum value.
    */
  def position: Double = js.native
  var form: HTMLFormElement = js.native
}
