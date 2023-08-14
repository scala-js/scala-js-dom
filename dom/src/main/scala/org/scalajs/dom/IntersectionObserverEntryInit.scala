package org.scalajs.dom

import scala.scalajs.js

trait IntersectionObserverEntryInit extends js.Object {

  var boundingClientRect: DOMRectInit

  var intersectionRatio: Double

  var intersectionRect: DOMRectInit

  var isIntersecting: Boolean

  var rootBounds: DOMRectInit

  var target: Element

  var time: Double
}
