/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** A StorageEvent is sent to a window when a storage area changes. */
@js.native
@JSGlobal
class StorageEvent(typeArg: String, init: js.UndefOr[StorageEventInit]) extends Event(typeArg, init) {

  /** The original value of the key. The oldValue is null when the change has been invoked by storage clear() method or
    * the key has been newly added and therefor doesn't have any previous value. Read only.
    */
  def oldValue: String = js.native

  /** The new value of the key. The newValue is null when the change has been invoked by storage clear() method or the
    * key has been removed from the storage. Read only.
    */
  def newValue: String = js.native

  /** The URL of the document whose key changed. Read only. */
  def url: String = js.native

  /** Represents the Storage object that was affected. Read only. */
  def storageArea: Storage = js.native

  /** Represents the key changed. The key attribute is null when the change is caused by the storage clear() method.
    * Read only.
    */
  def key: String = js.native
}
