/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** An object implementing the StyleSheet interface represents a single style sheet. CSS style sheets will further
  * implement the more specialized CSSStyleSheet interface.
  */
@js.native
@JSGlobal
class StyleSheet extends js.Object {

  /** Returns a DOMString representing the location of the stylesheet. */
  def href: String = js.native

  /** Is a Boolean representing whether the current stylesheet has been applied or not. */
  def disabled: Boolean = js.native

  /** ownerNode returns the node that associates this style sheet with the document. */
  def ownerNode: Node = js.native

  /** Returns a StyleSheet including this one, if any; returns null if there aren't any. */
  def parentStyleSheet: StyleSheet = js.native

  /** Returns a MediaList representing the intended destination medium for style information. */
  def media: MediaList = js.native

  /** Returns a DOMString representing the style sheet language for this style sheet. */
  def `type`: String = js.native

  /** Returns a DOMString representing the advisory title of the current style sheet. */
  def title: String = js.native
}
