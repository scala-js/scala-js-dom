package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The DedicatedWorkerGlobalScope object (the Worker global scope) is accessible through the self keyword. Some
  * additional global functions, namespaces objects, and constructors, not typically associated with the worker global
  * scope, but available on it, are listed in the JavaScript Reference. See also: Functions available to workers.
  */
@js.native
trait DedicatedWorkerGlobalScope extends WorkerGlobalScope {

  /** The onmessage property of the DedicatedWorkerGlobalScope interface represents an EventHandler to be called when
    * the message event occurs and bubbles through the Worker — i.e. when a message is sent to the worker using the
    * Worker.postMessage method.
    */
  var onmessage: js.Function1[MessageEvent[Any], _] = js.native

  /** The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that
    * spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or
    * JavaScript object handled by the structured clone algorithm, which includes cyclical references.
    *
    * The main scope that spawned the worker can send back information to the thread that spawned it using the
    * Worker.postMessage method.
    *
    * @param message
    *   The object to deliver to the main thread; this will be in the data field in the event delivered to the
    *   Worker.onmessage handler. This may be any value or JavaScript object handled by the structured clone algorithm,
    *   which includes cyclical references.
    * @param transferList
    *   An optional array of Transferable objects to transfer ownership of. If the ownership of an object is
    *   transferred, it becomes unusable in the context it was sent from and it becomes available only to the main
    *   thread it was sent to.
    *
    * Only MessagePort and ArrayBuffer objects can be transferred.
    */
  def postMessage(message: js.Any, transferList: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native
}

@js.native
@JSGlobalScope
object DedicatedWorkerGlobalScope extends js.Object {

  /** Returns an object reference to the DedicatedWorkerGlobalScope object itself. */
  def self: DedicatedWorkerGlobalScope = js.native
}
