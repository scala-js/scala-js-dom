/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A clipboard item is conceptually data that the user has expressed a desire to make shareable by invoking a "cut" or
  * "copy" command
  */
@js.native
@JSGlobal
class ClipboardItem(items: js.Dictionary[ClipboardItemData], options: ClipboardItemOptions = js.native)
    extends js.Object {
  def presentationStyle: PresentationStyle = js.native

  /** Returns an Array of MIME types available within the ClipboardItem. */
  def types: FrozenArray[String] = js.native

  /** Returns a Promise that resolves with a Blob of the requested MIME type, or an error if the MIME type is not found.
    */
  def getType(`type`: String): js.Promise[Blob] = js.native

}
