/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

opaque type VisibilityState = String

object VisibilityState {

  /** The page content may be at least partially visible. In practice this means that the page is the foreground tab of
    * a non-minimized window.
    */
  val visible: VisibilityState = "visible"

  /** The page content is not visible to the user. In practice this means that the document is either a background tab
    * or part of a minimized window, or the OS screen lock is active.
    */
  val hidden: VisibilityState = "hidden"

  /** the page content is being prerendered and is not visible to the user (considered hidden for purposes of
    * document.hidden). The document may start in this state, but will never transition to it from another value. Note:
    * browser support is optional.
    */
  val prerender: VisibilityState = "prerender"

  /** The page is being unloaded from memory. Note: browser support is optional. */
  val unloaded: VisibilityState = "unloaded"
}
