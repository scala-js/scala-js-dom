/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 *
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Represents information about the implementation's precision for given parameters. See
  * [[WebGLRenderingContext#getShaderPrecisionFormat]].
  */
@js.native
@JSGlobal
class WebGLShaderPrecisionFormat private[this] () extends js.Object {

  /** The base 2 log of the absolute value of the minimum value that can be represented. */
  val rangeMin: Int = js.native

  /** The base 2 log of the absolute value of the maximum value that can be represented. */
  val rangeMax: Int = js.native

  /** The number of bits of precision that can be represented. For integer formats this value is always 0. */
  val precision: Int = js.native
}
