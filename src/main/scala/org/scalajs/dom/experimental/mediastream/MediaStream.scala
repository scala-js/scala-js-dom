/**
 * https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/
 */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom.{Event, EventInit, EventTarget, TimeRanges}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/**
 * The MediaStream
 *
 * https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/
 *
 * MDN
 *
 */
@js.native
@JSGlobal
class MediaStream() extends EventTarget {

  /**
   * A Boolean value that returns true if the MediaStream is active, or false otherwise.
   *
   * MDN
   */
  val active: Boolean = js.native

  /**
   * Is a DOMString containing 36 characters denoting a universally
   * unique identifier (UUID) for the object.
   *
   * MDN
   */
  val id: String = js.native

  /**
   * Is an EventHandler containing the action to perform when an addtrack event
   * is fired when a new MediaStreamTrack object is added.
   *
   * MDN
   */
  var onaddtrack: js.Function1[Event, Any] = js.native

  /**
   * Is an EventHandler containing the action to perform when an removetrack
   * event is fired when a  MediaStreamTrack object is removed from it.
   *
   * MDN
   */
  var onremovetrack: js.Function1[Event, Any] = js.native

  /**
   * Stores a copy of the MediaStreamTrack given as argument. If the track has
   * already been added to the MediaStream object, nothing happens; if the
   * track is in the finished state - that is, has already reached its end -
   * the exception INVALID_STATE_RAISE is raised.
   *
   * MDN
   */
  def addTrack(track: MediaStreamTrack): Unit = js.native

  /**
   * Returns a list of the MediaStreamTrack objects stored in the MediaStream
   * object that have their kind attribute set to "audio". The order is not
   * defined, and may not only vary from one browser to another, but also from
   * one call to another..
   *
   * MDN
   */
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native

  /**
   * Returns the track whose ID corresponds to the one given in parameters,
   * trackid. If no parameter is given, or if no track with that ID does exist,
   * it returns null. If several tracks have the same ID, it returns the first
   * one.
   *
   * MDN
   */
  def getTrackById(trackId: String): MediaStreamTrack = js.native

  /**
   * Returns a list of all MediaStreamTrack objects stored in the MediaStream object,
   * regardless of the value of the kind attribute. The order is not defined, and may
   * not only vary from one browser to another, but also from one call to another.
   *
   * MDN
   */
  def getTracks(): js.Array[MediaStreamTrack] = js.native

  /**
   * Returns a list of the MediaStreamTrack objects stored in the MediaStream
   * object that have their kind attribute set to "video". The order is not
   * defined, and may not only vary from one browser to another, but also from
   * one call to another.
   *
   * MDN
   */
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native

  /**
   * Removes the MediaStreamTrack given as argument. If the track is not part
   * of the MediaStream object, nothing happens; if the track is in the
   * finished state - that is, it has already reached its end - the exception
   * INVALID_STATE_RAISE is raised.
   *
   * MDN
   */
  def removeTrack(track: MediaStreamTrack): Unit = js.native

  /**
   * Clones the given MediaStream and all its tracks.
   * When the clone() method is invoked, the user agent must run the following
   * steps:
   *   1) Let streamClone be a newly constructed MediaStream object.
   *   2) Initialize streamClone's id attribute to a newly generated value.
   *   3) Let trackSetClone be a list that contains the result of running
   *   MediaStreamTrack.clone() on all the tracks in this stream.
   *
   * Let trackSetClone be streamClone's track set.
   *
   * MDN
   */
  override def clone(): MediaStream = js.native
}

/**
 * see [[https://www.w3.org/TR/2013/WD-mediacapture-streams-20130903/#widl-MediaStream-onended]] in W3C spec
 */
@js.native
trait MediaStreamTrackState extends js.Any

object MediaStreamTrackState {

  /** The track is active (the track's underlying media source is making a best-effort
   * attempt to provide data in real time).
   * The output of a track in the live state can be switched on and off with the
   * enabled attribute.
   */
  val live = "live".asInstanceOf[MediaStreamTrackState]

  /** The track has ended (the track's underlying media source is no longer providing
   * data, and will never provide more data for this track). Once a track enters this
   * state, it never exits it.
   *
   * For example, a video track in a MediaStream ends if the user unplugs the USB web
   * camera that acts as the track's media source.
   */
  val ended = "ended".asInstanceOf[MediaStreamTrackState]
}

