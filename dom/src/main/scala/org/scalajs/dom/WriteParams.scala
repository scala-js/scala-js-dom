/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

trait WriteParams extends js.Object {

  /** A string that is one of "write", "seek", or "truncate". */
  var `type`: WriteCommandType

  /** The file data to write. Can be an ArrayBuffer, TypedArray, DataView, Blob, or string. This property is required if
    * type is set to "write".
    */
  var data: js.UndefOr[BufferSource | Blob | String] = js.undefined

  /** The byte position the current file cursor should move to if type "seek" is used. Can also be set if type is
    * "write", in which case the write will start at the specified position.
    */
  var position: js.UndefOr[Double] = js.undefined

  /** A number representing the number of bytes the stream should contain. This property is required if type is set to
    * "truncate".
    */
  var size: js.UndefOr[Double] = js.undefined
}
