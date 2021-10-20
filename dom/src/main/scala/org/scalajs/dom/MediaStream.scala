/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The MediaStream
  *
  * https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/
  */
@js.native
@JSGlobal
class MediaStream() extends EventTarget {

  /** A Boolean value that returns true if the MediaStream is active, or false otherwise. */
  val active: Boolean = js.native

  /** Is a DOMString containing 36 characters denoting a universally unique identifier (UUID) for the object. */
  val id: String = js.native

  /** Is an EventHandler containing the action to perform when an addtrack event is fired when a new MediaStreamTrack
    * object is added.
    */
  var onaddtrack: js.Function1[Event, Any] = js.native

  /** Is an EventHandler containing the action to perform when an removetrack event is fired when a MediaStreamTrack
    * object is removed from it.
    */
  var onremovetrack: js.Function1[Event, Any] = js.native

  /** Stores a copy of the MediaStreamTrack given as argument. If the track has already been added to the MediaStream
    * object, nothing happens; if the track is in the finished state - that is, has already reached its end - the
    * exception INVALID_STATE_RAISE is raised.
    */
  def addTrack(track: MediaStreamTrack): Unit = js.native

  /** Returns a list of the MediaStreamTrack objects stored in the MediaStream object that have their kind attribute set
    * to "audio". The order is not defined, and may not only vary from one browser to another, but also from one call to
    * another..
    */
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native

  /** Returns the track whose ID corresponds to the one given in parameters, trackid. If no parameter is given, or if no
    * track with that ID does exist, it returns null. If several tracks have the same ID, it returns the first one.
    */
  def getTrackById(trackId: String): MediaStreamTrack = js.native

  /** Returns a list of all MediaStreamTrack objects stored in the MediaStream object, regardless of the value of the
    * kind attribute. The order is not defined, and may not only vary from one browser to another, but also from one
    * call to another.
    */
  def getTracks(): js.Array[MediaStreamTrack] = js.native

  /** Returns a list of the MediaStreamTrack objects stored in the MediaStream object that have their kind attribute set
    * to "video". The order is not defined, and may not only vary from one browser to another, but also from one call to
    * another.
    */
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native

  /** Removes the MediaStreamTrack given as argument. If the track is not part of the MediaStream object, nothing
    * happens; if the track is in the finished state - that is, it has already reached its end - the exception
    * INVALID_STATE_RAISE is raised.
    */
  def removeTrack(track: MediaStreamTrack): Unit = js.native

  /** Clones the given MediaStream and all its tracks. When the clone() method is invoked, the user agent must run the
    * following steps: 1) Let streamClone be a newly constructed MediaStream object. 2) Initialize streamClone's id
    * attribute to a newly generated value. 3) Let trackSetClone be a list that contains the result of running
    * MediaStreamTrack.clone() on all the tracks in this stream.
    *
    * Let trackSetClone be streamClone's track set.
    */
  override def clone(): MediaStream = js.native
}
