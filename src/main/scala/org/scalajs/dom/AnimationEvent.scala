/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The AnimationEvent interface represents events providing information related to animations. */
@js.native
trait AnimationEvent extends Event {

  /** The AnimationEvent.animationName read-only property is a DOMString containing the value of the animation-name CSS
    * property associated with the transition.
    */
  def animationName: String = js.native

  /** The AnimationEvent.elapsedTime read-only property is a float giving the amount of time the animation has been
    * running, in seconds, when this event fired, excluding any time the animation was paused. For an "animationstart"
    * event, elapsedTime is 0.0 unless there was a negative value for animation-delay, in which case the event will be
    * fired with elapsedTime containing  (-1 * delay).
    */
  def elapsedTime: Double = js.native
}
