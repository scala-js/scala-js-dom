/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites
  * different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for
  * accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on
  * each channel.
  *
  * If ChannelMergerNode has one single output, but as many inputs as there are channels to merge; the amount of inputs
  * is defined as a parameter of its constructor and the call to AudioContext.createChannelMerger. In the case that no
  * value is given, it will default to 6.
  *
  * Using a ChannelMergerNode, it is possible to create outputs with more channels than the rendering hardware is able
  * to process. In that case, when the signal is sent to the AudioContext.listener object, supernumerary channels will
  * be ignored.
  *
  *   - Number of inputs: variable; default to 6.
  *   - Number of outputs: 1
  *   - Channel count mode: "max"
  *   - Channel count: 2 (not used in the default count mode)
  *   - Channel interpretation: "speakers"
  */
@js.native
trait ChannelMergerNode extends AudioNode
