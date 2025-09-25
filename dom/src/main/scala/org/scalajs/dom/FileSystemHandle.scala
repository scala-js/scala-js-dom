/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The FileSystemHandle interface of the File System API is an object which represents a file or directory entry.
  * Multiple handles can represent the same entry. For the most part you do not work with FileSystemHandle directly but
  * rather its child interfaces FileSystemFileHandle and FileSystemDirectoryHandle.
  */
@js.native
trait FileSystemHandle extends js.Object {

  /** Returns the type of entry. This is 'file' if the associated entry is a file or 'directory'. */
  val kind: FileSystemHandleKind = js.native

  /** Returns the name of the associated entry. */
  def name: String = js.native

  /** The isSameEntry() method of the FileSystemHandle interface compares two handles to see if the associated entries
    * (either a file or directory) match.
    *
    * @param fileSystemHandle
    *   The FileSystemHandle to match against the handle on which the method is invoked.
    *
    * @return
    *   A Promise that fulfills with a Boolean.
    */
  def isSameEntry(fileSystemHandle: FileSystemHandle): js.Promise[Boolean] = js.native
}
