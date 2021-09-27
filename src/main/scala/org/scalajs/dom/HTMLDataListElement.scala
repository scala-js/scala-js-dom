/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLDataListElement interface provides special properties (beyond the HTMLElement object interface it also has
  * available to it by inheritance) to manipulate &lt;datalist&gt; elements and their content.
  */
@js.native
@JSGlobal
abstract class HTMLDataListElement extends HTMLElement {

  /** A collection of the contained option elements. */
  def options: HTMLCollection = js.native
}
