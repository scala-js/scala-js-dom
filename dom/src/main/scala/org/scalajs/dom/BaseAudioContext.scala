/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The BaseAudioContext interface of the Web Audio API acts as a base definition for online and offline
  * audio-processing graphs, as represented by AudioContext and OfflineAudioContext respectively. You wouldn't use
  * BaseAudioContext directly — you'd use its features via one of these two inheriting interfaces.
  *
  * A BaseAudioContext can be a target of events, therefore it implements the EventTarget interface.
  */
@js.native
trait BaseAudioContext extends EventTarget {

  /** Returns a double representing an ever-increasing hardware time in seconds used for scheduling. It starts at 0 and
    * cannot be stopped, paused or reset.
    */
  def currentTime: Double = js.native

  /** Returns an AudioDestinationNode representing the final destination of all audio in the context. It can be thought
    * of as the audio-rendering device.
    */
  val destination: AudioDestinationNode = js.native

  /** Returns the AudioListener object, used for 3D spatialization. */
  val listener: AudioListener = js.native

  /** Returns a float representing the sample rate (in samples per second) used by all nodes in this context. The
    * sample-rate of an AudioContext cannot be changed.
    */
  val sampleRate: Double = js.native

  /** Returns an instance of [[AudioWorklet]] that can be used for adding [[AudioWorketProcessor]]-derived classes which
    * implement custom audio processing.
    */
  val audioWorklet: AudioWorklet = js.native

  /** Returns the current state of the AudioContext. */
  def state: String = js.native

  /** Creates an AnalyserNode, which can be used to expose audio time and frequency data and for example to create data
    * visualisations.
    */
  def createAnalyser(): AnalyserNode = js.native

  /** Creates a BiquadFilterNode, which represents a second order filter configurable as several different common filter
    * types: high-pass, low-pass, band-pass, etc.
    */
  def createBiquadFilter(): BiquadFilterNode = js.native

  /** Creates a new, empty AudioBuffer object, which can then be populated by data and played via an
    * AudioBufferSourceNode.
    *
    * @param numOfChannels
    *   An integer representing the number of channels this buffer should have. Implementations must support a minimum
    *   32 channels.
    * @param length
    *   An integer representing the size of the buffer in sample-frames.
    * @param sampleRate
    *   The sample-rate of the linear audio data in sample-frames per second. An implementation must support
    *   sample-rates in at least the range 22050 to 96000.
    */
  def createBuffer(numOfChannels: Int, length: Int, sampleRate: Int): AudioBuffer = js.native

  /** Creates an AudioBufferSourceNode, which can be used to play and manipulate audio data contained within an
    * AudioBuffer object. AudioBuffers are created using AudioContext.createBuffer or returned by
    * AudioContext.decodeAudioData when it successfully decodes an audio track.
    */
  def createBufferSource(): AudioBufferSourceNode = js.native

  /** Creates a ChannelMergerNode, which is used to combine channels from multiple audio streams into a single audio
    * stream.
    *
    * @param numberOfInputs
    *   The number of channels in the input audio streams, which the output stream will contain; the default is 6 is
    *   this parameter is not specified.
    */
  def createChannelMerger(numberOfInputs: Int = js.native): ChannelMergerNode = js.native

  /** Creates a ChannelSplitterNode, which is used to access the individual channels of an audio stream and process them
    * separately.
    *
    * @param numberOfOutputs
    *   The number of channels in the input audio stream that you want to output separately; the default is 6 is this
    *   parameter is not specified.
    */
  def createChannelSplitter(numberOfOutputs: Int = js.native): ChannelSplitterNode = js.native

  /** Creates a ConvolverNode, which can be used to apply convolution effects to your audio graph, for example a
    * reverberation effect.
    */
  def createConvolver(): ConvolverNode = js.native

  /** Creates a DelayNode, which is used to delay the incoming audio signal by a certain amount. This node is also
    * useful to create feedback loops in a Web Audio API graph.
    *
    * @param maxDelayTime
    *   The maximum amount of time, in seconds, that the audio signal can be delayed by. The default value is 0.
    */
  def createDelay(maxDelayTime: Int): DelayNode = js.native

  /** Creates a DynamicsCompressorNode, which can be used to apply acoustic compression to an audio signal. */
  def createDynamicsCompressor(): DynamicsCompressorNode = js.native

  /** Creates a GainNode, which can be used to control the overall volume of the audio graph. */
  def createGain(): GainNode = js.native

  /** Creates an OscillatorNode, a source representing a periodic waveform. It basically generates a tone. */
  def createOscillator(): OscillatorNode = js.native

  /** Creates a PannerNode, which is used to spatialise an incoming audio stream in 3D space. */
  def createPanner(): PannerNode = js.native

  /** Creates a PeriodicWave, used to define a periodic waveform that can be used to determine the output of an
    * OscillatorNode.
    */
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): PeriodicWave = js.native

  /** Creates a StereoPannerNode, which can be used to apply stereo panning to an audio source. */
  def createStereoPanner(): StereoPannerNode = js.native

  /** Creates a WaveShaperNode, which is used to implement non-linear distortion effects. */
  def createWaveShaper(): WaveShaperNode = js.native

  /** Asynchronously decodes audio file data contained in an ArrayBuffer. In this case, the ArrayBuffer is usually
    * loaded from an XMLHttpRequest's response attribute after setting the responseType to arraybuffer. This method only
    * works on complete files, not fragments of audio files.
    *
    * @param audioData
    *   An ArrayBuffer containing the audio data to be decoded, usually grabbed from an XMLHttpRequest's response
    *   attribute after setting the responseType to arraybuffer.
    * @param successCallback
    *   A callback function to be invoked when the decoding successfully finishes. The single argument to this callback
    *   is an AudioBuffer representing the decoded PCM audio data. Usually you'll want to put the decoded data into an
    *   AudioBufferSourceNode, from which it can be played and manipulated how you want.
    * @param errorCallback
    *   An optional error callback, to be invoked if an error occurs when the audio data is being decoded.
    */
  def decodeAudioData(
      audioData: js.typedarray.ArrayBuffer, successCallback: js.Function1[AudioBuffer, _] = js.native,
      errorCallback: js.Function0[_] = js.native
  ): js.Promise[AudioBuffer] = js.native

}
