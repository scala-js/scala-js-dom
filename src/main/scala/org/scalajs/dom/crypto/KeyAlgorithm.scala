package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

/** The KeyAlgorithm dictionary represents information about the contents of a given CryptoKey object.
  *
  * See [[http://www.w3.org/TR/WebCryptoAPI/#key-algorithm-dictionary ¶12 KeyAlgorithm dictionary]] in w3c spec.
  */
trait KeyAlgorithm extends Algorithm
