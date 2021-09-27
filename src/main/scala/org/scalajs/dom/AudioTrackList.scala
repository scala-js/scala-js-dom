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

@js.native
trait AudioTrackList extends EventTarget with DOMList[AudioTrack] {

  var onchange: js.Function1[js.Any, _] = js.native
  var onaddtrack: js.Function1[TrackEvent, _] = js.native

  def getTrackById(id: String): AudioTrack = js.native
}
