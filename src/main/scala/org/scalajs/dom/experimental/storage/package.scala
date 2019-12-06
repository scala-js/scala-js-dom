package org.scalajs.dom.experimental

import org.scalajs.dom

import scala.language.implicitConversions
import scala.scalajs.js

/**
 * https://storage.spec.whatwg.org/
 */
package object storage {
  implicit def toNavigatorStorage(navigator: dom.Navigator): NavigatorStorage =
    navigator.asInstanceOf[NavigatorStorage]

  @js.native
  trait NavigatorStorage extends js.Object {
    val storage: StorageManager = js.native
  }

  @js.native
  trait StorageManager extends js.Any {
    def persisted(): js.Promise[Boolean] = js.native
    def persist(): js.Promise[Boolean] = js.native
    def estimate(): js.Promise[StorageEstimate] = js.native
  }

  @js.native
  trait StorageEstimate extends js.Any {
    val usage: Double = js.native
    val quota: Double = js.native
  }
}
