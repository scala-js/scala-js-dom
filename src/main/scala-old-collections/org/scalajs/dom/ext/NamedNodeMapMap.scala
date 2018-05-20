package org.scalajs.dom.ext

import scala.collection.mutable

import org.scalajs.dom._

class NamedNodeMapMap private[ext] (namedNodeMap: NamedNodeMap)
    extends mutable.Map[String, Attr] {
  self =>

  override def iterator: Iterator[(String, Attr)] = {
    new Iterator[(String, Attr)] {
      private var index: Int = 0

      override def next(): (String, Attr) = {
        val n: Attr = namedNodeMap.item(index)
        this.index = this.index + 1
        (n.name, n)
      }

      override def hasNext: Boolean = index < namedNodeMap.length
    }
  }

  override def get(key: String): Option[Attr] = {
    namedNodeMap.getNamedItem(key) match {
      case null => None
      case attr => Some(attr)
    }
  }

  def length: Int = namedNodeMap.length

  override def clear(): Unit =
    keysIterator.toList.foreach(this -= _)

  override def +=(kv: (String, Attr)): this.type = {
    namedNodeMap.setNamedItem(kv._2)
    this
  }

  override def -=(key: String): this.type = {
    namedNodeMap.removeNamedItem(key)
    this
  }

}
