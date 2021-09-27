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
abstract class File extends Blob {

  /** Returns the name of the file. For security reasons, the path is excluded from this property. */
  def name: String = js.native
}
