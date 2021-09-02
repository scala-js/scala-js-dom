package org.scalajs

import scala.scalajs.js
import scala.scalajs.js.typedarray.ArrayBuffer
import scala.scalajs.js.|

package object dom {

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

  lazy val window: Window = js.Dynamic.global.window.asInstanceOf[Window]
  lazy val document: html.Document = window.document

  lazy val console: Console = js.Dynamic.global.console.asInstanceOf[Console] // #411

  @deprecated("directly use the dom.CSS* types and values instead", "2.0.0")
  lazy val css: DeprecatedCSSAliases.type = DeprecatedCSSAliases
}
