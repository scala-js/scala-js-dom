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

/** The console object provides access to the browser's debugging console. The specifics of how it works vary from
  * browser to browser, but there is a de facto set of features that are typically provided.
  */
@js.native
trait Console extends js.Object {

  /** Outputs an informational message to the Web Console. In Firefox, a small "i" icon is displayed next to these items
    * in the Web Console's log.
    */
  def info(message: Any, optionalParams: Any*): Unit = js.native

  def profile(reportName: String = js.native): Unit = js.native

  def assert(test: Boolean, message: String, optionalParams: Any*): Unit = js.native

  def clear(): Unit = js.native

  /** Displays an interactive list of the properties of the specified JavaScript object. The output is presented as a
    * hierarchical listing with disclosure triangles that let you see the contents of child objects.
    */
  def dir(value: Any, optionalParams: Any*): Unit = js.native

  /** Displays an interactive tree of the descendant elements of the specified XML/HTML element. If it is not possible
    * to display as an element the JavaScript Object view is shown instead. The output is presented as a hierarchical
    * listing of expandable nodes that let you see the contents of child nodes.
    */
  def dirxml(value: Any): Unit = js.native

  /** Outputs a warning message. You may use string substitution and additional arguments with this method. See Using
    * string substitutions.
    */
  def warn(message: Any, optionalParams: Any*): Unit = js.native

  /** Outputs an error message. You may use string substitution and additional arguments with this method. See Using
    * string substitutions.
    */
  def error(message: Any, optionalParams: Any*): Unit = js.native

  /** For general output of logging information. You may use string substitution and additional arguments with this
    * method. See Using string substitutions.
    */
  def log(message: Any, optionalParams: Any*): Unit = js.native

  /** Outputs a debug message. You may use string substitution and additional arguments with this method. See Using
    * string substitutions.
    */
  def debug(message: Any, optionalParams: Any*): Unit = js.native

  /** Displays tabular data as a table.
    *
    * This function takes one mandatory argument data, which must be an array or an object, and one additional optional
    * parameter columns.
    *
    * It logs data as a table. Each element in the array (or enumerable property if data is an object) will be a row in
    * the table.
    *
    * The first column in the table will be labeled (index). If data is an array, then its values will be the array
    * indices. If data is an object, then its values will be the property names. Note that (in Firefox) console.table is
    * limited to displaying 1000 rows (first row is the labeled index).
    */
  def table(data: js.Object | js.Array[_], columns: js.UndefOr[Int] = js.native): Unit = js.native

  /** Outputs a stack trace to the Web Console. */
  def trace(): Unit = js.native

  def profileEnd(): Unit = js.native

  /** Starts a timer you can use to track how long an operation takes. You give each timer a unique name, and may have
    * up to 10,000 timers running on a given page. When you call console.timeEnd() with the same name, the browser will
    * output the time, in milliseconds, that elapsed since the timer was started.
    */
  def time(label: String): Unit = js.native

  /** Stops a timer that was previously started by calling console.time(). */
  def timeEnd(label: String): Unit = js.native

  /** Logs the number of times that this particular call to count() has been called. This function takes an optional
    * argument label.
    */
  def count(label: String = js.native): Unit = js.native

  /** Resets the counter. This function takes an optional argument label. */
  def countReset(label: String = js.native): Unit = js.native

  /** Creates a new inline group in the Web Console log. This indents following console messages by an additional level,
    * until console.groupEnd() is called.
    */
  def group(label: js.UndefOr[String] = js.native): Unit = js.native

  /** Creates a new inline group in the Web Console. Unlike console.group(), however, the new group is created
    * collapsed. The user will need to use the disclosure button next to it to expand it, revealing the entries created
    * in the group.
    *
    * Call console.groupEnd() to back out to the parent group.
    */
  def groupCollapsed(label: js.UndefOr[String] = js.native): Unit = js.native

  /** Exits the current inline group in the Web Console. */
  def groupEnd(): Unit = js.native
}
