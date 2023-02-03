package org.scalajs.dom

import scala.scalajs.js

/** An object describing characteristics of the lock you want to create. */
trait LockOptions extends js.Object {

  /** Either `"exclusive"` or `"shared"`. The default value is `"exclusive"`. */
  var mode: js.UndefOr[LockMode] = js.undefined

  /** If `true`, the lock request will only be granted if it is not already held. If it cannot be granted, the callback
    * will be invoked with `null` instead of a [[Lock]] instance. The default value is `false`.
    */
  var ifAvailable: js.UndefOr[Boolean] = js.undefined

  /** If `true`, then any held locks with the same name will be released, and the request will be granted, preempting
    * any queued requests for it. The default value is `false`.
    */
  var steal: js.UndefOr[Boolean] = js.undefined

  /** An [[AbortSignal]] (the `signal` property of an [[AbortController]]); if specified and the [[AbortController]] is
    * aborted, the lock request is dropped if it was not already granted.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined

}
