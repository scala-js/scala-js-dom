/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The ImageCapture interface of the MediaStream Image Capture API provides methods to enable the capture of images or
  * photos from a camera or other photographic device referenced through a valid MediaStreamTrack.
  */
@js.native
@JSGlobal
class ImageCapture(
    init: MediaStreamTrack
) extends js.Object {

  /** Returns a reference to the MediaStreamTrack passed to the constructor. */
  val track: MediaStreamTrack = js.native

  /** Takes a single exposure using the video capture device sourcing a MediaStreamTrack and returns a Promise that
    * resolves with a Blob containing the data.
    */
  def takePhoto(): js.Promise[Blob] = js.native

  /** Takes a snapshot of the live video in a MediaStreamTrack, returning an ImageBitmap, if successful. */
  def grabFrame(): js.Promise[ImageBitmap] = js.native
}
