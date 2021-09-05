package org.scalajs.dom

import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation._

@deprecated("All the members of webworkers.* have been moved to dom.*", "2.0.0")
object webworkers {

  @deprecated("use dom.AbstractWorker instead", "2.0.0")
  type AbstractWorker = dom.AbstractWorker

  @deprecated("use dom.DedicatedWorkerGlobalScope instead", "2.0.0")
  type DedicatedWorkerGlobalScope = dom.DedicatedWorkerGlobalScope

  @deprecated("use dom.Worker instead", "2.0.0")
  type Worker = dom.Worker

  @deprecated("use dom.WorkerGlobalScope instead", "2.0.0")
  type WorkerGlobalScope = dom.WorkerGlobalScope

  @deprecated("use dom.WorkerLocation instead", "2.0.0")
  type WorkerLocation = dom.WorkerLocation

  @deprecated("use dom.WorkerNavigator instead", "2.0.0")
  type WorkerNavigator = dom.WorkerNavigator

  @deprecated("use dom.DedicatedWorkerGlobalScope instead", "2.0.0")
  @js.native
  @JSGlobalScope
  object DedicatedWorkerGlobalScope extends js.Object {

    /** Returns an object reference to the DedicatedWorkerGlobalScope object itself.
      */
    def self: DedicatedWorkerGlobalScope = js.native
  }
}
