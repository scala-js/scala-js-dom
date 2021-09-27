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
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The Text interface represents the textual content of Element or Attr.  If an element has no markup within its
  * content, it has a single child implementing Text that contains the element's text.  However, if the element contains
  * markup, it is parsed into information items and Text nodes that form its children.
  *
  * New documents have a single Text node for each block of text. Over time, more Text nodes may be created as the
  * document's content changes. The Node.normalize() method merges adjacent Text objects back into a single node for
  * each block of text.
  */
@js.native
@JSGlobal
class Text extends CharacterData {

  /** The Text.wholeText read-only property returns all text of all Text nodes logically adjacent to the node. The text
    * is concatenated in document order.  This allows to specify any text node and obtain all adjacent text as a single
    * string.
    */
  def wholeText: String = js.native

  /** The Text.splitText() method breaks the Textnode into two nodes at the specified offset, keeping both nodes in the
    * tree as siblings.
    */
  def splitText(offset: Int): Text = js.native
}
