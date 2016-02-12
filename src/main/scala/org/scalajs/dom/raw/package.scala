/**
  * Documentation marked "MDN" is thanks to Mozilla Contributors
  * at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License
  * http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.typedarray.ArrayBuffer

package object raw {

  @deprecated(message = "Import from scala.scalajs.js instead.", since = "0.9.0")
  type Promise[+A] = js.Promise[A]

  /**
   * The Transferable interface represents an object that can be transfered
   * between different execution contexts, like the main thread and Web workers.
   *
   * This is an abstract interface and there isn't any object of this type.
   * It also doesn't define any method or property:
   * it is merely a tag indicating objects that can be used in specific
   * conditions, like to be transfered to a Worker using the
   * Worker.postMessage() method.
   *
   * MDN
   */
  type Transferable = ArrayBuffer | MessagePort

  @deprecated(message = "Import from org.scalajs.dom.experimental.serviceworkers instead.", since = "0.9.0")
  type ServiceWorker = experimental.serviceworkers.ServiceWorker
  @deprecated(message = "Import from org.scalajs.dom.experimental.serviceworkers instead.", since = "0.9.0")
  type ServiceWorkerRegistration = experimental.serviceworkers.ServiceWorkerRegistration
  @deprecated(message = "Import from org.scalajs.dom.experimental.serviceworkers instead.", since = "0.9.0")
  type ServiceWorkerContainer = experimental.serviceworkers.ServiceWorkerContainer
}
