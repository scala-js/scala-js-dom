package org.scalajs.dom

import org.scalajs.dom

package object ext {
  @deprecated("use dom.KeyValue instead", "2.0.0")
  val KeyValue: dom.KeyValue.type = dom.KeyValue

  @deprecated("use dom.KeyCode instead", "2.0.0")
  val KeyCode: dom.KeyCode.type = dom.KeyCode

  @deprecated("use dom.KeyLocation instead", "2.0.0")
  val KeyLocation: dom.KeyLocation.type = dom.KeyLocation
}