@js.native
trait MediaStreamTrack extends EventTarget {

  /**
   * Is a Boolean value with a value of true if the track is enabled, that is
   * allowed to render the media source stream; or false if it is disabled,
   * that is not rendering the media source stream but silence and blackness.
   * If the track has been disconnected, this value can be changed but has no
   * more effect.
   *
   * MDN
   */
  var enabled: Boolean = js.native

  /**
   * Returns a DOMString containing a unique identifier (GUID) for the
   * track; it is generated by the browser.
   *
   * MDN
   */
  val id: String = js.native

  /**
   * Returns a DOMString set to "audio" if the track is an audio track
   * and to "video", if it is a video track. It doesn't change if the track is
   * deassociated from its source.
   *
   * MDN
   */
  val kind: String = js.native

  /**
   * Returns a DOMString containing a user agent-assigned label that
   * identifies the track source, as in "internal microphone". The string may
   * be left empty and is empty as long as no source has been connected. When
   * the track is deassociated from its source, the label is not changed.
   *
   * MDN
   */
  val label: String = js.native

  /**
   * Returns a Boolean value with a value of true if the track is
   * muted, false otherwise.
   *
   * MDN
   */
  val muted: Boolean = js.native

  /**
   * Returns a Boolean value with a value of true if the track is
   * (such a video file source or a camera that settings can't be
   * modified),false otherwise.
   *
   * MDN
   */
  val readonly: Boolean = js.native

  /**
   * Returns an enumerated value giving the status of the track.It
   * takes one of the following values:
   *
   *    "live" which indicates that an input is connected and does its
   *    best-effort in providing real-time data. In that case, the output of
   *    data can be switched on or off using the MediaStreamTrack.enabled
   *    attribute.
   *
   *    "ended" which indicates that the input is not giving any more data
   *    and will never provide new data.
   *
   * MDN
   */
  val readyState: MediaStreamTrackState = js.native

  /**
   * Returns a boolean value with a value of true if the track is
   * sourced by a RTCPeerConnection, false otherwise.
   *
   * MDN
   */
  val remote: Boolean = js.native

  /**
   * Is a EventHandler containing the action to perform when an started event
   * is fired on the object, that is when a new MediaStreamTrack object is
   * added.
   *
   * MDN
   */
  var onstarted: js.Function1[Event, Any] = js.native

  /**
   * Is a EventHandler containing the action to perform when an mute event is
   * fired on the object, that is when the streaming is terminating.
   *
   * MDN
   */
  var onmute: js.Function1[Event, Any] = js.native

  /**
   * Is a EventHandler containing the action to perform when an unmute event
   * is fired on the object, that is when a  MediaStreamTrack object is removed
   * from it.
   *
   * MDN
   */
  var onunmute: js.Function1[Event, Any] = js.native

  /**
   * Is a EventHandler containing the action to perform when an overconstrained
   * event is fired on the object, that is when a  MediaStreamTrack object is
   * removed from it.
   *
   * MDN
   */
  var onoverconstrained: js.Function1[Event, Any] = js.native

  /**
   * Is a EventHandler containing the action to perform when an ended event is
   * fired on the object, that is when a  MediaStreamTrack object is removed
   * from it.
   *
   * MDN
   */
  var onended: js.Function1[Event, Any] = js.native

  /**
   * Returns a MediaTrackConstraints object containing the currently
   * set constraints for the track; the returned value matches the
   * constraints last set using applyConstraints().
   *
   * MDN
   */
  def getConstraints(): MediaTrackConstraints = js.native

  /**
   * Returns the a list of constrainable properties available for the
   * MediaStreamTrack.
   *
   * MDN
   */
  def getCapabilities(): js.Any = js.native

  /**
   * Returns a duplicate of the MediaStreamTrack.
   *
   * MDN
   */
  override def clone(): MediaStreamTrack = js.native

  /**
   * Lets the application specify the ideal and/or ranges of acceptable values
   * for any number of the available constrainable properties of the MediaStreamTrack.
   */
  def applyConstraints(
      constraints: MediaTrackConstraints): js.Promise[Unit] = js.native

