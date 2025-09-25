/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** Represents an enumerated value describing the way channels must be matched between the AudioNode's inputs and
  * outputs.
  */
opaque type AudioNodeChannelCountMode <: String = String

object AudioNodeChannelCountMode {

  /** The number of channels is equal to the maximum number of channels of all connections. In this case, channelCount
    * is ignored and only up-mixing happens.
    */
  val max: AudioNodeChannelCountMode = "max"

  /** The number of channels is equal to the maximum number of channels of all connections, clamped to the value of
    * channelCount.
    */
  val `clamped-max`: AudioNodeChannelCountMode = "clamped-max"

  /** The number of channels is defined by the value of channelCount. */
  val explicit: AudioNodeChannelCountMode = "explicit"
}
