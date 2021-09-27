/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 *
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray._

/** Holds information returned by [[WebGLRenderingContext#getActiveAttrib]] and
  * [[WebGLRenderingContext#getActiveUniform]].
  */
@js.native
@JSGlobal
class WebGLActiveInfo private[this] () extends js.Object {

  /** The size of the requested variable. */
  val size: Int = js.native

  /** The type of the requested variable. */
  val `type`: Int = js.native

  /** The name of the requested variable. */
  val name: String = js.native
}
