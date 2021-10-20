package org.scalajs.dom

import scala.scalajs.js

/** This is not typed in the Fetch API but it is easy to create the most common defaults. */
@js.native
trait HttpMethod extends js.Any

object HttpMethod {
  val GET: HttpMethod = "GET".asInstanceOf[HttpMethod]
  val POST: HttpMethod = "POST".asInstanceOf[HttpMethod]
  val PUT: HttpMethod = "PUT".asInstanceOf[HttpMethod]
  val PATCH: HttpMethod = "PATCH".asInstanceOf[HttpMethod]
  val DELETE: HttpMethod = "DELETE".asInstanceOf[HttpMethod]
  val QUERY: HttpMethod = "QUERY".asInstanceOf[HttpMethod]
  val HEAD: HttpMethod = "HEAD".asInstanceOf[HttpMethod]
  val OPTIONS: HttpMethod = "OPTIONS".asInstanceOf[HttpMethod]
}
