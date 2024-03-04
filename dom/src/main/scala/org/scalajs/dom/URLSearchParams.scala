package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The URLSearchParams defines utility methods to work with the query string of a URL. */
@js.native
@JSGlobal
class URLSearchParams extends js.Iterable[js.Tuple2[String, String]] {

  /** Leading '?' characters are ignored. */
  def this(init: String) = this()
  def this(init: Sequence[js.Tuple2[String, String]]) = this()
  def this(init: js.Dictionary[String]) = this()

  def append(name: String, value: String): Unit = js.native

  def delete(name: String): Unit = js.native

  def get(name: String): String = js.native

  def getAll(name: String): Sequence[String] = js.native

  def has(name: String): Boolean = js.native

  def set(name: String, value: String): Unit = js.native

  def sort(): Unit = js.native

  @JSName(js.Symbol.iterator)
  override def jsIterator(): js.Iterator[js.Tuple2[String, String]] = js.native

  def entries(): js.Iterator[js.Tuple2[String, String]] = js.native

  def keys(): js.Iterator[String] = js.native

  def values(): js.Iterator[String] = js.native

  def forEach(callback: js.Function2[String, String, Unit]): Unit = js.native

}
