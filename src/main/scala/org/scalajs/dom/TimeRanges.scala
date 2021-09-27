/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The TimeRanges interface is used to represent a set of time ranges, primarily for the purpose of tracking which
  * portions of media have been buffered when loading it for use by the &lt;audio&gt; and &lt;video&gt; elements.
  */
@js.native
@JSGlobal
class TimeRanges extends js.Object {

  /** Returns the number of ranges in the object. */
  def length: Int = js.native

  /** Returns the time for the start of the range with the specified index. */
  def start(index: Int): Double = js.native

  /** Returns the time offset at which a specified time range ends. */
  def end(index: Int): Double = js.native
}
