/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait FileSystemCreateWritableOptions extends js.Object {

  /** A Boolean. Default false. When set to true if the file exists, the existing file is first copied to the temporary
    * file. Otherwise the temporary file starts out empty.
    */
  var keepExistingData: js.UndefOr[Boolean] = js.undefined
}
