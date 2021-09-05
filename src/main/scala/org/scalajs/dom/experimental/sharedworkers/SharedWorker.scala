package org.scalajs.dom.experimental.sharedworkers

import org.scalajs.dom.{AbstractWorker, MessagePort}
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SharedWorker interface represents a specific kind of worker that can be accessed from several browsing contexts,
  * such as several windows, iframes or even workers. They implement an interface different than dedicated workers and
  * have a different global scope, SharedWorkerGlobalScope.
  *
  * @constructor
  *   The SharedWorker constructor creates a SharedWorker object that executes the script at the specified URL.This
  *   script must obey the same-origin policy.
  *
  * If the URL has an invalid syntax or if the same-origin policy is violated, a DOMException of type SECURITY_ERR is
  * thrown.
  * @example
  *   {{{var myWorker = new SharedWorker("aURL", name);}}}
  * @param stringUrl
  *   A DOMString representing the URL of the script the worker will execute. It must obey the same-origin policy.
  * @param name
  *   An optional argument that specifies an existing SharedWorkerGlobalScope.name — if this is specified then that
  *   SharedWorkerGlobalScope will be used as the scope for this shared worker.
  */
@js.native
@JSGlobal
class SharedWorker(stringUrl: String, name: js.UndefOr[String] = js.native) extends AbstractWorker {

  /** The port property of the SharedWorker interface returns a [[MessagePort]] object used to communicate and control
    * the shared worker.
    */
  def port: MessagePort = js.native
}
