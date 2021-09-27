/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

trait MediaTrackConstraintSet extends js.Object {
  var width: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var facingMode: js.UndefOr[String] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var sampleSize: js.UndefOr[Double] = js.undefined
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
}

@deprecated("all the members of MediaTrackConstraintSet are deprecated", "2.0.0")
object MediaTrackConstraintSet {

  @deprecated("use `new MediaTrackConstraintSet { ... }` instead", "2.0.0")
  @inline
  def apply(
      width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined,
      aspectRatio: js.UndefOr[Double] = js.undefined, frameRate: js.UndefOr[Double] = js.undefined,
      facingMode: js.UndefOr[String] = js.undefined, volume: js.UndefOr[Double] = js.undefined,
      sampleRate: js.UndefOr[Double] = js.undefined, sampleSize: js.UndefOr[Double] = js.undefined,
      echoCancellation: js.UndefOr[Boolean] = js.undefined, deviceId: js.UndefOr[String] = js.undefined,
      groupId: js.UndefOr[String] = js.undefined
  ): MediaTrackConstraintSet = {
    val result = js.Dynamic.literal()
    width.foreach(result.width = _)
    height.foreach(result.height = _)
    aspectRatio.foreach(result.aspectRatio = _)
    frameRate.foreach(result.frameRate = _)
    facingMode.foreach(result.facingMode = _)
    volume.foreach(result.volume = _)
    sampleRate.foreach(result.sampleRate = _)
    sampleSize.foreach(result.sampleSize = _)
    echoCancellation.foreach(result.echoCancellation = _)
    deviceId.foreach(result.deviceId = _)
    groupId.foreach(result.groupId = _)
    result.asInstanceOf[MediaTrackConstraintSet]
  }
}
