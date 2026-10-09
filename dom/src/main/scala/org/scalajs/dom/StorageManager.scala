/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait StorageManager extends js.Object {
  def persisted(): js.Promise[Boolean] = js.native
  def persist(): js.Promise[Boolean] = js.native
  def estimate(): js.Promise[StorageEstimate] = js.native

  /** The getDirectory() method of the StorageManager interface is used to obtain a reference to a
    * FileSystemDirectoryHandle object allowing access to a directory and its contents, stored in the origin private
    * file system (OPFS).
    */
  def getDirectory(): js.Promise[FileSystemDirectoryHandle] = js.native
}
