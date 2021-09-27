/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

@js.native
trait WindowSessionStorage extends js.Object {

  /** This is a global object (sessionStorage) that maintains a storage area that's available for the duration of the
    * page session. A page session lasts for as long as the browser is open and survives over page reloads and restores.
    * Opening a page in a new tab or window will cause a new session to be initiated.
    */
  def sessionStorage: Storage = js.native
}
