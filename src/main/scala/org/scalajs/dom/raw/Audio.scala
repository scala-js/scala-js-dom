/**
 * Documentation is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */

package org.scalajs.dom.raw

import scala.scalajs.js

/** The AudioContext interface represents an audio-processing graph built
 *  from audio modules linked together, each represented by an AudioNode.
 *  An audio context controls both the creation of the nodes it contains and the
 *  execution of the audio processing, or decoding. You need to create an
 *  AudioContext before you do anything else, as everything happens inside a
 *  context.
 *
 *  An AudioContext can be a target of events, therefore it implements the
 *  EventTarget interface.
 */
@js.native
class AudioContext extends EventTarget {
  /** Returns a double representing an ever-increasing hardware time in
   *  seconds used for scheduling.
   *  It starts at 0 and cannot be stopped, paused or reset.
   */
  def currentTime: Double = js.native

  /** Returns an AudioDestinationNode representing the final destination of
   *  all audio in the context.
   *  It can be thought of as the audio-rendering device.
   */
  val destination: AudioDestinationNode = js.native

  /** Returns the AudioListener object, used for 3D spatialization. */
  val listener: AudioListener = js.native

  /** Returns a float representing the sample rate (in samples per second)
   *  used by all nodes in this context.
   *  The sample-rate of an AudioContext cannot be changed.
   */
  val sampleRate: Double = js.native

  /** Creates an AnalyserNode, which can be used to expose audio time and
   *  frequency data and for example to create data visualisations.
   */
  def createAnalyser(): AnalyserNode = js.native

  /** Creates a BiquadFilterNode, which represents a second order filter
   *  configurable as several different common filter types:
   *  high-pass, low-pass, band-pass, etc.
   */
  def createBiquadFilter(): BiquadFilterNode = js.native

  /** Creates a new, empty AudioBuffer object, which can then be populated by
   *  data and played via an AudioBufferSourceNode.
   *
   * @param numOfChannels An integer representing the number of channels this
   *                      buffer should have. Implementations must support a
   *                      minimum 32 channels.
   * @param length        An integer representing the size of the buffer in
   *                      sample-frames.
   * @param sampleRate    The sample-rate of the linear audio data in
   *                      sample-frames per second. An implementation must
   *                      support sample-rates in at least the range 22050 to
   *                      96000.
   */
  def createBuffer(numOfChannels: Int, length: Int, sampleRate: Int): AudioBuffer = js.native

  /** Creates an AudioBufferSourceNode, which can be used to play and
   *  manipulate audio data contained within an AudioBuffer object.
   *  AudioBuffers are created using AudioContext.createBuffer or returned by
   *  AudioContext.decodeAudioData when it successfully decodes an audio track.
   */
  def createBufferSource(): AudioBufferSourceNode = js.native

  /** Creates a ChannelMergerNode, which is used to combine channels from
   *  multiple audio streams into a single audio stream.
   *
   *  @param numberOfInputs The number of channels in the input audio streams,
   *                        which the output stream will contain; the default is
   *                        6 is this parameter is not specified.
   */
  def createChannelMerger(numberOfInputs: Int = 6): ChannelMergerNode = js.native

  /** Creates a ChannelSplitterNode, which is used to access the individual
   *  channels of an audio stream and process them separately.
   *
   *  @param numberOfOutputs The number of channels in the input audio stream
   *                         that you want to output separately; the default is
   *                         6 is this parameter is not specified.
   */
  def createChannelSplitter(numberOfOutputs: Int = 6): ChannelSplitterNode = js.native

  /** Creates a ConvolverNode, which can be used to apply convolution effects
   *  to your audio graph, for example a reverberation effect.
   */
  def createConvolver(): ConvolverNode = js.native

  /** Creates a DelayNode, which is used to delay the incoming audio signal
   *  by a certain amount.
   *  This node is also useful to create feedback loops in a Web Audio API
   *  graph.
   *
   *  @param maxDelayTime The maximum amount of time, in seconds, that the audio
   *                      signal can be delayed by. The default value is 0.
   */
  def createDelay(maxDelayTime: Int): DelayNode = js.native

  /** Creates a DynamicsCompressorNode, which can be used to apply acoustic
   *  compression to an audio signal. */
  def createDynamicsCompressor(): DynamicsCompressorNode = js.native

  /** Creates a GainNode, which can be used to control the overall volume of
   *  the audio graph. */
  def createGain(): GainNode = js.native

  /** Creates a MediaElementAudioSourceNode associated with an HTMLMediaElement.
   *  This can be used to play and manipulate audio from &lt;video&gt; or
   *  &lt;audio&gt; elements.
   *
   *  @param myMediaElement An HTMLMediaElement object that you want to feed
   *                        into an audio processing graph to manipulate.
   */
  def createMediaElementSource(myMediaElement: HTMLMediaElement): MediaElementAudioSourceNode = js.native

  /** Creates a MediaStreamAudioSourceNode associated with a MediaStream
   *  representing an audio stream which may come from the local computer
   *  microphone or other sources.
   *
   *  @param stream A MediaStream object that you want to feed into an audio
   *                processing graph to manipulate.
   */
  def createMediaStreamSource(stream: MediaStream): MediaStreamAudioSourceNode = js.native

  /** Creates a MediaStreamAudioDestinationNode associated with a MediaStream
   *  representing an audio stream which may be stored in a local file or sent
   *  to another computer.
   */
  def createMediaStreamDestination(): MediaStreamAudioDestinationNode = js.native

  /** Creates an OscillatorNode, a source representing a periodic waveform.
   *  It basically generates a tone. */
  def createOscillator(): OscillatorNode = js.native

  /** Creates a PannerNode, which is used to spatialise an incoming audio
   *  stream in 3D space. */
  def createPanner(): PannerNode = js.native

