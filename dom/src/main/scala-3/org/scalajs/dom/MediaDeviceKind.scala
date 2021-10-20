/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/#idl-def-MediaDeviceKind]] in W3C spec */
opaque type MediaDeviceKind <: String = String

object MediaDeviceKind {

  /** Represents an audio input device; for example a microphone. */
  val audioinput: MediaDeviceKind = "audioinput"

  /** Represents an audio output device; for example a pair of headphones. */
  val audiooutput: MediaDeviceKind = "audiooutput"

  /** Represents a video input device; for example a webcam. */
  val videoinput: MediaDeviceKind = "videoinput"
}
