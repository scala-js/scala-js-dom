/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The [[XMLDocument]] interface represents an XML document. It inherits from the generic [[Document]] and does not add
  * any specific methods or properties to it: nevertheless, several algorithms behave differently with the two types of
  * documents.
  */
@js.native
@JSGlobal
class XMLDocument extends Document