  /** Creates a PeriodicWave, used to define a periodic waveform that can be
   *  used to determine the output of an OscillatorNode.
   */
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): PeriodicWave = js.native

  /** Creates a StereoPannerNode, which can be used to apply stereo panning
   *  to an audio source. */
  def createStereoPanner(): StereoPannerNode = js.native

  /** Creates a WaveShaperNode, which is used to implement non-linear
   *  distortion effects. */
  def createWaveShaper(): WaveShaperNode = js.native

  /** Asynchronously decodes audio file data contained in an ArrayBuffer. In
   *  this case, the ArrayBuffer is usually loaded from an XMLHttpRequest's
   *  response attribute after setting the responseType to arraybuffer.
   *  This method only works on complete files, not fragments of audio files.
   *
   *  @param audioData       An ArrayBuffer containing the audio data to be
   *                         decoded, usually grabbed from an XMLHttpRequest's
   *                         response attribute after setting the responseType
   *                         to arraybuffer.
   *  @param successCallback A callback function to be invoked when the
   *                         decoding successfully finishes. The single
   *                         argument to this callback is an AudioBuffer
   *                         representing the decoded PCM audio data. Usually
   *                         you'll want to put the decoded data into an
   *                         AudioBufferSourceNode, from which it can be played
   *                         and manipulated how you want.
   *  @param errorCallback   An optional error callback, to be invoked if an
   *                         error occurs when the audio data is being decoded.
   */
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer,
                      successCallback: js.Function1[AudioBuffer, _] = js.native,
                      errorCallback: js.Function0[_] = js.native): Promise[AudioBuffer] = js.native
}

/** The OfflineAudioContext interface is an AudioContext interface
 *  representing an audio-processing graph built from linked together
 *  AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext
 *  doesn't render the audio to the device hardware; instead, it generates it,
 *  as fast as it can, and outputs the result to an AudioBuffer.
 *
 *  It is important to note that, whereas you can create a new AudioContext
 *  using the new AudioContext() constructor with no arguments, the
 *  new OfflineAudioContext() constructor requires three arguments:
 *
 *  @example {{{
 *  new OfflineAudioContext(numOfChannels, length, sampleRate)
 *  }}}
 *
 *  This works in exactly the same way as when you create a new AudioBuffer with
 *  the AudioContext.createBuffer method. For more detail, read Audio buffers:
 *  frames, samples and channels from our Basic concepts guide.
 *
 *  @param numOfChannels An integer representing the number of channels this
 *                       buffer should have.
 *                       Implementations must support a minimum 32 channels.
 *  @param length        An integer representing the size of the buffer in
 *                       sample-frames.
 *  @param sampleRate    The sample-rate of the linear audio data in
 *                       sample-frames per second.
 *                       An implementation must support sample-rates in at
 *                       least the range 22050 to 96000, with 44100 being the
 *                       most commonly used.
 */
@js.native
class OfflineAudioContext(numOfChannels: Int, length: Int, sampleRate: Int) extends AudioContext {
  /** The promise-based startRendering() method of the OfflineAudioContext
   *  Interface starts rendering the audio graph, taking into account the
   *  current connections and the current scheduled changes.
   *
   *  When the method is invoked, the rendering is started and a promise is
   *  raised. When the rendering is completed, the promise resolves with an
   *  AudioBuffer containing the rendered audio.
   */
  def startRendering(): Promise[AudioBuffer] = js.native

  /** Is an EventHandler called when the processing is terminated, that is
   *  when the complete event (of type OfflineAudioCompletionEvent) is raised.
   */
  @deprecated("Use the promise version of OfflineAudioContext.startRendering instead.", "forever")
  var oncomplete: js.Function1[OfflineAudioCompletionEvent, _] = js.native
}


/** The AudioNode interface is a generic interface for representing an audio
 *  processing module like an audio source (e.g. an HTML &lt;audio&gt; or
 *  &lt;video&gt; element, an OscillatorNode, etc.), the audio destination,
 *  intermediate processing module (e.g. a filter like BiquadFilterNode or
 *  ConvolverNode), or volume control (like GainNode).
 *
 *  An AudioNode has inputs and outputs, each with a given amount of channels.
 *  An AudioNode with zero inputs and one or multiple outputs is called a source
 *  node. The exact processing done varies from one AudioNode to another but, in
 *  general, a node reads its inputs, does some audio-related processing, and
 *  generates new values for its outputs, or simply lets the audio pass through
 *  (for example in the AnalyserNode, where the result of the processing is
 *  accessed separately).
 *
 *  Different nodes can be linked together to build a processing graph. Such
 *  a graph is contained in an AudioContext.
 *  Each AudioNode participates in exactly one such context. In general,
 *  processing nodes inherit the properties and  methods of AudioNode, but also
 *  define their own functionality on top. See the individual node pages for
 *  more details, as listed on the Web Audio API homepage.
 */
@js.native
trait AudioNode extends EventTarget {
  /** Returns the associated AudioContext, that is the object representing
   *  the processing graph the node is participating in.
   */
  val context: AudioContext = js.native

  /** Returns the number of inputs feeding the node. Source nodes are defined
   *  as nodes having a numberOfInputs property with a value of 0.
   */
  val numberOfInputs: Int = js.native

  /** Returns the number of outputs coming out of the node. Destination nodes
   *   — like AudioDestinationNode — have a value of 0 for this attribute.
   */
  val numberOfOutputs: Int = js.native

  /** Represents an integer used to determine how many channels are used when
   *  up-mixing and down-mixing connections to any inputs to the node. Its usage
   *  and precise definition depend on the value of AudioNode.channelCountMode.
   */
  var channelCount: Int = js.native

  /** Represents an enumerated value describing the way channels must be
   *  matched between the node's inputs and outputs.
   */
  var channelCountMode: Int = js.native

  /** Represents an enumerated value describing the meaning of the channels.
   *  This interpretation will define how audio up-mixing and down-mixing will
   *  happen.
   *
   *  The possible values are "speakers" or "discrete".
   */
  var channelInterpretation: String = js.native

  /** Allows us to connect one output of this node to one input of another
   *  node.
   */
  def connect(audioNode: AudioNode): Unit = js.native

  /** Allows us to connect one output of this node to one input of an audio
   *  parameter.
   */
  def connect(audioParam: AudioParam): Unit = js.native

  /** Allows us to disconnect the current node from another one it is already
   *  connected to.
   *
   *  @param output The index describing which output of the AudioNode is
   *                going to be disconnected.
   */
  def disconnect(output: AudioNode = js.native): Unit = js.native
}

