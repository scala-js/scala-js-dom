/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait ReadOnlyMapLike[K, V] extends js.Object {

  @JSBracketAccess
  def apply(index: K): V = js.native

  /** Returns a boolean indicating whether a value has been associated with the passed key in the Map object or not. */
  def has(key: K): Boolean = js.native

  def forEach(callbackFn: js.Function2[K, V, Unit]): Unit = js.native

  def size: Int = js.native

  def keys(): js.Iterator[K] = js.native

}
