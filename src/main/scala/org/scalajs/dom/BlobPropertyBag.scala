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

trait BlobPropertyBag extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined

  var endings: js.UndefOr[String] = js.undefined
}

@deprecated("all members of BlobPropertyBag are deprecated", "2.0.0")
object BlobPropertyBag {

  @deprecated("use `new BlobPropertyBag { ... }` instead", "2.0.0")
  @inline
  def apply(`type`: js.UndefOr[String] = js.undefined): BlobPropertyBag = {
    val result = js.Dynamic.literal()
    `type`.foreach(result.`type` = _)
    result.asInstanceOf[BlobPropertyBag]
  }
}
