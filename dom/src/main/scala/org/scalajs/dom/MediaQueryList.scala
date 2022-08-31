/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** A MediaQueryList object stores information on a media query applied to a document, with support for both immediate
  * and event-driven matching against the state of the document.
  */
@js.native
trait MediaQueryList extends EventTarget {

  /** A boolean value that returns true if the document currently matches the media query list, or false if not. */
  def matches: Boolean = js.native

  /** A string representing a serialized media query. */
  var media: String = js.native

  /** Adds to the MediaQueryList a callback which is invoked whenever the media query status—whether or not the document
    * matches the media queries in the list—changes.
    *
    * This method exists primarily for backward compatibility; if possible, you should instead use addEventListener() to
    * watch for the change event.
    * @deprecated
    */
  @deprecated("Use addEventListener() instead", "2.3.0")
  def addListener(listener: MediaQueryListListener): Unit = js.native

  /** Removes the specified listener callback from the callbacks to be invoked when the MediaQueryList changes media
    * query status, which happens any time the document switches between matching and not matching the media queries
    * listed in the MediaQueryList.
    *
    * This method has been kept for backward compatibility; if possible, you should generally use removeEventListener()
    * to remove change notification callbacks (which should have previously been added using addEventListener()).
    * @deprecated
    */
  @deprecated("Use removeEventListener() instead", "2.3.0")
  def removeListener(listener: MediaQueryListListener): Unit = js.native
}
