package org.scalajs.dom.tests.shared

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.|

trait CompilationTest {

  trait IDBKeyTests {
    def o: IDBObjectStore

    locally {
      import IDBKey._

      implicitly[IsKey[Double]]
      implicitly[IsKey[Int]]
      implicitly[IsKey[Int | String]]

      implicitly[IsKey[js.Array[Double]]]
      implicitly[IsKey[js.Array[Int]]]
      implicitly[IsKey[js.Array[Int | String]]]

      implicitly[IsKey[String | js.Array[Int]]]
      implicitly[IsKey[String | js.Array[Int] | Int]]
      implicitly[IsKey[js.Array[String] | js.Array[Int] | Int]]

      implicitly[IsKey[js.Array[js.Array[Double]]]]
      implicitly[IsKey[js.Array[js.Array[Int]]]]
      implicitly[IsKey[js.Array[String | js.Array[Int]]]]
      implicitly[IsKey[js.Array[String | js.Array[Int] | js.Array[String | Double]]]]
    }

    o.get(123)
    o.get(123.0)
    o.get("qwe")
    o.get(null.asInstanceOf[String | Double])
    o.get(js.Array[Int]())
    o.get(js.Array[Double]())
    o.get(js.Array[String | Double]())
    o.get(js.Array[js.Array[Double]]())
    o.get(js.Array[js.Array[String | Double]]())
    o.get(js.Array[String | js.Array[String | Double]]())
    o.get(js.Array[js.Array[String | Double] | String]())
    o.get(js.Array[String | js.Array[String | Double] | String]())
    o.get(js.Array[js.Array[js.Date | Double] | js.Array[String | Double] | js.Array[String | js.Date]]())

    o.getAll(123)
    o.getAll(123.0)
    o.getAll("qwe")
    o.getAll(null.asInstanceOf[String | Double])
    o.getAll(js.Array[Int]())
    o.getAll(js.Array[Double]())
    o.getAll(js.Array[String | Double]())
    o.getAll(js.Array[js.Array[Double]]())
    o.getAll(js.Array[js.Array[String | Double]]())
    o.getAll(js.Array[String | js.Array[String | Double]]())
    o.getAll(js.Array[js.Array[String | Double] | String]())
    o.getAll(js.Array[String | js.Array[String | Double] | String]())
    o.getAll(js.Array[js.Array[js.Date | Double] | js.Array[String | Double] | js.Array[String | js.Date]]())

    123: js.UndefOr[IDBKey]
    123.0: js.UndefOr[IDBKey]
    "qwe": js.UndefOr[IDBKey]
    null.asInstanceOf[String | Double]: js.UndefOr[IDBKey]
    js.Array[Int](): js.UndefOr[IDBKey]
    js.Array[Double](): js.UndefOr[IDBKey]
    js.Array[String | Double](): js.UndefOr[IDBKey]
    js.Array[js.Array[Double]](): js.UndefOr[IDBKey]
    js.Array[js.Array[String | Double]](): js.UndefOr[IDBKey]
    js.Array[String | js.Array[String | Double]](): js.UndefOr[IDBKey]
    js.Array[js.Array[String | Double] | String](): js.UndefOr[IDBKey]
    js.Array[String | js.Array[String | Double] | String](): js.UndefOr[IDBKey]
    js.Array[js.Array[js.Date | Double] | js.Array[String | Double] | js.Array[String | js.Date]](): js.UndefOr[IDBKey]
  }
}
