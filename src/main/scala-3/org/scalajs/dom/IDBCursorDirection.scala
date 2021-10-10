/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

opaque type IDBCursorDirection = js.Any

object IDBCursorDirection {

  /** The cursor shows all records, including duplicates. It starts at the upper bound of the key range and moves
    * downwards (monotonically decreasing in the order of keys).
    */
  @inline def prev: IDBCursorDirection = "prev"

  /** The cursor shows all records, excluding duplicates. If multiple records exist with the same key, only the first
    * one iterated is retrieved. It starts at the upper bound of the key range and moves downwards.
    */
  @inline def prevunique: IDBCursorDirection = "prevunique"

  /** The cursor shows all records, including duplicates. It starts at the lower bound of the key range and moves
    * upwards (monotonically increasing in the order of keys).
    */
  @inline def next: IDBCursorDirection = "next"

  /** The cursor shows all records, excluding duplicates. If multiple records exist with the same key, only the first
    * one iterated is retrieved. It starts at the lower bound of the key range and moves upwards.
    */
  @inline def nextunique: IDBCursorDirection = "nextunique"
}
