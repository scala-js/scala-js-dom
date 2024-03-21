/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The 2D rendering context for the drawing surface of a &lt;canvas&gt; element. To get this object, call getContext()
  * on a &lt;canvas&gt;, supplying "2d" as the argument:
  */
@js.native
@JSGlobal
class CanvasRenderingContext2D extends js.Object {

  /** Default 10 */
  var miterLimit: Double = js.native

  /** Default value 10px sans-serif */
  var font: String = js.native

  /** With globalAlpha applied this sets how shapes and images are drawn onto the existing bitmap. Possible values:
    * source-atop source-in source-out source-over (default) destination-atop destination-in destination-out
    * destination-over lighter darker copy xor
    */
  var globalCompositeOperation: String = js.native

  /** Type of endings on the end of lines. Possible values: butt (default), round, square */
  var lineCap: String = js.native

  /** Specifies where to start a dasharray on a line. */
  var lineDashOffset: Double = js.native

  /** Color of the shadow. Default fully-transparent black. */
  var shadowColor: String = js.native

  /** Defines the type of corners where two lines meet. Possible values: round, bevel, miter (default) */
  var lineJoin: String = js.native

  /** Horizontal distance the shadow will be offset. Default 0. */
  var shadowOffsetX: Double = js.native

  /** Width of lines. Default 1.0 */
  var lineWidth: Double = js.native

  /** Back-reference to the canvas element for which this context was created. Read only. */
  var canvas: HTMLCanvasElement = js.native

  /** A CSS color, a CanvasGradient or CanvasPattern, to use as a line around shapes. */
  var strokeStyle: js.Any = js.native

  /** Alpha value that is applied to shapes and images before they are composited onto the canvas. Default 1.0 (opaque).
    */
  var globalAlpha: Double = js.native

  /** Vertical distance the shadow will be offset. Default 0. */
  var shadowOffsetY: Double = js.native

  /** A CSS color, a CanvasGradient or CanvasPattern, to use as a fill. */
  var fillStyle: js.Any = js.native

  /** A CSS filter, which will be applied on the entire canvas. */
  var filter: String = js.native

  /** Specifies the blurring effect. Default 0 */
  var shadowBlur: Double = js.native

  /** Possible values: start (default), end, left, right or center. */
  var textAlign: String = js.native

  /** Possible values: top, hanging, middle, alphabetic (default), ideographic, bottom */
  var textBaseline: String = js.native

  /** A boolean value indicating whether to smooth scaled images or not. The default value is true. */
  var imageSmoothingEnabled: Boolean = js.native

  /** Restores the drawing style state to the last element on the 'state stack' saved by save(). */
  def restore(): Unit = js.native

  /** Resets the current transform to the identity matrix, and then invokes the transform() method with the same
    * arguments.
    */
  def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native

  /** Saves the current drawing style state using a stack so you can revert any change you make to it using restore().
    */
  def save(): Unit = js.native

  /** The arc() method creates a circular arc centered at (x, y) with a radius of radius. The path starts at startAngle,
    * ends at endAngle, and travels in the direction given by counterclockwise (defaulting to clockwise).
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double,
      counterclockwise: Boolean): Unit = js.native

  /** The arc() method creates a circular arc centered at (x, y) with a radius of radius. The path starts at startAngle,
    * ends at endAngle, and travels in the direction given by counterclockwise (defaulting to clockwise).
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native

  /** Returns a TextMetrics object. */
  def measureText(text: String): TextMetrics = js.native

