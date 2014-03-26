package org.scalajs.dom

import scala.scalajs.js
import org.scalajs.dom
import scala.collection.mutable
import scala.scalajs.js.Undefined

package object extensions {

  implicit class PimpedNodeList(nodes: dom.NodeList) extends EasySeq[dom.Node](nodes.length, nodes.apply)

  implicit class PimpedTouchList(nodes: dom.TouchList) extends EasySeq[dom.TouchEvent](nodes.length, nodes.apply)

  implicit class PimpedHtmlCollection(coll: dom.HTMLCollection) extends EasySeq[dom.Element](coll.length, coll.apply)

  implicit class PimpedSVGTransformList(coll: dom.SVGTransformList) extends EasySeq[dom.SVGTransform](coll.numberOfItems, coll.getItem)

  implicit class Castable(x: Any) {
    def cast[T] = x.asInstanceOf[T]
  }

  implicit def pimpAnimatedNumber(x: dom.SVGAnimatedNumber) = x.baseVal.toDouble

  implicit def pimpAnimatedNumberRaw(x: dom.SVGAnimatedNumber) = x.baseVal

  implicit def pimpRichAnimatedNumber(x: dom.SVGAnimatedNumber) = x.baseVal.toDouble: runtime.RichDouble

  implicit def pimpAnimatedLength(x: dom.SVGAnimatedLength) = x.baseVal.value.toDouble

  implicit def pimpAnimatedLengthRaw(x: dom.SVGAnimatedLength) = x.baseVal.value

  implicit def pimpRichAnimatedLength(x: dom.SVGAnimatedLength) = x.baseVal.value.toDouble: runtime.RichDouble

  implicit def color2String(c: Color) = c.toString
  implicit def color2JsString(c: Color) = c.toString: js.String
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

    def prepPath(points: Seq[(js.Number, js.Number)], closed: Boolean = true) = {
      ctx.beginPath()
      if (closed) ctx.moveTo(points.last._1, points.last._2)
      for (p <- points) {
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

  /**
   * Implicit class that adds some useful methods to any ScalaJS object
   * @param obj any ScalaJS object
   */
  implicit class AnyJs(obj:scalajs.js.Any){
    /**
     * As Javascript has both null and undefined often if(element.obj==null) returns false when obj is undefined,
     * it is especially  unpleasant with dom wrappers
     * @param other another object to compare to
     * @return
     */
    def ===(other:Any): Boolean = if(other==null) obj==null || obj.isInstanceOf[Undefined] || obj=="" else obj==other

    /**
     * Just a shorter conversion to dynamic object
     * @return self as Dynamic
     */
    def dyn = obj.asInstanceOf[js.Dynamic]

    /**
     * provides dynamic results as options
     * @param key name of the property
     * @return Option[js.Dynamic]
     */
    def \ (key:String): Option[js.Dynamic] = dyn.selectDynamic(key) match {
      case null=>
        dom.document.getElementById("").parentElement.tagName
        None
      case v:Undefined=>None
      case validValue=>Some(validValue)
    }
  }

  /**
   * Useful for complicated traversals, like
   *  grandfather \ "mother" \ "daughter"
   * @param opt option with Dynamic object
   */
  implicit class OptionPath(opt:Option[js.Dynamic]){
    def \ (key:String): Option[js.Dynamic] = opt.flatMap(_ \ key)
  }

  /**
   * Implicit class to deal with attributes as with normal mutable Map
   * @param attributes dom Attributes
   */
  implicit class Attributes(attributes:NamedNodeMap) extends mutable.Map[String,Attr] {
    self =>

    override def iterator: Iterator[(String, Attr)] = new Iterator[(String, Attr)] {
      var index = 0
      override def next(): (String, Attr) = {
        val n: Attr = attributes.item(index)
        this.index = this.index + 1
        (n.name, n)
      }
      override def hasNext: Boolean = index < self.length
    }

    override def get(key: String): Option[Attr] = attributes.getNamedItem(key) match {
      case null => None
      case attr => Some(attr)
    }

    def length: Int = attributes.length.toInt

    override def -=(key: String) = {
      attributes.removeNamedItem(key)
      this
    }

    override def +=(kv: (String, Attr)) = {
      attributes.setNamedItem(kv._2)
      this}
  }

}
