/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

trait MediaTrackSettings extends js.Object {
  var width: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var facingMode: js.UndefOr[String] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var sampleSize: js.UndefOr[Double] = js.undefined
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  var latency: js.UndefOr[Double] = js.undefined
  var channelCount: js.UndefOr[Double] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
}
