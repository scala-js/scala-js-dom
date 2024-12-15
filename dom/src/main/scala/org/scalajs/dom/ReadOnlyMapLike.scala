/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Browser Map-like objects (or "maplike objects") are Web API interfaces that behave in many ways like a Map.
  *
  * Just like Map, entries can be iterated in the same order that they were added to the object. Map-like objects and
  * Map also have properties and methods that share the same name and behavior. However unlike Map they only allow
  * specific predefined types for the keys and values of each entry.
  */
@js.native
trait ReadOnlyMapLike[K, V] extends js.Iterable[js.Tuple2[K, V]] {

  @JSBracketAccess
  def apply(index: K): V = js.native

  /** Returns a boolean indicating whether a value has been associated with the passed key in the Map object or not. */
  def has(key: K): Boolean = js.native

  def forEach(callbackFn: js.Function2[V, K, Unit]): Unit = js.native

  def size: Int = js.native

  def keys(): js.Iterator[K] = js.native

  def entries(): js.Iterator[js.Tuple2[K, V]] = js.native

  def values(): js.Iterator[V] = js.native

  @JSName(js.Symbol.iterator)
  override def jsIterator(): js.Iterator[js.Tuple2[K, V]] = js.native

}
