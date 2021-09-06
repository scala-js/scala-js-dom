package org.scalajs
package dom
package experimental

import scala.language.implicitConversions

package object beacon {

  @deprecated("use dom.BeaconNavigator instead", "2.0.0")
  type BeaconNavigator = dom.BeaconNavigator

  @deprecated("use dom.BeaconWorkerNavigator instead", "2.0.0")
  type BeaconWorkerNavigator = dom.BeaconWorkerNavigator

  @deprecated("use dom.Navigator.toBeaconNavigator instead", "2.0.0")
  implicit def toBeaconNavigator(n: Navigator): BeaconNavigator =
    Navigator.toBeaconNavigator(n)

  @deprecated("use dom.WorkerNavigator.toBeaconWorkerNavigator instead", "2.0.0")
  implicit def toBeaconWorkerNavigator(n: WorkerNavigator): BeaconWorkerNavigator =
    WorkerNavigator.toBeaconWorkerNavigator(n)

}
