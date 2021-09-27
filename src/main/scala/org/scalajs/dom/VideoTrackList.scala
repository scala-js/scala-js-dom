/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait VideoTrackList extends EventTarget {
  def length: Double = js.native

  @JSBracketAccess
  def apply(index: Double): VideoTrack = js.native

  def getTrackById(id: String): VideoTrack = js.native

  def selectedIndex: Double = js.native

  var onchange: js.Function1[Event, Any] = js.native
  var onaddtrack: js.Function1[Event, Any] = js.native
  var onremovetrack: js.Function1[Event, Any] = js.native
}
