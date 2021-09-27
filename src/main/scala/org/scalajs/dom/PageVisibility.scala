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

/** The Page Visibility API lets you know when a webpage is visible or in focus. With tabbed browsing, there is a
  * reasonable chance that any given webpage is in the background and thus not visible to the user. When the user
  * minimizes the webpage or moves to another tab, the API sends a visibilitychange event regarding the visibility of
  * the page. You can detect the event and perform some actions or behave differently. For example, if your web app is
  * playing a video, it would pause the moment the user looks at another browser, and plays again when the user returns
  * to the tab. The user does not lose their place in the video and can continue watching.
  *
  * @see
  *   [[https://www.w3.org/TR/2013/REC-page-visibility-20131029/ Page Visibility (Second Edition) W3C Recommendation 29 October 2013]]
  */
@js.native
trait PageVisibility extends js.Object {

  /** Returns true if the page is in a state considered to be hidden to the user, and false otherwise. */
  def hidden: Boolean = js.native

  /** Is a string denoting the visibility state of the document.
    *
    * Note: or a vendor prefixed DOMString as defined in
    * [[https://www.w3.org/TR/2013/REC-page-visibility-20131029/#sec-vendor-prefix 4.5 Vendor Prefixes]]
    */
  def visibilityState: VisibilityState | String = js.native

  /** The visibilitychange event is fired when the content of a tab has become visible or has been hidden. */
  var visibilitychange: js.Function1[Event, _] = js.native
}
