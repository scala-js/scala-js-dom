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

/** The CharacterData abstract interface represents a Node object that contains characters. This is an abstract
  * interface, meaning there aren't any object of type CharacterData: it is implemented by other interfaces, like Text,
  * Comment, or ProcessingInstruction which aren't abstract.
  */
@js.native
@JSGlobal
abstract class CharacterData extends Node with NonDocumentTypeChildNode {

  /** Returns an unsigned long representing the size of the string contained in CharacterData.data. */
  def length: Int = js.native

  /** Is a DOMString representing the textual data contained in this object. */
  var data: String = js.native

  /** Removes the specified amount of characters, starting at the specified offset, from the CharacterData.data string;
    * when this method returns, data contains the shortened DOMString.
    */
  def deleteData(offset: Int, count: Int): Unit = js.native

  /** Replaces the specified amount of characters, starting at the specified offset, with the specified DOMString; when
    * this method returns, data contains the modified DOMString.
    */
  def replaceData(offset: Int, count: Int, arg: String): Unit = js.native

  /** Appends the given DOMString to the CharacterData.data string; when this method returns, data contains the
    * concatenated DOMString.
    */
  def appendData(arg: String): Unit = js.native

  /** Inserts the specified characters, at the specified offset, in the CharacterData.data string; when this method
    * returns, data contains the modified DOMString.
    */
  def insertData(offset: Int, arg: String): Unit = js.native

  /** Returns a DOMString containing the part of CharacterData.data of the specified length and starting at the
    * specified offset.
    */
  def substringData(offset: Int, count: Int): String = js.native
}
