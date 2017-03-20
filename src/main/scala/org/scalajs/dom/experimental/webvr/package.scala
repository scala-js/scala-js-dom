package org.scalajs.dom.experimental


import org.scalajs.dom.Event
import org.scalajs.dom.experimental.offscreencanvas.OffscreenCanvas

import language.implicitConversions
import org.scalajs.dom.raw.HTMLCanvasElement

import scala.scalajs.js
import scala.scalajs.js.{Any, |}

/**
  * WebVR API, Editor’s Draft, 21 September 2016
  *
  * [[https://w3c.github.io/webvr/]]
  */
package object webvr {

  type VRSource = HTMLCanvasElement | OffscreenCanvas

  type EventHandler = js.Function1[Event, _]

}

