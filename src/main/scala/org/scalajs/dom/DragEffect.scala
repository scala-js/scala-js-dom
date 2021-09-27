/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** When dragging, there are several operations that may be performed. The copy operation is used to indicate that the
  * data being dragged will be copied from its present location to the drop location. The move operation is used to
  * indicate that the data being dragged will be moved, and the link operation is used to indicate that some form of
  * relationship or connection will be created between the source and drop locations.
  *
  * You can specify which of the three operations are allowed for a drag source by setting the `effectAllowed` property
  * within a `dragstart` event listener.
  *
  * Note that these values must be used exactly as defined below.
  *
  * https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/Drag_operations#drageffects
  */
object DragEffect {

  /** no operation is permitted */
  final val None = "none"

  /** copy only */
  final val Copy = "copy"

  /** move only */
  final val Move = "move"

  /** link only */
  final val Link = "link"

  /** copy or move only */
  final val CopyMove = "copyMove"

  /** copy or link only */
  final val CopyLink = "copyLink"

  /** link or move only */
  final val LinkMove = "linkMove"

  /** copy, move, or link */
  final val All = "all"
}
