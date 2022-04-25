package org.scalajs.dom

import scala.scalajs.js

/** An ElementDefinitionOptions object represents additional options associated with CustomElementRegsitry.define. */
trait ElementDefinitionOptions extends js.Object {

  /** String specifying the name of a built-in element to extend. Used to create a customized built-in element. */
  var `extends`: js.UndefOr[String] = js.undefined
}
