package org.scalajs.dom.crypto

import scala.scalajs.js

@js.native
trait JsonWebKey extends js.Object {
  var kty: String = js.native

  var use: String = js.native

  var key_ops: js.Array[String] = js.native

  var alg: js.Array[String] = js.native

  var ext: Boolean = js.native

  var crv: String = js.native

  var x: String = js.native

  var y: String = js.native

  var d: String = js.native

  var n: String = js.native

  var e: String = js.native

  var p: String = js.native

  var q: String = js.native

  var dp: String = js.native

  var dq: String = js.native

  var qi: String = js.native

  var oth: js.Array[String] = js.native

  var k: String = js.native
}
