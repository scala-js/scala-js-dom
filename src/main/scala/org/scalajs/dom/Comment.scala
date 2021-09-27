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

/** The Comment interface represents textual notations within markup; although it is generally not visually shown, such
  * comments are available to be read in the source view. Comments are represented in HTML and XML as content between
  * '&lt;!--' and '--&gt;'. In XML, the character sequence '--' cannot be used within a comment.
  */
@js.native
@JSGlobal
class Comment extends CharacterData {
  var text: String = js.native
}
