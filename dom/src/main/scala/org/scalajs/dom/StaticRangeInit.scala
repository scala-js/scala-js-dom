package org.scalajs.dom

import scala.scalajs.js

trait StaticRangeInit extends js.Object {

  /** The offset into the starting node at which the first character of the range is found. */
  val startOffset: Int

  /** The offset into the node indicated by endOffset at which the last character in the range is located. */
  val endOffset: Int

  /** The Node in which the starting point of the range is located. */
  val startContainer: Node

  /** The Node in which the end point of the range is located. */
  val endContainer: Node
}
