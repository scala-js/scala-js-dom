/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class SVGElementInstance extends EventTarget {
  def previousSibling: SVGElementInstance = js.native

  def parentNode: SVGElementInstance = js.native

  def lastChild: SVGElementInstance = js.native

  def nextSibling: SVGElementInstance = js.native

  def childNodes: SVGElementInstanceList = js.native

  def correspondingUseElement: SVGUseElement = js.native

  def correspondingElement: SVGElement = js.native

  def firstChild: SVGElementInstance = js.native
}
