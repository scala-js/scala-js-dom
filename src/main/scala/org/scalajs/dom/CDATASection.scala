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

/** A CDATA Section can be used within XML to include extended portions of unescaped text, such that the symbols &lt;
  * and & do not need escaping as they normally do within XML when used as text.
  *
  * As a CDATASection has no properties or methods unique to itself and only directly implements the Text interface, one
  * can refer to Text to find its properties and methods.
  */
@js.native
@JSGlobal
abstract class CDATASection extends Text
