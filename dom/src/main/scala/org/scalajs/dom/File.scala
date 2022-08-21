/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The File interface provides information about -- and access to the contents of -- files.
  *
  * These are generally retrieved from a FileList object returned as a result of a user selecting files using the input
  * element, or from a drag and drop operation's DataTransfer object.
  *
  * The file reference can be saved when the form is submitted while the user is offline, so that the data can be
  * retrieved and uploaded when the Internet connection is restored.
  */
@js.native
@JSGlobal
abstract class File(bits: js.Iterable[Any], name: String, options: FileOptions) extends Blob {

  /** The File.lastModified read-only property provides the last modified date of the file as the number of milliseconds
    * since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current
    * date.
    */
  def lastModified: Int = js.native

  /** The File.webkitRelativePath is a read-only property that contains a string which specifies the file's path
    * relative to the directory selected by the user in an <input> element with its webkitdirectory attribute set.
    *
    * @return
    *   A string containing the path of the file relative to the ancestor directory the user selected.
    */
  def webkitRelativePath: String = js.native
}

/** An options object containing optional attributes for the file. */
trait FileOptions extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
  var lastModified: js.UndefOr[Int] = js.undefined
}
