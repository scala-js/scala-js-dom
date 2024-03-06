/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The CustomElementRegistry interface provides methods for registering custom elements and querying registered
  * elements. To get an instance of it, use the window.customElements property.
  * https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry
  */
@js.native
@JSGlobal
abstract class CustomElementRegistry extends js.Object {

  /** Returns the constructor for a previously-defined custom element.  */
  def get(name: String): js.Dynamic

   /** Returns the name for a previously-defined custom element.
     * @param constructor
     *   Constructor for the custom element.
     */
   def getName(constructor: js.Dynamic): String

  /** Defines a new custom element. */
  def define(name: String, constructor: js.Dynamic, options: ElementDefinitionOptions = js.native): Unit

  def upgrade(root: Node): Unit

  def whenDefined(name: String): js.Promise[Any]
}
