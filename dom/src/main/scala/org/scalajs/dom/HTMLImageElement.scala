/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLImageElement interface provides special properties and methods (beyond the regular HTMLElement interface it
  * also has available to it by inheritance) for manipulating the layout and presentation of &lt;img&gt; elements.
  */
@js.native
@JSGlobal
abstract class HTMLImageElement extends HTMLElement {

  /** Reflects the width HTML attribute, indicating the rendered width of the image in CSS pixels. */
  var width: Int = js.native

  /** Intrinsic height of the image in CSS pixels, if it is available; otherwise, 0. */
  var naturalHeight: Int = js.native

  /** Reflects the alt HTML attribute, indicating fallback context for the image. */
  var alt: String = js.native

  /** Allows you to specify the layout width of the image for each of a list of media conditions. */
  var sizes: String = js.native

  /** A string whose value provides a hint to the user agent on how to handle the loading of the image which is
    * currently outside the window's visual viewport.
    */
  var loading: String = js.native

  /** Reflects the src HTML attribute, containing the URL of the image. */
  var src: String = js.native

  /** Identifies one or more image candidate strings, separated using commas (,) each specifying image resources to use
    * under given circumstances.
    *
    * Each image candidate string contains an image URL and an optional width or pixel density descriptor that indicates
    * the conditions under which that candidate should be used instead of the image specified by the src property.
    */
  var srcset: String = js.native

  /** Indicates the URL of the image which is currently presented in the <img> element it represents. */
  def currentSrc: String = js.native

  /** Reflects the usemap HTML attribute, containing a partial URL of a map element. */
  var useMap: String = js.native

  /** Intrinsic width of the image in CSS pixels, if it is available; otherwise, 0. */
  var naturalWidth: Int = js.native

  /** Reflects the height HTML attribute, indicating the rendered height of the image in CSS pixels. */
  var height: Int = js.native

  var href: String = js.native

  /** Reflects the ismap HTML attribute, indicating that the image is part of a server-side image map. */
  var isMap: Boolean = js.native

  /** True if the browser has fetched the image, and it is in a supported image type that was decoded without errors. */
  def complete: Boolean = js.native

  var onload: js.Function1[Event, _] = js.native

  /** Indicates the x-coordinate of the <img> element's left border edge relative to the root element's origin. */
  def x: Long = js.native

  /** Indicates the y-coordinate of the <img> element's top border edge relative to the root element's origin. */
  def y: Long = js.native
}
