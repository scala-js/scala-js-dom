package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The WorkerNavigator interface represents a subset of the [[Navigator]] interface allowed to be accessed from a
  * Worker. Such an object is initialized for each worker and is available via the WorkerGlobalScope.navigator property
  * obtained by calling window.self.navigator
  */
@js.native
trait WorkerNavigator extends NavigatorID with NavigatorOnLine with NavigatorLanguage {

  @deprecated("sendBeacon is not supported in web workers", "2.0.0")
  def sendBeacon(url: String, data: BodyInit = js.native): Boolean = js.native
}
