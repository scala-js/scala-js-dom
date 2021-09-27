/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** A MediaQueryList object maintains a list of media queries on a document, and handles sending notifications to
  * listeners when the media queries on the document change.
  */
@js.native
trait MediaQueryListListener extends js.Object {
  def apply(mql: MediaQueryList): Unit = js.native
}
