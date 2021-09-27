package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Implicit imports for the notification api.
  *
  * https://developer.mozilla.org/en-US/docs/Web/API/Notifications_API
  */
@js.native
@JSGlobal
object Notification extends js.Object {

  /** The permission read-only property of the Notification interface indicates the current permission granted by the
    * user for the current origin to display web notifications.
    */
  val permission: String = js.native

  /** The requestPermission() method of the Notification interface requests permission from the user for the current
    * origin to display notifications.
    */
  def requestPermission(callback: js.Function1[String, Any]): Unit = js.native
}

/** The Notification interface allows to notify users of an incoming message or event.
  *
  * NOTE: requires permission Note: This feature is available in Web Workers.
  *
  * @param title
  *   The text title of the notification
  * @param options
  *   The options to configure this notification
  * @return
  *   a new Notification
  */
@JSGlobal("Notification")
@js.native
class Notification(title: String, options: NotificationOptions = ???) extends EventTarget {

  /** The body read-only property of the Notification interface indicates the body string of the notification, as
    * specified in the body option of the Notification() constructor.
    */
  val body: String = js.native

  /** The data read-only property of the Notification interface returns a structured clone of the notification's data,
    * as specified in the data option of the Notification() constructor.
    *
    * The notification's data can be any arbitrary data that you want associated with the notification.
    */
  val data: js.Object = js.native

  /** The dir read-only property of the Notification interface indicates the text direction of the notification,
    * asspecified in the dir option of the Notification() constructor.
    */
  val dir: String = js.native

  /** The icon read-only property of the Notification interface contains the URL of an icon to be displayed as part of
    * the notification, as specified in the icon option of the Notification() constructor.
    */
  val icon: String = js.native

  /** The lang read-only property of the Notification interface indicates the text direction of the notification, as
    * specified in the lang option of the Notification() constructor.
    */
  val lang: String = js.native

  /** The noscreen read-only property of the Notification interface specifies whether the notification firing should
    * enable the device's screen or not, as specified in the noscreen option of the Notification() constructor.
    */
  val noscreen: Boolean = js.native

  /** The onclick property of the Notification interface specifies an event listener to receive click events. These
    * events occur when the user clicks on a displayed Notification.
    */
  var onclick: js.Function0[Any] = js.native

  /** The onerror property of the Notification interface specifies an event listener to receive error events. These
    * events occur when something goes wrong with a Notification (in many cases an error preventing the notification
    * from being displayed.)
    */
  var onerror: js.Function0[Any] = js.native

  /** The renotify read-only property of the Notification interface specifies whether the user should be notified after
    * a new notification replaces an old one, as specified in the renotify option of the Notification() constructor.
    */
  val renotify: Boolean = js.native

  /** The silent read-only property of the Notification interface specifies whether the notification should be silent,
    * i.e. no sounds or vibrations should be issued, regardless of the device settings. This is specified in the
    * renotify option of the Notification() constructor.
    */
  val silent: Boolean = js.native

  /** The sound read-only property of the Notification interface specifies the URL of an audio file to be played when
    * the notification fires. This is specified in the sound option of the Notification() constructor.
    */
  val sound: String = js.native

  /** The sticky read-only property of the Notification interface specifies whether the notification should be 'sticky',
    * i.e. not easily clearable by the user. This is specified in the sticky option of the Notification() constructor.
    */
  val sticky: Boolean = js.native

  /** The tag read-only property of the Notification interface signifies an identifying tag for the notification, as
    * specified in the tag option of the Notification() constructor.
    *
    * The idea of notification tags is that more than one notification can share the same tag, linking them together.
    * One notification can then be programmatically replaced with another to avoid the users' screen being filled up
    * with a huge number of similar notifications.
    */
  val tag: String = js.native

  /** The vibrate read-only property of the Notification interface. Specifies a vibration pattern for devices with
    * vibration hardware to emit.
    */
  val vibrate: js.Array[Double] = js.native

  /** The close() method of the Notification interface is used to close a previously displayed notification. */
  def close(): Unit = js.native
}
