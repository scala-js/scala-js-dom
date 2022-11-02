/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** A frozen array type is a parameterized type whose values are references to objects that hold a fixed length array of
  * unmodifiable values. The values in the array are of type T.
  *
  * Since FrozenArray<T> values are references, they are unlike sequence types, which are lists of values that are
  * passed by value.
  */
@js.native
trait FrozenArray[+T] extends js.Iterable[T] {
  val length: Int = js.native

  @js.annotation.JSBracketAccess
  def apply(index: Int): T = js.native
}
