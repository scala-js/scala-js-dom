package org.scalajs
package dom.experimental

import scala.language.implicitConversions

/** https://storage.spec.whatwg.org/ */
package object storage {

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  def toNavigatorStorage(navigator: dom.Navigator): dom.Navigator =
    navigator

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  type NavigatorStorage = dom.Navigator

  @deprecated("use dom.StorageManager instead", "2.0.0")
  type StorageManager = dom.StorageManager

  @deprecated("use dom.StorageEstimate instead", "2.0.0")
  type StorageEstimate = dom.StorageEstimate

}
