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
