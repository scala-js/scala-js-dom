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

/** The HTMLLIElement interface expose specific properties and methods (beyond those defined by regular HTMLElement
  * interface it also has available to it by inheritance) for manipulating list elements.
  */
@js.native
@JSGlobal
abstract class HTMLLIElement extends HTMLElement {

  /** Indicates the ordinal position of the list element inside a given &lt;ol&gt;. It reflects the value attribute of
    * the HTML &lt;li&gt; element, and can be smaller than 0. If the &lt;li&gt; element is not a child of an &lt;ol&gt;
    * element, the property has no meaning.
    */
  var value: Int = js.native
}
