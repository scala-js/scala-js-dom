/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGLength interface correspond to the &lt;length&gt; basic data type. */
@js.native
@JSGlobal
class SVGLength extends js.Object {

  /** The value as a string value, in the units expressed by unitType. Setting this attribute will cause value,
    * valueInSpecifiedUnits and unitType to be updated automatically to reflect this setting. Exceptions on setting: a
    * DOMException with code SYNTAX_ERR is raised if the assigned string cannot be parsed as a valid &lt;length&gt;. a
    * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only attribute
    * or when the object itself is read only.
    */
  var valueAsString: String = js.native

  /** The value as a floating point value, in the units expressed by unitType. Setting this attribute will cause value
    * and valueAsString to be updated automatically to reflect this setting. Exceptions on setting: a DOMException with
    * code NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only attribute or when the object
    * itself is read only.
    */
  var valueInSpecifiedUnits: Double = js.native

  /** The value as a floating point value, in user units. Setting this attribute will cause valueInSpecifiedUnits and
    * valueAsString to be updated automatically to reflect this setting. Exceptions on setting: a DOMException with code
    * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only attribute or when the object
    * itself is read only.
    */
  var value: Double = js.native

  /** The type of the value as specified by one of the SVG_LENGTHTYPE_* constants defined on this interface. */
  def unitType: Int = js.native

  /** Reset the value as a number with an associated unitType, thereby replacing the values for all of the attributes on
    * the object. Exceptions: a DOMException with code NOT_SUPPORTED_ERR is raised if unitType is SVG_LENGTHTYPE_UNKNOWN
    * or not a valid unit type constant (one of the other SVG_LENGTHTYPE_* constants defined on this interface). a
    * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only attribute
    * or when the object itself is read only.
    */
  def newValueSpecifiedUnits(unitType: Int, valueInSpecifiedUnits: Double): Unit = js.native

  /** Preserve the same underlying stored value, but reset the stored unit identifier to the given unitType. Object
    * attributes unitType, valueInSpecifiedUnits and valueAsString might be modified as a result of this method. For
    * example, if the original value were "0.5cm" and the method was invoked to convert to millimeters, then the
    * unitType would be changed to SVG_LENGTHTYPE_MM, valueInSpecifiedUnits would be changed to the numeric value 5 and
    * valueAsString would be changed to "5mm".
    */
  def convertToSpecifiedUnits(unitType: Int): Unit = js.native
}

/** The SVGLength interface correspond to the &lt;length&gt; basic data type. */
@js.native
@JSGlobal
object SVGLength extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLength),List())))) */
  val SVG_LENGTHTYPE_NUMBER: Int = js.native
  val SVG_LENGTHTYPE_CM: Int = js.native
  val SVG_LENGTHTYPE_PC: Int = js.native
  val SVG_LENGTHTYPE_PERCENTAGE: Int = js.native
  val SVG_LENGTHTYPE_MM: Int = js.native
  val SVG_LENGTHTYPE_PT: Int = js.native
  val SVG_LENGTHTYPE_IN: Int = js.native
  val SVG_LENGTHTYPE_EMS: Int = js.native
  val SVG_LENGTHTYPE_PX: Int = js.native

  /** The unit type is not one of predefined unit types. It is invalid to attempt to define a new value of this type or
    * to attempt to switch an existing value to this type.
    */
  val SVG_LENGTHTYPE_UNKNOWN: Int = js.native
  val SVG_LENGTHTYPE_EXS: Int = js.native
}
