/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The DOMException interface represents an anormal event happening when a method or a property is used. */
@js.native
@JSGlobal
class DOMException extends js.Object {

  /** Returns a DOMString representing a message or description associated with the given error name. */
  def message: String = js.native

  /** Returns a DOMString that contains one of the strings associated with an error name. */
  def name: String = js.native
}

@js.native
@JSGlobal
object DOMException extends js.Object {

  val INDEX_SIZE_ERR: Int = js.native
  val DOMSTRING_SIZE_ERR: Int = js.native
  val HIERARCHY_REQUEST_ERR: Int = js.native
  val WRONG_DOCUMENT_ERR: Int = js.native
  val INVALID_CHARACTER_ERR: Int = js.native
  val NO_DATA_ALLOWED_ERR: Int = js.native
  val NO_MODIFICATION_ALLOWED_ERR: Int = js.native
  val NOT_FOUND_ERR: Int = js.native
  val NOT_SUPPORTED_ERR: Int = js.native
  val INUSE_ATTRIBUTE_ERR: Int = js.native
  val INVALID_STATE_ERR: Int = js.native
  val SYNTAX_ERR: Int = js.native
  val INVALID_MODIFICATION_ERR: Int = js.native
  val NAMESPACE_ERR: Int = js.native
  val INVALID_ACCESS_ERR: Int = js.native
  val VALIDATION_ERR: Int = js.native
  val TYPE_MISMATCH_ERR: Int = js.native
  val SECURITY_ERR: Int = js.native
  val NETWORK_ERR: Int = js.native
  val ABORT_ERR: Int = js.native
  val URL_MISMATCH_ERR: Int = js.native
  val QUOTA_EXCEEDED_ERR: Int = js.native
  val TIMEOUT_ERR: Int = js.native
  val INVALID_NODE_TYPE_ERR: Int = js.native
  val DATA_CLONE_ERR: Int = js.native
}
