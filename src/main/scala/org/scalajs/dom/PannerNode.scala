/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The PannerNode interface represents the position and behavior of an audio source signal in space. It is an AudioNode
  * audio-processing module describing its position with right-hand Cartesian coordinates, its movement using a velocity
  * vector and its directionality using a directionality cone.
  *
  * A PannerNode always has exactly one input and one output: the input can be mono or stereo but the output is always
  * stereo (2 channels) — you need stereo sound for panning effects!
  *
  * The PannerNode brings a spatial position and velocity and a directionality for a given signal.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 1
  *   - Channel count mode: "clamped-max"
  *   - Channel count: 2
  *   - Channel interpretation: "speakers"
  */
@js.native
trait PannerNode extends AudioNode {

  /** Is an enumerated value determining which spatialisation algorithm to use to position the audio in 3D space. */
  var panningModel: String = js.native

  /** Is an enumerated value determining which algorithm to use to reduce the volume of the audio source as it moves
    * away from the listener.
    */
  var distanceModel: String = js.native

  /** Is a double value representing the reference distance for reducing volume as the audio source moves further from
    * the listener.
    */
  var refDistance: Double = js.native

  /** Is a double value representing the maximum distance between the audio source and the listener, after which the
    * volume is not reduced any further.
    */
  var maxDistance: Double = js.native

  /** Is a double value describing how quickly the volume is reduced as the source moves away from the listener. This
    * value is used by all distance models.
    */
  var rolloffFactor: Double = js.native

  /** Is a double value describing the angle, in degrees, of a cone inside of which there will be no volume reduction.
    */
  var coneInnerAngle: Double = js.native

  /** Is a double value describing the angle, in degrees, of a cone outside of which the volume will be reduced by a
    * constant value, defined by the coneOuterGain attribute.
    */
  var coneOuterAngle: Double = js.native

  /** Is a double value describing the amount of volume reduction outside the cone defined by the coneOuterAngle
    * attribute.
    *
    * Its default value is 0, meaning that no sound can be heard.
    */
  var coneOuterGain: Double = js.native

  /** Defines the position of the audio source relative to the listener (represented by an AudioListener object stored
    * in the AudioContext.listener attribute.) The three parameters x, y and z are unitless and describe the source's
    * position in 3D space using the right-hand Cartesian coordinate system.
    *
    * The setPosition() method's default value of the position is (0, 0, 0).
    *
    * @param x
    *   The x position of the panner in 3D space.
    * @param y
    *   The y position of the panner in 3D space.
    * @param z
    *   The z position of the panner in 3D space.
    */
  def setPosition(x: Double = js.native, y: Double = js.native, z: Double = js.native): Unit = js.native

  /** Defines the direction the audio source is playing in. This can have a big effect if the sound is very directional
    * — controlled by the three cone-related attributes PannerNode.coneInnerAngle, PannerNode.coneOuterAngle, and
    * PannerNode.coneOuterGain. In such a case, a sound pointing away from the listener can be very quiet or even
    * silent.
    *
    * The three parameters x, y and z are unitless and describe a direction vector in 3D space using the right-hand
    * Cartesian coordinate system.
    *
    * The default value of the direction vector is (1, 0, 0).
    *
    * @param x
    *   The x value of the panner's direction vector in 3D space.
    * @param y
    *   The y value of the panner's direction vector in 3D space.
    * @param z
    *   The z value of the panner's direction vector in 3D space.
    */
  def setOrientation(x: Double = js.native, y: Double = js.native, z: Double = js.native): Unit = js.native

  /** Defines the velocity vector of the audio source — how fast it is moving and in what direction.
    *
    * The velocity relative to the listener is used to control the pitch change needed to conform with the Doppler
    * effect due to the relative speed.
    *
    * As the vector controls both the direction of travel and its velocity, the three parameters x, y and z are
    * expressed in meters per second.
    *
    * The default value of the velocity vector is (0, 0, 0).
    *
    * @param x
    *   The x value of the panner's velocity vector.
    * @param y
    *   The y value of the panner's velocity vector.
    * @param z
    *   The z value of the panner's velocity vector.
    */
  def setVelocity(x: Double = js.native, y: Double = js.native, z: Double = js.native): Unit = js.native
}
