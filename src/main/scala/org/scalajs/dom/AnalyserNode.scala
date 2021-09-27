/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The AnalyserNode interface represents a node able to provide real-time frequency and time-domain analysis
  * information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you
  * to take the generated data,process it, and create audio visualizations.
  *
  * An AnalyzerNode has exactly one input and one output. The node works even if the output is not connected.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 1 (but may be left unconnected)
  *   - Channel count mode: "explicit"
  *   - Channel count: 1
  *   - Channel interpretation: "speakers"
  */
@js.native
trait AnalyserNode extends AudioNode {

  /** Is an unsigned long value representing the size of the FFT (Fast Fourier Transform) to be used to determine the
    * frequency domain.
    */
  var fftSize: Int = js.native

  /** Is an unsigned long value half that of the FFT size. This generally equates to the number of data values you will
    * have to play with for the visualization.
    */
  val frequencyBinCount: Int = js.native

  /** Is a double value representing the minimum power value in the scaling range for the FFT analysis data, for
    * conversion to unsigned byte values — basically, this specifies the minimum value for the range of results when
    * using getByteFrequencyData().
    */
  var minDecibels: Double = js.native

  /** Is a double value representing the maximum power value in the scaling range for the FFT analysis data, for
    * conversion to unsigned byte values — basically, this specifies the maximum value for the range of results when
    * using getByteFrequencyData().
    */
  var maxDecibels: Double = js.native

  /** Is a double value representing the averaging constant with the last analysis frame — basically, it makes the
    * transition between values over time smoother.
    */
  var smoothingTimeConstant: Double = js.native

  /** Copies the current frequency data into a Float32Array array passed into it.
    *
    * If the array has fewer elements than the AnalyserNode.frequencyBinCount, excess elements are dropped. If it has
    * more elements than needed, excess elements are ignored.
    *
    * @param array
    *   The Float32Array that the frequency domain data will be copied to.
    */
  def getFloatFrequencyData(array: js.typedarray.Float32Array): Unit = js.native

  /** Copies the current frequency data into a Uint8Array (unsigned byte array) passed into it.
    *
    * If the array has fewer elements than the AnalyserNode.frequencyBinCount, excess elements are dropped. If it has
    * more elements than needed, excess elements are ignored.
    *
    * @param array
    *   The Uint8Array that the frequency domain data will be copied to.
    */
  def getByteFrequencyData(array: js.typedarray.Uint8Array): Unit = js.native

  /** Copies the current waveform, or time-domain, data into a Float32Array array passed into it.
    *
    * If the array has fewer elements than the AnalyserNode.fftSize, excess elements are dropped. If it has more
    * elements than needed, excess elements are ignored.
    *
    * @param array
    *   The Float32Array that the time domain data will be copied to.
    */
  def getFloatTimeDomainData(array: js.typedarray.Float32Array): Unit = js.native

  /** Copies the current waveform, or time-domain, data into a Uint8Array (unsigned byte array) passed into it.
    *
    * If the array has fewer elements than the AnalyserNode.fftSize, excess elements are dropped. If it has more
    * elements than needed, excess elements are ignored.
    *
    * @param array
    *   The Uint8Array that the time domain data will be copied to.
    */
  def getByteTimeDomainData(array: js.typedarray.Uint8Array): Unit = js.native
}
