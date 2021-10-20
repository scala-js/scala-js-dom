/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 *
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Contains drawing surface attributes. */
@js.native
@JSGlobal
class WebGLContextAttributes extends js.Object {

  /** When `true`, the drawing buffer has an alpha channel. */
  var alpha: Boolean = js.native

  /** When `true`, the drawing buffer has a depth buffer of at least 16 bits. */
  var depth: Boolean = js.native

  /** When `true`, the drawing buffer has a stencil buffer of at least 8 bits. */
  var stencil: Boolean = js.native

  /** When `true` and antialiasing is supported, the drawing buffer will use an antialiasing method if it's choice. */
  var antialias: Boolean = js.native

  /** When `true` the page compositor assumes the buffer's contents is premultiplied. Used for sensible transparency
    * when using WebGL canvases for overlays.
    */
  var premultipliedAlpha: Boolean = js.native

  /** When `true`, the drawing buffer is preserved after rendering, otherwise it is cleared. On some implementations
    * preserving the drawing buffer can dramatically impact performance.
    */
  var preserveDrawingBuffer: Boolean = js.native
}
