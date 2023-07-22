/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait AudioScheduledSourceNode extends AudioNode {

  /** This method specifies the exact time to start playing the tone. */
  def start(): Unit = js.native

  /** This method specifies the exact time to stop playing the tone. */
  def stop(): Unit = js.native

  /** This method specifies the exact time to start playing the tone. */
  def start(when: Double): Unit = js.native

  /** This method specifies the exact time to stop playing the tone. */
  def stop(when: Double): Unit = js.native

  /** Used to set the event handler for the ended event, which fires when the tone has stopped playing. */
  var onended: js.Function1[Event, _] = js.native

}
