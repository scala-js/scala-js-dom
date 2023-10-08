/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class MediaRecorder(stream: MediaStream) extends EventTarget {
  var ondataavailable: js.Function1[Event, Any] = js.native
  var onerror: js.Function1[Event, Any] = js.native
  var onstop: js.Function1[Event, Any] = js.native

  def resume(): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native

}
