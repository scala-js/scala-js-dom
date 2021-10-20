/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The SVGTextPositioningElement interface is inherited by text-related interfaces: SVGTextElement, SVGTSpanElement,
  * SVGTRefElement and SVGAltGlyphElement.
  */
@js.native
@JSGlobal
abstract class SVGTextPositioningElement extends SVGTextContentElement {

  /** Corresponds to attribute y on the given element. */
  def y: SVGAnimatedLengthList = js.native

  /** Corresponds to attribute rotate on the given element. */
  def rotate: SVGAnimatedNumberList = js.native

  /** Corresponds to attribute dy on the given element. */
  def dy: SVGAnimatedLengthList = js.native

  /** Corresponds to attribute x on the given element. */
  def x: SVGAnimatedLengthList = js.native

  /** Corresponds to attribute dx on the given element. */
  def dx: SVGAnimatedLengthList = js.native
}
