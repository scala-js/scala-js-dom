package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {

  /** The body property of the Notification interface indicates the body string of the notification. */
  var body: js.UndefOr[String] = js.undefined

  /** The dir property of the Notification interface indicates the text direction of the notification. */
  var dir: js.UndefOr[String] = js.undefined

  /** The icon property of the Notification interface contains the URL of an icon to be displayed as part of the
    * notification.
    */
  var icon: js.UndefOr[String] = js.undefined

  /** The lang property of the Notification interface indicates the text direction of the notification. */
  var lang: js.UndefOr[String] = js.undefined

  /** The noscreen property of the Notification interface specifies whether the notification firing should enable the
    * device's screen or not.
    */
  var noscreen: js.UndefOr[Boolean] = js.undefined

  /** The renotify property of the Notification interface specifies whether the user should be notified after a new
    * notification replaces an old one.
    */
  var renotify: js.UndefOr[Boolean] = js.undefined

  /** The silent property of the Notification interface specifies whether the notification should be silent, i.e. no
    * sounds or vibrations should be issued, regardless of the device settings.
    */
  var silent: js.UndefOr[Boolean] = js.undefined

  /** The sound property of the Notification interface specifies the URL of an audio file to be played when the
    * notification fires.
    */
  var sound: js.UndefOr[String] = js.undefined

  /** The sticky property of the Notification interface specifies whether the notification should be 'sticky', i.e. not
    * easily clearable by the user.
    */
  var sticky: js.UndefOr[Boolean] = js.undefined

  /** The tag property of the Notification interface signifies an identifying tag for the notification.
    *
    * The idea of notification tags is that more than one notification can share the same tag, linking them together.
    * One notification can then be programmatically replaced with another to avoid the users' screen being filled up
    * with a huge number of similar notifications.
    */
  var tag: js.UndefOr[String] = js.undefined

  /** The onclick property of the Notification interface specifies an event listener to receive click events. These
    * events occur when the user clicks on a displayed Notification.
    */
  var onclick: js.UndefOr[js.Function0[Any]] = js.undefined

  /** The onerror property of the Notification interface specifies an event listener to receive error events. These
    * events occur when something goes wrong with a Notification (in many cases an error preventing the notification
    * from being displayed.)
    */
  var onerror: js.UndefOr[js.Function0[Any]] = js.undefined

  var vibrate: js.UndefOr[js.Array[Double]] = js.undefined
}

@deprecated("all members of NotificationOptions are deprecated", "2.0.0")
object NotificationOptions {

  /** Construct a new NotificationOptions
    *
    * @param body
    *   The body text of the notification.
    * @param dir
    *   The text direction of the notification.
    * @param icon
    *   The icon URL of the notification.
    * @param lang
    *   The text direction of the notification.
    * @param noscreen
    *   Boolean indicating if notification firing should enable the device's screen or not
    * @param renotify
    *   Boolean indicating whether the user should be notified after a new notification replaces an old one.
    * @param silent
    *   Boolean indicating specifies whether the notification should be silent, i.e. no sounds or vibrations should be
    *   issued, regardless of the device settings
    * @param sound
    *   The URL of an audio file to be played when the notification fires.
    * @param sticky
    *   Boolean indicating whether the notification should be 'sticky', i.e. not easily clearable by the user.
    * @param tag
    *   A text identifying tag for the notification.
    * @param vibrate
    *   The vibration pattern for hardware to emit
    * @return
    *   a new NotificationOptions
    */
  @deprecated("use `new NotificationOptions { ... }` instead", "2.0.0")
  @inline
  def apply(
      body: js.UndefOr[String] = js.undefined, dir: js.UndefOr[String] = js.undefined,
      icon: js.UndefOr[String] = js.undefined, lang: js.UndefOr[String] = js.undefined,
      noscreen: js.UndefOr[Boolean] = js.undefined, renotify: js.UndefOr[Boolean] = js.undefined,
      silent: js.UndefOr[Boolean] = js.undefined, sound: js.UndefOr[String] = js.undefined,
      sticky: js.UndefOr[Boolean] = js.undefined, tag: js.UndefOr[String] = js.undefined,
      onclick: js.UndefOr[js.Function0[Any]] = js.undefined, onerror: js.UndefOr[js.Function0[Any]] = js.undefined,
      vibrate: js.UndefOr[js.Array[Double]] = js.undefined
  ): NotificationOptions = {
    val body0 = body
    val dir0 = dir
    val icon0 = icon
    val lang0 = lang
    val noscreen0 = noscreen
    val renotify0 = renotify
    val silent0 = silent
    val sound0 = sound
    val sticky0 = sticky
    val tag0 = tag
    val onclick0 = onclick
    val onerror0 = onerror
    val vibrate0 = vibrate
    new NotificationOptions {
      this.body = body0
      this.dir = dir0
      this.icon = icon0
      this.lang = lang0
      this.noscreen = noscreen0
      this.renotify = renotify0
      this.silent = silent0
      this.sound = sound0
      this.sticky = sticky0
      this.tag = tag0
      this.onclick = onclick0
      this.onerror = onerror0
      this.vibrate = vibrate0
    }
  }
}

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