/** The AnalyserNode interface represents a node able to provide real-time
 *  frequency and time-domain analysis information.
 *  It is an AudioNode that passes the audio stream unchanged from the input to
 *  the output, but allows you to take the generated data,process it, and create
 *  audio visualizations.
 *
 *  An AnalyzerNode has exactly one input and one output. The node works even
 *  if the output is not connected.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      1 (but may be left unconnected)
 *  - Channel count mode:     "explicit"
 *  - Channel count:          1
 *  - Channel interpretation: "speakers"
 */
@js.native
trait AnalyserNode extends AudioNode {
  /** Is an unsigned long value representing the size of the FFT (Fast Fourier
   *  Transform) to be used to determine the frequency domain.
   */
  var fftSize: Int = js.native

  /** Is an unsigned long value half that of the FFT size. This generally
   *  equates to the number of data values you will have to play with for the
   *  visualization.
   */
  val frequencyBinCount: Int = js.native

  /** Is a double value representing the minimum power value in the scaling
   *  range for the FFT analysis data, for conversion to unsigned byte values —
   *  basically, this specifies the minimum value for the range of results when
   *  using getByteFrequencyData().
   */
  var minDecibels: Double = js.native

  /** Is a double value representing the maximum power value in the scaling
   *  range for the FFT analysis data, for conversion to unsigned byte values —
   *  basically, this specifies the maximum value for the range of results when
   *  using getByteFrequencyData().
   */
  var maxDecibels: Double = js.native

  /** Is a double value representing the averaging constant with the last
   *  analysis frame — basically, it makes the transition between values over
   *  time smoother.
   */
  var smoothingTimeConstant: Double = js.native

  /** Copies the current frequency data into a Float32Array array passed into
   *  it.
   *
   *  If the array has fewer elements than the AnalyserNode.frequencyBinCount,
   *  excess elements are dropped.
   *  If it has more elements than needed, excess elements are ignored.
   *
   *  @param array The Float32Array that the frequency domain data will be
   *               copied to.
   */
  def getFloatFrequencyData(array: js.typedarray.Float32Array): Unit = js.native

  /** Copies the current frequency data into a Uint8Array (unsigned byte
   *  array) passed into it.
   *
   *  If the array has fewer elements than the AnalyserNode.frequencyBinCount,
   *  excess elements are dropped.
   *  If it has more elements than needed, excess elements are ignored.
   *
   *  @param array The Uint8Array that the frequency domain data will be
   *               copied to.
   */
  def getByteFrequencyData(array: js.typedarray.Uint8Array): Unit = js.native

  /** Copies the current waveform, or time-domain, data into a Float32Array
   *  array passed into it.
   *
   *  If the array has fewer elements than the AnalyserNode.fftSize, excess
   *  elements are dropped.
   *  If it has more elements than needed, excess elements are ignored.
   *
   *  @param array The Float32Array that the time domain data will be copied to.
   */
  def getFloatTimeDomainData(array: js.typedarray.Float32Array): Unit = js.native

  /** Copies the current waveform, or time-domain, data into a Uint8Array
   *  (unsigned byte array) passed into it.
   *
   *  If the array has fewer elements than the AnalyserNode.fftSize, excess
   *  elements are dropped.
   *  If it has more elements than needed, excess elements are ignored.
   *
   *  @param array The Uint8Array that the time domain data will be copied to.
   */
  def getByteTimeDomainData(array: js.typedarray.Uint8Array): Unit = js.native
}

/** AudioBufferSourceNode has no input and exactly one output. The number of
 *  channels in the output corresponds to the number of channels of the
 *  AudioBuffer that is set to the AudioBufferSourceNode.buffer property.
 *  If there is no buffer set—that is, if the attribute's value is NULL—the
 *  output contains one channel consisting of silence.
 *  An AudioBufferSourceNode can only be played once; that is, only one call to
 *  AudioBufferSourceNode.start() is allowed.
 *  If the sound needs to be played again, another AudioBufferSourceNode has
 *  to be created. Those nodes are cheap to create, and AudioBuffers can be
 *  reused across plays. It is often said that AudioBufferSourceNodes have to be
 *  used in a "fire and forget" fashion: once it has been started, all
 *  references to the node can be dropped, and it will be garbage-collected
 *  automatically.
 *
 *  Multiple calls to AudioBufferSourceNode.stop() are allowed. The most
 *  recent call replaces the previous one, granted the AudioBufferSourceNode
 *  has not already reached the end of the buffer.
 *
 *  - Number of inputs:  0
 *  - Number of outputs: 1
 *  - Channel count:     defined by the associated AudioBuffer
 */
@js.native
trait AudioBufferSourceNode extends AudioNode {
  /** Is an AudioBuffer that defines the audio asset to be played, or when
   *  set to the value null, defines a single channel of silence.
   */
  @deprecated("Should no longer be used, but will probably still work.", "forever")
  var buffer: AudioBuffer = js.native

  /** Is an a-rate AudioParam that defines the speed factor at which the
   *  audio asset will be played.
   *  Since no pitch correction is applied on the output, this can be used to
   *  change the pitch of the sample.
   */
  val playbackRate: AudioParam = js.native

  /** Is a Boolean attribute indicating if the audio asset must be replayed
   *  when the end of the AudioBuffer is reached.
   *  Its default value is false.
   */
  var loop: Boolean = js.native

  /** Is a double value indicating, in seconds, where in the AudioBuffer the
   *  restart of the play must happen.
   *  Its default value is 0.
   */
  var loopStart: Double = js.native

  /** Is a double value indicating, in seconds, where in the AudioBuffer the
   *  replay of the play must stop (and eventually loop again).
   *  Its default value is 0.
   */
  var loopEnd: Double = js.native

  /** Schedules the start of the playback of the audio asset.
   *
   *  @param when     The when parameter defines when the play will start. If
   *                  when represents a time in the past, the play will start
   *                  immediately. If the method is called more than one time,
   *                  or after a call to AudioBufferSourceNode.stop(), an
   *                  exception is raised.
   *  @param offset   The offset parameter, which defaults to 0, defines
   *                  where the playback will start.
   *  @param duration The duration parameter, which defaults to the length of
   *                  the asset minus the value of offset, defines the length of
   *                  the portion of the asset to be played.
   */
  def start(when: Double = 0.0, offset: Double = 0.0, duration: Double = js.native): Unit = js.native

