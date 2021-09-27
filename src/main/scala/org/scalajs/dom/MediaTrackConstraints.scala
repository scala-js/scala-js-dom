/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js

trait MediaTrackConstraints extends MediaTrackConstraintSet {
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined
}

@deprecated("all the members of MediaTrackConstraints are deprecated", "2.0.0")
object MediaTrackConstraints {

  @deprecated("use `new MediaTrackConstraints { ... }` instead", "2.0.0")
  @inline
  def apply(
      advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined
  ): MediaTrackConstraints = {
    val result = js.Dynamic.literal()
    advanced.foreach(result.advanced = _)
    result.asInstanceOf[MediaTrackConstraints]
  }
}
