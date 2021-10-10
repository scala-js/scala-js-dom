/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#rtciceconnectionstate-enum]] in W3C spec */
opaque type RTCIceConnectionState = String

object RTCIceConnectionState {

  /** The ICE Agent is gathering addresses and/or waiting for remote candidates to be supplied. */
  val `new`: RTCIceConnectionState = "new"

  /** The ICE Agent has received remote candidates on at least one component, and is checking candidate pairs but has
    * not yet found a connection. In addition to checking, it may also still be gathering.
    */
  val checking: RTCIceConnectionState = "checking"

  /** The ICE Agent has found a usable connection for all components but is still checking other candidate pairs to see
    * if there is a better connection. It may also still be gathering.
    */
  val connected: RTCIceConnectionState = "connected"

  /** The ICE Agent has finished gathering and checking and found a connection for all components. Open issue: it is not
    * clear how the non controlling ICE side knows it is in the state.
    */
  val completed: RTCIceConnectionState = "completed"

  /** The ICE Agent is finished checking all candidate pairs and failed to find a connection for at least one component.
    * Connections may have been found for some components.
    */
  val failed: RTCIceConnectionState = "failed"

  /** Liveness checks have failed for one or more components. This is more aggressive than failed, and may trigger
    * intermittently (and resolve itself without action) on a flaky network.
    */
  val disconnected: RTCIceConnectionState = "disconnected"

  /** The ICE Agent has shut down and is no longer responding to STUN requests. */
  val closed: RTCIceConnectionState = "closed"
}
