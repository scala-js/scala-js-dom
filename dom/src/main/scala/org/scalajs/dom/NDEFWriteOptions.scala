package org.scalajs.dom

import scala.scalajs.js

/** @see
  *   https://w3c.github.io/web-nfc/#the-ndefwriteoptions-dictionary
  * @see
  *   https://developer.mozilla.org/en-US/docs/Web/API/NDEFReader/write
  */
trait NDEFWriteOptions extends js.Object {

  /** A boolean value specifying whether or not existing records should be overwritten, if such exists. Default is true
    */
  var `overwrite`: js.UndefOr[Boolean] = js.undefined

  /** An AbortSignal that allows the current write operation to be canceled. */
  var `signal`: js.UndefOr[AbortSignal] = js.undefined

}
