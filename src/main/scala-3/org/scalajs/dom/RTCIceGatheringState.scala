/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

opaque type RTCIceGatheringState = String

object RTCIceGatheringState {

  /** The object was just created, and no networking has occurred yet. */
  val `new`: RTCIceGatheringState = "new"

  /** The ICE engine is in the process of gathering candidates for this RTCPeerConnection. */
  val gathering: RTCIceGatheringState = "gathering"

  /** The ICE engine has completed gathering. Events such as adding a new interface or a new TURN server will cause the
    * state to go back to gathering.
    */
  val complete: RTCIceGatheringState = "complete"
}
