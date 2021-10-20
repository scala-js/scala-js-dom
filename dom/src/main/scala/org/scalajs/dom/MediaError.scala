/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class MediaError extends js.Object {
  def code: Int = js.native
}

@js.native
@JSGlobal
object MediaError extends js.Object {
  val MEDIA_ERR_ABORTED: Int = js.native
  val MEDIA_ERR_NETWORK: Int = js.native
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Int = js.native
  val MEDIA_ERR_DECODE: Int = js.native
}
