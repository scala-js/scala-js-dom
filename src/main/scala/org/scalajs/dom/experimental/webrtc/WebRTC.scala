/**
 * http://www.w3.org/TR/2015/WD-webrtc-20150210/
 */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{
  Blob, DOMException, Event, EventInit, EventTarget, MessageEvent
}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

@js.native
trait RTCIdentityAssertion extends js.Object {
  val idp: String = js.native
  val name: String = js.native
}

object RTCIdentityAssertion {
  @inline
  def apply(
      idp: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined
  ): RTCIdentityAssertion = {
    val result = js.Dynamic.literal()
    idp.foreach(result.idp = _)
    name.foreach(result.name = _)
    result.asInstanceOf[RTCIdentityAssertion]
  }
}

@js.native
trait RTCOfferOptions extends js.Object {

  /**
   * When the value of this dictionary member is true, the generated
   * description will have ICE credentials that are different from the current
   * credentials (as visible in the localDescription attribute's SDP). Applying
   * the generated description will restart ICE.
   *
   * When the value of this dictionary member is false, and the localDescription
   * attribute has valid ICE credentials, the generated description will have
   * the same ICE credentials as the current value from the localDescription
   * attribute.
   */
  var iceRestart: Boolean = js.native

  /**
   * In some cases, an RTCPeerConnection may wish to receive audio but not send
   * any audio. The RTCPeerConnection needs to know if it should signal to the
   * remote side whether it wishes to receive audio. This option allows an
   * application to indicate its preferences for the number of audio streams
   * to receive when creating an offer.
   */
  var offerToReceiveAudio: Double = js.native

  /**
   * In some cases, an RTCPeerConnection may wish to receive video but not send
   * any video. The RTCPeerConnection needs to know if it should signal to the
   * remote side whether it wishes to receive video or not. This option allows
   * an application to indicate its preferences for the number of video streams
   * to receive when creating an offer.
   */
  var offerToReceiveVideo: Double = js.native

  /**
   * default: true
   * Many codecs and system are capable of detecting "silence" and changing
   * their behavior in this case by doing things such as not transmitting any
   * media. In many cases, such as when dealing with emergency calling or
   * sounds other than spoken voice, it is desirable to be able to turn off
   * this behavior. This option allows the application to provide information
   * about whether it wishes this type of processing enabled or disabled.
   */
  var voiceActivityDetection: Boolean = js.native
}

object RTCOfferOptions {
  @inline
  def apply(
      iceRestart: js.UndefOr[Boolean] = js.undefined,
      offerToReceiveAudio: js.UndefOr[Double] = js.undefined,
      offerToReceiveVideo: js.UndefOr[Double] = js.undefined,
      voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
  ): RTCOfferOptions = {
    val result = js.Dynamic.literal()
    iceRestart.foreach(result.iceRestart = _)
    offerToReceiveAudio.foreach(result.offerToReceiveAudio = _)
    offerToReceiveVideo.foreach(result.offerToReceiveVideo = _)
    voiceActivityDetection.foreach(result.voiceActivityDetection = _)
    result.asInstanceOf[RTCOfferOptions]
  }
}

@js.native
trait RTCIceServer extends js.Object {
  var urls: String | js.Array[String] = js.native
  var username: String = js.native
  var credential: String = js.native
}

object RTCIceServer {
  @inline
  def apply(urls: js.UndefOr[String | js.Array[String]] = js.undefined,
      username: js.UndefOr[String] = js.undefined,
      credential: js.UndefOr[String] = js.undefined): RTCIceServer = {
    val result = js.Dynamic.literal()
    urls.foreach(v => result.urls = v.asInstanceOf[js.Any])
    username.foreach(result.username = _)
    credential.foreach(result.credential = _)
    result.asInstanceOf[RTCIceServer]
  }
}

/**
 * see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCIceTransportPolicy]] in W3C spec
 */
@js.native
trait RTCIceTransportPolicy extends js.Any

object RTCIceTransportPolicy {

  /**
   * The ICE engine must not send or receive any packets at this point.
   */
  val none = "none".asInstanceOf[RTCIceTransportPolicy]

  /**
   * The ICE engine must only use media relay candidates such as candidates
   * passing through a TURN server. This can be used to reduce leakage of IP
   * addresses in certain use cases.
   */
  val relay = "relay".asInstanceOf[RTCIceTransportPolicy]

  /**
   * The ICE engine may use any type of candidates when this value is
   * specified.
   */
  val all = "all".asInstanceOf[RTCIceTransportPolicy]
}

/**
 * see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCBundlePolicy]] in W3C spec
 */
@js.native
trait RTCBundlePolicy extends js.Any

