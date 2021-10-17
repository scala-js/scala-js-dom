/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

opaque type RTCSignalingState = String

object RTCSignalingState {

  /** There is no offer­answer exchange in progress. This is also the initial state in which case the local and remote
    * descriptions are empty.
    */
  val stable: RTCSignalingState = "stable"

  /** A local description, of type "offer", has been successfully applied. */
  val `have-local-offer`: RTCSignalingState = "have-local-offer"

  /** A remote description, of type "offer", has been successfully applied. */
  val `have-remote-offer`: RTCSignalingState = "have-remote-offer"

  /** A remote description of type "offer" has been successfully applied and a local description of type "pranswer" has
    * been successfully applied.
    */
  val `have-local-pranswer`: RTCSignalingState =
    "have-local-pranswer"

  /** A local description of type "offer" has been successfully applied and a remote description of type "pranswer" has
    * been successfully applied.
    */
  val `have-remote-pranswer`: RTCSignalingState =
    "have-remote-pranswer"

  /** The connection is closed. */
  val closed: RTCSignalingState = "closed"
}
