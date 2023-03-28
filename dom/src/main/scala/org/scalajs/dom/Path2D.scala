package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
class Path2D extends js.Object {

  def addPath(path: Path2D): Unit = js.native

  def closePath(): Unit = js.native

  def moveTo(x: Double, y: Double): Unit = js.native

  def lineTo(x: Double, y: Double): Unit = js.native

  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native

  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native

  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native

  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double,
      anticlockwise: Boolean): Unit = js.native

  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native

  def ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double,
      endAngle: Double, anticlockwise: Boolean = js.native): Unit = js.native

  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

}