  /**
   * Returns a MediaTrackSettings object containing the current values of
   * each of the MediaStreamTrack's constrainable properties.
   *
   * MDN
   */
  def getSettings(): js.Any = js.native

  /**
   * Stops playing the source associated to the track, both the source and the
   * track are deassociated. The track state is set to ended.
   *
   * MDN
   */
  def stop(): Unit = js.native
}

trait MediaTrackSettings extends js.Object {
  var width: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var facingMode: js.UndefOr[String] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var sampleSize: js.UndefOr[Double] = js.undefined
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  var latency: js.UndefOr[Double] = js.undefined
  var channelCount: js.UndefOr[Double] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
}

@js.native
trait MediaTrackConstraintSet extends js.Object {
  var width: Double = js.native
  var height: Double = js.native
  var aspectRatio: Double = js.native
  var frameRate: Double = js.native
  var facingMode: String = js.native
  var volume: Double = js.native
  var sampleRate: Double = js.native
  var sampleSize: Double = js.native
  var echoCancellation: Boolean = js.native
  var deviceId: String = js.native
  var groupId: String = js.native
}

object MediaTrackConstraintSet {
  @inline
  def apply(
      width: js.UndefOr[Double] = js.undefined,
      height: js.UndefOr[Double] = js.undefined,
      aspectRatio: js.UndefOr[Double] = js.undefined,
      frameRate: js.UndefOr[Double] = js.undefined,
      facingMode: js.UndefOr[String] = js.undefined,
      volume: js.UndefOr[Double] = js.undefined,
      sampleRate: js.UndefOr[Double] = js.undefined,
      sampleSize: js.UndefOr[Double] = js.undefined,
      echoCancellation: js.UndefOr[Boolean] = js.undefined,
      deviceId: js.UndefOr[String] = js.undefined,
      groupId: js.UndefOr[String] = js.undefined
  ): MediaTrackConstraintSet = {
    val result = js.Dynamic.literal()
    width.foreach(result.width = _)
    height.foreach(result.height = _)
    aspectRatio.foreach(result.aspectRatio = _)
    frameRate.foreach(result.frameRate = _)
    facingMode.foreach(result.facingMode = _)
    volume.foreach(result.volume = _)
    sampleRate.foreach(result.sampleRate = _)
    sampleSize.foreach(result.sampleSize = _)
    echoCancellation.foreach(result.echoCancellation = _)
    deviceId.foreach(result.deviceId = _)
    groupId.foreach(result.groupId = _)
    result.asInstanceOf[MediaTrackConstraintSet]
  }
}

@js.native
trait MediaTrackConstraints extends MediaTrackConstraintSet {
  var advanced: js.Array[MediaTrackConstraintSet] = js.native
}

object MediaTrackConstraints {
  @inline
  def apply(
      advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined
  ): MediaTrackConstraints = {
    val result = js.Dynamic.literal()
    advanced.foreach(result.advanced = _)
    result.asInstanceOf[MediaTrackConstraints]
  }
}

object MediaStreamTrack {

  @inline
  def apply(
      enabled: js.UndefOr[Boolean] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      kind: js.UndefOr[String] = js.undefined,
      label: js.UndefOr[String] = js.undefined,
      muted: js.UndefOr[Boolean] = js.undefined,
      readonly: js.UndefOr[Boolean] = js.undefined,
      readyState: js.UndefOr[String] = js.undefined,
      remote: js.UndefOr[Boolean] = js.undefined,
      onstarted: js.UndefOr[js.Function0[Any]] = js.undefined,
      onmute: js.UndefOr[js.Function0[Any]] = js.undefined,
      onunmute: js.UndefOr[js.Function0[Any]] = js.undefined,
      onoverconstrained: js.UndefOr[js.Function0[Any]] = js.undefined,
      oneended: js.UndefOr[js.Function0[Any]] = js.undefined
  ): MediaStreamTrack = {
    val result = js.Dynamic.literal()
    enabled.foreach(result.enabled = _)
    id.foreach(result.id = _)
    kind.foreach(result.kind = _)
    label.foreach(result.label = _)
    muted.foreach(result.muted = _)
    readonly.foreach(result.readonly = _)
    readyState.foreach(result.readyState = _)
    remote.foreach(result.remote = _)
    onstarted.foreach(result.onstarted = _)
    onmute.foreach(result.onmute = _)
    onunmute.foreach(result.onunmute = _)
    onoverconstrained.foreach(result.onoverconstrained = _)
    oneended.foreach(result.oneended = _)
    result.asInstanceOf[MediaStreamTrack]
  }
}

