package org.scalajs.dom

import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation._

package object experimental {

  // old package.scala

  @deprecated("use dom.RequestInfo instead", "2.0.0")
  type RequestInfo = dom.RequestInfo

  @deprecated("use dom.HeadersInit instead", "2.0.0")
  type HeadersInit = dom.HeadersInit

  @deprecated("use dom.ByteString instead", "2.0.0")
  type ByteString = dom.ByteString

  @deprecated("use dom.BodyInit instead", "2.0.0")
  type BodyInit = dom.BodyInit

  @deprecated("use dom.Sequence instead", "2.0.0")
  type Sequence[T] = dom.Sequence[T]

  @deprecated("use dom.OpenEndedDictionary instead", "2.0.0")
  type OpenEndedDictionary[T] = dom.OpenEndedDictionary[T]

  // old AbortController.scala

  @deprecated("use dom.AbortController instead", "2.0.0")
  type AbortController = dom.AbortController

  @deprecated("use dom.AbortSignal instead", "2.0.0")
  type AbortSignal = dom.AbortSignal

  // old Fetch.scala

  @deprecated("use dom.fetch instead", "2.0.0")
  object Fetch {

    @js.native
    @JSGlobal("fetch")
    def fetch(info: RequestInfo, init: RequestInit = null): js.Promise[Response] = js.native
  }

  @deprecated("use dom.Request instead", "2.0.0")
  type Request = dom.Request

  @deprecated("use dom.RequestInit instead", "2.0.0")
  type RequestInit = dom.RequestInit

  @deprecated("use dom.Response instead", "2.0.0")
  type Response = dom.Response

  @deprecated("use dom.Response instead", "2.0.0")
  lazy val Response: dom.Response.type = dom.Response

  @deprecated("use dom.ResponseInit instead", "2.0.0")
  type ResponseInit = dom.ResponseInit

  @deprecated("use new dom.ResponseInit { ... } instead", "2.0.0")
  object ResponseInit {

    def apply(_status: Int = 200, _statusText: ByteString = "OK",
        _headers: HeadersInit = js.Dictionary[String]()): ResponseInit = {
      new ResponseInit {
        var status = _status
        var statusText = _statusText
        var headers = _headers
      }
    }
  }

  @deprecated("use dom.Body instead", "2.0.0")
  type Body = dom.Body

  @deprecated("use dom.Headers instead", "2.0.0")
  type Headers = dom.Headers

  @deprecated("use dom.ReferrerPolicy instead", "2.0.0")
  type ReferrerPolicy = dom.ReferrerPolicy

  @deprecated("use dom.ReferrerPolicy instead", "2.0.0")
  lazy val ReferrerPolicy: dom.ReferrerPolicy.type = dom.ReferrerPolicy

  @deprecated("use dom.HttpMethod instead", "2.0.0")
  type HttpMethod = dom.HttpMethod

  @deprecated("use dom.HttpMethod instead", "2.0.0")
  lazy val HttpMethod: dom.HttpMethod.type = dom.HttpMethod

  @deprecated("use dom.RequestType instead", "2.0.0")
  type RequestType = dom.RequestType

  @deprecated("use dom.RequestType instead", "2.0.0")
  lazy val RequestType: dom.RequestType.type = dom.RequestType

  @deprecated("use dom.RequestDestination instead", "2.0.0")
  type RequestDestination = dom.RequestDestination

  @deprecated("use dom.RequestDestination instead", "2.0.0")
  lazy val RequestDestination: dom.RequestDestination.type =
    dom.RequestDestination

  @deprecated("use dom.RequestMode instead", "2.0.0")
  type RequestMode = dom.RequestMode

  @deprecated("use dom.RequestMode instead", "2.0.0")
  lazy val RequestMode: dom.RequestMode.type = dom.RequestMode

  @deprecated("use dom.RequestCredentials instead", "2.0.0")
  type RequestCredentials = dom.RequestCredentials

  @deprecated("use dom.RequestCredentials instead", "2.0.0")
  lazy val RequestCredentials: dom.RequestCredentials.type =
    dom.RequestCredentials

  @deprecated("use dom.RequestCache instead", "2.0.0")
  type RequestCache = dom.RequestCache

  @deprecated("use dom.RequestCache instead", "2.0.0")
  lazy val RequestCache: dom.RequestCache.type = dom.RequestCache

  @deprecated("use dom.RequestRedirect instead", "2.0.0")
  type RequestRedirect = dom.RequestRedirect

  @deprecated("use dom.RequestRedirect instead", "2.0.0")
  lazy val RequestRedirect: dom.RequestRedirect.type = dom.RequestRedirect

  @deprecated("use dom.ResponseType instead", "2.0.0")
  type ResponseType = dom.ResponseType

  @deprecated("use dom.ResponseType instead", "2.0.0")
  lazy val ResponseType: dom.ResponseType.type = dom.ResponseType

  // old FileReaderSync.scala
  @deprecated("use dom.FileReaderSync instead", "2.0.0")
  type FileReaderSync = dom.FileReaderSync

  // old Notification.scala

  @deprecated("use dom.Notification instead", "2.0.0")
  type Notification = dom.Notification

  @deprecated("use dom.Notification instead", "2.0.0")
  lazy val Notification: dom.Notification.type = dom.Notification

  @deprecated("use dom.NotificationOptions instead", "2.0.0")
  type NotificationOptions = dom.NotificationOptions

  // old Stream.scala

  @deprecated("use dom.WriteableState instead", "2.0.0")
  type WriteableState = dom.WriteableState

  @deprecated("use dom.WriteableState instead", "2.0.0")
  lazy val WriteableState: dom.WriteableState.type = dom.WriteableState

  @deprecated("use dom.WriteableStream instead", "2.0.0")
  type WriteableStream[-T] = dom.WriteableStream[T]

  @deprecated("use dom.ReadableStream instead", "2.0.0")
  type ReadableStream[+T] = dom.ReadableStream[T]

  @deprecated("use dom.ReadableStreamReader instead", "2.0.0")
  type ReadableStreamReader[+T] = dom.ReadableStreamReader[T]

  @deprecated("use dom.ReadableStreamController instead", "2.0.0")
  type ReadableStreamController[-T] = dom.ReadableStreamController[T]

  @deprecated("use dom.Chunk instead", "2.0.0")
  type Chunk[+T] = dom.Chunk[T]

  // old URL.scala

  @deprecated("use dom.URL instead", "2.0.0")
  type URL = dom.URL

  @deprecated("use dom.URLSearchParams instead", "2.0.0")
  type URLSearchParams = dom.URLSearchParams
}