object RTCBundlePolicy {

  /**
   * Gather ICE candidates for each media type in use (audio, video, and
   * data). If the remote endpoint is not BUNDLE-aware, negotiate only
   * one audio and video track on separate transports.
   */
  val balanced = "balanced".asInstanceOf[RTCBundlePolicy]

  /**
   * Gather ICE candidates for each track. If the remote endpoint is not
   * BUNDLE-aware, negotiate all media tracks on separate transports.
   */
  val `max-compat` = "max-compat".asInstanceOf[RTCBundlePolicy]

  /**
   * Gather ICE candidates for only one track. If the remote endpoint is
   * not BUNDLE-aware, negotiate only one media track.
   */
  val `max-bundle` = "max-bundle".asInstanceOf[RTCBundlePolicy]
}

@js.native
trait RTCConfiguration extends js.Object {

  /**
   * An array containing URIs of servers available to be used by ICE, such
   * as STUN and TURN server.
   */
  var iceServers: js.Array[RTCIceServer] = js.native

  /**
   * defaulting to "all"
   * Indicates which candidates the ICE engine is allowed to use.
   */
  var iceTransportPolicy: RTCIceTransportPolicy = js.native

  /**
   * defaulting to "balanced"
   * Indicates which BundlePolicy to use.
   */
  var bundlePolicy: RTCBundlePolicy = js.native

  /**
   * Sets the target peer identity for the RTCPeerConnection. The
   * RTCPeerConnection will establish a connection to a remote peer unless
   * it can be successfully authenticated with the provided name.
   */
  var peerIdentity: String = js.native
}

object RTCConfiguration {
  @inline
  def apply(iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined,
      iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined,
      bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.undefined,
      peerIdentity: js.UndefOr[String] = js.undefined): RTCConfiguration = {
    val result = js.Dynamic.literal()
    iceServers.foreach(result.iceServers = _)
    iceTransportPolicy.foreach(result.iceTransportPolicy = _)
    bundlePolicy.foreach(result.bundlePolicy = _)
    peerIdentity.foreach(result.peerIdentity = _)
    result.asInstanceOf[RTCConfiguration]
  }
}

/**
 * see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCSdpType]] in W3C spec
 */
@js.native
trait RTCSdpType extends js.Any

object RTCSdpType {

  /**
   * An RTCSdpType of "offer" indicates that a description should be treated
   * as an [SDP] offer.
   */
  val offer = "offer".asInstanceOf[RTCSdpType]

  /**
   * An RTCSdpType of "pranswer" indicates that a description should be
   * treated as an [SDP] answer, but not a final answer. A description used
   * as an SDP "pranswer" may be applied as a response to a SDP offer, or an
   * update to a previously sent SDP "pranswer".
   */
  val pranswer = "pranswer".asInstanceOf[RTCSdpType]

  /**
   * An RTCSdpType of "answer" indicates that a description should be treated
   * as an [SDP] final answer, and the offer-answer exchange should be
   * considered complete. A description used as an SDP answer may be applied
   * as a response to an SDP offer or as an update to a previously sent SDP
   * "pranswer".
   */
  val answer = "answer".asInstanceOf[RTCSdpType]
}

@js.native
trait RTCSessionDescriptionInit extends js.Object {
  var `type`: RTCSdpType = js.native
  var sdp: String = js.native
}

object RTCSessionDescriptionInit {
  @inline
  def apply(`type`: js.UndefOr[RTCSdpType] = js.undefined,
      sdp: js.UndefOr[String] = js.undefined): RTCSessionDescriptionInit = {
    val result = js.Dynamic.literal()
    `type`.foreach(result.`type` = _)
    sdp.foreach(result.sdp = _)
    result.asInstanceOf[RTCSessionDescriptionInit]
  }
}

@js.native
@JSGlobal
class RTCSessionDescription(
    descriptionInitDict: js.UndefOr[RTCSessionDescriptionInit] = js.undefined)
    extends js.Object {

  /**
   * An enum of type RTCSdpType describing the session description's type.
   *
   * MDN
   */
  var `type`: RTCSdpType = js.native

  /**
   * A DOMString containing the SDP format describing the session.
   *
   * MDN
   */
  var sdp: String = js.native
}

@js.native
trait RTCIceCandidateInit extends js.Object {
  var candidate: String = js.native
  var sdpMid: String = js.native
  var sdpMLineIndex: Double = js.native
}

