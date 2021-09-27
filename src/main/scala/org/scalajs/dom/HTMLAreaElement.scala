/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLAreaElement interface provides special properties and methods (beyond those of the regular object
  * HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of
  * area elements.
  */
@js.native
@JSGlobal
abstract class HTMLAreaElement extends HTMLElement {

  /** Is a DOMString containing the protocol component (including trailing colon ':'), of the referenced URL. */
  var protocol: String = js.native

  /** Is a DOMString containing tThe search element (including leading question mark '?'), if any, of the referenced
    * URL.
    */
  var search: String = js.native

  /** Is a DOMString that reflects the alt HTML attribute, containing alternative text for the element. */
  var alt: String = js.native

  /** Is a DOMString that reflects the coords HTML attribute, containing coordinates to define the hot-spot region. */
  var coords: String = js.native

  /** Is a DOMString containing the hostname in the referenced URL. */
  var hostname: String = js.native

  /** Is a DOMString containing the port component, if any, of the referenced URL. */
  var port: String = js.native

  /** Is a DOMString containing the path name component, if any, of the referenced URL. */
  var pathname: String = js.native

  /** Is a DOMString containing the hostname and port (if it's not the default port) in the referenced URL. */
  var host: String = js.native

  /** Is a DOMString containing the fragment identifier (including the leading hash mark (#)), if any, in the referenced
    * URL.
    */
  var hash: String = js.native

  /** Is a DOMString that reflects the target HTML attribute, indicating the browsing context in which to open the
    * linked resource.
    */
  var target: String = js.native

  /** Is a DOMString containing that reflects the href HTML attribute, containing a valid URL of a linked resource. */
  var href: String = js.native

  /** Is a DOMString teflects the shape HTML attribute, indicating the shape of the hot-spot, limited to known values.
    */
  var shape: String = js.native
}
