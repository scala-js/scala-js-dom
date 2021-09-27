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

/** A MediaQueryList object maintains a list of media queries on a document, and handles sending notifications to
  * listeners when the media queries on the document change.
  */
@js.native
trait MediaQueryList extends js.Object {

  /** true if the document currently matches the media query list; otherwise false. Read only. */
  def matches: Boolean = js.native

  /** The serialized media query list */
  var media: String = js.native

  /** Adds a new listener to the media query list. If the specified listener is already in the list, this method has no
    * effect.
    */
  def addListener(listener: MediaQueryListListener): Unit = js.native

  /** Removes a listener from the media query list. Does nothing if the specified listener isn't already in the list. */
  def removeListener(listener: MediaQueryListListener): Unit = js.native
}
