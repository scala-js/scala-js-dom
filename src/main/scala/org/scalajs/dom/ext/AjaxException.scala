package org.scalajs.dom.ext

import org.scalajs.dom

/** Thrown when `Ajax.get` or `Ajax.post` receives a non-20X response code. Contains the XMLHttpRequest that resulted in
  * that response
  */
@deprecated("scalajs-dom no longer includes custom utilities, only facades. Try using dom.fetch API which doesn't require additional utilities.", "2.0.0")
case class AjaxException(xhr: dom.XMLHttpRequest) extends Exception {
  def isTimeout: Boolean = xhr.status == 0 && xhr.readyState == 4
}

// This is just there to work around some weird warnings in Scala 3.x
@deprecated("scalajs-dom no longer includes custom utilities, only facades. Try using dom.fetch API which doesn't require additional utilities.", "2.0.0")
object AjaxException extends (dom.XMLHttpRequest => AjaxException)
