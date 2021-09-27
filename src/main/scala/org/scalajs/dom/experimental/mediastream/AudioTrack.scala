/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import scala.scalajs.js

@js.native
trait AudioTrack extends js.Object {
  val id: String = js.native
  val kind: String = js.native
  val label: String = js.native
  val language: String = js.native
  var enabled: Boolean = js.native
}