object RTCIceCandidateInit {
  @inline
  def apply(
      candidate: js.UndefOr[String] = js.undefined,
      sdpMid: js.UndefOr[String] = js.undefined,
      sdpMLineIndex: js.UndefOr[Double] = js.undefined
  ): RTCIceCandidateInit = {
    val result = js.Dynamic.literal()
    candidate.foreach(result.candidate = _)
    sdpMid.foreach(result.sdpMid = _)
    sdpMLineIndex.foreach(result.sdpMLineIndex = _)
    result.asInstanceOf[RTCIceCandidateInit]
  }
}

/**
 * The RTCIceCandidate interface of the the WebRTC API represents a candidate
 * internet connectivity establishment (ICE) server for establishing an
 * RTCPeerConnection.
 *
 * MDN
 */
@js.native
@JSGlobal
class RTCIceCandidate(candidateInitDict: RTCIceCandidateInit)
    extends js.Object {

  /**
   * Returns a transport address for the candidate that can be used for
   * connectivity checks. The format of this address is a candidate-attribute
   * as defined in RFC 5245.
   *
   * MDN
   */
  var candidate: String = js.native

  /**
   * If not null, this contains the identifier of the
   * "media stream identification" (as defined in RFC 5888) for the media
   * component this candidate is associated with.
   *
   * MDN
   */
  var sdpMid: String = js.native

  /**
   * If not null, this indicates the index (starting at zero) of the media
   * description (as defined in RFC 4566) in the SDP this candidate is
   * associated with.
   *
   * MDN
   */
  var sdpMLineIndex: Double = js.native
}

/**
 * see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCDataChannelState]] in W3C spec
 */
@js.native
trait RTCDataChannelState extends js.Any

object RTCDataChannelState {

  /**
   * The user agent is attempting to establish the underlying data transport.
   * This is the initial state of a RTCDataChannel object created with
   * createDataChannel().
   */
  val connecting = "connecting".asInstanceOf[RTCDataChannelState]

  /**
   * The underlying data transport is established and communication is possible.
   * This is the initial state of a RTCDataChannel object dispatched as a part of
   * a RTCDataChannelEvent.
   */
  val open = "open".asInstanceOf[RTCDataChannelState]

  /**
   * The procedure to close down the underlying data transport has started.
   */
  val closing = "closing".asInstanceOf[RTCDataChannelState]

  /**
   * The underlying data transport has been closed or could not be established.
   */
  val closed = "closed".asInstanceOf[RTCDataChannelState]
}

/**
 * The RTCDataChannel interface represents a bi-directional data channel between
 * two peers of a connection.
 *
 * MDN
 */
@js.native
trait RTCDataChannel extends EventTarget {

  /**
   * Returns a DOMString containing a name describing the data channel.
   * There is no constraint of uniqueness about it.
   *
   * MDN
   */
  val label: String = js.native

  /**
   * The read-only property RTCDataChannel.ordered returns a Boolean indicating
   * if the order of delivery of the messages is guaranteed or not.
   *
   * MDN
   */
  val ordered: Boolean = js.native
  val maxPacketLifeTime: Double = js.native
  val maxRetransmits: Double = js.native

  /**
   * Returns a DOMString containing the name of the subprotocol in use.
   * If none, it returns "".
   *
   * MDN
   */
  val protocol: String = js.native
  val negotiated: Boolean = js.native

  /**
   * Returns an unsigned short being a unique id for the channel.
   * It is set at the creation of the RTCDataChannel object.
   *
   * MDN
   */
  val id: Double = js.native

  /**
   * Returns an enum of the type RTCDataChannelState representing the state of
   * the underlying data connection.
   *
   * MDN
   */
  def readyState: RTCDataChannelState = js.native

  /**
   * Returns an unsigned long containing the amount of bytes that have been
   * queued for sending: that is the amount of data requested to be transmitted
   * via RTCDataChannel.send() that has not been sent yet. Note that if the
   * channel state, as given by RTCDataChannel.readyState is "closed",
   * the buffering continues.
   *
   * MDN
   */
  def bufferedAmount: Double = js.native
  var onopen: js.Function1[Event, Any] = js.native
  var onerror: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the close event is received.
   * Such an event is sent when the underlying data transport has been closed.
   *
   * MDN
   */
  var onclose: js.Function1[Event, Any] = js.native
  def close(): Unit = js.native

  /**
   * Is the event handler called when the message event is received.
   * Such an event is sent when a message is available on the data connection.
   *
   * MDN
   */
  var onmessage: js.Function1[MessageEvent, Any] = js.native

  /**
   * Returns a DOMString indicating the type of binary data transmitted by the
   * connection. This should be either "blob" if Blob objects are being used or
   * "arraybuffer" if ArrayBuffer objects are being used.
   * Initially it is set to "blob".
   *
   * It controls the type of the MessageEvent.data property passed in the
   * parameter of message targetting this RTCDataChannel.
   *
   * MDN
   */
  var binaryType: String = js.native

