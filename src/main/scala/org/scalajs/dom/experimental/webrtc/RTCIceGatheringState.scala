/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import scala.scalajs.js

sealed trait RTCIceGatheringState extends js.Any

object RTCIceGatheringState {

  /** The object was just created, and no networking has occurred yet. */
  val `new`: RTCIceGatheringState = "new".asInstanceOf[RTCIceGatheringState]

  /** The ICE engine is in the process of gathering candidates for this RTCPeerConnection. */
  val gathering: RTCIceGatheringState = "gathering".asInstanceOf[RTCIceGatheringState]

  /** The ICE engine has completed gathering. Events such as adding a new interface or a new TURN server will cause the
    * state to go back to gathering.
    */
  val complete: RTCIceGatheringState = "complete".asInstanceOf[RTCIceGatheringState]
}
