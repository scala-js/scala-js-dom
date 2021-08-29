package org.scalajs.dom.experimental.domparser

import org.scalajs.dom.raw.Document
import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * DOMParser can parse XML or HTML source stored in a string into a DOM Document.
 *
 * MDN
 */
@js.native
@JSGlobal
class DOMParser extends js.Object {

  /**
   * The DOMParser can also be used to parse a SVG document or a HTML document.
   * There are three different results possible, selected by the MIME type given.
   * If the MIME type is text/xml, the resulting object will be an XMLDocument,
   * if the MIME type is image/svg+xml, it will be an SVGDocument and
   * if the MIME type is text/html, it will be an HTMLDocument.
   *
   * MDN
   */
  def parseFromString(string: String,
      supportedType: SupportedType): Document = js.native
}

@js.native
sealed trait SupportedType extends js.Any

object SupportedType {
  val `text/html` = "text/html".asInstanceOf[SupportedType]
  val `text/xml` = "text/xml".asInstanceOf[SupportedType]
  val `application/xml` = "application/xml".asInstanceOf[SupportedType]
  val `application/xhtml+xml` =
    "application/xhtml+xml".asInstanceOf[SupportedType]
  val `image/svg+xml` = "image/svg+xml".asInstanceOf[SupportedType]
}