@js.native
trait MediaStreamConstraints extends js.Object {
  var video: Boolean | MediaTrackConstraints = js.native
  var audio: Boolean | MediaTrackConstraints = js.native
  var peerIdentity: String = js.native
}

object MediaStreamConstraints {
  @inline
  def apply(
      video: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined,
      audio: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined,
      peerIdentity: js.UndefOr[String] = js.undefined
  ): MediaStreamConstraints = {
    val result = js.Dynamic.literal()
    video.foreach(v => result.video = v.asInstanceOf[js.Any])
    audio.foreach(a => result.audio = a.asInstanceOf[js.Any])
    peerIdentity.foreach(result.peerIdentity = _)
    result.asInstanceOf[MediaStreamConstraints]
  }
}

trait MediaStreamTrackEventInit extends EventInit {
  var track: js.UndefOr[MediaStreamTrack] = js.undefined
}

@js.native
@JSGlobal
class MediaStreamTrackEvent(typeArg: String,
    init: js.UndefOr[MediaStreamTrackEventInit])
    extends Event(typeArg, init) {
  val track: MediaStreamTrack = js.native
}

/**
 * see [[https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/#idl-def-MediaDeviceKind]] in W3C spec
 */
@js.native
trait MediaDeviceKind extends js.Any

object MediaDeviceKind {

  /** Represents an audio input device; for example a microphone.
   */
  val audioinput = "audioinput".asInstanceOf[MediaDeviceKind]

  /** Represents an audio output device; for example a pair of headphones.
   */
  val audiooutput = "audiooutput".asInstanceOf[MediaDeviceKind]

  /** Represents a video input device; for example a webcam.
   */
  val videoinput = "videoinput".asInstanceOf[MediaDeviceKind]
}

@js.native
trait MediaDeviceInfo extends js.Object {

  /**
   * Returns a DOMString that is an identifier for the represented device
   * that is persisted across sessions. It is un-guessable by other
   * applications and unique to the origin of the calling application. It is
   * reset when the user clears cookies (for Private Browsing, a different
   * identifier is used that is not persisted across sessions).
   *
   * MDN
   */
  val deviceId: String = js.native

  /**
   * Returns a DOMString that is a group identifier. Two devices have the same
   * group identifier if they belong to the same physical device; for example
   * a monitor with both a built-in camera and microphone.
   *
   * MDN
   */
  val groupId: String = js.native

  /**
   * enum MediaDevicesInfoKind
   * Returns an enumerated value that is either "videoinput", "audioinput"
   * or "audiooutput".
   *
   * MDN
   */
  val kind: MediaDeviceKind = js.native

  /**
   * Returns a DOMString that is a label describing this device (for example
   * "External USB Webcam"). Only available during active MediaStream use or
   * when persistent permissions have been granted.
   *
   * MDN
   */
  val label: String = js.native
}

object MediaDeviceInfo {
  @inline
  def apply(
      deviceId: js.UndefOr[String] = js.undefined,
      groupId: js.UndefOr[String] = js.undefined,
      kind: js.UndefOr[String] = js.undefined,
      label: js.UndefOr[String] = js.undefined
  ): MediaDeviceInfo = {
    val result = js.Dynamic.literal()
    deviceId.foreach(result.deviceId = _)
    groupId.foreach(result.groupId = _)
    kind.foreach(result.kind = _)
    label.foreach(result.label = _)
    result.asInstanceOf[MediaDeviceInfo]
  }
}

/**
 * The MediaDevices interface provides access to connected media input devices
 * like cameras and microphones, as well as screen sharing. In essence, it
 * lets you obtain access to any hardware source of media data.
 *
 * MDN
 */
@js.native
trait MediaDevices extends EventTarget {

  /**
   * The event handler for the devicechange event. This event is
   * delivered to the MediaDevices object when a media input or
   * output device is attached to or removed from the user's computer.
   *
   * MDN
   */
  var ondevicechange: js.Function1[Event, Any] = js.native

