package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait FrameType extends js.Any

/** part of ServiceWorker
  * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client-frametype ¶4.2.2 frameType]] of
  * serviceWorker spec
  */
object FrameType {

  /** The window client's global object's browsing context is an auxiliary browsing context. */
  val auxiliary: FrameType = "auxiliary".asInstanceOf[FrameType]

  /** The window client's global object's browsing context is a top-level browsing context. */
  val `top-level` = "top-level".asInstanceOf[FrameType]

  /** The window client's global object's browsing context is a nested browsing context. */
  val nested: FrameType = "nested".asInstanceOf[FrameType]

  val none: FrameType = "none".asInstanceOf[FrameType]
}
