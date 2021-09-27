/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLVideoElement interface provides special properties and methods for manipulating video objects. It also
  * inherits properties and methods of HTMLMediaElement and HTMLElement.
  */
@js.native
@JSGlobal
abstract class HTMLVideoElement extends HTMLMediaElement {

  /** Is a DOMString that reflects the width HTML attribute, which specifies the width of the display area, in CSS
    * pixels.
    */
  var width: Int = js.native

  /** Returns an unsigned long containing the intrinsic width of the resource in CSS pixels, taking into account the
    * dimensions, aspect ratio, clean aperture, resolution, and so forth, as defined for the format used by the
    * resource. If the element's ready state is HAVE_NOTHING, the value is 0.
    */
  def videoWidth: Int = js.native

  /** Returns an unsigned long containing the intrinsic height of the resource in CSS pixels, taking into account the
    * dimensions, aspect ratio, clean aperture, resolution, and so forth, as defined for the format used by the
    * resource. If the element's ready state is HAVE_NOTHING, the value is 0.
    */
  def videoHeight: Int = js.native

  /** Is a DOMString that reflects the height HTML attribute, which specifies the height of the display area, in CSS
    * pixels.
    */
  var height: Int = js.native

  /** Is a DOMString that reflects the poster HTML attribute, which specifies an image to show while no video data is
    * available.
    */
  var poster: String = js.native
}
