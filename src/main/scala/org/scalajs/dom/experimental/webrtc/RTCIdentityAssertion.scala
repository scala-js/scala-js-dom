/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{Blob, DOMException, Event, EventInit, EventTarget, MessageEvent}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

trait RTCIdentityAssertion extends js.Object {
  val idp: String
  val name: String
}

@deprecated("all members of RTCPeerConnection are deprecated", "2.0.0")
object RTCIdentityAssertion {

  @deprecated("RTCIdentityAssertions should not be created manually", "2.0.0")
  @inline
  def apply(
      idp: js.UndefOr[String] = js.undefined, name: js.UndefOr[String] = js.undefined
  ): RTCIdentityAssertion = {
    val result = js.Dynamic.literal()
    idp.foreach(result.idp = _)
    name.foreach(result.name = _)
    result.asInstanceOf[RTCIdentityAssertion]
  }
}
