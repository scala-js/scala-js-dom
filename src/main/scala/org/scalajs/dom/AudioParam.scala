/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as
  * GainNode.gain). An AudioParam can be set to a specific value or a change in value, and can be scheduled to happen at
  * a specific time and following a specific pattern.
  *
  * There are two kinds of AudioParam, a-rate and k-rate parameters:
  *
  *   - An a-rate AudioParam takes the current audio parameter value for each sample frame of the audio signal.
  *   - A k-rate AudioParam uses the same initial audio parameter value for the whole block processed, that is 128
  *     sample frames.
  *
  * Each AudioNode defines which of its parameters are a-rate or k-rate in the spec.
  *
  * Each AudioParam has a list of events, initially empty, that define when and how values change. When this list is not
  * empty, changes using the AudioParam.value attributes are ignored. This list of events allows us to schedule changes
  * that have to happen at very precise times, using arbitrary timelime-based automation curves. The time used is the
  * one defined in AudioContext.currentTime.
  */
@js.native
trait AudioParam extends AudioNode {

  /** Represents the parameter's current floating point value; initially set to the value of AudioParam.defaultValue.
    * Though it can be set, any modifications happening while there are automation events scheduled — that is events
    * scheduled using the methods of the AudioParam — are ignored, without raising any exception.
    */
  var value: Double = js.native

  /** Represents the initial value of the attributes as defined by the specific AudioNode creating the AudioParam. */
  val defaultValue: Double = js.native

  /** Schedules an instant change to the value of the AudioParam at a precise time, as measured against
    * AudioContext.currentTime. The new value is given in the value parameter.
    *
    * @param value
    *   A floating point number representing the value the AudioParam will change to at the given time.
    * @param startTime
    *   A double representing the exact time (in seconds) after the AudioContext was first created that the change in
    *   value will happen.
    */
  def setValueAtTime(value: Double, startTime: Double): Unit = js.native

  /** Schedules a gradual linear change in the value of the AudioParam. The change starts at the time specified for the
    * previous event, follows a linear ramp to the new value given in the value parameter, and reaches the new value at
    * the time given in the endTime parameter.
    *
    * @param value
    *   A floating point number representing the value the AudioParam will ramp up to by the given time.
    * @param endTime
    *   A double representing the exact time (in seconds) after the ramping starts that the changing of the value will
    *   stop.
    */
  def linearRampToValueAtTime(value: Double, endTime: Double): Unit = js.native

  /** Schedules a gradual exponential change in the value of the AudioParam. The change starts at the time specified for
    * the previous event, follows an exponential ramp to the new value given in the value parameter, and reaches the new
    * value at the time given in the endTime parameter.
    *
    * @param value
    *   A floating point number representing the value the AudioParam will ramp up to by the given time.
    * @param endTime
    *   A double representing the exact time (in seconds) after the ramping starts that the changing of the value will
    *   stop.
    */
  def exponentialRampToValueAtTime(value: Double, endTime: Double): Unit = js.native

  /** Schedules the start of a change to the value of the AudioParam. The change starts at the time specified in
    * startTime and exponentially moves towards the value given by the target parameter. The exponential decay rate is
    * defined by the timeConstant parameter, which is a time measured in seconds.
    *
    * @param target
    *   The value the parameter will start to transition towards at the given start time.
    * @param startTime
    *   The time that the exponential transition will begin, which will be relative to AudioContext.currentTime.
    * @param timeConstant
    *   The time-constant value of first-order filter (exponential) approach to the target value. The larger this value
    *   is, the slower the transition will be.
    */
  def setTargetAtTime(target: Double, startTime: Double, timeConstant: Double): Unit = js.native

  /** Schedules the values of the AudioParam to follow a set of values, defined by the values Float32Array scaled to fit
    * into the given interval, starting at startTime, and having a specific duration.
    *
    * @param values
    *   A Float32Array representing the value curve the AudioParam will change through along the duration.
    * @param startTime
    *   A double representing the exact time (in seconds) after the AudioContext was first created that the change in
    *   value will happen.
    * @param duration
    *   A double representing the exact time (in seconds) during which the values will be changed between. The values
    *   are spaced equally along this duration.
    */
  def setValueCurveAtTime(values: js.typedarray.Float32Array, startTime: Double, duration: Double): Unit = js.native

  /** Cancels all scheduled future changes to the AudioParam.
    *
    * @param startTime
    *   A double representing the exact time (in seconds) after the AudioContext was first created after which all
    *   scheduled changes will be cancelled.
    */
  def cancelScheduledValues(startTime: Double): Unit = js.native
}
