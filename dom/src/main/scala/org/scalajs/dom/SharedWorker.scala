package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

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
  * @param scriptURL
  *   A DOMString representing the URL of the script the worker will execute. It must obey the same-origin policy.
  * @param options
  *   A DOMString specifying an identifying name for the SharedWorkerGlobalScope representing the scope of the worker,
  *   which is mainly useful for debugging purposes. Or, an object containing option properties that can set when
  *   creating the object instance.
  */
@js.native
@JSGlobal
class SharedWorker private[this] (scriptURL: String, options: js.UndefOr[String | WorkerOptions] = js.native)
    extends AbstractWorker {

  def this(scriptURL: String) = this(scriptURL, js.undefined)

  def this(scriptURL: String, name: String) = this(scriptURL, js.defined(name))

  def this(scriptURL: String, options: WorkerOptions) = this(scriptURL, js.defined(options))

  /** The port property of the SharedWorker interface returns a [[MessagePort]] object used to communicate and control
    * the shared worker.
    */
  def port: MessagePort = js.native
}
