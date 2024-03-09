/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 *
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** An opaque type that provides ways to asynchronously query for information. By default, occlusion queries and primitive queries are available. */
@js.native
@JSGlobal
class WebGLQuery private[this]() extends js.Object
