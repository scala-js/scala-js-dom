package org.scalajs.dom.experimental.sharedworkers

import org.scalajs.dom.experimental.serviceworkers.ExtendableMessageEvent
import org.scalajs.dom.raw.{ApplicationCache, WorkerGlobalScope}
import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * The SharedWorkerGlobalScope object (the SharedWorker global scope) is
 * accessible through the self keyword. Some additional global functions,
 * namespaces objects, and constructors, not typically associated with the
 * worker global scope, but available on it, are listed in the JavaScript
 * Reference. See the complete list of functions available to workers.
 *
 * MDN
 */
@js.native
trait SharedWorkerGlobalScope extends WorkerGlobalScope {

  /**
   * Returns the name that the SharedWorker was (optionally) given
   * when it was created. This is the name that the [[SharedWorker]]
   * constructor can pass to get a reference to the
   * SharedWorkerGlobalScope.
   *
   * MDN
   */
  def name: String = js.native

  /**
   * Returns the ApplicationCache object for the worker
   * (see Using the application cache).
   *
   * MDN
   */
  def applicationCache: ApplicationCache = js.native

  /**
   * An EventHandler representing the code to be called when the connect
   * event is raised — that is, when a MessagePort connection is opened
   * between the associated SharedWorker and the main thread.
   *
   * MDN
   */
  var onconnect: js.Function1[ExtendableMessageEvent, _] = js.native
}

@js.native
@JSGlobalScope
object SharedWorkerGlobalScope extends js.Object {
  def self: SharedWorkerGlobalScope = js.native
}
