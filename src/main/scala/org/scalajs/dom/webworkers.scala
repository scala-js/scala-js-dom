package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

object webworkers {
  type AbstractWorker = raw.AbstractWorker
  type DedicatedWorkerGlobalScope = raw.DedicatedWorkerGlobalScope
  type Worker = raw.Worker
  type WorkerGlobalScope = raw.WorkerGlobalScope
  type WorkerLocation = raw.WorkerLocation
  type WorkerNavigator = raw.WorkerNavigator

  @js.native
  @JSGlobalScope
  object DedicatedWorkerGlobalScope extends js.Object {

    /**
     * Returns an object reference to the DedicatedWorkerGlobalScope object itself.
     *
     * MDN
     */
    def self: DedicatedWorkerGlobalScope = js.native
  }

}
