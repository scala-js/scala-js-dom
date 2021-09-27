/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The ErrorEvent interface represents events providing information related to errors in scripts or in files. */
@js.native
trait ErrorEvent extends Event {
  def colno: Int = js.native

  /** Is a DOMString containing the name of the script file in which the error occurred. */
  def filename: String = js.native

  /** Is an integer containing the line number of the script file on which the error occurred. */
  def lineno: Int = js.native

  /** Is a DOMString containing a human-readable error message describing the problem. */
  def message: String = js.native
}
