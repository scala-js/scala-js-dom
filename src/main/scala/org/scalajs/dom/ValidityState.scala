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

/** The DOM ValidityState interface represents the validity states that an element can be in, with respect to constraint
  * validation. Together, they help explain why an element's value fails to validate, if it's not valid.
  */
@js.native
trait ValidityState extends js.Object {

  /** The element's custom validity message has been set to a non-empty string by calling the element's
    * setCustomValidity() method.
    */
  def customError: Boolean = js.native

  /** The element has a required attribute, but no value. */
  def valueMissing: Boolean = js.native

  /** The value does not fit the rules determined by the step attribute (that is, it's not evenly divisible by the step
    * value).
    */
  def stepMismatch: Boolean = js.native

  /** The value is less than the minimum specified by the min attribute. */
  def rangeUnderflow: Boolean = js.native

  /** The value is greater than the maximum specified by the max attribute. */
  def rangeOverflow: Boolean = js.native

  /** The value is not in the required syntax (when type is email or url). */
  def typeMismatch: Boolean = js.native

  /** The value does not match the specified pattern. */
  def patternMismatch: Boolean = js.native

  /** The value exceeds the specified maxlength for HTMLInputElement or HTMLTextAreaElement objects. Note: This will
    * never be true in Gecko, because elements' values are prevented from being longer than maxlength.
    */
  def tooLong: Boolean = js.native

  /** The element meets all constraint validations, and is therefore considered to be valid. */
  def valid: Boolean = js.native
}
