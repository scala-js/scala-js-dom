/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** Interface SVGTests defines an interface which applies to all elements which have attributes requiredFeatures,
  * requiredExtensions and systemLanguage.
  */
@js.native
trait SVGTests extends js.Object {

  /** Corresponds to attribute requiredFeatures on the given element. */
  var requiredFeatures: SVGStringList = js.native

  /** Corresponds to attribute requiredExtensions on the given element. */
  var requiredExtensions: SVGStringList = js.native

  /** Corresponds to attribute systemLanguage on the given element. */
  var systemLanguage: SVGStringList = js.native

  /** Returns true if the browser supports the given extension, specified by a URI. */
  def hasExtension(extension: String): Boolean = js.native
}
