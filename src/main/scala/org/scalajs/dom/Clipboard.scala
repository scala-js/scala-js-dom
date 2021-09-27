/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The Clipboard interface implements the Clipboard API, providing—if the user grants permission—both read and write
  * access to the contents of the system clipboard. The Clipboard API can be used to implement cut, copy, and paste
  * features within a web application.
  *
  * The system clipboard is exposed through the global Navigator.clipboard property
  *
  * Clipboard is based on the EventTarget interface, and includes its methods.
  */
@js.native
trait Clipboard extends EventTarget {

  /** The read() method of the Clipboard interface requests a copy of the clipboard's contents, delivering the data to
    * the returned Promise when the promise is resolved. Unlike readText(), the read() method can return arbitrary data,
    * such as images.
    *
    * To read from the clipboard, you must first have the "clipboard-read" permission.
    */
  def read(): js.Promise[DataTransfer] = js.native

  /** The readText() method returns a Promise which resolves with a copy of the textual contents of the system
    * clipboard.
    */
  def readText(): js.Promise[String] = js.native

  /** The write() method writes arbitrary data, such as images, to the clipboard. This can be used to implement cut and
    * copy functionality.
    *
    * Before you can write to the clipboard, you need to use the Permissions API to get the "clipboard-write"
    * permission.
    */
  def write(data: DataTransfer): js.Promise[Unit] = js.native

  /** The writeText() method writes the specified text string to the system clipboard. */
  def writeText(newClipText: String): js.Promise[Unit] = js.native
}
