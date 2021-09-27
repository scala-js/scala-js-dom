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

/** The TransitionEvent interface represents events providing information related to transitions. */
@js.native
trait TransitionEvent extends Event {
  def propertyName: String = js.native

  /** The TransionnEvent.elapsedTime read-only property is a float giving the amount of time the animation has been
    * running, in seconds, when this event fired. This value is not affected by the transition-delay property.
    */
  def elapsedTime: Double = js.native
}
