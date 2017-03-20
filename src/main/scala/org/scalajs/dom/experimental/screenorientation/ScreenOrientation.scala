package org.scalajs.dom.experimental.screenorientation

/**
  * Extensions to the Screen interface.
  *
  * Façade to the Screen Orientation API, W3C Working Draft 21 July 2016
  *
  * [[https://www.w3.org/TR/screen-orientation]]
  */

import org.scalajs.dom.experimental.webvr.EventHandler
import org.scalajs.dom.raw.EventTarget

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation._
import scala.language.implicitConversions

/**
  * The Screen Orientation API provides the ability to read the screen orientation type and angle,
  * to be informed when the screen orientation state changes, and be able to lock the screen orientation to a specific state.
  */
@js.native
trait ScreenOrientation extends EventTarget {

  /**
    * When the lock() method is invoked, the user agent must run the apply an orientation lock steps to the responsible document using orientation.
    */
  def lock(orientation: String): Promise[Unit] = js.native

  /**
    * When the unlock() method is invoked, the user agent must run the steps to lock the orientation of the responsible document to the responsible document's default orientation.
    */
  def unlock(): Unit = js.native

  /**
    * When getting the type attribute, the user agent must return the responsible document's current orientation type.
    */
  def `type`: String = js.native

  /**
    * When getting the angle attribute, the user agent must return the responsible document's current orientation angle.
    */
  def angle: Int = js.native

  /**
    * The onchange attribute is an event handler whose corresponding event handler event type is change.
    */
  def onchange: EventHandler = js.native

}

/**
  * the OrientationType
  */
object OrientationType extends Enumeration {
  type OrientationType = Value

  @JSName("portrait-primary")
  val portraitPrimary = Value("portrait-primary")

  @JSName("portrait-secondary")
  val portraitSecondary = Value("portrait-secondary")

  @JSName("landscape-primary")
  val landscapePrimary = Value("landscape-primary")

  @JSName("landscape-secondary")
  val landscapeSecondary = Value("landscape-secondary")
}

/**
  * the OrientationLockType
  */
object OrientationLockType extends Enumeration {
  type OrientationLockType = Value

  val any = Value("any")
  val natural = Value("natural")
  val landscape = Value("landscape")
  val portrait = Value("portrait")

  @JSName("portrait-primary")
  val portraitPrimary = Value("portrait-primary")

  @JSName("portrait-secondary")
  val portraitSecondary = Value("portrait-secondary")

  @JSName("landscape-primary")
  val landscapePrimary = Value("landscape-primary")

  @JSName("landscape-secondary")
  val landscapeSecondary = Value("landscape-secondary")
}