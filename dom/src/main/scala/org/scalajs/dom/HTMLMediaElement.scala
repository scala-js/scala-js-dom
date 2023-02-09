/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The HTMLMediaElement interface has special properties and methods (beyond the properties and methods available for
  * all children of HTMLElement), that are common to all media-related objects.
  */
@js.native
@JSGlobal
abstract class HTMLMediaElement extends HTMLElement {

  /** The initial playback position in seconds. */
  def initialTime: Double = js.native

  /** The ranges of the media source that the browser has played, if any. */
  def played: TimeRanges = js.native

  /** The absolute URL of the chosen media resource (if, for example, the server selects a media file based on the
    * resolution of the user's display), or an empty string if the networkState is EMPTY.
    */
  def currentSrc: String = js.native

  /** Reflects the loop HTML attribute, indicating whether the media element should start over when it reaches the end.
    */
  var loop: Boolean = js.native

  /** Indicates whether the media element has ended playback. */
  def ended: Boolean = js.native

  /** The ranges of the media source that the browser has buffered (if any) at the moment the buffered property is
    * accessed. The returned TimeRanges object is normalized.
    */
  def buffered: TimeRanges = js.native

  /** The MediaError object for the most recent error, or null if there has not been an error. */
  def error: MediaError = js.native

  /** The time ranges that the user is able to seek to, if any. */
  def seekable: TimeRanges = js.native

  /** Reflects the autoplay HTML attribute, indicating whether playback should automatically begin as soon as enough
    * media is available to do so without interruption.
    */
  var autoplay: Boolean = js.native

  /** Reflects the controls HTML attribute, indicating whether user interface items for controlling the resource should
    * be displayed.
    */
  var controls: Boolean = js.native

  /** The audio volume, from 0.0 (silent) to 1.0 (loudest). */
  var volume: Double = js.native

  /** Reflects the src HTML attribute, containing the URL of a media resource to use. Gecko implements a similar
    * functionality is available for streams: mozSrcObject.
    */
  var src: String = js.native

  /** The current rate at which the media is being played back. This is used to implement user controls for fast
    * forward, slow motion, and so forth. The normal playback rate is multiplied by this value to obtain the current
    * rate, so a value of 1.0 indicates normal speed. If the playbackRate is negative, the media is played backwards.
    * The audio is muted when the media plays backwards or if the fast forward or slow motion is outside a useful range
    * (E.g. Gecko mute the sound outside the range 0.25 and 5.0). The pitch of the audio is corrected by default and is
    * the same for every speed. Some navigators implement the non-standard preservespitch property to control this.
    */
  var playbackRate: Double = js.native

  /** The length of the media in seconds, or zero if no media data is available.  If the media data is available but the
    * length is unknown, this value is NaN.  If the media is streamed and has no predefined length, the value is Inf.
    */
  def duration: Double = js.native

  /** true if the audio is muted, and false otherwise. */
  var muted: Boolean = js.native

  /** The default playback rate for the media. 1.0 is "normal speed," values lower than
    * 1.0 make the media play slower than normal, higher values make it play faster. The value 0.0 is invalid and throws
    * a NOT_SUPPORTED_ERR exception.
    */
  var defaultPlaybackRate: Double = js.native

  /** Indicates whether the media element is paused. */
  def paused: Boolean = js.native

  /** Indicates whether the media is in the process of seeking to a new position. */
  def seeking: Boolean = js.native

  /** The current playback time, in seconds. Setting this value seeks the media to the new time. */
  var currentTime: Double = js.native

  /** Reflects the preload HTML attribute, indicating what data should be preloaded, if any. Possible values are: none,
    * metadata, auto. See preload attribute documentation for details.
    */
  var preload: String = js.native

  /** The current state of fetching the media over the network. Constant Value Description NETWORK_EMPTY 0 There is no
    * data yet.  The readyState is also HAVE_NOTHING. NETWORK_IDLE 1   NETWORK_LOADING 2 The media is loading.
    * NETWORK_NO_SOURCE[1] 3
    */
  def networkState: Int = js.native

  def pause(): Unit = js.native

  /** Begins playback of the media. If you have changed the src attribute of the media element since the page was
    * loaded, you must call load() before play(), otherwise the original media plays again.
    */
  def play(): js.UndefOr[js.Promise[Unit]] = js.native

  /** Begins loading the media content from the server. */
  def load(): Unit = js.native

  /** Determines whether the specified media type can be played back. */
  def canPlayType(`type`: String): String = js.native

  /** Represents the list of TextTrack objects contained in the element. */
  def textTracks: TextTrackList = js.native

  /** Represents the list of AudioTrack objects contained in the element. */
  def audioTracks: AudioTrackList = js.native

  /** Sets or returns the object which serves as the source of the media associated with the HTMLMediaElement. */
  var srcObject: js.UndefOr[MediaStream | MediaSource | Blob] = js.native
}

@js.native
@JSGlobal
object HTMLMediaElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMediaElement),List())))) */
  /** Enough of the media resource has been retrieved that the metadata attributes are initialized.  Seeking will no
    * longer raise an exception.
    */
  val HAVE_METADATA: Int = js.native

  /** Data is available for the current playback position, but not enough to actually play more than one frame. */
  val HAVE_CURRENT_DATA: Int = js.native

  /** No information is available about the media resource. */
  val HAVE_NOTHING: Int = js.native
  val NETWORK_NO_SOURCE: Int = js.native

  /** Enough data is available—and the download rate is high enough—that the media can be played through to the end
    * without interruption.
    */
  val HAVE_ENOUGH_DATA: Int = js.native

  /** There is no data yet.  The readyState is also HAVE_NOTHING. */
  val NETWORK_EMPTY: Int = js.native
  val NETWORK_LOADING: Int = js.native
  val NETWORK_IDLE: Int = js.native

  /** Data for the current playback position as well as for at least a little bit of time into the future is available
    * (in other words, at least two frames of video, for example).
    */
  val HAVE_FUTURE_DATA: Int = js.native
}
