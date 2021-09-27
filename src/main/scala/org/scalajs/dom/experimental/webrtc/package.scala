package org.scalajs.dom.experimental

import org.scalajs.dom

package object webrtc {

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  def toWebRTC(n: dom.Navigator): NavigatorMediaStream =
    n

  @deprecated("use dom.Navigator instead", "2.0.0")
  type NavigatorMediaStream = dom.Navigator

  @deprecated("use dom.MediaStreamEventInit instead", "2.0.0")
  type MediaStreamEventInit = dom.MediaStreamEventInit

  @deprecated("use dom.RTCBundlePolicy instead", "2.0.0")
  type RTCBundlePolicy = dom.RTCBundlePolicy

  @deprecated("use dom.RTCBundlePolicy instead", "2.0.0")
  val RTCBundlePolicy = dom.RTCBundlePolicy

  @deprecated("use dom.RTCConfiguration instead", "2.0.0")
  type RTCConfiguration = dom.RTCConfiguration

  @deprecated("use dom.RTCConfiguration instead", "2.0.0")
  val RTCConfiguration = dom.RTCConfiguration

  @deprecated("use dom.RTCDataChannelEventInit instead", "2.0.0")
  type RTCDataChannelEventInit = dom.RTCDataChannelEventInit

  @deprecated("use dom.RTCDataChannelEvent instead", "2.0.0")
  type RTCDataChannelEvent = dom.RTCDataChannelEvent

  @deprecated("use dom.RTCDataChannelInit instead", "2.0.0")
  type RTCDataChannelInit = dom.RTCDataChannelInit

  @deprecated("use dom.RTCDataChannelInit instead", "2.0.0")
  val RTCDataChannelInit = dom.RTCDataChannelInit

  @deprecated("use dom.RTCDataChannel instead", "2.0.0")
  type RTCDataChannel = dom.RTCDataChannel

  @deprecated("use dom.RTCDataChannelState instead", "2.0.0")
  type RTCDataChannelState = dom.RTCDataChannelState

  @deprecated("use dom.RTCDataChannelState instead", "2.0.0")
  val RTCDataChannelState = dom.RTCDataChannelState

  @deprecated("use dom.RTCDTMFSender instead", "2.0.0")
  type RTCDTMFSender = dom.RTCDTMFSender

  @deprecated("use dom.RTCIceCandidateInit instead", "2.0.0")
  type RTCIceCandidateInit = dom.RTCIceCandidateInit

  @deprecated("use dom.RTCIceCandidateInit instead", "2.0.0")
  val RTCIceCandidateInit = dom.RTCIceCandidateInit

  @deprecated("use dom.RTCIceCandidate instead", "2.0.0")
  type RTCIceCandidate = dom.RTCIceCandidate

  @deprecated("use dom.RTCIceConnectionState instead", "2.0.0")
  type RTCIceConnectionState = dom.RTCIceConnectionState

  @deprecated("use dom.RTCIceConnectionState instead", "2.0.0")
  val RTCIceConnectionState = dom.RTCIceConnectionState

  @deprecated("use dom.RTCIceGatheringState instead", "2.0.0")
  type RTCIceGatheringState = dom.RTCIceGatheringState

  @deprecated("use dom.RTCIceGatheringState instead", "2.0.0")
  val RTCIceGatheringState = dom.RTCIceGatheringState

  @deprecated("use dom.RTCIceServer instead", "2.0.0")
  type RTCIceServer = dom.RTCIceServer

  @deprecated("use dom.RTCIceServer instead", "2.0.0")
  val RTCIceServer = dom.RTCIceServer

  @deprecated("use dom.RTCIceTransportPolicy instead", "2.0.0")
  type RTCIceTransportPolicy = dom.RTCIceTransportPolicy

  @deprecated("use dom.RTCIceTransportPolicy instead", "2.0.0")
  val RTCIceTransportPolicy = dom.RTCIceTransportPolicy

  @deprecated("use dom.RTCIdentityAssertion instead", "2.0.0")
  type RTCIdentityAssertion = dom.RTCIdentityAssertion

  @deprecated("use dom.RTCIdentityAssertion instead", "2.0.0")
  val RTCIdentityAssertion = dom.RTCIdentityAssertion

  @deprecated("use dom.RTCOfferOptions instead", "2.0.0")
  type RTCOfferOptions = dom.RTCOfferOptions

  @deprecated("use dom.RTCOfferOptions instead", "2.0.0")
  val RTCOfferOptions = dom.RTCOfferOptions

  @deprecated("use dom.RTCPeerConnectionIceEventInit instead", "2.0.0")
  type RTCPeerConnectionIceEventInit = dom.RTCPeerConnectionIceEventInit

  @deprecated("use dom.RTCPeerConnectionIceEvent instead", "2.0.0")
  type RTCPeerConnectionIceEvent = dom.RTCPeerConnectionIceEvent

  @deprecated("use dom.RTCPeerConnection instead", "2.0.0")
  type RTCPeerConnection = dom.RTCPeerConnection

  @deprecated("use dom.RTCPeerConnection instead", "2.0.0")
  val RTCPeerConnection = dom.RTCPeerConnection

  @deprecated("use dom.RTCSdpType instead", "2.0.0")
  type RTCSdpType = dom.RTCSdpType

  @deprecated("use dom.RTCSdpType instead", "2.0.0")
  val RTCSdpType = dom.RTCSdpType

  @deprecated("use dom.RTCSessionDescriptionInit instead", "2.0.0")
  type RTCSessionDescriptionInit = dom.RTCSessionDescriptionInit

  @deprecated("use dom.RTCSessionDescriptionInit instead", "2.0.0")
  val RTCSessionDescriptionInit = dom.RTCSessionDescriptionInit

  @deprecated("use dom.RTCSessionDescription instead", "2.0.0")
  type RTCSessionDescription = dom.RTCSessionDescription

  @deprecated("use dom.RTCSessionDescription instead", "2.0.0")
  val RTCSessionDescription = dom.RTCSessionDescription

  @deprecated("use dom.RTCSignalingState instead", "2.0.0")
  type RTCSignalingState = dom.RTCSignalingState

  @deprecated("use dom.RTCSignalingState instead", "2.0.0")
  val RTCSignalingState = dom.RTCSignalingState

  @deprecated("use dom.RTCStatsReport instead", "2.0.0")
  type RTCStatsReport = dom.RTCStatsReport

  @deprecated("use dom.RTCStats instead", "2.0.0")
  type RTCStats = dom.RTCStats

  @deprecated("use dom.RTCStatsType instead", "2.0.0")
  type RTCStatsType = dom.RTCStatsType

  @deprecated("use dom.RTCStatsType instead", "2.0.0")
  val RTCStatsType = dom.RTCStatsType

}
