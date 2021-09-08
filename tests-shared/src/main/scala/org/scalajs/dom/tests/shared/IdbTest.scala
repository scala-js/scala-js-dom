package org.scalajs.dom.tests.shared

import java.util.UUID
import org.junit.Assert._
import org.scalajs.dom._
import org.scalajs.dom.tests.shared.AsyncTesting._
import scala.concurrent._
import scala.scalajs.js
import scala.util.Try

/** Scala.js version of https://gist.github.com/JamesMessinger/a0d6389a5d0e3a24814b */
object IdbTest {

  def apply(idb: js.UndefOr[IDBFactory]): AsyncResult =
    asyncWhenDefined(idb)(apply(_))

  def apply(idb: IDBFactory): AsyncResult = async {
    open(idb).flatMap(use)
  }

  private def open(idb: IDBFactory): Future[IDBDatabase] = {
    val p = Promise[IDBDatabase]()
    val r = idb.open(UUID.randomUUID().toString)

    r.onerror = (e: Event) => fail(p, "idb.open failed: " + r.error)

    r.onupgradeneeded = (e: IDBEvent[IDBDatabase]) => {
      val db = e.target.result
      val opts = new IDBCreateObjectStoreOptions { override val keyPath = "id" }
      val store = db.createObjectStore("MyObjectStore", opts)
      store.createIndex("NameIndex", js.Array("name.last", "name.first"))
    }

    r.onsuccess = (e: IDBEvent[IDBDatabase]) => {
      assertSame(r.result, e.target.result)
      p.success(r.result)
    }

    p.future
  }

  private def fail(p: Promise[_], why: Any): Unit =
    p.failure(new RuntimeException("" + why))

  private def use(db: IDBDatabase): Future[Unit] = {
    import js.Dynamic.{literal => obj}

    val tx = db.transaction("MyObjectStore", IDBTransactionMode.readwrite)
    val store = tx.objectStore("MyObjectStore")
    val index = store.index("NameIndex")

    // Add some data
    store.put(obj(id = 12345, name = obj(first = "John", last = "Doe"), age = 42))
    store.put(obj(id = 67890, name = obj(first = "Bob", last = "Smith"), age = 35))

    // Query the data
    val getJohn = store.get(12345)
    val getBob = index.get(js.Array("Smith", "Bob"))

    // Close the db when the transaction is done
    tx.oncomplete = (e: Event) => {
      db.close()
    }

    def getFirstName(r: IDBRequest[Any]): Future[String] = {
      val p = Promise[String]()
      r.onerror = (e: Event) => fail(p, e)
      r.onsuccess = (e: IDBEvent[Any]) => {
        p.complete(Try(e.target.result.asInstanceOf[js.Dynamic].name.first.asInstanceOf[String]))
      }
      p.future
    }

    for {
      john <- getFirstName(getJohn)
      bob  <- getFirstName(getBob)
    } yield {
      assertEquals("John", john)
      assertEquals("Bob", bob)
    }
  }
}
