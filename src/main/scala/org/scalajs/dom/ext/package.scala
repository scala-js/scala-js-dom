package org.scalajs.dom

import scala.language.implicitConversions

import scala.collection.mutable

package object ext {

  implicit class PimpedNodeList(nodes: NodeList)
      extends EasySeq[Node](nodes.length, nodes.apply)

  implicit class PimpedTouchList(nodes: TouchList)
      extends EasySeq[Touch](nodes.length, nodes.apply)

  implicit class PimpedHtmlCollection(coll: html.Collection)
      extends EasySeq[Element](coll.length, coll.apply)

  implicit class PimpedSVGTransformList(coll: svg.TransformList)
      extends EasySeq[svg.Transform](coll.numberOfItems, coll.getItem)

  implicit class Castable(x: Any) {
    def cast[T] = x.asInstanceOf[T]
  }

  implicit def pimpAnimatedNumber(x: svg.AnimatedNumber): Double = x.baseVal

  implicit def pimpRichAnimatedNumber(
      x: svg.AnimatedNumber): runtime.RichDouble =
    x.baseVal: runtime.RichDouble

  implicit def pimpAnimatedLength(x: svg.AnimatedLength): Double =
    x.baseVal.value

  implicit def pimpRichAnimatedLength(
      x: svg.AnimatedLength): runtime.RichDouble =
    x.baseVal.value: runtime.RichDouble

  implicit def color2String(c: Color): String = c.toString
  implicit class pimpedContext(val ctx: CanvasRenderingContext2D) {
    def prepCircle(x: Double, y: Double, r: Double) = {
      ctx.beginPath()
      ctx.arc(x, y, r, 0, math.Pi * 2)
    }

    def fillCircle(x: Double, y: Double, r: Double) = {
      prepCircle(x, y, r)
      ctx.fill()
    }

    def strokeCircle(x: Double, y: Double, r: Double) = {
      prepCircle(x, y, r)
      ctx.stroke()
    }

    def prepPath(points: Seq[(Double, Double)], closed: Boolean = true) = {
      ctx.beginPath()
      if (closed) ctx.moveTo(points.last._1, points.last._2)
      for (p <- points) {
        ctx.lineTo(p._1, p._2)
      }
    }

    def fillPath(points: (Double, Double)*) = {
      prepPath(points)
      ctx.fill()
    }

    def strokePath(points: (Double, Double)*) = {
      prepPath(points)
      ctx.stroke()
    }

    def strokePathOpen(points: (Double, Double)*) = {
      prepPath(points, closed = false)
      ctx.stroke()
    }
  }

  implicit def pimpNamedNodeMap(namedNodeMap: NamedNodeMap): NamedNodeMapMap =
    new NamedNodeMapMap(namedNodeMap)
}
