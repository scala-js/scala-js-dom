/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A collection of nodes returned by Node.attributes (also potentially for DocumentType.entities,
  * DocumentType.notations). NamedNodeMaps are not in any particular order (unlike NodeList, although they may be
  * accessed by an index as in an array (they may also be accessed with the item method). A NamedNodeMap object are live
  * and will thus be auto-updated if changes are made to their contents internally or elsewhere.
  */
@js.native
@JSGlobal
class NamedNodeMap extends js.Object {
  def length: Int = js.native

  def removeNamedItemNS(namespaceURI: String, localName: String): Attr = js.native

  def item(index: Int): Attr = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): Attr = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: Attr): Unit = js.native

  def removeNamedItem(name: String): Attr = js.native

  def getNamedItem(name: String): Attr = js.native

  def setNamedItem(arg: Attr): Attr = js.native

  def getNamedItemNS(namespaceURI: String, localName: String): Attr = js.native

  def setNamedItemNS(arg: Attr): Attr = js.native
}

object NamedNodeMap {

  implicit def namedNodeMapAsMap(namedNodeMap: NamedNodeMap): mutable.Map[String, Attr] =
    new NamedNodeMapMap(namedNodeMap)
}
