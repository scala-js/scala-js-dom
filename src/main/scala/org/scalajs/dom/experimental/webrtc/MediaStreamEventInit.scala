/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.EventInit
import org.scalajs.dom.experimental.mediastream._
import scala.scalajs.js

trait MediaStreamEventInit extends EventInit {
  var stream: js.UndefOr[MediaStream] = js.undefined
}
