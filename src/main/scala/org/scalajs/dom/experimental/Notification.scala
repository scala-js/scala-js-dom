package org.scalajs.dom.experimental

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait NotificationOptions extends js.Object {

  /**
   * The body property of the Notification interface indicates the
   * body string of the notification.
   *
   * MDN
   */
  val body: String = js.native

  /**
   * The dir property of the Notification interface indicates the
   * text direction of the notification.
   *
   * MDN
   */
  val dir: String = js.native

  /**
   * The icon property of the Notification interface contains the
   * URL of an icon to be displayed as part of the notification.
   *
   * MDN
   */
  val icon: String = js.native

  /**
   * The lang property of the Notification interface indicates the
   * text direction of the notification.
   *
   * MDN
   */
  val lang: String = js.native

  /**
   * The noscreen property of the Notification interface specifies
   * whether the notification firing should enable the device's screen or not.
   *
   * MDN
   */
  val noscreen: Boolean = js.native

  /**
   * The renotify property of the Notification interface specifies
   * whether the user should be notified after a new notification replaces an
   * old one.
   *
   * MDN
   */
  val renotify: Boolean = js.native

  /**
   * The silent property of the Notification interface specifies
   * whether the notification should be silent, i.e. no sounds or vibrations
   * should be issued, regardless of the device settings.
   *
   * MDN
   */
  val silent: Boolean = js.native

  /**
   * The sound property of the Notification interface specifies the
   * URL of an audio file to be played when the notification fires.
   *
   * MDN
   */
  val sound: String = js.native

  /**
   * The sticky property of the Notification interface specifies
   * whether the notification should be 'sticky', i.e. not easily clearable
   * by the user.
   *
   * MDN
   */
  val sticky: Boolean = js.native

  /**
   * The tag property of the Notification interface signifies an
   * identifying tag for the notification.
   *
   * The idea of notification tags is that more than one notification can
   * share the same tag, linking them together. One notification can then
   * be programmatically replaced with another to avoid the users' screen
   * being filled up with a huge number of similar notifications.
   *
   * MDN
   */
  val tag: String = js.native

  /**
   * The onclick property of the Notification interface specifies an event
   * listener to receive click events. These events occur when the user
   * clicks on a displayed Notification.
   *
   * MDN
   */
  val onclick: js.Function0[Any] = js.native

  /**
   * The onerror property of the Notification interface specifies an event
   * listener to receive error events. These events occur when something goes
   * wrong with a Notification (in many cases an error preventing the
   * notification from being displayed.)
   *
   * MDN
   */
  val onerror: js.Function0[Any] = js.native

  val vibrate: js.Array[Double] = js.native
}

object NotificationOptions {

  /**
   * Construct a new NotificationOptions
   *
   * @param body      The body text of the notification.
   * @param dir       The text direction of the notification.
   * @param icon      The icon URL of the notification.
   * @param lang      The text direction of the notification.
   * @param noscreen  Boolean indicating if notification firing should enable
   *                  the device's screen or not
   * @param renotify  Boolean indicating whether the user should be notified
   *                  after a new notification replaces an old one.
   * @param silent    Boolean indicating specifies whether the notification
   *                  should be silent, i.e. no sounds or vibrations should
   *                  be issued, regardless of the device settings
   * @param sound     The URL of an audio file to be played when the
   *                  notification fires.
   * @param sticky    Boolean indicating whether the notification should be
   *                  'sticky', i.e. not easily clearable by the user.
   * @param tag       A text identifying tag for the notification.
   * @param vibrate   The vibration pattern for hardware to emit
   * @return a new NotificationOptions
   */
  @inline
  def apply(
      body: js.UndefOr[String] = js.undefined,
      dir: js.UndefOr[String] = js.undefined,
      icon: js.UndefOr[String] = js.undefined,
      lang: js.UndefOr[String] = js.undefined,
      noscreen: js.UndefOr[Boolean] = js.undefined,
      renotify: js.UndefOr[Boolean] = js.undefined,
      silent: js.UndefOr[Boolean] = js.undefined,
      sound: js.UndefOr[String] = js.undefined,
      sticky: js.UndefOr[Boolean] = js.undefined,
      tag: js.UndefOr[String] = js.undefined,
      onclick: js.UndefOr[js.Function0[Any]] = js.undefined,
      onerror: js.UndefOr[js.Function0[Any]] = js.undefined,
      vibrate: js.UndefOr[js.Array[Double]] = js.undefined): NotificationOptions = {
    val result = js.Dynamic.literal()
    body.foreach(result.body = _)
    dir.foreach(result.dir = _)
    icon.foreach(result.icon = _)
    lang.foreach(result.lang = _)
    noscreen.foreach(result.noscreen = _)
    renotify.foreach(result.renotify = _)
    silent.foreach(result.silent = _)
    sound.foreach(result.sound = _)
    sticky.foreach(result.sticky = _)
    tag.foreach(result.tag = _)
    onclick.foreach(result.onclick = _)
    onerror.foreach(result.onerror = _)
    vibrate.foreach(result.vibrate = _)
    result.asInstanceOf[NotificationOptions]
  }
}

