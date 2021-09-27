/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait AudioTrackList extends EventTarget {
  def length: Double = js.native

  @JSBracketAccess
  def apply(index: Double): AudioTrack = js.native

  def getTrackById(id: String): AudioTrack = js.native

  var onchange: js.Function1[Event, Any] = js.native
  var onaddtrack: js.Function1[Event, Any] = js.native
  var onremovetrack: js.Function1[Event, Any] = js.native
}
