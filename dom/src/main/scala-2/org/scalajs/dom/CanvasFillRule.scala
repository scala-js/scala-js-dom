package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait CanvasFillRule extends js.Any

object CanvasFillRule {

  val nonzero: CanvasFillRule = "nonzero".asInstanceOf[CanvasFillRule]

  val evenodd: CanvasFillRule = "evenodd".asInstanceOf[CanvasFillRule]

}
