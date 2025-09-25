/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The FileSystemSyncAccessHandle interface of the File System API represents a synchronous handle to a file system
  * entry.
  *
  * This class is only accessible inside dedicated Web Workers (so that its methods do not block execution on the main
  * thread) for files within the origin private file system, which is not visible to end-users.
  *
  * As a result, its methods are not subject to the same security checks as methods running on files within the
  * user-visible file system, and so are much more performant. This makes them suitable for significant, large-scale
  * file updates such as SQLite database modifications.
  *
  * The interface is accessed through the FileSystemFileHandle.createSyncAccessHandle() method.
  */
@js.native
trait FileSystemSyncAccessHandle extends js.Object {

  /** The close() method of the FileSystemSyncAccessHandle interface closes an open synchronous file handle, disabling
    * any further operations on it and releasing the exclusive lock previously put on the file associated with the file
    * handle.
    */
  def close(): Unit = js.native

  /** The flush() method of the FileSystemSyncAccessHandle interface persists any changes made to the file associated
    * with the handle via the write() method to disk.
    *
    * Bear in mind that you only need to call this method if you need the changes committed to disk at a specific time,
    * otherwise you can leave the underlying operating system to handle this when it sees fit, which should be OK in
    * most cases.
    */
  def flush(): Unit = js.native

  /** The getSize() method of the FileSystemSyncAccessHandle interface returns the size of the file associated with the
    * handle in bytes.
    */
  def getSize(): Double = js.native

  /** The read() method of the FileSystemSyncAccessHandle interface reads the content of the file associated with the
    * handle into a specified buffer, optionally at a given offset.
    *
    * @param buffer
    *   An ArrayBuffer or ArrayBufferView (such as a DataView) representing the buffer that the file content should be
    *   read into. Note that you cannot directly manipulate the contents of an ArrayBuffer. Instead, you create one of
    *   the typed array objects like an Int8Array or a DataView object which represents the buffer in a specific format,
    *   and use that to read and write the contents of the buffer.
    * @param options
    *   An options object.
    *
    * @return
    *   A number representing the number of bytes read from the file.
    */
  def read(buffer: BufferSource, options: js.UndefOr[FileSystemReadWriteOptions] = js.native): Double = js.native

  /** The truncate() method of the FileSystemSyncAccessHandle interface resizes the file associated with the handle to a
    * specified number of bytes.
    *
    * @param newSize
    *   The number of bytes to resize the file to.
    */
  def truncate(newSize: Double): Unit = js.native

  /** The write() method of the FileSystemSyncAccessHandle interface writes the content of a specified buffer to the
    * file associated with the handle, optionally at a given offset.
    *
    * Files within the origin private file system are not visible to end-users, therefore are not subject to the same
    * security checks as methods running on files within the user-visible file system. As a result, writes performed
    * using FileSystemSyncAccessHandle.write() are much more performant. This makes them suitable for significant,
    * large-scale file updates such as SQLite database modifications.
    *
    * @param buffer
    *   An ArrayBuffer or ArrayBufferView (such as a DataView) representing the buffer to be written to the file.
    * @param options
    *   An options object.
    *
    * @return
    *   A number representing the number of bytes written to the file.
    */
  def write(buffer: BufferSource, options: js.UndefOr[FileSystemReadWriteOptions] = js.native): Double = js.native
}
