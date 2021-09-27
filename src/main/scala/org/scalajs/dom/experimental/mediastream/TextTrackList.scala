/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait TextTrackList extends EventTarget {

  def length: Double = js.native

  @JSBracketAccess
  def apply(index: Double): VideoTrack = js.native

  def getTrackById(id: String): TextTrack = js.native

  var onchange: js.Function1[Event, Any] = js.native
  var onaddtrack: js.Function1[Event, Any] = js.native
  var onremovetrack: js.Function1[Event, Any] = js.native
}
