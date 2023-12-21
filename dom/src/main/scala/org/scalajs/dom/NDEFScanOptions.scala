package org.scalajs.dom

import scala.scalajs.js

/** @see https://w3c.github.io/web-nfc/#the-ndefscanoptions-dictionary */
trait NDEFScanOptions extends js.Object {

  /** An AbortSignal that allows the current write operation to be canceled. */
  var `signal`: js.UndefOr[AbortSignal] = js.undefined
}
