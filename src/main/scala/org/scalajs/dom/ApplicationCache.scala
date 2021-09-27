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

@js.native
trait ApplicationCache extends EventTarget {
  def status: Int = js.native

  var ondownloading: js.Function1[Event, _] = js.native
  var onprogress: js.Function1[ProgressEvent, _] = js.native
  var onupdateready: js.Function1[Event, _] = js.native
  var oncached: js.Function1[Event, _] = js.native
  var onobsolete: js.Function1[Event, _] = js.native
  var onerror: js.Function1[ErrorEvent, _] = js.native
  var onchecking: js.Function1[Event, _] = js.native
  var onnoupdate: js.Function1[Event, _] = js.native

  def swapCache(): Unit = js.native

  def abort(): Unit = js.native

  def update(): Unit = js.native
}

@js.native
@JSGlobal
object ApplicationCache extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ApplicationCache),List())))) */
  val CHECKING: Int = js.native
  val UNCACHED: Int = js.native
  val UPDATEREADY: Int = js.native
  val DOWNLOADING: Int = js.native
  val IDLE: Int = js.native
  val OBSOLETE: Int = js.native
}
