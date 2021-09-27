/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait TextTrackCueList extends js.Object {
  def length: Double = js.native

  @JSBracketAccess
  def apply(index: Double): TextTrackCue = js.native

  def getCueById(id: String): TextTrackCue = js.native
}
