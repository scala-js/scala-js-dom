/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The marker element defines the graphics that is to be used for drawing arrowheads or polymarkers on a given
  * &lt;path&gt; , &lt;line&gt; , &lt;polyline&gt; or &lt;polygon&gt; element.
  */
@js.native
@JSGlobal
abstract class SVGMarkerElement
    extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
  var orientType: SVGAnimatedEnumeration = js.native
  var markerUnits: SVGAnimatedEnumeration = js.native

  def markerWidth: SVGAnimatedLength = js.native

  def markerHeight: SVGAnimatedLength = js.native

  def orientAngle: SVGAnimatedAngle = js.native

  def refY: SVGAnimatedLength = js.native

  def refX: SVGAnimatedLength = js.native

  def setOrientToAngle(angle: SVGAngle): Unit = js.native

  def setOrientToAuto(): Unit = js.native
}

@js.native
@JSGlobal
object SVGMarkerElement extends js.Object {
  val SVG_MARKER_ORIENT_UNKNOWN: Int = js.native
  val SVG_MARKER_ORIENT_ANGLE: Int = js.native
  val SVG_MARKERUNITS_UNKNOWN: Int = js.native
  val SVG_MARKERUNITS_STROKEWIDTH: Int = js.native
  val SVG_MARKER_ORIENT_AUTO: Int = js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: Int = js.native
}
