/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{Blob, DOMException, Event, EventInit, EventTarget, MessageEvent}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCBundlePolicy]] in W3C spec */
sealed trait RTCBundlePolicy extends js.Any

object RTCBundlePolicy {

  /** Gather ICE candidates for each media type in use (audio, video, and data). If the remote endpoint is not
    * BUNDLE-aware, negotiate only one audio and video track on separate transports.
    */
  val balanced: RTCBundlePolicy = "balanced".asInstanceOf[RTCBundlePolicy]

  /** Gather ICE candidates for each track. If the remote endpoint is not BUNDLE-aware, negotiate all media tracks on
    * separate transports.
    */
  val `max-compat` = "max-compat".asInstanceOf[RTCBundlePolicy]

  /** Gather ICE candidates for only one track. If the remote endpoint is not BUNDLE-aware, negotiate only one media
    * track.
    */
  val `max-bundle` = "max-bundle".asInstanceOf[RTCBundlePolicy]
}
