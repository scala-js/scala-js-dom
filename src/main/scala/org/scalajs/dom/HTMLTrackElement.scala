/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.{MediaSource, MediaStream}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The HTMLTrackElement interface provides access to the properties of &lt;track&gt; elements, as well as methods to
  * manipulate them.
  */
@js.native
@JSGlobal
abstract class HTMLTrackElement extends HTMLElement {
  var kind: String = js.native
  var src: String = js.native
  var srclang: String = js.native
  def track: TextTrack = js.native
  var label: String = js.native
}
