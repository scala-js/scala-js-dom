/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait TextTrack extends EventTarget {
  val id: String = js.native
  val kind: String = js.native
  val label: String = js.native
  val language: String = js.native
  val inBandMetadataTrackDispatchType: String = js.native

  var mode: TextTrackMode = js.native

  def cues: TextTrackCueList = js.native
  def activeCues: TextTrackCueList = js.native

  def addCue(cue: TextTrackCue): Unit = js.native
  def removeCue(cue: TextTrackCue): Unit = js.native

  var oncuechange: js.Function1[Event, Any] = js.native
}
