/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** An object of this type can be obtained by calling the Window.performance read-only attribute.
  *
  * An object of this type can be obtained by calling the Window.performance read-only attribute.
  */
@js.native
@JSGlobal
class Performance private[this]() extends js.Object {

  /** The Performance.navigation read-only property returns a PerformanceNavigation object representing the type of
    * navigation that occurs in the given browsing context, like the amount of redirections needed to fetch the
    * resource.
    */
  def navigation: PerformanceNavigation = js.native

  /** The Performance.timing read-only property returns a PerformanceTiming object containing latency-related
    * performance information.
    */
  def timing: PerformanceTiming = js.native

  def getEntriesByType(entryType: String): js.Array[PerformanceEntry] = js.native

  /** Is a jsonizer returning a json object representing the Performance object. */
  def toJSON(): js.Dynamic = js.native

  def getMeasures(measureName: String = js.native): js.Dynamic = js.native

  def clearMarks(markName: String = js.native): Unit = js.native

  def getMarks(markName: String = js.native): js.Dynamic = js.native

  def clearResourceTimings(): Unit = js.native

  def mark(markName: String): Unit = js.native

  def measure(measureName: String, startMarkName: String = js.native, endMarkName: String = js.native): Unit = js.native

  def getEntriesByName(name: String, entryType: String = js.native): js.Array[PerformanceEntry] = js.native

  def getEntries(): js.Array[PerformanceEntry] = js.native

  def clearMeasures(measureName: String = js.native): Unit = js.native

  def setResourceTimingBufferSize(maxSize: Int): Unit = js.native

  /** Returns a DOMHighResTimeStamp representing the amount of milliseconds elapsed since the start of the navigation,
    * as give by PerformanceTiming.navigationStart to the call of the method.
    */
  def now(): Double = js.native
}
