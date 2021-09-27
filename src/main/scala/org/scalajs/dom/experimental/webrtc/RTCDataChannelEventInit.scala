/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.EventInit
import scala.scalajs.js

trait RTCDataChannelEventInit extends EventInit {
  var channel: js.UndefOr[RTCDataChannel] = js.undefined
}
