/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.{MediaSource, MediaStream}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The HTMLMetaElement interface contains descriptive metadata about a document. Itt inherits all of the properties and
  * methods described in the HTMLElement interface.
  */
@js.native
@JSGlobal
abstract class HTMLMetaElement extends HTMLElement {

  /** Gets or sets the name of an HTTP response header to define for a document. */
  var httpEquiv: String = js.native

  /** Gets or sets the name of a meta-data property to define for a document. */
  var name: String = js.native

  /** Gets or sets the value of meta-data property. */
  var content: String = js.native
  var url: String = js.native

  var charset: String = js.native
}
