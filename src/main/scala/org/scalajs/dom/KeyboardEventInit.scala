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

trait KeyboardEventInit extends UIEventInit with ModifierKeyEventInit {

  /** Sets value of KeyboardEvent.charCode. Defaults to 0. */
  var charCode: js.UndefOr[Int] = js.undefined

  /** Sets value of KeyboardEvent.keyCode. Defaults to 0. */
  var keyCode: js.UndefOr[Int] = js.undefined

  /** Sets value of KeyboardEvent.location. Defaults to 0. */
  var location: js.UndefOr[Int] = js.undefined

  /** Sets value of KeyboardEvent.locale. Defaults to empty string. */
  var locale: js.UndefOr[String] = js.undefined

  /** Sets value of KeyboardEvent.key. Defaults to empty string. */
  var key: js.UndefOr[String] = js.undefined

  /** Sets value of KeyboardEvent.repeat. Defaults to false. */
  var repeat: js.UndefOr[Boolean] = js.undefined
}
