/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The DOMImplementation interface represent an object providing methods which are not dependent on any particular
  * document. Such an object is returned by the Document.implementation property.
  */
@js.native
@JSGlobal
class DOMImplementation extends js.Object {

  /** « DOM Reference « DOMImplementation */
  def createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType = js.native

  /** « DOM Reference « DOMImplementation */
  def createDocument(namespaceURI: String, qualifiedName: String, doctype: DocumentType): Document = js.native

  def hasFeature(feature: String, version: String): Boolean = js.native

  /** Returns a Boolean indicating if a given feature is supported or not. This function is unreliable and kept for
    * compatibility purpose alone: except for SVG-related queries, it always returns true. Old browsers are very
    * inconsistent in their behavior.
    */
  def hasFeature(feature: String): Boolean = js.native

  /** Creates and returns an HTML Document. */
  def createHTMLDocument(title: String): Document = js.native
}
