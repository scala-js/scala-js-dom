/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** An object of this type is returned by the files property of the HTML input element; this lets you access the list of
  * files selected with the &lt;input type="file"&gt; element. It's also used for a list of files dropped into web
  * content when using the drag and drop API; see the DataTransfer object for details on this usage.
  */
@js.native
@JSGlobal
class FileList private[this] () extends DOMList[File] {
  def item(index: Int): File = js.native
}
