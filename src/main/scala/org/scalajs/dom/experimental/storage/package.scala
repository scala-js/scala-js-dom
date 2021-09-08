package org.scalajs.dom.experimental

import org.scalajs.dom
import scala.language.implicitConversions
import scala.scalajs.js

/** https://storage.spec.whatwg.org/ */
package object storage {

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  implicit def toNavigatorStorage(navigator: dom.Navigator): dom.Navigator =
    navigator

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  @js.native
  trait NavigatorStorage extends dom.Navigator

  @deprecated("use dom.StorageManager instead", "2.0.0")
  type StorageManager = dom.StorageManager

  @deprecated("use dom.StorageEstimate instead", "2.0.0")
  type StorageEstimate = dom.StorageEstimate

}
