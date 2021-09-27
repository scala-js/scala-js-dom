/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** IndexedDB transaction mode Provides constants for IDB Transaction modes These constants have been removed from
  * browser support and replaced by String values
  */
@js.native
sealed trait IDBTransactionMode extends js.Any

object IDBTransactionMode {

  /** Allows data to be read but not changed. It is the default transaction mode. */
  @inline def readonly: IDBTransactionMode = "readonly".asInstanceOf[IDBTransactionMode]

  /** Allows any operation to be performed, including ones that delete and create object stores and indexes. This mode
    * is for updating the version number of transactions that were started using the setVersion() method of IDBDatabase
    * objects. Transactions of this mode cannot run concurrently with other transactions.
    */
  @inline def versionchange: IDBTransactionMode = "versionchange".asInstanceOf[IDBTransactionMode]

  /** Allows reading and writing of data in existing data stores to be changed. */
  @inline def readwrite: IDBTransactionMode = "readwrite".asInstanceOf[IDBTransactionMode]
}
