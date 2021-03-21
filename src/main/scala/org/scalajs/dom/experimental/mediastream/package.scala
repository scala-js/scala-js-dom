package org.scalajs.dom.experimental

import scala.scalajs.js
import scala.scalajs.js.|

package object mediastream {
  type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer
  type AppendMode = String
  type TextTrackMode = String
  type EndOfStreamError = String
  type ReadyState = String
}
