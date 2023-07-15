package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The [[Path2D]] interface of the Canvas 2D API is used to declare a path that can then be used on a
  * [[CanvasRenderingContext2D]] object. The path methods of the [[CanvasRenderingContext2D]] interface are also present
  * on this interface, which gives you the convenience of being able to retain and replay your path whenever desired.
  */
@js.native
@JSGlobal
class Path2D extends js.Object {

  /** Adds a path to the current path. */
  def addPath(path: Path2D): Unit = js.native

  /** Causes the point of the pen to move back to the start of the current sub-path. It tries to draw a straight line
    * from the current point to the start. If the shape has already been closed or has only one point, this function
    * does nothing.
    */
  def closePath(): Unit = js.native

  /** Moves the starting point of a new sub-path to the (x, y) coordinates. */
  def moveTo(x: Double, y: Double): Unit = js.native

  /** Connects the last point in the subpath to the (x, y) coordinates with a straight line. */
  def lineTo(x: Double, y: Double): Unit = js.native

  /** Adds a cubic Bézier curve to the path. It requires three points. The first two points are control points and the
    * third one is the end point. The starting point is the last point in the current path, which can be changed using
    * moveTo() before creating the Bézier curve.
    */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native

  /** Adds a quadratic Bézier curve to the current path. */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native

  /** Adds a circular arc to the path with the given control points and radius, connected to the previous point by a
    * straight line.
    */
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native

  /** The arc() method creates a circular arc centered at (x, y) with a radius of radius. The path starts at startAngle,
    * ends at endAngle, and travels in the direction given by counterclockwise (defaulting to clockwise).
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double,
      counterclockwise: Boolean): Unit = js.native

  /** The arc() method creates a circular arc centered at (x, y) with a radius of radius. The path starts at startAngle,
    * ends at endAngle, and travels in the direction given by counterclockwise (defaulting to clockwise).
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native

  /** The ellipse() method creates an elliptical arc centered at (x, y) with the radii radiusX and radiusY. The path
    * starts at startAngle and ends at endAngle, and travels in the direction given by counterclockwise (defaulting to
    * clockwise).
    */
  def ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double,
      endAngle: Double, counterclockwise: Boolean = js.native): Unit = js.native

  /** Creates a path for a rectangle at position (x, y) with a size that is determined by width and height. */
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

}
