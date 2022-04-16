/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The DOM StaticRange interface extends AbstractRange to provide a method to specify a range of content in the DOM
  * whose contents don't update to reflect changes which occur within the DOM tree.
  *
  * This interface offers the same set of properties and methods as AbstractRange.
  *
  * AbstractRange and StaticRange are not available from web workers.
  */
@js.native
@JSGlobal
class StaticRange(init: StaticRangeInit) extends AbstractRange
