/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class PerformanceResourceTiming extends PerformanceEntry {
  def redirectStart: Int = js.native

  def redirectEnd: Int = js.native

  def domainLookupEnd: Int = js.native

  def responseStart: Int = js.native

  def domainLookupStart: Int = js.native

  def fetchStart: Int = js.native

  def requestStart: Int = js.native

  def connectEnd: Int = js.native

  def connectStart: Int = js.native

  def initiatorType: String = js.native

  var responseEnd: Int = js.native
}
