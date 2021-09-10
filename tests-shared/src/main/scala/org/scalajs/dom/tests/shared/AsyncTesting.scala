package org.scalajs.dom.tests.shared

import org.junit.Assert
import scala.concurrent._
import scala.util._
import scala.scalajs.js
import scala.scalajs.js.timers._

object AsyncTesting {

  type AsyncResult = Future[Try[Unit]]

  implicit def global: ExecutionContext =
    ExecutionContext.global

  def asyncPass: AsyncResult =
    Future.successful(Success(()))

  def asyncWhenDefined[A](o: js.UndefOr[A])(f: A => AsyncResult): AsyncResult =
    o.fold(asyncPass)(f)

  def async(run: => Future[Any]): AsyncResult = {
    val p = Promise[Try[Unit]]()
    val timeout = setTimeout(1200) {
      p.tryComplete(Failure(new RuntimeException("Test timed out.")))
    }
    setTimeout(1) {
      run.onComplete { ta =>
        clearTimeout(timeout)
        p.complete(Success(ta.map(_ => ())))
      }
    }
    p.future
  }

  implicit final class AsyncFutureOps[A](private val self: Future[A]) extends AnyVal {

    def tap(f: A => Any): Future[A] =
      self.map { a => f(a); a }

    def assertEquals(expect: A): Future[A] =
      tap(Assert.assertEquals(expect, _))
  }

}
