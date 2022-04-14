package org.scalajs.dom

import scala.scalajs.js

/** ResizeObserverOptions [[https://developer.mozilla.org/en-US/docs/Web/API/ResizeObserver/observe]] */
opaque type ResizeObserverBoxOption <: String = String

object ResizeObserverBoxOption {
  val `content-box`: ResizeObserverBoxOption = "content-box"
  val `border-box`: ResizeObserverBoxOption = "border-box"
  val `device-pixel-content-box`: ResizeObserverBoxOption = "device-pixel-content-box"
}
