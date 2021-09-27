/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import scala.scalajs.js

/** The MediaTrackSupportedConstraints dictionary establishes the list of constrainable properties recognized by the
  * user agent or browser in its implementation of the MediaStreamTrack object. An object conforming to
  * MediaTrackSupportedConstraints is returned by MediaDevices.getSupportedConstraints().
  */
trait MediaTrackSupportedConstraints extends js.Object {
  var width: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Boolean] = js.undefined
  var aspectRatio: js.UndefOr[Boolean] = js.undefined
  var frameRate: js.UndefOr[Boolean] = js.undefined
  var facingMode: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Boolean] = js.undefined
  var sampleRate: js.UndefOr[Boolean] = js.undefined
  var sampleSize: js.UndefOr[Boolean] = js.undefined
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  var latency: js.UndefOr[Boolean] = js.undefined
  var channelCount: js.UndefOr[Boolean] = js.undefined
  var deviceId: js.UndefOr[Boolean] = js.undefined
  var groupId: js.UndefOr[Boolean] = js.undefined
}
