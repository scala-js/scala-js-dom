/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait FileSystemGetFileOptions extends js.Object {

  /** A Boolean. Default false. When set to true if the file is not found, one with the specified name will be created
    * and returned.
    */
  var create: js.UndefOr[Boolean] = js.undefined
}
