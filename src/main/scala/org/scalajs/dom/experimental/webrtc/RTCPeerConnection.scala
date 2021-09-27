/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom
package experimental.webrtc

import org.scalajs.dom.{DOMException, Event, EventTarget}
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The RTCPeerConnection interface represents a WebRTC connection between the local computer and a remote peer. It is
  * used to handle efficient streaming of data between the two peers.
  */
@js.native
@JSGlobal
class RTCPeerConnection(configuration: js.UndefOr[RTCConfiguration] = js.undefined) extends EventTarget {

  /** Returns an enum of type RTCIceConnectionState that describes the ICE connection state for the connection. When
    * this value changes, a iceconnectionstatechange event is fired on the object. The possible values are:
    *   - "new": the ICE agent is gathering addresses or waiting for remote candidates (or both).
    *
    *   - "checking": the ICE agent has remote candidates, on at least one component, and is check them, though it has
    *     not found a connection yet. At the same time, it may still be gathering candidates.
    *
    *   - "connected": the ICE agent has found a usable connection for each component, but is still testing more remote
    *     candidates for a better connection. At the same time, it may still be gathering candidates.
    *
    *   - "completed": the ICE agent has found a usable connection for each component, and is no more testing remote
    *     candidates.
    *
    *   - "failed": the ICE agent has checked all the remote candidates and didn't find a match for at least one
    *     component. Connections may have been found for some components.
    *
    *   - "disconnected": liveness check has failed for at least one component. This may be a transient state, e. g. on
    *     a flaky network, that can recover by itself.
    *
    *   - "closed": the ICE agent has shutdown and is not answering to requests.
    */
  def iceConnectionState: RTCIceConnectionState = js.native

  /** Returns an enum of type RTCIceGatheringState that describes the ICE gathering state for the connection. The
    * possible values are:
    *   - "new": the object was just created, and no networking has occurred yet.
    *
    *   - "gathering": the ICE engine is in the process of gathering candidates for this connection.
    *
    *   - "complete": the ICE engine has completed gathering. Events such as adding a new interface or a new TURN server
    *     will cause the state to go back to gathering.
    */
  def iceGatheringState: RTCIceGatheringState = js.native

  /** This attribute indicates whether the remote peer is able to accept trickled ICE candidates [TRICKLE-ICE]. The
    * value is determined based on whether a remote description indicates support for trickle ICE, as defined in Section
    * 4.1.9 of [RTCWEB-JSEP]. Prior to the completion of setRemoteDescription, this value is null.
    */
  val canTrickleIceCandidates: js.Any = js.native

  /** Returns a RTCSessionDescription describing the session for the local end of the connection. If it has not yet been
    * set, it can be null.
    */
  def localDescription: RTCSessionDescription = js.native

  /** Returns a RTCIdentityAssertion, that is a couple of a domain name (idp) and a name (name) representing the
    * identity of the remote peer of this connection, once set and verified. If no peer has yet been set and verified,
    * this property will return null. Once set, via the appropriate method, it can't be changed.
    */
  val peerIdentity: RTCIdentityAssertion = js.native

  /** Returns a RTCSessionDescription describing the session for the remote end of the connection. If it has not yet
    * been set, it can be null.
    */
  def remoteDescription: RTCSessionDescription = js.native

  /** Returns an enum of type RTCSignalingState that describes the signaling state of the local connection. This state
    * describes the SDP offer, that defines the configuration of the connections like the description of the locally
    * associated objects of type MediaStream, the codec/RTP/RTCP options, the candidates gathered by the ICE Agent. When
    * this value changes, a signalingstatechange event is fired on the object. The possible values are:
    *
    *   - "stable": there is no SDP offer/answer exchange in progress. This is also the initial state of the connection.
    *
    *   - "have-local-offer": the local end of the connection has locally applied a SDP offer.
    *
    *   - "have-remote-offer": the remote end of the connection has locally applied a SDP offer.
    *
    *   - "have-local-pranswer": a remote SDP offer has been applied, and a SDP pranswer applied locally.
    *
    *   - "have-remote-pranswer": a local SDP offer has been applied, and a SDP pranswer applied remotely.
    *
    *   - "closed": the connection is closed.
    */
  def signalingState: RTCSignalingState = js.native

