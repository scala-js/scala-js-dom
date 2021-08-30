/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */
package org.scalajs.dom

import scala.scalajs.js.typedarray.ArrayBuffer
import scala.scalajs.js.|

package object raw {

  /**
   * The Transferable interface represents an object that can be transfered
   * between different execution contexts, like the main thread and Web workers.
   *
   * This is an abstract interface and there isn't any object of this type.
   * It also doesn't define any method or property:
   * it is merely a tag indicating objects that can be used in specific
   * conditions, like to be transfered to a Worker using the
   * Worker.postMessage() method.
   *
   * MDN
   */
  type Transferable = ArrayBuffer | MessagePort
}
