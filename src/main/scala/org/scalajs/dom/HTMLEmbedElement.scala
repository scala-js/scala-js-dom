/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLEmbedElement interface, which provides special properties (beyond the regular &lt;htmlelement&gt; interface
  * it also has available to it by inheritance) for manipulating &lt;embed&gt; elements.
  */
@js.native
@JSGlobal
abstract class HTMLEmbedElement extends HTMLElement with GetSVGDocument {

  /** Reflects the width HTML attribute, containing the displayed width of the resource. */
  var width: String = js.native

  /** Reflects the src HTML attribute, containing the address of the resource. */
  var src: String = js.native

  /** Reflects the height HTML attribute, containing the displayed height of the resource. */
  var height: String = js.native
}