  /** Schedules the end of the playback of an audio asset.
   *
   *  @param when The when parameter defines when the playback will stop. If
   *              it represents a time in the past, the playback will end
   *              immediately. If this method is called twice or more, an
   *              exception is raised.
   */
  def stop(when: Double = 0.0): Unit = js.native

  /** Is an EventHandler containing the callback associated with the ended
   *  event.
   */
  var onended: js.Function1[Event, _] = js.native
}

/** The AudioDestinationNode interface represents the end destination of an
 *  audio graph in a given context — usually the speakers of your device.
 *  It can also be the node that will "record" the audio data when used with an
 *  OfflineAudioContext.
 *
 *  AudioDestinationNode has no output (as it is the output, no more AudioNode
 *  can be linked after it in the audio graph) and one input.
 *  The amount of channels in the input must be between 0 and the
 *  maxChannelCount value or an exception is raised.
 *
 *  The AudioDestinationNode of a given AudioContext can be retrieved using
 *  the AudioContext.destination property.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      0
 *  - Channel count mode:     "explicit"
 *  - Channel count:          2
 *  - Channel interpretation: "speakers"
 */
@js.native
trait AudioDestinationNode extends AudioNode {
  /** Is an unsigned long defining the maximum amount of channels that the
   *  physical device can handle.
   */
  var maxChannelCount: Int = js.native
}

/** The AudioListener interface represents the position and orientation of
 *  the unique person listening to the audio scene, and is used in audio
 *  spatialisation. All PannerNodes spatialise in relation to the AudioListener
 *  stored in the AudioContext.listener attribute.
 *
 *  It is important to note that there is only one listener per context and
 *  that it isn't an AudioNode.
 */
@js.native
trait AudioListener extends AudioNode {
  /** Is a double value representing the amount of pitch shift to use when
   *  rendering a doppler effect.
   */
  var dopplerFactor: Double = js.native

  /** Is a double value representing the speed of sound, in meters per second.
   */
  var speedOfSound: Double = js.native

  /** Defines the position of the listener.
   *
   *  The three parameters x, y and z are unitless and describe the listener's
   *  position in 3D space according to the right-hand Cartesian coordinate
   *  system. PannerNode objects use this position relative to individual audio
   *  sources for spatialisation.
   *
   *  The default value of the position vector is (0, 0, 0).
   *
   *  @param x The x position of the listener in 3D space.
   *  @param y The y position of the listener in 3D space.
   *  @param z The z position of the listener in 3D space.
   */
  def setPosition(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0): Unit = js.native

  /** Defines the orientation of the listener.
   *
   *  It consists of two direction vectors:
   *
   *  - The front vector, defined by the three unitless parameters x, y and z,
   *    describes the direction of the face of the listener, that is the
   *    direction the nose of the person is pointing towards.
   *    The front vector's default value is (0, 0, -1).
   *  - The up vector, defined by three unitless parameters xUp, yUp and zUp,
   *    describes the direction of the top of the listener's head.
   *    The up vector's default value is (0, 1, 0).
   *
   *  Both vectors must be separated by an angle of 90° — in linear analysis
   *  terms, they must be linearly independent.
   *
   *  @param x   The x value of the front vector of the listener.
   *  @param y   The y value of the front vector of the listener.
   *  @param z   The z value of the front vector of the listener.
   *  @param xUp The x value of the up vector of the listener.
   *  @param yUp The y value of the up vector of the listener.
   *  @param zUp The z value of the up vector of the listener.
   */
  def setOrientation(x: Double = 0.0, y: Double = 0.0, z: Double = -1.0,
                     xUp: Double = 0.0, yUp: Double = 1.0, zUp: Double = 0.0): Unit = js.native
}

/** The AudioParam interface represents an audio-related parameter, usually a
 *  parameter of an AudioNode (such as GainNode.gain). An AudioParam can be set
 *  to a specific value or a change in value, and can be scheduled to happen at
 *  a specific time and following a specific pattern.
 *
 *  There are two kinds of AudioParam, a-rate and k-rate parameters:
 *
 *  - An a-rate AudioParam takes the current audio parameter value for each
 *    sample frame of the audio signal.
 *  - A k-rate AudioParam uses the same initial audio parameter value for the
 *    whole block processed, that is 128 sample frames.
 *
 *  Each AudioNode defines which of its parameters are a-rate or k-rate in
 *  the spec.
 *
 *  Each AudioParam has a list of events, initially empty, that define when
 *  and how values change. When this list is not empty, changes using the
 *  AudioParam.value attributes are ignored. This list of events allows us to
 *  schedule changes that have to happen at very precise times, using arbitrary
 *  timelime-based automation curves.
 *  The time used is the one defined in AudioContext.currentTime.
 */
@js.native
trait AudioParam extends AudioNode {
  /** Represents the parameter's current floating point value; initially set
   *  to the value of AudioParam.defaultValue.
   *  Though it can be set, any modifications happening while there are
   *  automation events scheduled — that is events scheduled using the methods
   *  of the AudioParam — are ignored, without raising any exception.
   */
  var value: Double = js.native

  /** Represents the initial value of the attributes as defined by the
   *  specific AudioNode creating the AudioParam.
   */
  val defaultValue: Double = js.native

  /** Schedules an instant change to the value of the AudioParam at a precise
   *  time, as measured against AudioContext.currentTime.
   *  The new value is given in the value parameter.
   *
   *  @param value     A floating point number representing the value the
   *                   AudioParam will change to at the given time.
   *  @param startTime A double representing the exact time (in seconds) after
   *                   the AudioContext was first created that the change in
   *                   value will happen.
   */
  def setValueAtTime(value: Double, startTime: Double): Unit = js.native

  /** Schedules a gradual linear change in the value of the AudioParam. The
   *  change starts at the time specified for the previous event, follows a
   *  linear ramp to the new value given in the value parameter, and reaches the
   *  new value at the time given in the endTime parameter.
   *
   *  @param value     A floating point number representing the value the
   *                   AudioParam will ramp up to by the given time.
   *  @param endTime   A double representing the exact time (in seconds) after
   *                   the ramping starts that the changing of the value will
   *                   stop.
   */
  def linearRampToValueAtTime(value: Double, endTime: Double): Unit = js.native

