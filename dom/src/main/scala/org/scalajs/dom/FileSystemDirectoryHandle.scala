/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The FileSystemDirectoryHandle interface of the File System API provides a handle to a file system directory. */
@js.native
trait FileSystemDirectoryHandle extends FileSystemHandle {

  /** The getDirectoryHandle() method of the FileSystemDirectoryHandle interface returns a FileSystemDirectoryHandle for
    * a subdirectory with the specified name within the directory handle on which the method is called.
    *
    * @param name
    *   A string representing the FileSystemHandle.name of the file you wish to retrieve.
    * @param options
    *   An optional object containing options for the retrieved subdirectory.
    *
    * @return
    *   A Promise which resolves with a FileSystemDirectoryHandle.
    */
  def getDirectoryHandle(name: String,
      options: js.UndefOr[FileSystemGetDirectoryOptions] = js.native): js.Promise[FileSystemDirectoryHandle] = js.native

  /** The getFileHandle() method of the FileSystemDirectoryHandle interface returns a FileSystemFileHandle for a file
    * with the specified name, within the directory the method is called.
    *
    * @param name
    *   A string representing the FileSystemHandle.name of the subdirectory you wish to retrieve.
    * @param options
    *   An object.
    *
    * @return
    *   A Promise which resolves with a FileSystemFileHandle.
    */
  def getFileHandle(name: String,
      options: js.UndefOr[FileSystemGetFileOptions] = js.native): js.Promise[FileSystemFileHandle] = js.native

  /** The removeEntry() method of the FileSystemDirectoryHandle interface attempts to remove an entry if the directory
    * handle contains a file or directory called the name specified.
    *
    * @param name
    *   A string representing the FileSystemHandle.name of the entry you wish to remove.
    * @param options
    *   An optional object containing options
    *
    * @return
    *   A Promise which resolves with undefined.
    */
  def removeEntry(name: String, options: js.UndefOr[FileSystemRemoveOptions] = js.native): js.Promise[Unit] = js.native

  /** The resolve() method of the FileSystemDirectoryHandle interface returns an Array of directory names from the
    * parent handle to the specified child entry, with the name of the child entry as the last array item.
    *
    * @param possibleDescendant
    *   The FileSystemHandle from which to return the relative path.
    *
    * @return
    *   A Promise which resolves with an Array of strings, or null if possibleDescendant is not a descendant of this
    *   FileSystemDirectoryHandle.
    */
  def resolve(possibleDescendant: FileSystemHandle): js.Promise[js.Array[String]] = js.native
}
