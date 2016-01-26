package org.scalajs.dom.experimental

import org.scalajs.dom.DOMError
import org.scalajs.dom.experimental.mediastream._
import scala.scalajs.js
import scala.language.implicitConversions

package object webrtc {
  implicit def toWebRTC(n: org.scalajs.dom.Navigator): NavigatorMediaStream =
    n.asInstanceOf[NavigatorMediaStream]

  @js.native
  trait NavigatorMediaStream extends js.Object {
    
    def getUserMedia(constraints: MediaStreamConstraints, success: js.Function1[MediaStream,Any], error: js.Function1[DOMError, Any] ): Unit = js.native
  }
}