  /** Schedules a gradual exponential change in the value of the AudioParam.
   *  The change starts at the time specified for
   *  the previous event, follows an exponential ramp to the new value given
   *  in the value parameter, and reaches the new
   *  value at the time given in the endTime parameter.
   *
   *  @param value     A floating point number representing the value the
   *                   AudioParam will ramp up to by the given time.
   *  @param endTime   A double representing the exact time (in seconds)
   *                   after the ramping starts that the changing of
   *                   the value will stop.
   */
  def exponentialRampToValueAtTime(value: Double, endTime: Double): Unit = js.native

  /** Schedules the start of a change to the value of the AudioParam. The
   *  change starts at the time specified in startTime and exponentially moves
   *  towards the value given by the target parameter. The exponential decay
   *  rate is defined by the timeConstant parameter, which is a time measured in
   *  seconds.
   *
   *  @param target       The value the parameter will start to transition
   *                      towards at the given start time.
   *  @param startTime    The time that the exponential transition will begin,
   *                      which will be relative to AudioContext.currentTime.
   *  @param timeConstant The time-constant value of first-order filter
   *                      (exponential) approach to the target value. The larger
   *                      this value is, the slower the transition will be.
   */
  def setTargetAtTime(target: Double, startTime: Double, timeConstant: Double): Unit = js.native

  /** Schedules the values of the AudioParam to follow a set of values,
   *  defined by the values Float32Array scaled to fit into the given interval,
   *  starting at startTime, and having a specific duration.
   *
   *  @param values    A Float32Array representing the value curve the
   *                   AudioParam will change through along the duration.
   *  @param startTime A double representing the exact time (in seconds) after
   *                   the AudioContext was first created that the change in
   *                   value will happen.
   *  @param duration  A double representing the exact time (in seconds)
   *                   during which the values will be changed between.
   *                   The values are spaced equally along this duration.
   */
  def setValueCurveAtTime(values: js.typedarray.Float32Array, startTime:
  Double, duration: Double): Unit = js.native

  /** Cancels all scheduled future changes to the AudioParam.
   *
   *  @param startTime A double representing the exact time (in seconds)
   *                   after the AudioContext was first created after
   *                   which all scheduled changes will be cancelled.
   */
  def cancelScheduledValues(startTime: Double): Unit = js.native
}

/** The BiquadFilterNode interface represents a simple low-order filter, and
 *  is created using the AudioContext.createBiquadFilter() method.
 *  It is an AudioNode that can represent different kinds of filters, tone
 *  control devices, and graphic equalizers.
 *  A BiquadFilterNode always has exactly one input and one output.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      1
 *  - Channel count mode:     "max"
 *  - Channel count:          2 (not used in the default count mode)
 *  - Channel interpretation: "speakers"
 */
@js.native
trait BiquadFilterNode extends AudioNode {
  /** Is a k-rate AudioParam, a double representing a frequency in the
   *  current filtering algorithm measured in hertz (Hz).
   */
  val frequency: AudioParam = js.native

  /** Is an a-rate AudioParam representing detuning of the frequency in cents.
   */
  val detune: AudioParam = js.native

  /** Is a k-rate AudioParam, a double representing a Q factor, or quality
   *  factor.
   */
  val Q: AudioParam = js.native

  /** Is a k-rate AudioParam, a double representing the gain used in the
   *  current filtering algorithm.
   */
  val gain: AudioParam = js.native

  /** Is a string value defining the kind of filtering algorithm the node is
   *  implementing.
   */
  var `type`: String = js.native

  /** From the current filter parameter settings this method calculates the
   *  frequency response for frequencies specified in the provided array of
   *  frequencies.
   *
   *  @param frequencyHz   A Float32Array containing hertz values that you
   *                       want the frequency response for.
   *  @param magResponse   A Float32Array that will contain the outputted
   *                       magnitude of the frequency response for each
   *                       inputted frequency (hertz) value. The magnitude
   *                       values are unitless.
   *  @param phaseResponse A Float32Array that will contain the outputted
   *                       phase of the frequency response for each inputted
   *                       frequency (hertz) value, measured in radians.
   */
  def getFrequencyResponse(frequencyHz: js.typedarray.Float32Array,
                           magResponse: js.typedarray.Float32Array,
                           phaseResponse: js.typedarray.Float32Array): Unit = js.native
}

/** The ChannelMergerNode interface, often used in conjunction with its
 *  opposite, ChannelSplitterNode, reunites different mono inputs into a single
 *  output. Each input is used to fill a channel of the output. This is useful
 *  for accessing each channels separately, e.g. for performing channel mixing
 *  where gain must be separately controlled on each channel.
 *
 *  If ChannelMergerNode has one single output, but as many inputs as there
 *  are channels to merge; the amount of inputs is defined as a parameter of its
 *  constructor and the call to AudioContext.createChannelMerger.
 *  In the case that no value is given, it will default to 6.
 *
 *  Using a ChannelMergerNode, it is possible to create outputs with more
 *  channels than the rendering hardware is able to process. In that case, when
 *  the signal is sent to the AudioContext.listener object, supernumerary
 *  channels will be ignored.
 *
 *  - Number of inputs:       variable; default to 6.
 *  - Number of outputs:      1
 *  - Channel count mode:     "max"
 *  - Channel count:          2 (not used in the default count mode)
 *  - Channel interpretation: "speakers"
 */
@js.native
trait ChannelMergerNode extends AudioNode

/** The ChannelSplitterNode interface, often used in conjunction with its
 *  opposite, ChannelMergerNode, separates the different channels of an audio
 *  source into a set of mono outputs. This is useful for accessing each channel
 *  separately, e.g. for performing channel mixing where gain must be separately
 *  controlled on each channel.
 *
 *  If your ChannelSplitterNode always has one single input, the amount of
 *  outputs is defined by a parameter on its constructor and the call to
 *  AudioContext.createChannelSplitter(). In the case that no value is given,
 *  it will default to 6. If there are less channels in the input than there are
 *  outputs, supernumerary outputs are silent.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      variable; default to 6.
 *  - Channel count mode:     "max"
 *  - Channel count:          2 (not used in the default count mode)
 *  - Channel interpretation: "speakers"
 */
@js.native
trait ChannelSplitterNode extends AudioNode

