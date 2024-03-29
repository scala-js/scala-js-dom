/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.Uint8Array

/** An API for compressing a stream of data. */
@js.native
@JSGlobal
class CompressionStream(format: CompressionFormat) extends js.Object {
  def readable: ReadableStream[Uint8Array] = js.native
  def writable: WriteableStream[Uint8Array] = js.native
}
