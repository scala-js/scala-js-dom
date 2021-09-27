package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requesttype RequestType enum]] */
@js.native
sealed trait RequestType extends js.Any

object RequestType {
  val empty: RequestType = "".asInstanceOf[RequestType]
  val audio: RequestType = "audio".asInstanceOf[RequestType]
  val font: RequestType = "font".asInstanceOf[RequestType]
  val image: RequestType = "image".asInstanceOf[RequestType]
  val script: RequestType = "script".asInstanceOf[RequestType]
  val style: RequestType = "style".asInstanceOf[RequestType]
  val track: RequestType = "track".asInstanceOf[RequestType]
  val video: RequestType = "video".asInstanceOf[RequestType]
}
