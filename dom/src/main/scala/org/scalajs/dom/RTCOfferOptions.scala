/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

trait RTCOfferOptions extends js.Object {

  /** When the value of this dictionary member is true, the generated description will have ICE credentials that are
    * different from the current credentials (as visible in the localDescription attribute's SDP). Applying the
    * generated description will restart ICE.
    *
    * When the value of this dictionary member is false, and the localDescription attribute has valid ICE credentials,
    * the generated description will have the same ICE credentials as the current value from the localDescription
    * attribute.
    */
  var iceRestart: js.UndefOr[Boolean] = js.undefined

  /** In some cases, an RTCPeerConnection may wish to receive audio but not send any audio. The RTCPeerConnection needs
    * to know if it should signal to the remote side whether it wishes to receive audio. This option allows an
    * application to indicate its preferences for the number of audio streams to receive when creating an offer.
    */
  var offerToReceiveAudio: js.UndefOr[Double] = js.undefined

  /** In some cases, an RTCPeerConnection may wish to receive video but not send any video. The RTCPeerConnection needs
    * to know if it should signal to the remote side whether it wishes to receive video or not. This option allows an
    * application to indicate its preferences for the number of video streams to receive when creating an offer.
    */
  var offerToReceiveVideo: js.UndefOr[Double] = js.undefined

  /** default: true Many codecs and system are capable of detecting "silence" and changing their behavior in this case
    * by doing things such as not transmitting any media. In many cases, such as when dealing with emergency calling or
    * sounds other than spoken voice, it is desirable to be able to turn off this behavior. This option allows the
    * application to provide information about whether it wishes this type of processing enabled or disabled.
    */
  var voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
}

@deprecated("all members of RTCOfferOptions are deprecated", "2.0.0")
object RTCOfferOptions {

  @deprecated("use `new RTCOfferOptions { ... }` instead", "2.0.0")
  @inline
  def apply(
      iceRestart: js.UndefOr[Boolean] = js.undefined, offerToReceiveAudio: js.UndefOr[Double] = js.undefined,
      offerToReceiveVideo: js.UndefOr[Double] = js.undefined, voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
  ): RTCOfferOptions = {
    val result = js.Dynamic.literal()
    iceRestart.foreach(result.iceRestart = _)
    offerToReceiveAudio.foreach(result.offerToReceiveAudio = _)
    offerToReceiveVideo.foreach(result.offerToReceiveVideo = _)
    voiceActivityDetection.foreach(result.voiceActivityDetection = _)
    result.asInstanceOf[RTCOfferOptions]
  }
}
