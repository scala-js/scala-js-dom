package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requesttype RequestType enum]] */
opaque type RequestType <: String = String

object RequestType {
  val empty: RequestType = ""
  val audio: RequestType = "audio"
  val font: RequestType = "font"
  val image: RequestType = "image"
  val script: RequestType = "script"
  val style: RequestType = "style"
  val track: RequestType = "track"
  val video: RequestType = "video"
}
