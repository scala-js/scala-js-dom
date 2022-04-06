package org.scalajs.dom

import scala.scalajs.js

/** The Worker interface represents a background task that can be easily created and can send messages back to their
  * creators. Creating a worker is as simple as calling the Worker() constructor, specifying a script to be run in the
  * worker thread.
  *
  * Of note is the fact that workers may in turn spawn new workers as long as those workers are hosted within the same
  * origin as the parent page. In addition, workers may use XMLHttpRequest for network I/O, with the exception that the
  * responseXML and channel attributes on XMLHttpRequest always return null.
  */
@js.native
trait WorkerOptions extends js.Any {
  var credentials: js.UndefOr[RequestCredentials] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[WorkerType] = js.native
}
