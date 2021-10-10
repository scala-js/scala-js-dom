/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

trait RTCConfiguration extends js.Object {

  /** An array containing URIs of servers available to be used by ICE, such as STUN and TURN server. */
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined

  /** defaulting to "all" Indicates which candidates the ICE engine is allowed to use. */
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined

  /** defaulting to "balanced" Indicates which BundlePolicy to use. */
  var bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.undefined

  /** Sets the target peer identity for the RTCPeerConnection. The RTCPeerConnection will establish a connection to a
    * remote peer unless it can be successfully authenticated with the provided name.
    */
  var peerIdentity: js.UndefOr[String] = js.undefined
}

@deprecated("all members of RTCConfiguration are deprecated", "2.0.0")
object RTCConfiguration {

  @deprecated("use `new RTCConfiguration { ... }` instead", "2.0.0")
  @inline
  def apply(iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined,
      iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined,
      bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.undefined,
      peerIdentity: js.UndefOr[String] = js.undefined): RTCConfiguration = {
    val result = js.Dynamic.literal()
    iceServers.foreach(result.iceServers = _)
    iceTransportPolicy.map(_.asInstanceOf[js.Any]).foreach(result.iceTransportPolicy = _)
    bundlePolicy.map(_.asInstanceOf[js.Any]).foreach(result.bundlePolicy = _)
    peerIdentity.map(_.asInstanceOf[js.Any]).foreach(result.peerIdentity = _)
    result.asInstanceOf[RTCConfiguration]
  }
}
