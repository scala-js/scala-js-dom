package org.scalajs.dom

import scala.scalajs.js

trait IntersectionObserverEntryInit extends js.Object {

  var boundingClientRect: DOMRect

  var intersectionRatio: Double

  var intersectionRect: DOMRect

  var isIntersecting: Boolean

  var rootBounds: DOMRect

  var target: Element

  var time: Double
}
