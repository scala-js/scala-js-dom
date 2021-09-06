package org.scalajs
package dom
package experimental

import scala.language.implicitConversions

package object beacon {

  @deprecated("use dom.Navigator instead", "2.0.0")
  type BeaconNavigator = dom.Navigator

  @deprecated("use dom.WorkerNavigator instead", "2.0.0")
  type BeaconWorkerNavigator = dom.WorkerNavigator

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  implicit def toBeaconNavigator(n: Navigator): BeaconNavigator =
    n

  @deprecated("use dom.WorkerNavigator directly instead", "2.0.0")
  implicit def toBeaconWorkerNavigator(n: WorkerNavigator): BeaconWorkerNavigator =
    n

}
