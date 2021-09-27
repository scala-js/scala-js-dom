/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait SourceBuffer extends EventTarget {
  var mode: AppendMode = js.native
  var timestampOffset: Double = js.native

  def updating: Boolean = js.native
  def buffered: TimeRanges = js.native

  def audioTracks: AudioTrackList = js.native
  def videoTracks: VideoTrackList = js.native
  def textTracks: TextTrackList = js.native

  var appendWindowStart: Double = js.native
  var appendWindowEnd: Double = js.native

  var onupdatestart: js.Function1[Event, Any] = js.native
  var onupdate: js.Function1[Event, Any] = js.native
  var onupdateend: js.Function1[Event, Any] = js.native
  var onerror: js.Function1[Event, Any] = js.native
  var onabort: js.Function1[Event, Any] = js.native

  def appendBuffer(data: BufferSource): Unit = js.native
  def abort(): Unit = js.native
  def remove(start: Double, end: Double): Unit = js.native
}
