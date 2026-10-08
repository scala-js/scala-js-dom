/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait MediaRecorderOptions extends js.Object {

  /** The chosen bitrate for the audio component of the media. */
  var audioBitsPerSecond: js.UndefOr[Long] = js.undefined

  /** The chosen bitrate for the video component of the media. */
  var videoBitsPerSecond: js.UndefOr[Long] = js.undefined

  /** The chosen bitrate for the audio and video components of the media. This can be specified instead of the above two
    * properties. If this is specified along with one or the other of the above properties, this will be used for the
    * one that isn't specified.
    */
  var bitsPerSecond: js.UndefOr[Long] = js.undefined
}
