/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The AudioNode interface is a generic interface for representing an audio processing module like an audio source
  * (e.g. an HTML &lt;audio&gt; or &lt;video&gt; element, an OscillatorNode, etc.), the audio destination, intermediate
  * processing module (e.g. a filter like BiquadFilterNode or ConvolverNode), or volume control (like GainNode).
  *
  * An AudioNode has inputs and outputs, each with a given amount of channels. An AudioNode with zero inputs and one or
  * multiple outputs is called a source node. The exact processing done varies from one AudioNode to another but, in
  * general, a node reads its inputs, does some audio-related processing, and generates new values for its outputs, or
  * simply lets the audio pass through (for example in the AnalyserNode, where the result of the processing is accessed
  * separately).
  *
  * Different nodes can be linked together to build a processing graph. Such a graph is contained in an AudioContext.
  * Each AudioNode participates in exactly one such context. In general, processing nodes inherit the properties and
  * methods of AudioNode, but also define their own functionality on top. See the individual node pages for more
  * details, as listed on the Web Audio API homepage.
  */
@js.native
trait AudioNode extends EventTarget {

  /** Returns the associated AudioContext, that is the object representing the processing graph the node is
    * participating in.
    */
  val context: AudioContext = js.native

  /** Returns the number of inputs feeding the node. Source nodes are defined as nodes having a numberOfInputs property
    * with a value of 0.
    */
  val numberOfInputs: Int = js.native

  /** Returns the number of outputs coming out of the node. Destination nodes — like AudioDestinationNode — have a value
    * of 0 for this attribute.
    */
  val numberOfOutputs: Int = js.native

  /** Represents an integer used to determine how many channels are used when up-mixing and down-mixing connections to
    * any inputs to the node. Its usage and precise definition depend on the value of AudioNode.channelCountMode.
    */
  var channelCount: Int = js.native

  /** Represents an enumerated value describing the way channels must be matched between the node's inputs and outputs.
    */
  var channelCountMode: ChannelCountMode = js.native

  /** Represents an enumerated value describing the meaning of the channels. This interpretation will define how audio
    * up-mixing and down-mixing will happen.
    *
    * The possible values are "speakers" or "discrete".
    */
  var channelInterpretation: ChannelInterpretation = js.native

  /** Allows us to connect one output of this node to one input of another node. */
  def connect(audioNode: AudioNode): Unit = js.native

  /** Allows us to connect one output of this node to one input of an audio parameter. */
  def connect(audioParam: AudioParam): Unit = js.native

  /** Allows us to disconnect the current node from another one it is already connected to.
    *
    * @param output
    *   The index describing which output of the AudioNode is going to be disconnected.
    */
  def disconnect(output: AudioNode = js.native): Unit = js.native
}
