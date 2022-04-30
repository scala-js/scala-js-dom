package org.scalajs.dom

import scala.scalajs.js

/** A ShadowRootInit object represents additional options associated with Element.attachShadow. */
trait ShadowRootInit extends js.Object {

  /** A string specifying the encapsulation mode for the shadow DOM tree. This can be one of:
    *
    * open: Elements of the shadow root are accessible from JavaScript outside the root, for example using
    * Element.shadowRoot: element.shadowRoot; // Returns a ShadowRoot obj
    *
    * closed: Denies access to the node(s) of a closed shadow root from JavaScript outside it: element.shadowRoot; //
    * Returns null
    */
  var mode: ShadowRootMode

  /** A boolean that, when set to true, specifies behavior that mitigates custom element issues around focusability.
    * When a non-focusable part of the shadow DOM is clicked, the first focusable part is given focus, and the shadow
    * host is given any available :focus styling.
    */
  var delegatesFocus: js.UndefOr[Boolean] = js.undefined
}
