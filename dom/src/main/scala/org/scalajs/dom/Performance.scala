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
class Performance private[this] () extends js.Object {

  /** The Performance.navigation read-only property returns a PerformanceNavigation object representing the type of
    * navigation that occurs in the given browsing context, like the amount of redirections needed to fetch the
    * resource.
    */
  def navigation: PerformanceNavigation = js.native

  /** The Performance.timing read-only property returns a PerformanceTiming object containing latency-related
    * performance information.
    */
  def timing: PerformanceTiming = js.native

  /** Returns an array of [[PerformanceEntry]] objects currently present in the performance timeline for a given type */
  def getEntriesByType(entryType: String): js.Array[PerformanceEntry] = js.native

  /** Is a jsonizer returning a json object representing the Performance object. */
  def toJSON(): js.Object = js.native

  @deprecated("No such API in the spec", "2.4.0")
  def getMeasures(measureName: String = js.native): js.Dynamic = js.native

  /** Removes all or specific [[PerformanceMark]] objects from the browser's performance timeline. */
  def clearMarks(markName: String = js.native): Unit = js.native

  @deprecated("No such API in the spec", "2.4.0")
  def getMarks(markName: String = js.native): js.Dynamic = js.native

  /** Removes all performance entries with an `entryType` of "resource" from the browser's performance timeline and sets
    * the size of the performance resource data buffer to zero.
    */
  def clearResourceTimings(): Unit = js.native

  /** Creates a named [[PerformanceMark]] object representing a high resolution timestamp marker in the browser's
    * performance timeline.
    */
  def mark(markName: String): PerformanceMark = js.native

  /** Creates a named [[PerformanceMeasure]] object representing a time measurement between two marks in the browser's
    * performance timeline.
    */
  def measure(measureName: String, startMarkName: String = js.native,
      endMarkName: String = js.native): PerformanceMeasure = js.native

  /** Returns an array of [[PerformanceEntry]] objects currently present in the performance timeline with the given name
    * and type.
    */
  def getEntriesByName(name: String, `type`: String = js.native): js.Array[PerformanceEntry] = js.native

  /** All [[PerformanceEntry]] objects currently present in the performance timeline. */
  def getEntries(): js.Array[PerformanceEntry] = js.native

  /** Removes all or specific [[PerformanceMeasure]] objects from the browser's performance timeline. */
  def clearMeasures(measureName: String = js.native): Unit = js.native

  /** sets the desired size of the browser's resource timing buffer which stores the "resource" performance entries. */
  def setResourceTimingBufferSize(maxSize: Int): Unit = js.native

  /** Returns a DOMHighResTimeStamp representing the amount of milliseconds elapsed since the start of the navigation,
    * as give by PerformanceTiming.navigationStart to the call of the method.
    */
  def now(): Double = js.native
}
