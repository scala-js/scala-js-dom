/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js

trait WorkletOptions extends js.Object {

  /** Indicates whether to send credentials (e.g. cookies and HTTP authentication) when loading the module. Can be one
    * of "omit", "same-origin", or "include". Defaults to "same-origin". See also Request.credentials.
    */
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
}
