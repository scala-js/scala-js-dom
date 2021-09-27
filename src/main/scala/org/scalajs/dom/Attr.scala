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

/** This type represents a DOM element's attribute as an object. In most DOM methods, you will probably directly
  * retrieve the attribute as a string (e.g., Element.getAttribute(), but certain functions (e.g.,
  * Element.getAttributeNode()) or means of iterating give Attr types.
  */
@js.native
@JSGlobal
class Attr extends Node {

  /** This property now always returns true. */
  def specified: Boolean = js.native

  /** The element holding the attribute.
    *
    * Note: DOM Level 4 removed this property. The assumption was that since you get an Attr object from an Element, you
    * should already know the associated element.
    *
    * As that doesn't hold true in cases like Attr objects being returned by Document.evaluate, the DOM Living Standard
    * reintroduced the property.
    */
  def ownerElement: Element = js.native

  /** The attribute's value. */
  var value: String = js.native

  /** The attribute's name. */
  def name: String = js.native

  /** A DOMString representing the namespace prefix of the attribute, or null if no prefix is specified. */
  def prefix: String = js.native
}
