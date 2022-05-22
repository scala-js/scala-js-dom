/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** An object containing registration options. */
trait ServiceWorkerRegistrationOptions extends js.Object {

  /** A string representing a URL that defines a service worker's registration scope; that is, what range of URLs a
    * service worker can control. This is usually a relative URL. It is relative to the base URL of the application. By
    * default, the `scope` value for a service worker registration is set to the directory where the service worker
    * script is located.
    */
  var scope: js.UndefOr[String] = js.undefined

  /** A string specifying the type of worker to create. */
  var `type`: js.UndefOr[WorkerType] = js.undefined

  /** A string indicating how much of a service worker's resources will be updated when a call is made to
    * `ServiceWorkerRegistration.updateViaCache`.
    */
  var updateViaCache: js.UndefOr[ServiceWorkerUpdateViaCache] = js.undefined
}
