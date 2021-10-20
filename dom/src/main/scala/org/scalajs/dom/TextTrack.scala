/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait TextTrack extends EventTarget {
  var language: String = js.native
  var mode: TextTrackMode = js.native
  var readyState: Int = js.native
  var activeCues: TextTrackCueList = js.native
  var cues: TextTrackCueList = js.native
  var oncuechange: js.Function1[Event, _] = js.native
  var kind: String = js.native
  var onload: js.Function1[js.Any, _] = js.native
  var onerror: js.Function1[ErrorEvent, _] = js.native
  var label: String = js.native

  var ERROR: Int = js.native
  var SHOWING: Int = js.native
  var LOADING: Int = js.native
  var LOADED: Int = js.native
  var NONE: Int = js.native
  var HIDDEN: Int = js.native
  var DISABLED: Int = js.native

  val id: String = js.native
  val inBandMetadataTrackDispatchType: String = js.native

  def addCue(cue: TextTrackCue): Unit = js.native
  def removeCue(cue: TextTrackCue): Unit = js.native
}

@js.native
@JSGlobal
object TextTrack extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrack),List())))) */
  var ERROR: Int = js.native
  var SHOWING: Int = js.native
  var LOADING: Int = js.native
  var LOADED: Int = js.native
  var NONE: Int = js.native
  var HIDDEN: Int = js.native
  var DISABLED: Int = js.native
}
