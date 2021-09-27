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

/** This type represents a set of space-separated tokens. Commonly returned by HTMLElement.classList,
  * HTMLLinkElement.relList, HTMLAnchorElement.relList or HTMLAreaElement.relList. It is indexed beginning with 0 as
  * with JavaScript arrays. DOMTokenList is always case-sensitive.
  */
@js.native
@JSGlobal
class DOMTokenList private[this] extends DOMList[String] {
  def item(index: Int): String = js.native

  def contains(token: String): Boolean = js.native

  def remove(token: String): Unit = js.native

  def toggle(token: String): Boolean = js.native

  def toggle(token: String, force: Boolean): Boolean = js.native

  def add(token: String): Unit = js.native
}
