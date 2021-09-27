/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLLinkElement interface represents reference information for external resources and the relationship of those
  * resources to a document and vice-versa. This object inherits all of the properties and methods of the HTMLElement
  * interface.
  */
@js.native
@JSGlobal
abstract class HTMLLinkElement extends HTMLElement with LinkStyle {

  /** Gets or sets the forward relationship of the linked resource from the document to the resource. */
  var rel: String = js.native

  /** Gets or sets the name of the target frame to which the resource applies. */
  var target: String = js.native

  /** Gets or sets the URI for the target resource. */
  var href: String = js.native

  /** Gets or sets a list of one or more media formats to which the resource applies. */
  var media: String = js.native

  /** Gets or sets the reverse relationship of the linked resource from the resource to the document. */
  var rev: String = js.native
  var `type`: String = js.native

  /** Gets or sets the language code for the linked resource. */
  var hreflang: String = js.native
}
