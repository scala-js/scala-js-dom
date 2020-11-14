package org.scalajs.dom.raw

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom.experimental.cachestorage.CacheStorage

/**
 * The WindowOrWorkerGlobalScope mixin describes several features common to the
 * Window and WorkerGlobalScope interfaces.
 *
 * Note: WindowOrWorkerGlobalScope is a mixin and not an interface; you can't
 * actually create an object of type WindowOrWorkerGlobalScope.
 *
 * MDN
 */
@js.native
trait WindowOrWorkerGlobalScope extends js.Object {

  /**
   * Returns the CacheStorage object associated with the current context.
   * This object enables functionality such as storing assets for offline use,
   * and generating custom responses to requests.
   *
   * MDN
   */
  def caches: js.UndefOr[CacheStorage] = js.native

  /**
   * Returns a boolean value that indicates whether a SharedArrayBuffer can be
   * sent via a Window.postMessage() call.
   *
   * MDN
   */
  def crossOriginIsolated: Boolean = js.native

  /**
   * Provides a mechanism for applications to asynchronously access
   * capabilities of indexed databases.
   *
   * MDN
   */
  def indexedDB: js.UndefOr[IDBFactory] = js.native

  /**
   * Returns a boolean indicating whether the current context is secure or not.
   *
   * MDN
   */
  def isSecureContext: Boolean = js.native

  /**
   * Returns the origin of the global scope, serialized as a string.
   *
   * MDN
   */
  def origin: String = js.native //should be USVString
}
