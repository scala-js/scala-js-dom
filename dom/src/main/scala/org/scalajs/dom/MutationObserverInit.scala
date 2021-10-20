/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** MutationObserverInit is an object which can specify the following properties: NOTE: At the very least, childList,
  * attributes, or characterDatamust be set to true. Otherwise, "An invalid or illegal string was specified" error is
  * thrown.
  */
trait MutationObserverInit extends js.Object {

  /** Set to true if additions and removals of the target node's child elements (including text nodes) are to be
    * observed.
    */
  var childList: js.UndefOr[Boolean] = js.undefined

  /** Set to true if mutations to target's attributes are to be observed. */
  var attributes: js.UndefOr[Boolean] = js.undefined

  /** Set to true if mutations to target's data are to be observed. */
  var characterData: js.UndefOr[Boolean] = js.undefined

  /** Set to true if mutations to not just target, but also target's descendants are to be observed. */
  var subtree: js.UndefOr[Boolean] = js.undefined

  /** Set to true if attributes is set to true and target's attribute value before the mutation needs to be recorded. */
  var attributeOldValue: js.UndefOr[Boolean] = js.undefined

  /** Set to true if characterData is set to true and target's data before the mutation needs to be recorded. */
  var characterDataOldValue: js.UndefOr[Boolean] = js.undefined

  /** Set to an array of attribute local names (without namespace) if not all attribute mutations need to be observed.
    */
  var attributeFilter: js.UndefOr[js.Array[String]] = js.undefined
}

/** Factory for [[MutationObserverInit]] objects. */
@deprecated("all members of MutationObserverInit are deprecated", "2.0.0")
object MutationObserverInit {

  /** Creates a new [[MutationObserverInit]] object with the given values. Default values for the `Boolean` parameters
    * are `false`. If the value of `attributeFilter` is `js.undefined`, created object won't have `attributeFilter`
    * property.
    */
  @deprecated("use `new MutationObserverInit { ... }` instead", "2.0.0")
  def apply(
      childList: Boolean = false, attributes: Boolean = false, characterData: Boolean = false, subtree: Boolean = false,
      attributeOldValue: Boolean = false, characterDataOldValue: Boolean = false,
      attributeFilter: js.UndefOr[js.Array[String]] = js.undefined
  ): MutationObserverInit = {
    val res = js.Dynamic
      .literal(
          "childList" -> childList,
          "attributes" -> attributes,
          "characterData" -> characterData,
          "subtree" -> subtree,
          "attributeOldValue" -> attributeOldValue,
          "characterDataOldValue" -> characterDataOldValue
      )
      .asInstanceOf[MutationObserverInit]
    attributeFilter.foreach(res.attributeFilter = _)
    res
  }
}
