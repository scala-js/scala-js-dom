package org.scalajs.dom

package object ext {

  implicit class PimpedNodeList(nodes: NodeList)
      extends EasySeq[Node](nodes.length, nodes.apply)

  implicit class PimpedTouchList(nodes: TouchList)
      extends EasySeq[Touch](nodes.length, nodes.apply)

  implicit class PimpedHtmlCollection(coll: html.Collection)
      extends EasySeq[Element](coll.length, coll.apply)

  implicit class PimpedSVGTransformList(coll: svg.TransformList)
      extends EasySeq[svg.Transform](coll.numberOfItems, coll.getItem)

}
