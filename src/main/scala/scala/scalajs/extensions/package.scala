package scala.scalajs

import scala.scalajs.js.CanvasRenderingContext2D

package object extensions {
  implicit class PimpedNodeList(nodes: js.NodeList) extends EasySeq[js.Node](nodes.length, nodes.apply)
  implicit class PimpedTouchList(nodes: js.TouchList) extends EasySeq[js.TouchEvent](nodes.length, nodes.apply)
  implicit class PimpedHtmlCollection(coll: js.HTMLCollection) extends EasySeq[js.Element](coll.length, coll.apply)
  implicit class PimpedSVGTransformList(coll: js.SVGTransformList) extends EasySeq[js.SVGTransform](coll.numberOfItems, coll.getItem)
  implicit class Castable(x: js.Dynamic){
    def to[T] = x.asInstanceOf[T]
  }
  implicit class pimpedContext(val ctx: CanvasRenderingContext2D){
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
    def prepPath(points: Seq[(js.Number, js.Number)], closed: Boolean = true) = {
      ctx.beginPath()
      if (closed) ctx.moveTo(points.last._1, points.last._2)
      for(p <- points){
        ctx.lineTo(p._1, p._2)
      }
    }
    def fillPath(points: (js.Number, js.Number)*) = {
      prepPath(points)
      ctx.fill()
    }
    def strokePath(points: (js.Number, js.Number)*) = {
      prepPath(points)
      ctx.stroke()
    }
    def strokePathOpen(points: (js.Number, js.Number)*) = {
      prepPath(points, closed = false)
      ctx.stroke()
    }
  }
}
