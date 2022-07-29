/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The History interface allows to manipulate the browser session history, that is the pages visited in the tab or
  * frame that the current page is loaded in.
  */
@js.native
@JSGlobal
class History extends js.Object {

  /** The History.length read-only property returns an Integer representing the number of elements in the session
    * history, including the currently loaded page. For example, for a page loaded in a new tab this property returns 1.
    */
  def length: Int = js.native

  /** Goes to the previous page in session history, the same action as when the user clicks the browser's Back button.
    * Equivalent to history.go(-1). Note: Calling this method to go back beyond the first page in the session history
    * has no effect and doesn't raise an exception.
    */
  def back(): Unit = js.native

  /** Goes to the next page in session history, the same action as when the user clicks the browser's Forward button;
    * this is equivalent to history.go(1). Note: Calling this method to go back beyond the last page in the session
    * history has no effect and doesn't raise an exception.
    */
  def forward(): Unit = js.native

  def go(delta: Int): Unit = js.native

  /** Loads a page from the session history, identified by its relative location to the current page, for example -1 for
    * the previous page or 1 for the next page. When integerDelta is out of bounds (e.g. -1 when there are no previously
    * visited pages in the session history), the method doesn't do anything and doesn't raise an exception. Calling go()
    * without parameters or with a non-integer argument has no effect (unlike Internet Explorer, which supports string
    * URLs as the argument).
    */
  def go(): Unit = js.native

  /** Returns an any value representing the state at the top of the history stack. This is a way to look at the state
    * without having to wait for a popstate event.
    */
  def state: js.Any = js.native

  def replaceState(statedata: js.Any, title: String, url: String): Unit = js.native

  def replaceState(statedata: js.Any, title: String, url: URL): Unit = js.native

  /** Updates the most recent entry on the history stack to have the specified data, title, and, if provided, URL. The
    * data is treated as opaque by the DOM; you may specify any JavaScript object that can be serialized.  Note that
    * Firefox currently ignores the title parameter; for more information, see manipulating the browser history. Note:
    * In Gecko 2.0 (Firefox 4 / Thunderbird 3.3 / SeaMonkey 2.1) through Gecko 5.0 (Firefox 5.0 / Thunderbird 5.0 /
    * SeaMonkey 2.2), the passed object is serialized using JSON. Starting in Gecko 6.0 (Firefox 6.0 / Thunderbird 6.0 /
    * SeaMonkey 2.3), the object is serialized using the structured clone algorithm. This allows a wider variety of
    * objects to be safely passed.
    */
  def replaceState(statedata: js.Any, title: String): Unit = js.native

  def pushState(statedata: js.Any, title: String, url: String): Unit = js.native

  def pushState(statedata: js.Any, title: String, url: URL): Unit = js.native

  /** Pushes the given data onto the session history stack with the specified title and, if provided, URL. The data is
    * treated as opaque by the DOM; you may specify any JavaScript object that can be serialized.  Note that Firefox
    * currently ignores the title parameter; for more information, see manipulating the browser history. Note: In Gecko
    * 2.0 (Firefox 4 / Thunderbird 3.3 / SeaMonkey 2.1) through Gecko 5.0 (Firefox 5.0 / Thunderbird 5.0 / SeaMonkey
    * 2.2), the passed object is serialized using JSON. Starting in Gecko 6.0 (Firefox 6.0 / Thunderbird 6.0 / SeaMonkey
    * 2.3), the object is serialized using the structured clone algorithm. This allows a wider variety of objects to be
    * safely passed.
    */
  def pushState(statedata: js.Any, title: String): Unit = js.native
}
