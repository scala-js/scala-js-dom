/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait SourceBufferList extends EventTarget {
  def length: Double = js.native

  @JSBracketAccess
  def apply(index: Double): SourceBuffer = js.native

  var onaddsourcebuffer: js.Function1[Event, Any] = js.native
  var onremovesourcebuffer: js.Function1[Event, Any] = js.native
}
