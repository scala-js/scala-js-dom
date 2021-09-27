package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

@js.native
@JSGlobalScope
object Fetch extends js.Object {

  /** [[https://fetch.spec.whatwg.org/#fetch-method ¶6.0 Fetch method]] defined in WhatWG spec
    *
    * @param info
    * @param init
    * @return
    */
  def fetch(info: RequestInfo, init: RequestInit = js.native): js.Promise[Response] = js.native
}
