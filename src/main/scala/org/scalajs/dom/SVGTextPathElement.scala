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
abstract class SVGTextPathElement extends SVGTextContentElement with SVGURIReference {
  def startOffset: SVGAnimatedLength = js.native

  def method: SVGAnimatedEnumeration = js.native

  def spacing: SVGAnimatedEnumeration = js.native
}

@js.native
@JSGlobal
object SVGTextPathElement extends js.Object {

  val TEXTPATH_SPACINGTYPE_EXACT: Int = js.native
  val TEXTPATH_METHODTYPE_STRETCH: Int = js.native
  val TEXTPATH_SPACINGTYPE_AUTO: Int = js.native
  val TEXTPATH_SPACINGTYPE_UNKNOWN: Int = js.native
  val TEXTPATH_METHODTYPE_UNKNOWN: Int = js.native
  val TEXTPATH_METHODTYPE_ALIGN: Int = js.native
}
