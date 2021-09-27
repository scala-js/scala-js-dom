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
class SVGPointList extends js.Object {
  def numberOfItems: Int = js.native

  def replaceItem(newItem: SVGPoint, index: Int): SVGPoint = js.native

  def getItem(index: Int): SVGPoint = js.native

  def clear(): Unit = js.native

  def appendItem(newItem: SVGPoint): SVGPoint = js.native

  def initialize(newItem: SVGPoint): SVGPoint = js.native

  def removeItem(index: Int): SVGPoint = js.native

  def insertItemBefore(newItem: SVGPoint, index: Int): SVGPoint = js.native
}
