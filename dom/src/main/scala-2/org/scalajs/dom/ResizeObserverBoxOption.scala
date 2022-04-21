package org.scalajs.dom

import scala.scalajs.js

/** ResizeObserverOptions [[https://developer.mozilla.org/en-US/docs/Web/API/ResizeObserver/observe]] */
@js.native
sealed trait ResizeObserverBoxOption extends js.Any

object ResizeObserverBoxOption {
  val `content-box`: ResizeObserverBoxOption = "content-box".asInstanceOf[ResizeObserverBoxOption]
  val `border-box`: ResizeObserverBoxOption = "border-box".asInstanceOf[ResizeObserverBoxOption]
  val `device-pixel-content-box`: ResizeObserverBoxOption = "device-pixel-content-box".asInstanceOf[ResizeObserverBoxOption]
}