  /**
   * Sends the data in parameter over the channel. The data can be a DOMString,
   * a Blob, an ArrayBuffer or an ArrayBufferView.
   *
   * MDN
   */
  def send(
      data: String | Blob | ArrayBuffer | ArrayBufferView): Unit = js.native
}

//https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCDataChannelInit
@js.native
trait RTCDataChannelInit extends js.Object {
  var ordered: Boolean = js.native
  var maxPacketLifeTime: Double = js.native
  var maxRetransmits: Double = js.native
  var protocol: String = js.native
  var negotiated: Boolean = js.native
  var id: Double = js.native
}

/**
 * The RTCDataChannelEvent interface represents events that occur while
 * attaching a RTCDataChannel to a RTCPeerConnection. The only event sent with
 * this interface is datachannel.
 *
 * MDN
 */
@js.native
@JSGlobal
class RTCDataChannelEvent(typeArg: String,
    init: js.UndefOr[RTCDataChannelEventInit])
    extends Event(typeArg, init) {
  def this(init: RTCDataChannelEventInit) = this("datachannel", init)

  /**
   * Contains the RTCDataChannel containing the data channel associated with
   * the event.
   *
   * MDN
   */
  val channel: RTCDataChannel = js.native
}

trait RTCDataChannelEventInit extends EventInit {
  var channel: js.UndefOr[RTCDataChannel] = js.undefined
}

object RTCDataChannelInit {
  @inline
  def apply(
      ordered: js.UndefOr[Boolean] = js.undefined,
      maxPacketLifeTime: js.UndefOr[Double] = js.undefined,
      maxRetransmits: js.UndefOr[Double] = js.undefined,
      protocol: js.UndefOr[String] = js.undefined,
      negotiated: js.UndefOr[Boolean] = js.undefined,
      id: js.UndefOr[Double] = js.undefined
  ): RTCDataChannelInit = {
    val result = js.Dynamic.literal()
    ordered.foreach(result.ordered = _)
    maxPacketLifeTime.foreach(result.maxPacketLifeTime = _)
    maxRetransmits.foreach(result.maxRetransmits = _)
    protocol.foreach(result.protocol = _)
    negotiated.foreach(result.negotiated = _)
    id.foreach(result.id = _)
    result.asInstanceOf[RTCDataChannelInit]
  }
}

//https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection
@js.native
trait RTCDTMFSender extends js.Object {

  /**
   * The canInsertDTMF attribute must indicate if the RTCDTMFSender is capable
   * of sending DTMF.
   */
  val canInsertDTMF: Boolean = js.native

  /**
   * An RTCDTMFSender object's insertDTMF() method is used to send DTMF tones.
   * The tones parameter is treated as a series of characters. The characters 0
   * through 9, A through D, #, and * generate the associated DTMF tones. The
   * characters a to d are equivalent to A to D. The character ',' indicates a
   * delay of 2 seconds before processing the next character in the tones
   * parameter. All other characters must be considered unrecognized.
   *
   * The duration parameter indicates the duration in ms to use for each character
   * passed in the tones parameters. The duration cannot be more than 6000 ms or
   * less than 40 ms. The default duration is 100 ms for each tone.
   *
   * The interToneGap parameter indicates the gap between tones. It must be at
   * least 30 ms. The default value is 70 ms.
   *
   * The browser may increase the duration and interToneGap times to cause the
   * times that DTMF start and stop to align with the boundaries of RTP packets
   * but it must not increase either of them by more than the duration of a
   * single RTP audio packet.
   */
  def insertDTMF(tones: String = js.native, duration: Double = js.native,
      interToneGap: Double = js.native): Unit = js.native

  /**
   * The track attribute must return the MediaStreamTrack given as argument to
   * the createDTMFSender() method.
   */
  val track: MediaStreamTrack = js.native

  /**
   * This event handler uses the RTCDTMFToneChangeEvent interface to return
   * the character for each tone as it is played out. See RTCDTMFToneChangeEvent
   * for details.
   */
  var ontonechange: js.Function1[Event, Any] = js.native

  /**
   * The toneBuffer attribute must return a list of the tones remaining to be
   * played out. For the syntax, content, and interpretation of this list, see insertDTMF.
   */
  val toneBuffer: String = js.native

  /**
   * The duration attribute must return the current tone duration value. This
   * value will be the value last set via the insertDTMF() method, or the
   * default value of 100 ms if insertDTMF() was called without specifying
   * the duration.
   */
  val duration: Double = js.native

