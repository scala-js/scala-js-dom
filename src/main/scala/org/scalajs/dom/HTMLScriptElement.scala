/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.{MediaSource, MediaStream}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** DOM Script objects expose the HTMLScriptElement (or HTML 4 HTMLScriptElement) interface, which provides special
  * properties and methods (beyond the regular element object interface they also have available to them by inheritance)
  * for manipulating the layout and presentation of &lt;script&gt; elements.
  */
@js.native
@JSGlobal
abstract class HTMLScriptElement extends HTMLElement {
  var defer: Boolean = js.native

  /** The IDL attribute text must return a concatenation of the contents of all the Text nodes that are children of the
    * &lt;script&gt; element (ignoring any other nodes such as comments or elements), in tree order. On setting, it must
    * act the same way as the textContent IDL attribute. Note: When inserted using the document.write() method,
    * &lt;script&gt; elements execute (typically synchronously), but when inserted using innerHTML and outerHTML
    * attributes, they do not execute at all.
    */
  var text: String = js.native

  /** Represents gives the address of the external script resource to use. It reflects the src attribute. */
  var src: String = js.native

  /** Represents the character encoding of the external script resource. It reflects the charset attribute. */
  var charset: String = js.native
  var `type`: String = js.native
  var event: String = js.native

  /** The async and defer attributes are boolean attributes that indicate how the script should be executed. The defer
    * and async attributes must not be specified if the src attribute is not present. There are three possible modes
    * that can be selected using these attributes. If the async attribute is present, then the script will be executed
    * asynchronously, as soon as it is available. If the async attribute is not present but the defer attribute is
    * present, then the script is executed when the page has finished parsing. If neither attribute is present, then the
    * script is fetched and executed immediately, before the user agent continues parsing the page. Note: The exact
    * processing details for these attributes are, for mostly historical reasons, somewhat non-trivial, involving a
    * number of aspects of HTML. The implementation requirements are therefore by necessity scattered throughout the
    * specification. These algorithms describe the core of this processing, but these algorithms reference and are
    * referenced by the parsing rules for &lt;script&gt; start and end tags in HTML, in foreign content, and in XML, the
    * rules for the document.write() method, the handling of scripting, etc. The defer attribute may be specified even
    * if the async attribute is specified, to cause legacy Web browsers that only support defer (and not async) to fall
    * back to the defer behavior instead of the synchronous blocking behavior that is the default.
    */
  var async: Boolean = js.native

  var onload: js.Function1[Event, _] = js.native
}