/** The ConvolverNode interface is an AudioNode that performs a Linear
 *  Convolution on a given AudioBuffer, often used to achieve a reverb effect.
 *  A ConvolverNode always has exactly one input and one output.
 *
 *  Note: For more information on the theory behind Linear Convolution, see
 *  the W3C Web Audio API spec section, Linear Effects Using Convolution, or
 *  read the The Wikipedia Linear Convolution Article.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      1
 *  - Channel count mode:     "clamped-max"
 *  - Channel count:          2
 *  - Channel interpretation: "speakers"
 */
@js.native
trait ConvolverNode extends AudioNode {
  /** A mono, stereo, or 4-channel AudioBuffer containing the (possibly
   *  multichannel) impulse response used by the ConvolverNode to create the
   *  reverb effect.
   */
  var buffer: AudioBuffer = js.native

  /** A boolean that controls whether the impulse response from the buffer will
   *  be scaled by an equal-power normalization when the buffer attribute is
   *  set, or not.
   */
  var normalize: Boolean = js.native
}

/** The DelayNode interface represents a delay-line; an AudioNode
 *  audio-processing module that causes a delay between the arrival of an input
 *  data and its propagation to the output.
 *  A DelayNode always has exactly one input and one output, both with the same
 *  amount of channels.
 *
 *  When creating a graph that has a cycle, it is mandatory to have at least one
 *  DelayNode in the cycle, or the nodes taking part in the cycle will be muted.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      1
 *  - Channel count mode:     "max"
 *  - Channel count:          2 (not used in the default count mode)
 *  - Channel interpretation: "speakers"
 */
@js.native
trait DelayNode extends AudioNode {
  /** Is an a-rate AudioParam representing the amount of delay to apply. */
  val delayTime: AudioParam = js.native
}

/** The DynamicsCompressorNode interface provides a compression effect, which
 *  lowers the volume of the loudest parts of the signal in order to help
 *  prevent clipping and distortion that can occur when multiple sounds are
 *  played and multiplexed together at once. This is often used in musical
 *  production and game audio. DynamicsCompressorNode is an AudioNode that has
 *  exactly one input and one output; it is created using the
 *  AudioContext.createDynamicsCompressor method.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      1
 *  - Channel count mode:     "explicit"
 *  - Channel count:          2
 *  - Channel interpretation: "speakers"
 */
@js.native
trait DynamicsCompressorNode extends AudioNode {
  /** Is a k-rate AudioParam representing the decibel value above which the
   *  compression will start taking effect.
   */
  val threshold: AudioParam = js.native

  /** Is a k-rate AudioParam containing a decibel value representing the
   *  range above the threshold where the curve smoothly transitions to the
   *  compressed portion.
   */
  val knee: AudioParam = js.native

  /** Is a k-rate AudioParam representing the amount of change, in dB, needed
   *  in the input for a 1 dB change in the output.
   */
  val ratio: AudioParam = js.native

  /** Is a k-rate AudioParam representing the amount of gain reduction
   *  currently applied by the compressor to the signal.
   */
  val reduction: AudioParam = js.native

  /** Is a k-rate AudioParam representing the amount of time, in seconds,
   *  required to reduce the gain by 10 dB.
   */
  val attack: AudioParam = js.native

  /** Is a k-rate AudioParam representing the amount of time, in seconds,
   *  required to increase the gain by 10 dB.
   */
  val release: AudioParam = js.native
}

/** The GainNode interface represents a change in volume. It is an AudioNode
 *  audio-processing module that causes a given gain to be applied to the input
 *  data before its propagation to the output.
 *  A GainNode always has exactly one input and one output, both with the same
 *  number of channels.
 *
 *  The gain is a unitless value, changing with time, that is multiplied to
 *  each corresponding sample of all input channels. If modified, the new gain
 *  is applied using a de-zippering algorithm in order to prevent unaesthetic
 *  'clicks' from appearing in the resulting audio.
 *
 *  The GainNode is increasing the gain of the output.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      1
 *  - Channel count mode:     "max"
 *  - Channel count:          2 (not used in the default count mode)
 *  - Channel interpretation: "speakers"
 */
@js.native
trait GainNode extends AudioNode {
  /** Is an a-rate AudioParam representing the amount of gain to apply. */
  val gain: AudioParam = js.native
}

/** The MediaElementAudioSourceNode interface represents an audio source
 *  consisting of an HTML5 &lt;audio&gt; or &lt;video&gt; element.
 *  It is an AudioNode that acts as an audio source.
 *
 *  A MediaElementSourceNode has no inputs and exactly one output, and is
 *  created using the AudioContext.createMediaElementSource method.
 *  The amount of channels in the output equals the number of channels of the
 *  audio referenced by the HTMLMediaElement used in the creation of the node,
 *  or is 1 if the HTMLMediaElement has no audio.
 *
 *  - Number of inputs:  0
 *  - Number of outputs: 1
 *  - Channel count:     defined by the media in the HTMLMediaElement passed
 *                       to the AudioContext.createMediaElementSource method
 *                       that created it.
 */
@js.native
trait MediaElementAudioSourceNode extends AudioNode

/** The MediaElementAudioSourceNode interface represents an audio destination
 *  consisting of a WebRTC MediaStream with a single AudioMediaStreamTrack,
 *  which can be used in a similar way to a MediaStream obtained from
 *  Navigator.getUserMedia.
 *
 *  It is an AudioNode that acts as an audio destination, created using the
 *  AudioContext.createMediaStreamDestination method.
 *
 *  - Number of inputs:             1
 *  - Number of outputs:            0
 *  - Channel count:                2
 *  - Channel count mode:           "explicit"
 *  - Channel count interpretation: "speakers"
 */
@js.native
trait MediaStreamAudioDestinationNode extends AudioNode {
  /** Is a MediaStream containing a single AudioMediaStreamTrack with the
   *  same number of channels as the node itself.
   *  You can use this property to get a stream out of the audio graph and
   *  feed it into another construct, such as a Media Recorder.
   */
  var stream: MediaStream = js.native
}

