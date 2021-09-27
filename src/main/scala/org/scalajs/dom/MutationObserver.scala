/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** MutationObserver provides developers a way to react to changes in a DOM. It is designed as a replacement for
  * Mutation Events defined in the DOM3 Events specification.
  */
@js.native
@JSGlobal
class MutationObserver(callback: js.Function2[js.Array[MutationRecord], MutationObserver, _]) extends js.Object {

  /** Registers the MutationObserver instance to receive notifications of DOM mutations on the specified node. */
  def observe(target: Node, options: MutationObserverInit): Unit = js.native

  /** Stops the MutationObserver instance from receiving notifications of DOM mutations. Until the observe() method is
    * used again, observer's callback will not be invoked.
    */
  def disconnect(): Unit = js.native

  /** Empties the MutationObserver instance's record queue and returns what was in there. */
  def takeRecords(): js.Array[MutationRecord] = js.native
}
