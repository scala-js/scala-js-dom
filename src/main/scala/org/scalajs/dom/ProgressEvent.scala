/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The ProgressEvent interface represents events measuring progress of an underlying process, like an HTTP request (for
  * an XMLHttpRequest, or the loading of the underlying resource of an &lt;img&gt;, &lt;audio&gt;, &lt;video&gt;,
  * &lt;style&gt; or &lt;link&gt;).
  */
@js.native
trait ProgressEvent extends Event {

  /** The ProgressEvent.loaded read-only property is an unsigned long long representing the amount of work already
    * performed by the underlying process. The ratio of work done can be calculated with the property and
    * ProgressEvent.total. When downloading a resource using HTTP, this only represent the part of the content itself,
    * not headers and other overhead.
    */
  def loaded: Double = js.native

  /** The ProgressEvent.lengthComputable read-only property is a Boolean flag indicating if the resource concerned by
    * the ProgressEvent has a length that can be calculated. If not, the ProgressEvent.total property has no significant
    * value.
    */
  def lengthComputable: Boolean = js.native

  /** The ProgressEvent.total read-only property is an unsigned long long representing the total amount of work that the
    * underlying process is in the progress of performing. When downloading a resource using HTTP, this only represent
    * the content itself, not headers and other overhead.
    */
  def total: Double = js.native
}
