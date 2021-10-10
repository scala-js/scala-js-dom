package org.scalajs.dom

import scala.scalajs.js

trait PermissionStatus extends EventTarget {
  val state: PermissionState
  var onchange: js.Function1[Event, _]
}