/** The MediaStreamAudioSourceNode interface represents an audio source
 *  consisting of a WebRTC MediaStream (such as a webcam or microphone).
 *  It is an AudioNode that acts as an audio source.
 *
 *  A MediaElementSourceNode has no inputs and exactly one output, and is
 *  created using the AudioContext.createMediaStreamSource method.
 *  The amount of channels in the output equals the number of channels in
 *  AudioMediaStreamTrack. If there is no valid media stream, then the number
 *  of output channels will be one silent channel.
 *
 *  - Number of inputs:  0
 *  - Number of outputs: 1
 *  - Channel count:     defined by the AudioMediaStreamTrack passed to the
 *                       AudioContext.createMediaStreamSource method that
 *                       created it.
 */
@js.native
trait MediaStreamAudioSourceNode extends AudioNode

/** The OscillatorNode interface represents a periodic waveform, like a sine
 *  wave. It is an AudioNode audio-processing module that causes a given
 *  frequency of sine wave to be created — in effect, a constant tone.
 *
 *  An OscillatorNode is created using the AudioContext.createOscillator
 *  method. It always has exactly one output and no inputs, both with the same
 *  amount of channels. Its basic property defaults (see AudioNode for
 *  definitions) are:
 *
 *  - Number of inputs:       0
 *  - Number of outputs:      1
 *  - Channel count mode:     max
 *  - Channel count:          2 (not used in the default count mode)
 *  - Channel interpretation: speakers
 */
@js.native
trait OscillatorNode extends AudioNode {
  /** An a-rate AudioParam representing the frequency of oscillation in hertz
   *  (though the AudioParam returned is read-only, the value it represents is
   *  not.)
   */
  var frequency: AudioParam = js.native

  /** An a-rate AudioParam representing detuning of oscillation in cents (though
   *  the AudioParam returned is read-only, the value it represents is not.)
   */
  var detune: AudioParam = js.native

  /** Represents the shape of the oscillator wave generated. Different waves
   *  will produce different tones. */
  var `type`: String = js.native // Not sure if this is correct ...

  /** This method specifies the exact time to start playing the tone. */
  def start(when: Double = 0.0): Unit = js.native

  /** This method specifies the exact time to stop playing the tone. */
  def stop(when: Double = 0.0): Unit = js.native

  /** Used to point to a PeriodicWave defining a periodic waveform that can
   *  be used to shape the oscillator's output, when type = "custom" is used.
   *
   *  This replaces the now-obsolete OscillatorNode.setWaveTable.
   */
  def setPeriodicWave(wave: PeriodicWave): Unit = js.native

  /** Used to set the event handler for the ended event, which fires when the
   *  tone has stopped playing.
   */
  var onended: js.Function1[Event, _] = js.native
}

/** The PannerNode interface represents the position and behavior of an audio
 *  source signal in space. It is an AudioNode audio-processing module
 *  describing its position with right-hand Cartesian coordinates, its movement
 *  using a velocity vector and its directionality using a directionality cone.
 *
 *  A PannerNode always has exactly one input and one output: the input can
 *  be mono or stereo but the output is always stereo (2 channels) — you need
 *  stereo sound for panning effects!
 *
 *  The PannerNode brings a spatial position and velocity and a directionality
 *  for a given signal.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      1
 *  - Channel count mode:     "clamped-max"
 *  - Channel count:          2
 *  - Channel interpretation: "speakers"
 */
@js.native
trait PannerNode extends AudioNode {
  /** Is an enumerated value determining which spatialisation algorithm to
   *  use to position the audio in 3D space. */
  var panningModel: String = js.native

  /** Is an enumerated value determining which algorithm to use to reduce the
   *  volume of the audio source as it moves away from the listener.
   */
  var distanceModel: String = js.native

  /** Is a double value representing the reference distance for reducing
   *  volume as the audio source moves further from the listener.
   */
  var refDistance: Double = js.native

  /** Is a double value representing the maximum distance between the audio
   *  source and the listener, after which the volume is not reduced any further.
   */
  var maxDistance: Double = js.native

  /** Is a double value describing how quickly the volume is reduced as the
   *  source moves away from the listener.
   *  This value is used by all distance models.
   */
  var rolloffFactor: Double = js.native

  /** Is a double value describing the angle, in degrees, of a cone inside of
   *  which there will be no volume reduction.
   */
  var coneInnerAngle: Double = js.native

  /** Is a double value describing the angle, in degrees, of a cone outside
   *  of which the volume will be reduced by a constant value, defined by the
   *  coneOuterGain attribute.
   */
  var coneOuterAngle: Double = js.native

  /** Is a double value describing the amount of volume reduction outside the
   *  cone defined by the coneOuterAngle attribute.
   *
   *  Its default value is 0, meaning that no sound can be heard.
   */
  var coneOuterGain: Double = js.native

  /** Defines the position of the audio source relative to the listener
   *  (represented by an AudioListener object stored in the
   *  AudioContext.listener attribute.) The three parameters x, y and z are
   *  unitless and describe the source's position in 3D space using the
   *  right-hand Cartesian coordinate system.
   *
   *  The setPosition() method's default value of the position is (0, 0, 0).
   *
   *  @param x The x position of the panner in 3D space.
   *  @param y The y position of the panner in 3D space.
   *  @param z The z position of the panner in 3D space.
   */
  def setPosition(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0): Unit = js.native

  /** Defines the direction the audio source is playing in.
   *  This can have a big effect if the sound is very directional —
   *  controlled by the three cone-related attributes PannerNode.coneInnerAngle,
   *  PannerNode.coneOuterAngle, and PannerNode.coneOuterGain. In such a case,
   *  a sound pointing away from the listener can be very quiet or even silent.
   *
   *  The three parameters x, y and z are unitless and describe a direction
   *  vector in 3D space using the right-hand Cartesian coordinate system.
   *
   *  The default value of the direction vector is (1, 0, 0).
   *
   *  @param x The x value of the panner's direction vector in 3D space.
   *  @param y The y value of the panner's direction vector in 3D space.
   *  @param z The z value of the panner's direction vector in 3D space.
   */
  def setOrientation(x: Double = 1.0, y: Double = 0.0, z: Double = 0.0): Unit = js.native

