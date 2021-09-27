/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The AudioListener interface represents the position and orientation of the unique person listening to the audio
  * scene, and is used in audio spatialisation. All PannerNodes spatialise in relation to the AudioListener stored in
  * the AudioContext.listener attribute.
  *
  * It is important to note that there is only one listener per context and that it isn't an AudioNode.
  */
@js.native
trait AudioListener extends AudioNode {

  /** Is a double value representing the amount of pitch shift to use when rendering a doppler effect. */
  var dopplerFactor: Double = js.native

  /** Is a double value representing the speed of sound, in meters per second. */
  var speedOfSound: Double = js.native

  /** Defines the position of the listener.
    *
    * The three parameters x, y and z are unitless and describe the listener's position in 3D space according to the
    * right-hand Cartesian coordinate system. PannerNode objects use this position relative to individual audio sources
    * for spatialisation.
    *
    * The default value of the position vector is (0, 0, 0).
    *
    * @param x
    *   The x position of the listener in 3D space.
    * @param y
    *   The y position of the listener in 3D space.
    * @param z
    *   The z position of the listener in 3D space.
    */
  def setPosition(x: Double = js.native, y: Double = js.native, z: Double = js.native): Unit = js.native

  /** Defines the orientation of the listener.
    *
    * It consists of two direction vectors:
    *
    *   - The front vector, defined by the three unitless parameters x, y and z, describes the direction of the face of
    *     the listener, that is the direction the nose of the person is pointing towards. The front vector's default
    *     value is (0, 0, -1).
    *   - The up vector, defined by three unitless parameters xUp, yUp and zUp, describes the direction of the top of
    *     the listener's head. The up vector's default value is (0, 1, 0).
    *
    * Both vectors must be separated by an angle of 90° — in linear analysis terms, they must be linearly independent.
    *
    * @param x
    *   The x value of the front vector of the listener.
    * @param y
    *   The y value of the front vector of the listener.
    * @param z
    *   The z value of the front vector of the listener.
    * @param xUp
    *   The x value of the up vector of the listener.
    * @param yUp
    *   The y value of the up vector of the listener.
    * @param zUp
    *   The z value of the up vector of the listener.
    */
  def setOrientation(x: Double = js.native, y: Double = js.native, z: Double = js.native, xUp: Double = js.native,
      yUp: Double = js.native, zUp: Double = js.native): Unit = js.native
}
