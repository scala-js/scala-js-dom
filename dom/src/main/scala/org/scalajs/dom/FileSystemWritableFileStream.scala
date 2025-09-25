/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The FileSystemWritableFileStream interface of the File System API is a WritableStream object with additional
  * convenience methods, which operates on a single file on disk. The interface is accessed through the
  * FileSystemFileHandle.createWritable() method.
  */
@js.native
trait FileSystemWritableFileStream extends js.Object {

  /** The write() method of the FileSystemWritableFileStream interface writes content into the file the method is called
    * on, at the current file cursor offset.
    *
    * No changes are written to the actual file on disk until the stream has been closed. Changes are typically written
    * to a temporary file instead. This method can also be used to seek to a byte point within the stream and truncate
    * to modify the total bytes the file contains.
    *
    * @param data
    *   Can be one of the following:
    *   - The file data to write, in the form of an ArrayBuffer, TypedArray, DataView, Blob, or string.
    *   - A WriteParams object.
    *
    * @return
    *   A Promise that returns undefined.
    */
  def write(data: BufferSource): js.Promise[Unit] = js.native

  def write(data: Blob): js.Promise[Unit] = js.native

  def write(data: String): js.Promise[Unit] = js.native

  def write(data: WriteParams): js.Promise[Unit] = js.native

  /** The seek() method of the FileSystemWritableFileStream interface updates the current file cursor offset to the
    * position (in bytes) specified when calling the method.
    *
    * @param position
    *   A number specifying the byte position from the beginning of the file.
    *
    * @return
    *   A Promise that returns undefined.
    */
  def seek(position: Double): js.Promise[Unit] = js.native

  /** The truncate() method of the FileSystemWritableFileStream interface resizes the file associated with the stream to
    * the specified size in bytes.
    *
    * If the size specified is larger than the current file size the file is padded with 0x00 bytes.
    *
    * The file cursor is also updated when truncate() is called. If the offset is smaller than the size, it remains
    * unchanged. If the offset is larger than size, the offset is set to that size. This ensures that subsequent writes
    * do not error.
    *
    * No changes are written to the actual file on disk until the stream has been closed. Changes are typically written
    * to a temporary file instead.
    *
    * @param size
    *   A number specifying the number of bytes to resize the stream to.
    *
    * @return
    *   A Promise that returns undefined.
    */
  def truncate(size: Double): js.Promise[Unit] = js.native
}