/**
 * Implicit imports for the notification api.
 *
 * https://developer.mozilla.org/en-US/docs/Web/API/Notifications_API
 */
@js.native
object Notification extends js.Object {

  /**
   * The permission read-only property of the Notification interface
   * indicates the current permission granted by the user for the current
   * origin to display web notifications.
   *
   * MDN
   */
  val permission: String = js.native

  /**
   * The requestPermission() method of the Notification interface requests
   * permission from the user for the current origin to display
   * notifications.
   *
   * MDN
   */
  def requestPermission(callback: js.Function1[String, Any]): Unit = js.native
}

/**
 * The Notification interface allows to notify users of an incoming message
 * or event.
 *
 * NOTE: requires permission
 * Note: This feature is available in Web Workers.
 *
 * MDN
 *
 * @param title     The text title of the notification
 * @param options   The options to configure this notification
 * @return a new Notification
 */
@JSName("Notification")
@js.native
class Notification(title: String, options: NotificationOptions = ???)
    extends EventTarget {

  /**
   * The body read-only property of the Notification interface indicates the
   * body string of the notification, as specified in the body option of the
   * Notification() constructor.
   *
   * MDN
   */
  val body: String = js.native

  /**
   * The data read-only property of the Notification interface returns a
   * structured clone of the notification's data, as specified in the
   * data option of the Notification() constructor.
   *
   * The notification's data can be any arbitrary data that you want
   * associated with the notification.
   *
   * MDN
   */
  val data: js.Object = js.native

  /**
   * The dir read-only property of the Notification interface indicates the
   * text direction of the notification, asspecified in the dir option of
   * the Notification() constructor.
   *
   * MDN
   */
  val dir: String = js.native

  /**
   * The icon read-only property of the Notification interface contains the
   * URL of an icon to be displayed as part of the notification, as specified
   * in the icon option of the Notification() constructor.
   *
   * MDN
   */
  val icon: String = js.native

  /**
   * The lang read-only property of the Notification interface indicates the
   * text direction of the notification, as specified in the lang option of
   * the Notification() constructor.
   *
   * MDN
   */
  val lang: String = js.native

  /**
   * The noscreen read-only property of the Notification interface specifies
   * whether the notification firing should enable the device's screen or not,
   * as specified in the noscreen option of the Notification() constructor.
   *
   * MDN
   */
  val noscreen: Boolean = js.native

  /**
   * The onclick property of the Notification interface specifies an event
   * listener to receive click events. These events occur when the user
   * clicks on a displayed Notification.
   *
   * MDN
   */
  var onclick: js.Function0[Any] = js.native

  /**
   * The onerror property of the Notification interface specifies an event
   * listener to receive error events. These events occur when something goes
   * wrong with a Notification (in many cases an error preventing the
   * notification from being displayed.)
   *
   * MDN
   */
  var onerror: js.Function0[Any] = js.native

  /**
   * The renotify read-only property of the Notification interface specifies
   * whether the user should be notified after a new notification replaces an
   * old one, as specified in the renotify option of the Notification()
   * constructor.
   *
   * MDN
   */
  val renotify: Boolean = js.native

  /**
   * The silent read-only property of the Notification interface specifies
   * whether the notification should be silent, i.e. no sounds or vibrations
   * should be issued, regardless of the device settings. This is specified
   * in the renotify option of the Notification() constructor.
   *
   * MDN
   */
  val silent: Boolean = js.native

  /**
   * The sound read-only property of the Notification interface specifies the
   * URL of an audio file to be played when the notification fires. This is
   * specified in the sound option of the Notification() constructor.
   *
   * MDN
   */
  val sound: String = js.native

  /**
   * The sticky read-only property of the Notification interface specifies
   * whether the notification should be 'sticky', i.e. not easily clearable
   * by the user. This is specified in the sticky option of the
   * Notification() constructor.
   *
   * MDN
   */
  val sticky: Boolean = js.native

  /**
   * The tag read-only property of the Notification interface signifies an
   * identifying tag for the notification, as specified in the tag option
   * of the Notification() constructor.
   *
   * The idea of notification tags is that more than one notification can
   * share the same tag, linking them together. One notification can then
   * be programmatically replaced with another to avoid the users' screen
   * being filled up with a huge number of similar notifications.
   *
   * MDN
   */
  val tag: String = js.native

  /**
   * The vibrate read-only property of the Notification interface.
   * Specifies a vibration pattern for devices with vibration hardware
   * to emit.
   *
   * MDN
   */
  val vibrate: js.Array[Double] = js.native

  /**
   * The close() method of the Notification interface is used to close a
   * previously displayed notification.
   *
   * MDN
   */
  def close(): Unit = js.native
}
