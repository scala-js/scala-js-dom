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

/** The hashchange event is fired when the fragment identifier of the URL has changed (the part of the URL that follows
  * the # symbol, including the # symbol).
  */
@js.native
trait HashChangeEvent extends Event {

  /** The new URL to which the window is navigating. */
  def newURL: String = js.native

  /** The previous URL from which the window was navigated. */
  def oldURL: String = js.native
}
