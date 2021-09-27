/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The IDBKeyRange interface of the IndexedDB API represents a continuous interval over some data type that is used for
  * keys. Records can be retrieved from object stores and indexes using keys or a range of keys. You can limit the range
  * using lower and upper bounds. For example, you can iterate over all values of a key between x and y.
  *
  * A key range can have a single value or a range with upper and lower bounds or endpoints. If the key range has both
  * upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be
  * open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain
  * range, you can use the following code constructs:
  */
@js.native
@JSGlobal
class IDBKeyRange extends js.Object {

  /** The upper bound of the key range (can be any type.) */
  def upper: IDBKey = js.native

  /** Returns false if the upper-bound value is included in the key range. */
  def upperOpen: Boolean = js.native

  /** The lower bound of the key range (can be any type.) */
  def lower: IDBKey = js.native

  /** Returns false if the lower-bound value is included in the key range. */
  def lowerOpen: Boolean = js.native
}

@js.native
@JSGlobal
object IDBKeyRange extends js.Object {

  /** The bounds can be open (that is, the bounds exclude the endpoint values) or closed (that is, the bounds include
    * the endpoint values). By default, the bounds are closed.
    */
  def bound(lower: IDBKey, upper: IDBKey, lowerOpen: Boolean = js.native,
      upperOpen: Boolean = js.native): IDBKeyRange = js.native

  /** This method may raise a DOMException of the following types: */
  def only(value: IDBValue): IDBKeyRange = js.native

  /** By default, it includes the lower endpoint value and is closed. */
  def lowerBound(bound: IDBKey, open: Boolean = js.native): IDBKeyRange = js.native

  /** By default, it includes the upper endpoint value and is closed. */
  def upperBound(bound: IDBKey, open: Boolean = js.native): IDBKeyRange = js.native
}
