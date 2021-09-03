package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.Uint8Array
import scala.scalajs.js.|

package object crypto {
  @js.native
  @JSGlobal("crypto")
  val crypto: Crypto = js.native

  type BigInteger = Uint8Array

  /**
   * According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]]
   * of the WebCryptoAPI an AlgorithmIdentifier is an `object or DOMString`. We make this more precise
   * here and specify an Algorithm.
   * note: it may be that we can do only with KeyAlgorithmIdentifier and HashAlgorithmIdentifier
   */
  type AlgorithmIdentifier = Algorithm | String

  /**
   * According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]]
   * of the WebCryptoAPI an AlgorithmIdentifier is an `object or DOMString`. We make this more precise
   * here and distinguish the non overlapping classes of Key and Hash Algorithms.
   */
  type KeyAlgorithmIdentifier = KeyAlgorithm | String

  /**
   * According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]]
   * a HashAlgorithmIdentifier is an AlgorithmIdentifier. Here we distinguish between Hash and Key
   * Algorithm Identifiers. At the JS layer these have the same structure.
   */
  type HashAlgorithmIdentifier = HashAlgorithm | String
}
