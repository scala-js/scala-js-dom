/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the
  * different channels of an audio source into a set of mono outputs. This is useful for accessing each channel
  * separately, e.g. for performing channel mixing where gain must be separately controlled on each channel.
  *
  * If your ChannelSplitterNode always has one single input, the amount of outputs is defined by a parameter on its
  * constructor and the call to AudioContext.createChannelSplitter(). In the case that no value is given, it will
  * default to 6. If there are less channels in the input than there are outputs, supernumerary outputs are silent.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: variable; default to 6.
  *   - Channel count mode: "max"
  *   - Channel count: 2 (not used in the default count mode)
  *   - Channel interpretation: "speakers"
  */
@js.native
trait ChannelSplitterNode extends AudioNode