  /**
   * Obtains an array of information about the media input and output devices
   * available on the system.
   *
   * MDN
   */
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]] = js.native

  /**
   * Returns an object conforming to MediaTrackSupportedConstraints indicating
   * which constrainable properties are supported on the MediaStreamTrack
   * interface. See "Capabilities and constraints" in Media Capture and
   * Streams API (Media Streams) to learn more about constraints and how to use them.
   *
   * MDN
   */
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native

  /**
   * With the user's permission through a prompt, turns on a camera or
   * screensharing and/or a microphone on the system and provides a
   * MediaStream containing a video track and/or an audio track with
   * the input.
   *
   * MDN
   */
  def getUserMedia(
      constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native

}

/**
 * The MediaTrackSupportedConstraints dictionary establishes the list of constrainable properties
 * recognized by the user agent or browser in its implementation of the MediaStreamTrack object.
 * An object conforming to MediaTrackSupportedConstraints is returned by
 * MediaDevices.getSupportedConstraints().
 *
 * MDN
 */
trait MediaTrackSupportedConstraints extends js.Object {
  var width: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Boolean] = js.undefined
  var aspectRatio: js.UndefOr[Boolean] = js.undefined
  var frameRate: js.UndefOr[Boolean] = js.undefined
  var facingMode: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Boolean] = js.undefined
  var sampleRate: js.UndefOr[Boolean] = js.undefined
  var sampleSize: js.UndefOr[Boolean] = js.undefined
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  var latency: js.UndefOr[Boolean] = js.undefined
  var channelCount: js.UndefOr[Boolean] = js.undefined
  var deviceId: js.UndefOr[Boolean] = js.undefined
  var groupId: js.UndefOr[Boolean] = js.undefined
}

/**
 * Represents a source of media data for an HTMLMediaElement object.
 *
 * A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent.
 */
@js.native
@JSGlobal
class MediaSource extends EventTarget {
  def sourceBuffers: SourceBufferList = js.native
  def activeSourceBuffers: SourceBufferList = js.native
  def readyState: ReadyState = js.native

  /**
   * Allows the web application to set the presentation duration.
   *
   * The duration is initially set to NaN when the MediaSource object is created.
   */
  var duration: Double = js.native

  var onsourceopen: js.Function1[Event, Any] = js.native
  var onsourceended: js.Function1[Event, Any] = js.native
  var onsourceclose: js.Function1[Event, Any] = js.native

  def addSourceBuffer(mimeType: String): SourceBuffer = js.native
  def removeSourceBuffer(sourceBuffer: SourceBuffer): Unit = js.native
  def endOfStream(error: EndOfStreamError = js.native): Unit = js.native
  def setLiveSeekableRange(start: Double, end: Double): Unit = js.native
  def clearLiveSeekableRange(): Unit = js.native
}

@js.native
@JSGlobalScope
object MediaSource extends js.Object {
  def isTypeSupported(mediaType: String): Boolean = js.native
}

@js.native
trait SourceBufferList extends EventTarget {
  def length: Double = js.native

  @JSBracketAccess
  def apply(index: Double): SourceBuffer = js.native

  var onaddsourcebuffer: js.Function1[Event, Any] = js.native
  var onremovesourcebuffer: js.Function1[Event, Any] = js.native
}

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

@js.native
trait AudioTrack extends js.Object {
  val id: String = js.native
  val kind: String = js.native
  val label: String = js.native
  val language: String = js.native
  var enabled: Boolean = js.native
}

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

@js.native
trait VideoTrack extends js.Object {
  val id: String = js.native
  val kind: String = js.native
  val label: String = js.native
  val language: String = js.native
  var selected: Boolean = js.native
}

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

@js.native
trait TextTrackCueList extends js.Object {
  def length: Double = js.native

  @JSBracketAccess
  def apply(index: Double): TextTrackCue = js.native

  def getCueById(id: String): TextTrackCue = js.native
}

@js.native
trait TextTrackCue extends EventTarget {
  def track: TextTrack = js.native

  var id: String = js.native
  var startTime: Double = js.native
  var endTime: Double = js.native
  var pauseOnExit: Boolean = js.native

  var onenter: js.Function1[Event, Any] = js.native
  var onexit: js.Function1[Event, Any] = js.native
}
