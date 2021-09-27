/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGPathElement interface corresponds to the &lt;path&gt; element. */
@js.native
@JSGlobal
abstract class SVGPathElement
    extends SVGElement with SVGStylable with SVGAnimatedPathData with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired {

  /** Returns the index into pathSegList which is distance units along the path, utilizing the user agent's
    * distance-along-a-path algorithm.
    */
  def getPathSegAtLength(distance: Double): Int = js.native

  /** Returns the (x,y) coordinate in user space which is distance units along the path, utilizing the browser's
    * distance-along-a-path algorithm.
    */
  def getPointAtLength(distance: Double): SVGPoint = js.native

  /** Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticAbs object. Parameters: float x The absolute X
    * coordinate for the end point of this path segment. float y The absolute Y coordinate for the end point of this
    * path segment. float x1 The absolute X coordinate for the first control point. float y1 The absolute Y coordinate
    * for the first control point.
    */
  def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double,
      y1: Double): SVGPathSegCurvetoQuadraticAbs = js.native

  /** Returns a stand-alone, parentless SVGPathSegLinetoRel object. Parameters: float x The relative X coordinate for
    * the end point of this path segment. float y The relative Y coordinate for the end point of this path segment.
    */
  def createSVGPathSegLinetoRel(x: Double, y: Double): SVGPathSegLinetoRel = js.native

  /** Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticRel object. Parameters: float x The relative X
    * coordinate for the end point of this path segment. float y The relative Y coordinate for the end point of this
    * path segment. float x1 The relative X coordinate for the first control point. float y1 The relative Y coordinate
    * for the first control point.
    */
  def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double,
      y1: Double): SVGPathSegCurvetoQuadraticRel = js.native

  /** Returns a stand-alone, parentless SVGPathSegCurvetoCubicAbs object. Parameters: float x The absolute X coordinate
    * for the end point of this path segment. float y The absolute Y coordinate for the end point of this path segment.
    * float x1 The absolute X coordinate for the first control point. float y1 The absolute Y coordinate for the first
    * control point. float x2 The absolute X coordinate for the second control point. float y2 The absolute Y coordinate
    * for the second control point.
    */
  def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double, y1: Double, x2: Double,
      y2: Double): SVGPathSegCurvetoCubicAbs = js.native

  /** Returns a stand-alone, parentless SVGPathSegLinetoAbs object. Parameters: float x The absolute X coordinate for
    * the end point of this path segment. float y The absolute Y coordinate for the end point of this path segment.
    */
  def createSVGPathSegLinetoAbs(x: Double, y: Double): SVGPathSegLinetoAbs = js.native

  /** Returns a stand-alone, parentless SVGPathSegClosePath object. */
  def createSVGPathSegClosePath(): SVGPathSegClosePath = js.native

  /** Returns a stand-alone, parentless SVGPathSegCurvetoCubicRel object. Parameters: float x The relative X coordinate
    * for the end point of this path segment. float y The relative Y coordinate for the end point of this path segment.
    * float x1 The relative X coordinate for the first control point. float y1 The relative Y coordinate for the first
    * control point. float x2 The relative X coordinate for the second control point. float y2 The relative Y coordinate
    * for the second control point.
    */
  def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double, y1: Double, x2: Double,
      y2: Double): SVGPathSegCurvetoCubicRel = js.native

  /** Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticSmoothRel object. Parameters: float x The absolute X
    * coordinate for the end point of this path segment. float y The absolute Y coordinate for the end point of this
    * path segment.
    */
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double, y: Double): SVGPathSegCurvetoQuadraticSmoothRel = js.native

  /** Returns a stand-alone, parentless SVGPathSegMovetoRel object. Parameters: float x The relative X coordinate for
    * the end point of this path segment. float y The relative Y coordinate for the end point of this path segment.
    */
  def createSVGPathSegMovetoRel(x: Double, y: Double): SVGPathSegMovetoRel = js.native

  /** Returns a stand-alone, parentless SVGPathSegCurvetoCubicSmoothAbs object. Parameters float x The absolute X
    * coordinate for the end point of this path segment. float y The absolute Y coordinate for the end point of this
    * path segment. float x2 The absolute X coordinate for the second control point. float y2 The absolute Y coordinate
    * for the second control point.
    */
  def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double,
      y2: Double): SVGPathSegCurvetoCubicSmoothAbs = js.native

  /** Returns a stand-alone, parentless SVGPathSegMovetoAbs object. Parameters: float x The absolute X coordinate for
    * the end point of this path segment. float y The absolute Y coordinate for the end point of this path segment.
    */
  def createSVGPathSegMovetoAbs(x: Double, y: Double): SVGPathSegMovetoAbs = js.native

  /** Returns a stand-alone, parentless SVGPathSegLinetoVerticalRel object. Parameters: float y The relative Y
    * coordinate for the end point of this path segment.
    */
  def createSVGPathSegLinetoVerticalRel(y: Double): SVGPathSegLinetoVerticalRel = js.native

  /** Returns a stand-alone, parentless SVGPathSegArcRel object. Parameters: float x The relative X coordinate for the
    * end point of this path segment. float y The relative Y coordinate for the end point of this path segment. float r1
    * The x-axis radius for the ellipse. float r2 The y-axis radius for the ellipse. float angle The rotation angle in
    * degrees for the ellipse's x-axis relative to the x-axis of the user coordinate system. boolean largeArcFlag The
    * value of the large-arc-flag parameter. boolean sweepFlag The value of the large-arc-flag parameter.
    */
  def createSVGPathSegArcRel(x: Double, y: Double, r1: Double, r2: Double, angle: Double, largeArcFlag: Boolean,
      sweepFlag: Boolean): SVGPathSegArcRel = js.native

  /** Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticSmoothAbs object. Parameters: float x The absolute X
    * coordinate for the end point of this path segment. float y The absolute Y coordinate for the end point of this
    * path segment.
    */
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double, y: Double): SVGPathSegCurvetoQuadraticSmoothAbs = js.native

  /** Returns a stand-alone, parentless SVGPathSegLinetoHorizontalRel object. Parameters: float x The relative X
    * coordinate for the end point of this path segment.
    */
  def createSVGPathSegLinetoHorizontalRel(x: Double): SVGPathSegLinetoHorizontalRel = js.native

  def getTotalLength(): Double = js.native

  /** Returns a stand-alone, parentless SVGPathSegCurvetoCubicSmoothRel object. Parameters float x The absolute X
    * coordinate for the end point of this path segment. float y The absolute Y coordinate for the end point of this
    * path segment. float x2 The absolute X coordinate for the second control point. float y2 The absolute Y coordinate
    * for the second control point.
    */
  def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double,
      y2: Double): SVGPathSegCurvetoCubicSmoothRel = js.native

  /** Returns a stand-alone, parentless SVGPathSegLinetoHorizontalAbs object. Parameters: float x The absolute X
    * coordinate for the end point of this path segment.
    */
  def createSVGPathSegLinetoHorizontalAbs(x: Double): SVGPathSegLinetoHorizontalAbs = js.native

  /** Returns a stand-alone, parentless SVGPathSegLinetoVerticalAbs object. Parameters: float y The absolute Y
    * coordinate for the end point of this path segment.
    */
  def createSVGPathSegLinetoVerticalAbs(y: Double): SVGPathSegLinetoVerticalAbs = js.native

  /** Returns a stand-alone, parentless SVGPathSegArcAbs object. Parameters: float x The absolute X coordinate for the
    * end point of this path segment. float y The absolute Y coordinate for the end point of this path segment. float r1
    * The x-axis radius for the ellipse. float r2 The y-axis radius for the ellipse. float angle The rotation angle in
    * degrees for the ellipse's x-axis relative to the x-axis of the user coordinate system. boolean largeArcFlag The
    * value of the large-arc-flag parameter. boolean sweepFlag The value of the large-arc-flag parameter.
    */
  def createSVGPathSegArcAbs(x: Double, y: Double, r1: Double, r2: Double, angle: Double, largeArcFlag: Boolean,
      sweepFlag: Boolean): SVGPathSegArcAbs = js.native
}
