package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The Worker interface represents a background task that can be easily created and can send messages back to their
  * creators. Creating a worker is as simple as calling the Worker() constructor, specifying a script to be run in the
  * worker thread.
  *
  * Of note is the fact that workers may in turn spawn new workers as long as those workers are hosted within the same
  * origin as the parent page. In addition, workers may use XMLHttpRequest for network I/O, with the exception that the
  * responseXML and channel attributes on XMLHttpRequest always return null.
  *
  * @param scriptURL
  *   A USVString representing the URL of the script the worker will execute. It must obey the same-origin policy.
  * @param options
  *   An object containing option properties that can be set when creating the object instance.
  */
@js.native
@JSGlobal
class Worker(scriptURL: String, options: js.UndefOr[WorkerOptions] = js.native) extends AbstractWorker {

  /** The Worker.onmessage property represents an EventHandler, that is a function to be called when the message event
    * occurs. These events are of type MessageEvent and will be called when the worker calls its own postMessage()
    * method: it is the way that a Worker has to give back information to the thread that created it.
    */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /** The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a
    * single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled
    * by the structured clone algorithm, which includes cyclical references.
    *
    * The Worker can send back information to the thread that spawned it using the
    * DedicatedWorkerGlobalScope.postMessage method.
    *
    * @param message
    *   The object to deliver to the worker; this will be in the data field in the event delivered to the
    *   DedicatedWorkerGlobalScope.onmessage handler. This may be any value or JavaScript object handled by the
    *   structured clone algorithm, which includes cyclical references.
    *
    * @param transfer
    *   An optional array of Transferable objects to transfer ownership of. If the ownership of an object is
    *   transferred, it becomes unusable in the context it was sent from and becomes available only to the worker it was
    *   sent to.
    *
    * Transferable objects are instances of classes like ArrayBuffer, MessagePort or ImageBitmap objects that can be
    * transferred. null is not an acceptable value for transfer.
    */
  def postMessage(message: js.Any, transfer: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native

  /** The Worker.terminate() method immediately terminates the Worker. This does not offer the worker an opportunity to
    * finish its operations; it is simply stopped at once.
    */
  def terminate(): Unit = js.native
}
