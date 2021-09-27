package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** See [[https://streams.spec.whatwg.org/#chunk ¶2 Model]] but mostly the examples in the whatwg streams spec */
@js.native
trait Chunk[+T] extends js.Object {

  /** The value of the chunk. */
  def value: T = js.native

  def done: Boolean = js.native
}