  var ontrack: js.Function1[MediaStreamTrackEvent, Any] = js.native

  /** Is the event handler called when the datachannel event is received. Such an event is sent when a RTCDataChannel is
    * added to this connection.
    */
  var ondatachannel: js.Function1[RTCDataChannelEvent, Any] = js.native

  /** Is the event handler called when the icecandidate event is received. Such an event is sent when a RTCICECandidate
    * object is added to the script.
    */
  var onicecandidate: js.Function1[RTCPeerConnectionIceEvent, Any] = js.native

  /** Is the event handler called when the iceconnectionstatechange event is received. Such an event is sent when the
    * value of iceConnectionState changes.
    */
  var oniceconnectionstatechange: js.Function1[Event, Any] = js.native

  /** Is the event handler called when the identityresult event is received. Such an event is sent when an identity
    * assertion is generated, via getIdentityAssertion(), or during the creation of an offer or an answer.
    */
  var onidentityresult: js.Function1[Event, Any] = js.native

  /** Is the event handler called when the idpassertionerror event is received. Such an event is sent when the
    * associated identity provider (IdP) encounters an error while generating an identity assertion.
    */
  var onidpassertionerror: js.Function1[Event, Any] = js.native

  /** Is the event handler alled when the idpvalidationerror event is received. Such an event is sent when the
    * associated identity provider (IdP) encounters an error while validating an identity assertion.
    */
  var onidpvalidationerror: js.Function1[Event, Any] = js.native

  /** Is the event handler called when the negotiationneeded event, sent by the browser to inform that negotiation will
    * be required at some point in the future, is received.
    */
  var onnegotiationneeded: js.Function1[Event, Any] = js.native

  /** Is the event handler called when the peeridentity event, sent when a peer identity has been set and verified on
    * this connection, is received.
    */
  var onpeeridentity: js.Function1[Event, Any] = js.native

  var onremovetrack: js.Function1[MediaStreamTrackEvent, Any] = js.native

  /** Is the event handler called when the signalingstatechange event, sent when the value of signalingState changes, is
    * received.
    */
  var onsignalingstatechange: js.Function1[Event, Any] = js.native

  /** The createOffer() method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose
    * of starting a new WebRTC connection to a remote peer. The SDP offer includes information about any
    * MediaStreamTracks already attached to the WebRTC session, codec, and options supported by the browser, and any
    * candidates already gathered by the ICE agent, for the purpose of being sent over the signaling channel to a
    * potential peer to request a connection or to update the configuration of an existing connection.
    *
    * The return value is a Promise which, when the offer has been created, is resolved with a RTCSessionDescription
    * object containing the newly-created offer.
    */
  def createOffer(options: RTCOfferOptions = js.native): js.Promise[RTCSessionDescription] = js.native

  /** The createAnswer() method on the RTCPeerConnection interface creates an SDP answer to an offer received from a
    * remote peer during the offer/answer negotiation of a WebRTC connection. The answer contains information about any
    * media already attached to the session, codecs and options supported by the browser, and any ICE candidates already
    * gathered. The answer is delivered to the returned Promise, and should then be sent to the source of the offer to
    * continue the negotiation process.
    */
  def createAnswer(): js.Promise[RTCSessionDescription] = js.native

  /** Changes the local description associated with the connection. The description defines the properties of the
    * connection like its codec. The connection is affected by this change and must be able to support both old and new
    * descriptions. The method takes one parameters, a RTCSessionDescription object to set, and returns a Promise.
    */
  def setLocalDescription(description: RTCSessionDescription): js.Promise[Unit] = js.native

  /** Changes the remote description associated with the connection. The description defines the properties of the
    * connection like its codec. The connection is affected by this change and must be able to support both old and new
    * descriptions. The method takes one parameters, a RTCSessionDescription object to set, and returns a Promise.
    */
  def setRemoteDescription(description: RTCSessionDescription): js.Promise[Unit] = js.native

