/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The DOM Storage mechanism is a means through which string key/value pairs can be securely stored and later retrieved
  * for use. The goal of this addition is to provide a comprehensive means through which interactive applications can be
  * built (including advanced abilities, such as being able to work "offline" for extended periods of time).
  */
@js.native
@JSGlobal
class Storage extends js.Object {
  var length: Int = js.native

  def getItem(key: String): String = js.native

  def setItem(key: String, data: String): Unit = js.native

  def clear(): Unit = js.native

  def removeItem(key: String): Unit = js.native

  def key(index: Int): String = js.native
}
