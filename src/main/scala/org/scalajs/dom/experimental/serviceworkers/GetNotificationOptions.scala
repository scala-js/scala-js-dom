package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import org.scalajs.dom.webgl.RenderingContext
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** An object containing options to filter the notifications returned. */
trait GetNotificationOptions extends js.Object {

  /** A DOMString representing a notification tag. If specified, only notifications that have this tag will be returned.
    */
  var tag: js.UndefOr[String] = js.undefined
}
