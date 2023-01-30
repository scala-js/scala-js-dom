package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requesttype RequestType enum]] */
@js.native
sealed trait DragDataItemKind extends js.Any

object DragDataItemKind {
  val string: DragDataItemKind = "string".asInstanceOf[DragDataItemKind]
  val file: DragDataItemKind = "file".asInstanceOf[DragDataItemKind]
}
