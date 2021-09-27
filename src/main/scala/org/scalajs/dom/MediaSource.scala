/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Represents a source of media data for an HTMLMediaElement object.
  *
  * A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent.
  */
@js.native
@JSGlobal
class MediaSource extends EventTarget {
  def sourceBuffers: SourceBufferList = js.native
  def activeSourceBuffers: SourceBufferList = js.native
  def readyState: String = js.native

  /** Allows the web application to set the presentation duration.
    *
    * The duration is initially set to NaN when the MediaSource object is created.
    */
  var duration: Double = js.native

  var onsourceopen: js.Function1[Event, Any] = js.native
  var onsourceended: js.Function1[Event, Any] = js.native
  var onsourceclose: js.Function1[Event, Any] = js.native

  def addSourceBuffer(mimeType: String): SourceBuffer = js.native
  def removeSourceBuffer(sourceBuffer: SourceBuffer): Unit = js.native
  def endOfStream(error: String = js.native): Unit = js.native
  def setLiveSeekableRange(start: Double, end: Double): Unit = js.native
  def clearLiveSeekableRange(): Unit = js.native
}

@js.native
@JSGlobal
object MediaSource extends js.Object {
  def isTypeSupported(mediaType: String): Boolean = js.native
}
