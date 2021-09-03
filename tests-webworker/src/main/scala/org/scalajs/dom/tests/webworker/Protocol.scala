package org.scalajs.dom.tests.webworker

import scala.scalajs.js

object Protocol {

  type MsgId   = Int
  type Message = js.Tuple2[MsgId, String]

  def Message(id: MsgId, data: String): Message =
    js.Tuple2(id, data)

  final val ServerStarted: MsgId = -1
}