  /**
   * The interToneGap attribute must return the current value of the
   * between-tone gap. This value will be the value last set via the
   * insertDTMF() method, or the default value of 70 ms if insertDTMF() was
   * called without specifying the interToneGap.
   */
  val interToneGap: Double = js.native
}

/**
 * see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCStatsType]] in W3C spec
 */
@js.native
trait RTCStatsType extends js.Any

object RTCStatsType {

  /** Inbound RTP. */
  val `inbound-rtp` = "inbound-rtp".asInstanceOf[RTCStatsType]

  /** Outbound RTP. */
  val `outbound-rtp` = "outbound-rtp".asInstanceOf[RTCStatsType]
}

@js.native
trait RTCStats extends js.Object {
  var timestamp: Double = js.native
  var `type`: RTCStatsType = js.native
  var id: String = js.native
}

//https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCStatsReport
@js.native
trait RTCStatsReport extends js.Object {
  def apply(id: String): RTCStats = js.native
}

trait RTCPeerConnectionIceEventInit extends EventInit {
  var candidate: js.UndefOr[RTCIceCandidate] = js.undefined
}

/**
 * The RTCPeerConnectionIceEvent interface represents events that occurs in
 * relation to ICE candidates with the target, usually an RTCPeerConnection.
 * Only one event is of this type: icecandidate.
 *
 * MDN
 */
@js.native
@JSGlobal
class RTCPeerConnectionIceEvent(typeArg: String,
    init: js.UndefOr[RTCPeerConnectionIceEventInit])
    extends Event(typeArg, init) {

  /**
   * Contains the RTCIceCandidate containing the candidate associated with
   * the event.
   *
   * MDN
   */
  var candidate: RTCIceCandidate = js.native
}

/**
 * see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#rtciceconnectionstate-enum]] in W3C spec
 */
@js.native
trait RTCIceConnectionState extends js.Any

object RTCIceConnectionState {

  /**
   * The ICE Agent is gathering addresses and/or waiting for remote candidates
   *  to be supplied.
   */
  val `new` = "new".asInstanceOf[RTCIceConnectionState]

  /**
   * The ICE Agent has received remote candidates on at least one component,
   * and is checking candidate pairs but has not yet found a connection. In
   * addition to checking, it may also still be gathering.
   */
  val checking = "checking".asInstanceOf[RTCIceConnectionState]

  /**
   * The ICE Agent has found a usable connection for all components but is
   * still checking other candidate pairs to see if there is a better
   * connection. It may also still be gathering.
   */
  val connected = "connected".asInstanceOf[RTCIceConnectionState]

  /**
   * The ICE Agent has finished gathering and checking and found a connection
   * for all components. Open issue: it is not clear how the non controlling
   * ICE side knows it is in the state.
   */
  val completed = "completed".asInstanceOf[RTCIceConnectionState]

  /**
   * The ICE Agent is finished checking all candidate pairs and failed to find
   * a connection for at least one component. Connections may have been found
   * for some components.
   */
  val failed = "failed".asInstanceOf[RTCIceConnectionState]

  /**
   * Liveness checks have failed for one or more components. This is more
   * aggressive than failed, and may trigger intermittently (and resolve itself
   * without action) on a flaky network.
   */
  val disconnected = "disconnected".asInstanceOf[RTCIceConnectionState]

  /**
   * The ICE Agent has shut down and is no longer responding to STUN requests.
   */
  val closed = "closed".asInstanceOf[RTCIceConnectionState]
}

@js.native
trait RTCSignalingState extends js.Any

object RTCSignalingState {

  /**
   * There is no offer­answer exchange in progress. This is also the initial
   * state in which case the local and remote descriptions are empty.
   */
  val stable = "stable".asInstanceOf[RTCSignalingState]

  /**
   * A local description, of type "offer", has been successfully applied.
   */
  val `have-local-offer` = "have-local-offer".asInstanceOf[RTCSignalingState]

  /**
   * A remote description, of type "offer", has been successfully applied.
   */
  val `have-remote-offer` = "have-remote-offer".asInstanceOf[RTCSignalingState]

  /**
   * A remote description of type "offer" has been successfully applied and
   * a local description of type "pranswer" has been successfully applied.
   */
  val `have-local-pranswer` =
    "have-local-pranswer".asInstanceOf[RTCSignalingState]

  /**
   * A local description of type "offer" has been successfully applied and a
   * remote description of type "pranswer" has been successfully applied.
   */
  val `have-remote-pranswer` =
    "have-remote-pranswer".asInstanceOf[RTCSignalingState]

  /**
   * The connection is closed.
   */
  val closed = "closed".asInstanceOf[RTCSignalingState]
}

