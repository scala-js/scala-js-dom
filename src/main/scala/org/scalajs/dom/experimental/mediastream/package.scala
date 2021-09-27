package org.scalajs.dom.experimental

import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.|

package object mediastream {

  @deprecated("use dom.BufferSource instead", "2.0.0")
  type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer

  @deprecated("use String instead", "2.0.0")
  type AppendMode = String

  @deprecated("use String instead", "2.0.0")
  type TextTrackMode = String

  @deprecated("use String instead", "2.0.0")
  type EndOfStreamError = String

  @deprecated("use String instead", "2.0.0")
  type ReadyState = String

  @deprecated("use dom.AudioTrack instead", "2.0.0")
  type AudioTrack = dom.AudioTrack

  @deprecated("use dom.AudioTrackList instead", "2.0.0")
  type AudioTrackList = dom.AudioTrackList

  @deprecated("use dom.ImageCapture instead", "2.0.0")
  type ImageCapture = dom.ImageCapture

  @deprecated("use dom.MediaDeviceInfo instead", "2.0.0")
  type MediaDeviceInfo = dom.MediaDeviceInfo

  @deprecated("use dom.MediaDeviceInfo instead", "2.0.0")
  val MediaDeviceInfo = dom.MediaDeviceInfo

  @deprecated("use dom.MediaDeviceKind instead", "2.0.0")
  type MediaDeviceKind = dom.MediaDeviceKind

  @deprecated("use dom.MediaDeviceKind instead", "2.0.0")
  val MediaDeviceKind = dom.MediaDeviceKind

  @deprecated("use dom.MediaDevices instead", "2.0.0")
  type MediaDevices = dom.MediaDevices

  @deprecated("use dom.MediaSource instead", "2.0.0")
  type MediaSource = dom.MediaSource

  @deprecated("use dom.MediaSource instead", "2.0.0")
  val MediaSource = dom.MediaSource

  @deprecated("use dom.MediaStream instead", "2.0.0")
  type MediaStream = dom.MediaStream

  @deprecated("use dom.MediaStreamConstraints instead", "2.0.0")
  type MediaStreamConstraints = dom.MediaStreamConstraints

  @deprecated("use dom.MediaStreamConstraints instead", "2.0.0")
  val MediaStreamConstraints = dom.MediaStreamConstraints

  @deprecated("use dom.MediaStreamTrack instead", "2.0.0")
  type MediaStreamTrack = dom.MediaStreamTrack

  @deprecated("use dom.MediaStreamTrack instead", "2.0.0")
  val MediaStreamTrack = dom.MediaStreamTrack

  @deprecated("use dom.MediaStreamTrackEvent instead", "2.0.0")
  type MediaStreamTrackEvent = dom.MediaStreamTrackEvent

  @deprecated("use dom.MediaStreamTrackEventInit instead", "2.0.0")
  type MediaStreamTrackEventInit = dom.MediaStreamTrackEventInit

  @deprecated("use dom.MediaStreamTrackState instead", "2.0.0")
  type MediaStreamTrackState = dom.MediaStreamTrackState

  @deprecated("use dom.MediaStreamTrackState instead", "2.0.0")
  val MediaStreamTrackState = dom.MediaStreamTrackState

  @deprecated("use dom.MediaTrackConstraintSet instead", "2.0.0")
  type MediaTrackConstraintSet = dom.MediaTrackConstraintSet

  @deprecated("use dom.MediaTrackConstraintSet instead", "2.0.0")
  val MediaTrackConstraintSet = dom.MediaTrackConstraintSet

  @deprecated("use dom.MediaTrackConstraints instead", "2.0.0")
  type MediaTrackConstraints = dom.MediaTrackConstraints

  @deprecated("use dom.MediaTrackConstraints instead", "2.0.0")
  val MediaTrackConstraints = dom.MediaTrackConstraints

  @deprecated("use dom.MediaTrackSettings instead", "2.0.0")
  type MediaTrackSettings = dom.MediaTrackSettings

  @deprecated("use dom.MediaTrackSupportedConstraints instead", "2.0.0")
  type MediaTrackSupportedConstraints = dom.MediaTrackSupportedConstraints

  @deprecated("use dom.SourceBuffer instead", "2.0.0")
  type SourceBuffer = dom.SourceBuffer

  @deprecated("use dom.SourceBufferList instead", "2.0.0")
  type SourceBufferList = dom.SourceBufferList

  @deprecated("use dom.TextTrack instead", "2.0.0")
  type TextTrack = dom.TextTrack

  @deprecated("use dom.TextTrack instead", "2.0.0")
  val TextTrack = dom.TextTrack

  @deprecated("use dom.TextTrackCue instead", "2.0.0")
  type TextTrackCue = dom.TextTrackCue

  @deprecated("use dom.TextTrackCueList instead", "2.0.0")
  type TextTrackCueList = dom.TextTrackCueList

  @deprecated("use dom.TextTrackList instead", "2.0.0")
  type TextTrackList = dom.TextTrackList

  @deprecated("use dom.VideoTrack instead", "2.0.0")
  type VideoTrack = dom.VideoTrack

  @deprecated("use dom.VideoTrackList instead", "2.0.0")
  type VideoTrackList = dom.VideoTrackList

}
