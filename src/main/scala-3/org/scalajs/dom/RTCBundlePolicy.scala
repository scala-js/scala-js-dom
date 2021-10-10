/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCBundlePolicy]] in W3C spec */
opaque type RTCBundlePolicy = String

object RTCBundlePolicy {

  /** Gather ICE candidates for each media type in use (audio, video, and data). If the remote endpoint is not
    * BUNDLE-aware, negotiate only one audio and video track on separate transports.
    */
  val balanced: RTCBundlePolicy = "balanced"

  /** Gather ICE candidates for each track. If the remote endpoint is not BUNDLE-aware, negotiate all media tracks on
    * separate transports.
    */
  val `max-compat` = "max-compat"

  /** Gather ICE candidates for only one track. If the remote endpoint is not BUNDLE-aware, negotiate only one media
    * track.
    */
  val `max-bundle` = "max-bundle"
}
