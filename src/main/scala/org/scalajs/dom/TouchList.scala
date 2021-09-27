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

/** A TouchList represents a list of all of the points of contact with a touch surface; for example, if the user has
  * three fingers on the screen (or trackpad), the corresponding TouchList would have one Touch object for each finger,
  * for a total of three entries.
  */
@js.native
trait TouchList extends DOMList[Touch] {
  def item(index: Int): Touch = js.native
}