  /** The updateIce method updates the ICE Agent process of gathering local candidates and pinging remote candidates. If
    * there is a mandatory constraint called "IceTransports" it will control how the ICE engine can act. This can be
    * used to limit the use to TURN candidates by a callee to avoid leaking location information prior to the call being
    * accepted. This call may result in a change to the state of the ICE Agent, and may result in a change to media
    * state if it results in connectivity being established
    */
  def updateIce(configuration: RTCConfiguration): Unit = js.native

  /** The addIceCandidate() method provides a remote candidate to the ICE Agent. In addition to being added to the
    * remote description, connectivity checks will be sent to the new candidates as long as the "IceTransports"
    * constraint is not set to "none". This call will result in a change to the connection state of the ICE Agent, and
    * may result in a change to media state if it results in different connectivity being established.
    */
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native

  def getConfiguration(): RTCConfiguration = js.native

  /** Returns an array of MediaStream associated with the local end of the connection. The array may be empty. */
  def getLocalStreams(): js.Array[MediaStream] = js.native

  /** Returns an array of MediaStream associated with the remote end of the connection. The array may be empty. */
  def getRemoteStreams(): js.Array[MediaStream] = js.native

  /** Returns the MediaStream with the given id that is associated with local or remote end of the connection. If no
    * stream matches, it returns null.
    */
  def getStreamById(id: String): MediaStream = js.native

  /** Adds a MediaStream as a local source of audio or video. If the negotiation already happened, a new one will be
    * needed for the remote peer to be able to use it.
    */
  def addStream(stream: MediaStream): Unit = js.native

  /** Removes a MediaStream as a local source of audio or video. If the negotiation already happened, a new one will be
    * needed for the remote peer to stop using it.
    */
  def removeStream(stream: MediaStream): Unit = js.native

  /** Abruptly closes a connection. */
  def close(): Unit = js.native

  /** Creates a new RTCDataChannel associated with this connection. The method takes a dictionary as parameter, with the
    * configuration required for the underlying data channel, like its reliability.
    */
  def createDataChannel(label: String, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native

  /** Creates a new RTCDTMFSender, associated to a specific MediaStreamTrack, that will be able to send DTMF phone
    * signaling over the connection.
    */
  def createDTMFSender(track: MediaStreamTrack): RTCDTMFSender = js.native

  /** Creates a new RTCStatsReport that contains and allows access to statistics regarding the connection. */
  def getStats(selector: MediaStreamTrack, callback: js.Function1[RTCStatsReport, Any],
      error: js.Function1[DOMException, Any]): RTCStatsReport = js.native

  /** Sets the identity provider to be used for a given RTCPeerConnection object. Applications need not make this call;
    * if the browser is already configured for an IdP, then that configured IdP might be used to get an assertion.
    *
    * When the setIdentityProvider() method is invoked, the user agent must run the following steps:
    *   - If the connection's RTCPeerConnection signalingState is closed, throw an InvalidStateError exception and abort
    *     these steps.
    *
    *   - Set the current identity provider values to the triplet (provider, protocol, usernameHint).
    *
    *   - If any identity provider value has changed, discard any stored identity assertion.
    *
    *   - Identity provider information is not used until an identity assertion is required, either in response to a
    *     call to getIdentityAssertion, or a session description is requested with a call to either createOffer or
    *     createAnswer.
    */
  def setIdentityProvider(provider: String, protocol: String = js.native,
      usernameHint: String = js.native): Unit = js.native

  /** Initiates the process of obtaining an identity assertion. Applications need not make this call. It is merely
    * intended to allow them to start the process of obtaining identity assertions before a call is initiated. If an
    * identity is needed, either because the browser has been configured with a default identity provider or because the
    * setIdentityProvider() method was called, then an identity will be automatically requested when an offer or answer
    * is created.
    *
    * When getIdentityAssertion is invoked, queue a task to run the following steps:
    *
    *   - If the connection's RTCPeerConnection signalingState is closed, abort these steps.
    *
    *   - Request an identity assertion from the IdP.
    */
  def getIdentityAssertion(): js.Promise[Unit] = js.native
}
