/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{Blob, DOMException, Event, EventInit, EventTarget, MessageEvent}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

//https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection
@js.native
trait RTCDTMFSender extends js.Object {

  /** The canInsertDTMF attribute must indicate if the RTCDTMFSender is capable of sending DTMF. */
  val canInsertDTMF: Boolean = js.native

  /** An RTCDTMFSender object's insertDTMF() method is used to send DTMF tones. The tones parameter is treated as a
    * series of characters. The characters 0 through 9, A through D, #, and * generate the associated DTMF tones. The
    * characters a to d are equivalent to A to D. The character ',' indicates a delay of 2 seconds before processing the
    * next character in the tones parameter. All other characters must be considered unrecognized.
    *
    * The duration parameter indicates the duration in ms to use for each character passed in the tones parameters. The
    * duration cannot be more than 6000 ms or less than 40 ms. The default duration is 100 ms for each tone.
    *
    * The interToneGap parameter indicates the gap between tones. It must be at least 30 ms. The default value is 70 ms.
    *
    * The browser may increase the duration and interToneGap times to cause the times that DTMF start and stop to align
    * with the boundaries of RTP packets but it must not increase either of them by more than the duration of a single
    * RTP audio packet.
    */
  def insertDTMF(tones: String = js.native, duration: Double = js.native,
      interToneGap: Double = js.native): Unit = js.native

  /** The track attribute must return the MediaStreamTrack given as argument to the createDTMFSender() method. */
  val track: MediaStreamTrack = js.native

  /** This event handler uses the RTCDTMFToneChangeEvent interface to return the character for each tone as it is played
    * out. See RTCDTMFToneChangeEvent for details.
    */
  var ontonechange: js.Function1[Event, Any] = js.native

  /** The toneBuffer attribute must return a list of the tones remaining to be played out. For the syntax, content, and
    * interpretation of this list, see insertDTMF.
    */
  val toneBuffer: String = js.native

  /** The duration attribute must return the current tone duration value. This value will be the value last set via the
    * insertDTMF() method, or the default value of 100 ms if insertDTMF() was called without specifying the duration.
    */
  val duration: Double = js.native

  /** The interToneGap attribute must return the current value of the between-tone gap. This value will be the value
    * last set via the insertDTMF() method, or the default value of 70 ms if insertDTMF() was called without specifying
    * the interToneGap.
    */
  val interToneGap: Double = js.native
}
