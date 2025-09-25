/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
/** Provides functionality to easily record media */
class MediaRecorder(stream: MediaStream, options: MediaRecorderOptions) extends EventTarget {

  /** Fires periodically each time timeslice milliseconds of media have been recorded (or when the entire media has been
    * recorded, if timeslice wasn't specified). The event, of type BlobEvent, contains the recorded media in its data
    * property.
    */
  var ondataavailable: js.Function1[BlobEvent, Any] = js.native

  /** Fired when there are fatal errors that stop recording. The received event is based on the MediaRecorderErrorEvent
    * interface, whose error property contains a DOMException that describes the actual error that occurred.
    */
  var onerror: js.Function1[Event, Any] = js.native

  /** Fired when media recording ends, either when the MediaStream ends, or after the MediaRecorder.stop() method is
    * called.
    */
  var onstop: js.Function1[Event, Any] = js.native

  def this(stream: MediaStream) = this(stream, js.native)

  /** Used to resume media recording when it has been previously paused. */
  def resume(): Unit = js.native

  /** Begins recording media into one or more Blob objects. */
  def start(): Unit = js.native

  /** Used to stop media capture. */
  def stop(): Unit = js.native

}
