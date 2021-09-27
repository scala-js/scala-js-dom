/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.{MediaSource, MediaStream}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The HTMLObjectElement interface provides special properties and methods (beyond those on the HTMLElement interface
  * it also has available to it by inheritance) for manipulating the layout and presentation of &lt;object&gt; element,
  * representing external resources.
  */
@js.native
@JSGlobal
abstract class HTMLObjectElement extends HTMLElement with GetSVGDocument {

  /** Reflects the width HTML attribute, specifying the displayed width of the resource in CSS pixels. */
  var width: String = js.native

  var `object`: Object = js.native

  /** The object element's form owner, or null if there isn't one. */
  def form: HTMLFormElement = js.native

  var alt: String = js.native
  var classid: String = js.native

  /** Reflects the name HTML attribute, specifying the name of the object (HTML 4, or of a browsing context (HTML5. */
  var name: String = js.native

  /** Reflects the usemap HTML attribute, specifying a &lt;map&gt; element to use. */
  var useMap: String = js.native

  /** Reflects the data HTML attribute, specifying the address of a resource's data. */
  var data: String = js.native

  /** Reflects the height HTML attribute, specifying the displayed height of the resource in CSS pixels. */
  var height: String = js.native

  /** The active document of the object element's nested browsing context, if any; otherwise null. */
  def contentDocument: Document = js.native
  var altHtml: String = js.native

  var `type`: String = js.native
  var BaseHref: String = js.native

  /** A localized message that describes the validation constraints that the control does not satisfy (if any). This is
    * the empty string if the control is not a candidate for constraint validation (willValidate is false), or it
    * satisfies its constraints.
    */
  def validationMessage: String = js.native

  /** The validity states that this element is in. */
  def validity: ValidityState = js.native

  /** Indicates whether the element is a candidate for constraint validation. Always false for HTMLObjectElement
    * objects.
    */
  def willValidate: Boolean = js.native

  /** Always returns true, because object objects are never candidates for constraint validation. */
  def checkValidity(): Boolean = js.native

  /** Sets a custom validity message for the element. If this message is not the empty string, then the element is
    * suffering from a custom validity error, and does not validate.
    */
  def setCustomValidity(error: String): Unit = js.native
}
