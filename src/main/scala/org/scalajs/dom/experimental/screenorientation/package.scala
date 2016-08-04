package org.scalajs.dom.experimental

import org.scalajs.dom.experimental.screenorientation.OrientationLockType.OrientationLockType
import org.scalajs.dom.experimental.screenorientation.OrientationType.OrientationType
import scala.language.implicitConversions

/**
 * Façade to the Screen Orientation API, W3C Working Draft 21 July 2016
 *
 * [[https://www.w3.org/TR/screen-orientation]]
 */
package object screenorientation {

  /** converts OrientationType to its string representation */
  implicit def OrientationTypeToString(t: OrientationType): String = t.toString

  /** converts OrientationLockType to its string representation */
  implicit def OrientationLockTypeToString(t: OrientationLockType): String = t.toString

}
