/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio attribute, which is available for some
  * of SVG's elements.
  */
@js.native
@JSGlobal
class SVGPreserveAspectRatio extends js.Object {

  /** The type of the alignment value as specified by one of the SVG_PRESERVEASPECTRATIO_* constants defined on this
    * interface.
    */
  var align: Int = js.native

  /** The type of the meet-or-slice value as specified by one of the SVG_MEETORSLICE_* constants defined on this
    * interface.
    */
  var meetOrSlice: Int = js.native
}

/** The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio attribute, which is available for some
  * of SVG's elements.
  */
@js.native
@JSGlobal
object SVGPreserveAspectRatio extends js.Object {

  val SVG_PRESERVEASPECTRATIO_NONE: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMID: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMAX: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Int = js.native

  /** The enumeration was set to a value that is not one of predefined types. It is invalid to attempt to define a new
    * value of this type or to attempt to switch an existing value to this type.
    */
  val SVG_MEETORSLICE_UNKNOWN: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMID: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMIN: Int = js.native

  /** Corresponds to value meet for attribute preserveAspectRatio. */
  val SVG_MEETORSLICE_MEET: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMID: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Int = js.native

  /** Corresponds to value slice for attribute preserveAspectRatio. */
  val SVG_MEETORSLICE_SLICE: Int = js.native
  val SVG_PRESERVEASPECTRATIO_UNKNOWN: Int = js.native
}