@js.native
trait RTCIceGatheringState extends js.Any

object RTCIceGatheringState {

  /**
   * The object was just created, and no networking has occurred yet.
   */
  val `new` = "new".asInstanceOf[RTCIceGatheringState]

  /**
   * The ICE engine is in the process of gathering candidates for this
   * RTCPeerConnection.
   */
  val gathering = "gathering".asInstanceOf[RTCIceGatheringState]

  /**
   * The ICE engine has completed gathering. Events such as adding a new
   * interface or a new TURN server will cause the state to go back to gathering.
   */
  val complete = "complete".asInstanceOf[RTCIceGatheringState]
}

trait MediaStreamEventInit extends EventInit {
  var stream: js.UndefOr[MediaStream] = js.undefined
}

/**
 * The RTCPeerConnection interface represents a WebRTC connection between the
 * local computer and a remote peer. It is used to handle efficient streaming of
 * data between the two peers.
 *
 * MDN
 */
@js.native
@JSGlobal
class RTCPeerConnection(
    configuration: js.UndefOr[RTCConfiguration] = js.undefined)
    extends EventTarget {

  /**
   * Returns an enum of type RTCIceConnectionState that describes the
   * ICE connection state for the connection. When this value changes, a
   * iceconnectionstatechange event is fired on the object. The possible values
   * are:
   *  - "new": the ICE agent is gathering addresses or waiting for remote
   *    candidates (or both).
   *
   *  - "checking": the ICE agent has remote candidates, on at least one
   *    component, and is check them, though it has not found a connection yet.
   *    At the same time, it may still be gathering candidates.
   *
   *  - "connected": the ICE agent has found a usable connection for each
   *    component, but is still testing more remote candidates for a better
   *    connection. At the same time, it may still be gathering candidates.
   *
   *  - "completed": the ICE agent has found a usable connection for each
   *    component, and is no more testing remote candidates.
   *
   *  - "failed": the ICE agent has checked all the remote candidates and
   *    didn't find a match for at least one component. Connections may have
   *    been found for some components.
   *
   *  - "disconnected": liveness check has failed for at least one component.
   *    This may be a transient state, e. g. on a flaky network, that can
   *    recover by itself.
   *
   *  - "closed": the ICE agent has shutdown and is not answering to requests.
   *
   * MDN
   */
  def iceConnectionState: RTCIceConnectionState = js.native

  /**
   * Returns an enum of type RTCIceGatheringState that describes the
   * ICE gathering state for the connection. The possible values are:
   *  - "new": the object was just created, and no networking has occurred yet.
   *
   *  - "gathering": the ICE engine is in the process of gathering candidates
   *    for this connection.
   *
   *  - "complete": the ICE engine has completed gathering. Events such as
   *    adding a new interface or a new TURN server will cause the state to
   *    go back to gathering.
   *
   * MDN
   */
  def iceGatheringState: RTCIceGatheringState = js.native

  /**
   * This attribute indicates whether the remote peer is able to accept trickled
   * ICE candidates [TRICKLE-ICE]. The value is determined based on whether a
   * remote description indicates support for trickle ICE, as defined in Section
   * 4.1.9 of [RTCWEB-JSEP]. Prior to the completion of setRemoteDescription,
   * this value is null.
   */
  val canTrickleIceCandidates: js.Any = js.native

  /**
   * Returns a RTCSessionDescription describing the session for the
   * local end of the connection. If it has not yet been set, it can be null.
   *
   * MDN
   */
  def localDescription: RTCSessionDescription = js.native

  /**
   * Returns a RTCIdentityAssertion, that is a couple of a domain name (idp)
   * and a name (name) representing the identity of the remote peer of this
   * connection, once set and verified. If no peer has yet been set and
   * verified, this property will return null. Once set, via the appropriate
   * method, it can't be changed.
   *
   * MDN
   */
  val peerIdentity: RTCIdentityAssertion = js.native

  /**
   * Returns a RTCSessionDescription describing the session for the remote end
   * of the connection. If it has not yet been set, it can be null.
   *
   * MDN
   */
  def remoteDescription: RTCSessionDescription = js.native

  /**
   * Returns an enum of type RTCSignalingState that describes the
   * signaling state of the local connection. This state describes the SDP
   * offer, that defines the configuration of the connections like the
   * description of the locally associated objects of type MediaStream, the
   * codec/RTP/RTCP options, the candidates gathered by the ICE Agent. When
   * this value changes, a signalingstatechange event is fired on the object.
   * The possible values are:
   *
   *  - "stable": there is no SDP offer/answer exchange in progress. This is
   *    also the initial state of the connection.
   *
   *  - "have-local-offer": the local end of the connection has locally applied
   *    a SDP offer.
   *
   *  - "have-remote-offer": the remote end of the connection has locally
   *    applied a SDP offer.
   *
   *  - "have-local-pranswer": a remote SDP offer has been applied, and a SDP
   *    pranswer applied locally.
   *
   *  - "have-remote-pranswer": a local SDP offer has been applied, and a SDP
   *    pranswer applied remotely.
   *
   *  - "closed": the connection is closed.
   *
   * MDN
   */
  def signalingState: RTCSignalingState = js.native

  var ontrack: js.Function1[MediaStreamTrackEvent, Any] = js.native

  /**
   * Is the event handler called when the datachannel event is received. Such
   * an event is sent when a RTCDataChannel is added to this connection.
   *
   * MDN
   */
  var ondatachannel: js.Function1[RTCDataChannelEvent, Any] = js.native

  /**
   * Is the event handler called when the icecandidate event is received. Such
   * an event is sent when a RTCICECandidate object is added to the script.
   *
   * MDN
   */
  var onicecandidate: js.Function1[RTCPeerConnectionIceEvent, Any] = js.native

  /**
   * Is the event handler called when the iceconnectionstatechange event is
   * received. Such an event is sent when the value of iceConnectionState
   * changes.
   *
   * MDN
   */
  var oniceconnectionstatechange: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the identityresult event is received.
   * Such an event is sent when an identity assertion is generated, via
   * getIdentityAssertion(), or during the creation of an offer or an answer.
   *
   * MDN
   */
  var onidentityresult: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the idpassertionerror event is received.
   * Such an event is sent when the associated identity provider (IdP)
   * encounters an error while generating an identity assertion.
   *
   * MDN
   */
  var onidpassertionerror: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler alled when the idpvalidationerror event is received.
   * Such an event is sent when the associated identity provider (IdP)
   * encounters an error while validating an identity assertion.
   *
   * MDN
   */
  var onidpvalidationerror: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the negotiationneeded event, sent by the
   * browser to inform that negotiation will be required at some point in the
   * future, is received.
   *
   * MDN
   */
  var onnegotiationneeded: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the peeridentity event, sent when a peer
   * identity has been set and verified on this connection, is received.
   *
   * MDN
   */
  var onpeeridentity: js.Function1[Event, Any] = js.native

  var onremovetrack: js.Function1[MediaStreamTrackEvent, Any] = js.native

  /**
   * Is the event handler called when the signalingstatechange event, sent when
   * the value of signalingState changes, is received.
   *
   * MDN
   */
  var onsignalingstatechange: js.Function1[Event, Any] = js.native

  /**
   * The createOffer() method of the RTCPeerConnection interface initiates the
   * creation of an SDP offer for the purpose of starting a new WebRTC connection
   * to a remote peer. The SDP offer includes information about any MediaStreamTracks
   * already attached to the WebRTC session, codec, and options supported by the
   * browser, and any candidates already gathered by the ICE agent, for the purpose
   * of being sent over the signaling channel to a potential peer to request a connection
   * or to update the configuration of an existing connection.
   *
   * The return value is a Promise which, when the offer has been created, is resolved
   * with a RTCSessionDescription object containing the newly-created offer.
   *
   * MDN
   */
  def createOffer(
      options: RTCOfferOptions = js.native): js.Promise[RTCSessionDescription] = js.native

  /**
   * The createAnswer() method on the RTCPeerConnection interface creates an SDP answer to
   * an offer received from a remote peer during the offer/answer negotiation of a WebRTC
   * connection. The answer contains information about any media already attached to the
   * session, codecs and options supported by the browser, and any ICE candidates already
   * gathered. The answer is delivered to the returned Promise, and should then be sent to
   * the source of the offer to continue the negotiation process.
   *
   * MDN
   */
  def createAnswer(): js.Promise[RTCSessionDescription] = js.native

  /**
   * Changes the local description associated with the connection. The
   * description defines the properties of the connection like its codec. The
   * connection is affected by this change and must be able to support both
   * old and new descriptions. The method takes one parameters, a
   * RTCSessionDescription object to set, and returns a Promise.
   *
   * MDN
   */
  def setLocalDescription(
      description: RTCSessionDescription): js.Promise[Unit] = js.native

  /**
   * Changes the remote description associated with the connection. The
   * description defines the properties of the connection like its codec.
   * The connection is affected by this change and must be able to support
   * both old and new descriptions. The method takes one parameters, a
   * RTCSessionDescription object to set, and returns a Promise.
   *
   * MDN
   */
  def setRemoteDescription(
      description: RTCSessionDescription): js.Promise[Unit] = js.native

  /**
   * The updateIce method updates the ICE Agent process of gathering local
   * candidates and pinging remote candidates. If there is a mandatory
   * constraint called "IceTransports" it will control how the ICE engine
   * can act. This can be used to limit the use to TURN candidates by a callee
   * to avoid leaking location information prior to the call being accepted.
   * This call may result in a change to the state of the ICE Agent, and may
   * result in a change to media state if it results in connectivity being
   * established
   *
   * MDN
   */
  def updateIce(configuration: RTCConfiguration): Unit = js.native

  /**
   * The addIceCandidate() method provides a remote candidate to the ICE Agent.
   * In addition to being added to the remote description, connectivity checks
   * will be sent to the new candidates as long as the "IceTransports"
   * constraint is not set to "none". This call will result in a change to the
   * connection state of the ICE Agent, and may result in a change to media
   * state if it results in different connectivity being established.
   *
   * MDN
   */
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native

  def getConfiguration(): RTCConfiguration = js.native

  /**
   * Returns an array of MediaStream associated with the local end of the
   * connection. The array may be empty.
   *
   * MDN
   */
  def getLocalStreams(): js.Array[MediaStream] = js.native

  /**
   * Returns an array of MediaStream associated with the remote end of the
   * connection. The array may be empty.
   *
   * MDN
   */
  def getRemoteStreams(): js.Array[MediaStream] = js.native

  /**
   * Returns the MediaStream with the given id that is associated with local
   * or remote end of the connection. If no stream matches, it returns null.
   *
   * MDN
   */
  def getStreamById(id: String): MediaStream = js.native

  /**
   * Adds a MediaStream as a local source of audio or video. If the
   * negotiation already happened, a new one will be needed for the remote
   * peer to be able to use it.
   *
   * MDN
   */
  def addStream(stream: MediaStream): Unit = js.native

  /**
   * Removes a MediaStream as a local source of audio or video. If the
   * negotiation already happened, a new one will be needed for the remote
   * peer to stop using it.
   *
   * MDN
   */
  def removeStream(stream: MediaStream): Unit = js.native

  /**
   * Abruptly closes a connection.
   *
   * MDN
   */
  def close(): Unit = js.native

  /**
   * Creates a new RTCDataChannel associated with this connection. The method
   * takes a dictionary as parameter, with the configuration required for the
   * underlying data channel, like its reliability.
   *
   * MDN
   */
  def createDataChannel(label: String,
      dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native

  /**
   * Creates a new RTCDTMFSender, associated to a specific MediaStreamTrack,
   * that will be able to send DTMF phone signaling over the connection.
   *
   * MDN
   */
  def createDTMFSender(track: MediaStreamTrack): RTCDTMFSender = js.native

  /**
   * Creates a new RTCStatsReport that contains and allows access to statistics
   * regarding the connection.
   *
   * MDN
   */
  def getStats(selector: MediaStreamTrack,
      callback: js.Function1[RTCStatsReport, Any],
      error: js.Function1[DOMException, Any]): RTCStatsReport = js.native

  /**
   * Sets the identity provider to be used for a given RTCPeerConnection object.
   * Applications need not make this call; if the browser is already configured
   * for an IdP, then that configured IdP might be used to get an assertion.
   *
   * When the setIdentityProvider() method is invoked, the user agent must run the
   * following steps:
   * -  If the connection's RTCPeerConnection signalingState is closed, throw
   *    an InvalidStateError exception and abort these steps.
   *
   * -  Set the current identity provider values to the triplet (provider,
   *    protocol, usernameHint).
   *
   * -  If any identity provider value has changed, discard any stored identity
   *    assertion.
   *
   * -  Identity provider information is not used until an identity assertion
   *    is required, either in response to a call to getIdentityAssertion, or a
   *    session description is requested with a call to either createOffer or
   *    createAnswer.
   */
  def setIdentityProvider(provider: String, protocol: String = js.native,
      usernameHint: String = js.native): Unit = js.native

  /**
   * Initiates the process of obtaining an identity assertion. Applications
   * need not make this call. It is merely intended to allow them to start the
   * process of obtaining identity assertions before a call is initiated. If an
   * identity is needed, either because the browser has been configured with a
   * default identity provider or because the setIdentityProvider() method was
   * called, then an identity will be automatically requested when an offer or
   * answer is created.
   *
   * When getIdentityAssertion is invoked, queue a task to run the following
   * steps:
   *
   * -  If the connection's RTCPeerConnection signalingState is closed, abort
   *    these steps.
   *
   * -  Request an identity assertion from the IdP.
   */
  def getIdentityAssertion(): js.Promise[Unit] = js.native
}
