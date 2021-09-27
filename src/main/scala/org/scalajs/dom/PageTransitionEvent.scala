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

/** The PageTransitionEvent is fired when a document is being loaded or unloaded.
  *
  * This interface also inherits properties from its parent, Event.
  */
@js.native
trait PageTransitionEvent extends Event {

  /** Indicates if the document is loading from a cache. */
  def persisted: Boolean = js.native
}