  /** Defines the velocity vector of the audio source — how fast it is moving
   *  and in what direction.
   *
   *  The velocity relative to the listener is used to control the pitch change
   *  needed to conform with the Doppler effect due to the relative speed.
   *
   *  As the vector controls both the direction of travel and its velocity,
   *  the three parameters x, y and z are expressed in meters per second.
   *
   *  The default value of the velocity vector is (0, 0, 0).
   *
   *  @param x The x value of the panner's velocity vector.
   *  @param y The y value of the panner's velocity vector.
   *  @param z The z value of the panner's velocity vector.
   */
  def setVelocity(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0): Unit = js.native
}

/** The StereoPannerNode interface of the Web Audio API represents a simple
 *  stereo panner node that can be used to pan an audio stream left or right.
 *  It is an AudioNode audio-processing module that positions an incoming audio
 *  stream in a stereo image using a low-cost equal-power panning algorithm.
 *
 *  The pan property takes a unitless value between -1 (full left pan) and 1
 *  (full right pan).
 *
 *  This interface was introduced as a much simpler way to apply a simple
 *  panning effect than having to use a full PannerNode.
 */
@js.native
trait StereoPannerNode extends AudioNode {
  /** Is an a-rate AudioParam representing the amount of panning to apply. */
  val pan: AudioParam = js.native
}

/** The WaveShaperNode interface represents a non-linear distorter. It is an
 *  AudioNode that uses a curve to apply a wave shaping distortion to the
 *  signal. Beside obvious distortion effects, it is often used to add a warm
 *  feeling to the signal.
 *
 *  A WaveShaperNode always has exactly one input and one output.
 *
 *  - Number of inputs:       1
 *  - Number of outputs:      1
 *  - Channel count mode:     "max"
 *  - Channel count:          2 (not used in the default count mode)
 *  - Channel interpretation: "speakers"
 */
@js.native
trait WaveShaperNode extends AudioNode {
  /** Is a Float32Array of numbers describing the distortion to apply. */
  var curve: js.typedarray.Float32Array = js.native

  /** Is an enumerated value indicating if oversampling must be used.
   *  Oversampling is a technique for creating more samples (up-sampling) before
   *  applying the distortion effect to the audio signal. */
  var oversample: String = js.native
}

/** The AudioBuffer interface represents a short audio asset residing in
 *  memory, created from an audio file using the AudioContext.decodeAudioData()
 *  method, or from raw data using AudioContext.createBuffer(). Once put into an
 *  AudioBuffer, the audio can then be played by being passed into an
 *  AudioBufferSourceNode.
 *
 *  Objects of these types are designed to hold small audio snippets,
 *  typically less than 45 s. For longer sounds, objects implementing the
 *  MediaElementAudioSourceNode are more suitable.
 *
 *  The buffer contains data in the following format: non-interleaved IEEE754
 *  32-bit linear PCM with a nominal range between -1 and +1, that is, 32bits
 *  floating point buffer, with each samples between -1.0 and 1.0. If the
 *  AudioBuffer has multiple channels, they are stored in separate buffer.
 */
@js.native
trait AudioBuffer extends js.Object {
  /** Returns a float representing the sample rate, in samples per second, of
   *  the PCM data stored in the buffer.
   */
  val sampleRate: Double = js.native

  /** Returns an integer representing the length, in sample-frames, of the
   *  PCM data stored in the buffer.
   */
  val length: Int = js.native

  /** Returns a double representing the duration, in seconds, of the PCM data
   *  stored in the buffer.
   */
  val duration: Double = js.native

  /** Returns an integer representing the number of discrete audio channels
   *  described by the PCM data stored in the buffer.
   */
  val numberOfChannels: Int = js.native

  /** Returns a Float32Array containing the PCM data associated with the
   *  channel, defined by the channel parameter (with 0 representing the first
   *  channel).
   *
   *  @param channel The channel property is an index representing the
   *                 particular channel to get data for. An index value of 0
   *                 represents the first channel. If the channel index value is
   *                 greater than of equal to AudioBuffer.numberOfChannels, an
   *                 INDEX_SIZE_ERR exception will be thrown.
   */
  def getChannelData(channel: Int): js.typedarray.Float32Array = js.native

  /** Copies the samples from the specified channel of the AudioBuffer to the
   *  destination array.
   *
   *  @param destination    A Float32Array to copy the channel data to.
   *  @param channelNumber  The channel number of the current AudioBuffer to
   *                        copy the channel data from. If channelNumber is
   *                        greater than or equal to AudioBuffer.numberOfChannels,
   *                        an INDEX_SIZE_ERR will be thrown.
   *  @param startInChannel An optional offset to copy the data from. If
   *                        startInChannel is greater than AudioBuffer.length,
   *                        an INDEX_SIZE_ERR will be thrown.
   */
  def copyFromChannel(destination: js.typedarray.Float32Array,
                      channelNumber: Int,
                      startInChannel: Int): Unit = js.native

  /** Copies the samples to the specified channel of the AudioBuffer, from
   *  the source array.
   *
   *  @param source         A Float32Array that the channel data will be
   *                        copied from.
   *  @param channelNumber  The channel number of the current AudioBuffer to
   *                        copy the channel data to. If channelNumber is
   *                        greater than or equal to AudioBuffer.numberOfChannels,
   *                        an INDEX_SIZE_ERR will be thrown.
   *  @param startInChannel An optional offset to copy the data to. If
   *                        startInChannel is greater than AudioBuffer.length,
   *                        an INDEX_SIZE_ERR will be thrown.
   */
  def copyToChannel(source: js.typedarray.Float32Array, channelNumber: Int, startInChannel: Int): Unit = js.native
}

/** The Web Audio API OfflineAudioCompletionEvent interface represents events
 *  that occur when the processing of an OfflineAudioContext is terminated.
 *  The complete event implements this interface.
 */
@js.native
trait OfflineAudioCompletionEvent extends Event {
  /** The buffer containing the result of the processing of an
   *  OfflineAudioContext.
   */
  val renderedBuffer: AudioBuffer = js.native
}

/** The PeriodicWave interface defines a periodic waveform that can be used
 *  to shape the output of an OscillatorNode.
 *
 *  PeriodicWave has no inputs or outputs; it is used to create custom
 *  oscillators via OscillatorNode.setPeriodicWave. The PeriodicWave itself is
 *  created/returned by AudioContext.createPeriodicWave.
 */
@js.native
trait PeriodicWave extends js.Object
