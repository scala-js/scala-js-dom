package org.scalajs.dom

import scala.scalajs.js

trait ResizeObserverOptions extends js.Object {
  var box: js.UndefOr[String] = js.undefined
}

/** Factory for [[ResizeObserverOptions]] objects. */
object ResizeObserverOptions {

  /** Creates a new [[ResizeObserverOptions]] object with the given values. */
  def apply(
      box: Option[String] = None
  ): ResizeObserverOptions = {
    val res = js.Dynamic.asInstanceOf[ResizeObserverOptions]
    box.foreach(res.box = _)
    res
  }
}
