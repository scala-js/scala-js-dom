/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 *
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** An opaque type that is used to synchronize activities between the GPU and the application. */
@js.native
@JSGlobal
class WebGLSync private[this]() extends js.Object
