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

/** The HTMLStyleElement interface represents a &lt;style&gt; element. It inherits properties and methods from its
  * parent, HTMLElement, and from LinkStyle.
  */
@js.native
@JSGlobal
abstract class HTMLStyleElement extends HTMLElement with LinkStyle {

  /** Is a DOMString representing the intended destination medium for style information. */
  var media: String = js.native

  /** Returns the type of the current style. */
  var `type`: String = js.native
}
