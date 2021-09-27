package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The [[DOMParser]] interface provides the ability to parse XML or HTML source code from a string into a DOM Document.
  *
  * You can perform the opposite operation—converting a DOM tree into XML or HTML source—using the `XMLSerializer`
  * interface.
  *
  * In the case of an HTML document, you can also replace portions of the DOM with new DOM trees built from HTML by
  * setting the value of the `Element.innerHTML` and `outerHTML` properties. These properties can also be read to fetch
  * HTML fragments corresponding to the corresponding DOM subtree.
  *
  * Note that `XMLHttpRequest` can parse XML and HTML directly from a URL-addressable resource, returning a Document in
  * its response property.
  */
@js.native
@JSGlobal
class DOMParser extends js.Object {

  /** The DOMParser can also be used to parse a SVG document or a HTML document. There are three different results
    * possible, selected by the MIME type given. If the MIME type is text/xml, the resulting object will be an
    * XMLDocument, if the MIME type is image/svg+xml, it will be an SVGDocument and if the MIME type is text/html, it
    * will be an HTMLDocument.
    */
  def parseFromString(string: String, mimeType: MIMEType): Document = js.native
}
