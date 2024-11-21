/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The FileSystemFileHandle interface of the File System API represents a handle to a file system entry. The interface
  * is accessed through the window.showOpenFilePicker() method.
  *
  * Note that read and write operations depend on file-access permissions that do not persist after a page refresh if no
  * other tabs for that origin remain open. The queryPermission method of the FileSystemHandle interface can be used to
  * verify permission state before accessing a file.
  */
@js.native
trait FileSystemFileHandle extends js.Object {

  /** The getFile() method of the FileSystemFileHandle interface returns a Promise which resolves to a File object
    * representing the state on disk of the entry represented by the handle.
    *
    * If the file on disk changes or is removed after this method is called, the returned File object will likely be no
    * longer readable.
    *
    * @return
    *   A Promise which resolves to a File object.
    */
  def getFile(): js.Promise[File] = js.native

  /** The createSyncAccessHandle() method of the FileSystemFileHandle interface returns a Promise which resolves to a
    * FileSystemSyncAccessHandle object that can be used to synchronously read from and write to a file. The synchronous
    * nature of this method brings performance advantages, but it is only usable inside dedicated Web Workers for files
    * within the origin private file system.
    *
    * Creating a FileSystemSyncAccessHandle takes an exclusive lock on the file associated with the file handle. This
    * prevents the creation of further FileSystemSyncAccessHandles or FileSystemWritableFileStreams for the file until
    * the existing access handle is closed.
    *
    * @return
    *   A Promise which resolves to a FileSystemSyncAccessHandle object.
    */
  def createSyncAccessHandle(): js.Promise[FileSystemSyncAccessHandle] = js.native

  /** The createWritable() method of the FileSystemFileHandle interface creates a FileSystemWritableFileStream that can
    * be used to write to a file. The method returns a Promise which resolves to this created stream.
    *
    * Any changes made through the stream won't be reflected in the file represented by the file handle until the stream
    * has been closed. This is typically implemented by writing data to a temporary file, and only replacing the file
    * represented by file handle with the temporary file when the writable filestream is closed.
    *
    * @param options
    *   An object.
    *
    * @return
    *   A Promise which resolves to a FileSystemWritableFileStream object.
    */
  def createWritable(
      options: js.UndefOr[FileSystemCreateWritableOptions] = js.native): js.Promise[FileSystemWritableFileStream] = js.native
}
