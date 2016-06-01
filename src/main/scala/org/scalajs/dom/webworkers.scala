package org.scalajs.dom

object webworkers {
  type AbstractWorker = raw.AbstractWorker
  type DedicatedWorkerGlobalScope = raw.DedicatedWorkerGlobalScope
  lazy val DedicatedWorkerGlobalScope: raw.DedicatedWorkerGlobalScope.type =
    raw.DedicatedWorkerGlobalScope
  type Worker = raw.Worker
  type WorkerGlobalScope = raw.WorkerGlobalScope
  type WorkerLocation = raw.WorkerLocation
  type WorkerNavigator = raw.WorkerNavigator
}