  /** Reports whether or not the specified point is contained in the current path. */
  def isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule = js.native): Boolean = js.native

  /** Reports whether or not the specified point is contained in the current path. */
  def isPointInPath(path: Path2D, x: Double, y: Double): Boolean = js.native

  /** Reports whether or not the specified point is contained in the current path. */
  def isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule): Boolean = js.native

  /** Adds a quadratic Bézier curve to the current path. */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native

  /** Paints data from the given ImageData object onto the bitmap. If a dirty rectangle is provided, only the pixels
    * from that rectangle are painted.
    */
  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double = js.native, dirtyY: Double = js.native,
      dirtyWidth: Double = js.native, dirtyHeight: Double = js.native): Unit = js.native

  /** Adds a rotation to the transformation matrix. The angle argument represents a clockwise rotation angle and is
    * expressed in radians.
    */
  def rotate(angle: Double): Unit = js.native

  /** Draws (fills) a given text at the given (x, y) position. */
  def fillText(text: String, x: Double, y: Double, maxWidth: Double = js.native): Unit = js.native

  /** Moves the origin point of the context to (x, y). */
  def translate(x: Double, y: Double): Unit = js.native

  /** Adds a scaling transformation to the canvas units by x horizontally and by y vertically. */
  def scale(x: Double, y: Double): Unit = js.native

  /** Creates a radial gradient given by the coordinates of the two circles represented by the parameters. */
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double,
      r1: Double): CanvasGradient = js.native

  /** Connects the last point in the subpath to the x, y coordinates with a straight line. */
  def lineTo(x: Double, y: Double): Unit = js.native

  /** Returns a dash list array containing an even number of non-negative numbers. */
  def getLineDash(): js.Array[Double] = js.native

  /** Fills the subpaths with the current fill style. */
  def fill(fillRule: CanvasFillRule = js.native): Unit = js.native

  /** Fills the subpaths with the current fill style. */
  def fill(path: Path2D): Unit = js.native

  /** Fills the subpaths with the current fill style. */
  def fill(path: Path2D, fillRule: CanvasFillRule): Unit = js.native

  /** Creates a new, blank ImageData object with the specified dimensions. All of the pixels in the new object are
    * transparent black.
    */
  def createImageData(imageDataOrSw: js.Any, sh: Double = js.native): ImageData = js.native

  /** Creates a pattern using the specified image. It repeats the source in the directions specified by the repetition
    * argument. This method returns a CanvasPattern.
    */
  def createPattern(image: HTMLElement, repetition: String): CanvasPattern = js.native

  /** Tries to draw a straight line from the current point to the start. If the shape has already been closed or has
    * only one point, this function does nothing.
    */
  def closePath(): Unit = js.native

  /** Creates a path for a rectangle at position (x, y) with a size that is determined by width and height. */
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Creates a path for a rounded rectangle with a specified position, width, height, and corner radii. */
  def roundRect(x: Double, y: Double, w: Double, h: Double, radii: js.Any): Unit = js.native

  /** Creates a clipping path from the current sub-paths. Everything drawn after clip() is called appears inside the
    * clipping path only. For an example, see Clipping paths in the Canvas tutorial.
    */
  def clip(fillRule: CanvasFillRule = js.native): Unit = js.native

  /** Creates a clipping path from the current sub-paths. Everything drawn after clip() is called appears inside the
    * clipping path only. For an example, see Clipping paths in the Canvas tutorial.
    */
  def clip(path: Path2D): Unit = js.native

  /** Creates a clipping path from the current sub-paths. Everything drawn after clip() is called appears inside the
    * clipping path only. For an example, see Clipping paths in the Canvas tutorial.
    */
  def clip(path: Path2D, fillRule: CanvasFillRule): Unit = js.native

  /** Sets all pixels in the rectangle defined by starting point (x, y) and size (width, height) to transparent black.
    */
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Moves the starting point of a new subpath to the (x, y) coordinates. */
  def moveTo(x: Double, y: Double): Unit = js.native

  /** Returns an ImageData object representing the underlying pixel data for the area of the canvas denoted by the
    * rectangle which starts at (sx, sy) and has an sw width and sh height.
    */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native

  /** Draws a filled rectangle at (x, y) position whose size is determined by width and height. */
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Adds a cubic Bézier curve to the current path. */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native

  /** Draws the specified image. This method is available in multiple formats, providing a great deal of flexibility in
    * its use.
    */
  def drawImage(image: HTMLElement, offsetX: Double, offsetY: Double, width: Double = js.native,
      height: Double = js.native, canvasOffsetX: Double = js.native, canvasOffsetY: Double = js.native,
      canvasImageWidth: Double = js.native, canvasImageHeight: Double = js.native): Unit = js.native

  /** Multiplies the current transformation matrix with the matrix described by its arguments. */
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native

  /** Strokes the subpaths with the current stroke style. */
  def stroke(): Unit = js.native

  def stroke(path: Path2D): Unit = js.native

  /** Paints a rectangle which has a starting point at (x, y) and has a w width and an h height onto the canvas, using
    * the current stroke style.
    */
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Sets the current line dash pattern. */
  def setLineDash(segments: js.Array[Double]): Unit = js.native

  /** Draws (strokes) a given text at the given (x, y) position. */
  def strokeText(text: String, x: Double, y: Double, maxWidth: Double = js.native): Unit = js.native

  /** Starts a new path by resetting the list of sub-paths. Call this method when you want to create a new path. */
  def beginPath(): Unit = js.native

  /** Adds an arc with the given control points and radius, connected to the previous point by a straight line. */
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native

  /** Creates a linear gradient along the line given by the coordinates represented by the parameters. */
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native

  /** The ellipse() method creates an elliptical arc centered at (x, y) with the radii radiusX and radiusY. The path
    * starts at startAngle and ends at endAngle, and travels in the direction given by counterclockwise (defaulting to
    * clockwise).
    */
  def ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double,
      endAngle: Double, counterclockwise: Boolean = js.native): Unit = js.native
}
