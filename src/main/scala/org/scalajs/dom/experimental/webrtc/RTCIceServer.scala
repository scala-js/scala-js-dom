/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import scala.scalajs.js
import scala.scalajs.js.|

trait RTCIceServer extends js.Object {
  var urls: js.UndefOr[String | js.Array[String]] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var credential: js.UndefOr[String] = js.undefined
}

@deprecated("all members of RTCIceServer are deprecated", "2.0.0")
object RTCIceServer {

  @deprecated("use `new RTCIceServer { ... }` instead", "2.0.0")
  @inline
  def apply(urls: js.UndefOr[String | js.Array[String]] = js.undefined, username: js.UndefOr[String] = js.undefined,
      credential: js.UndefOr[String] = js.undefined): RTCIceServer = {
    val result = js.Dynamic.literal()
    urls.foreach(v => result.urls = v.asInstanceOf[js.Any])
    username.foreach(result.username = _)
    credential.foreach(result.credential = _)
    result.asInstanceOf[RTCIceServer]
  }
}
