package org.scalajs.dom.experimental

import org.scalajs.dom.raw.EventTarget
import scala.language.implicitConversions
import scala.scalajs.js


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
  var dir: String = js.native

  /**
   * The icon property of the Notification interface contains the
   * URL of an icon to be displayed as part of the notification.
   *
   * MDN
   */
  var icon: String = js.native

  /**
   * The lang property of the Notification interface indicates the
   * text direction of the notification.
   *
   * MDN
   */
  var lang: String = js.native

  /**
   * The noscreen property of the Notification interface specifies
   * whether the notification firing should enable the device's screen or not.
   *
   * MDN
   */
  var noscreen: Boolean = js.native

  /**
   * The renotify property of the Notification interface specifies
   * whether the user should be notified after a new notification replaces an
   * old one.
   *
   * MDN
   */
  var renotify: Boolean = js.native

  /**
   * The silent property of the Notification interface specifies
   * whether the notification should be silent, i.e. no sounds or vibrations
   * should be issued, regardless of the device settings.
   *
   * MDN
   */
  var silent: Boolean = js.native

  /**
   * The sound property of the Notification interface specifies the
   * URL of an audio file to be played when the notification fires.
   *
   * MDN
   */
  var sound: String = js.native

  /**
   * The sticky property of the Notification interface specifies
   * whether the notification should be 'sticky', i.e. not easily clearable
   * by the user.
   *
   * MDN
   */
  var sticky: Boolean = js.native

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
  var tag: String = js.native

  /**
   * The title property of the Notification interface indicates
   * the title of the notification.
   *
   * MDN
   */
  var title: String = js.native

  var vibrate: js.Object = js.native
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
   * @param title     The text title of the notification
   * @param vibrate   The vibration pattern for hardware to emit
   * @return a new NotificationOptions
   */
  @inline
  def apply(body: js.UndefOr[String] = js.undefined,
            dir: js.UndefOr[String] = js.undefined,
            icon: js.UndefOr[String] = js.undefined,
            lang: js.UndefOr[String] = js.undefined,
            noscreen: js.UndefOr[Boolean] = js.undefined,
            renotify: js.UndefOr[Boolean] = js.undefined,
            silent: js.UndefOr[Boolean] = js.undefined,
            sound: js.UndefOr[String] = js.undefined,
            sticky: js.UndefOr[Boolean] = js.undefined,
            tag: js.UndefOr[String] = js.undefined,
            title: js.UndefOr[String] = js.undefined,
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
    title.foreach(result.title = _)
    vibrate.foreach(result.vibrate = _)
    result.asInstanceOf[NotificationOptions]
  }
}

/**
 * Implicit imports for the notification api.
 *
 * https://developer.mozilla.org/en-US/docs/Web/API/Notifications_API
 */
object Notification {
  implicit def toNotification(w: org.scalajs.dom.Window): NotificationWindow =
    w.asInstanceOf[NotificationWindow]

  class NotificationWindow extends js.Any {
    /** Return an interface to the Notification API */
    def Notification: Notification = js.native

  }

  /**
   * The Notification interface allows to notify users of an incoming message
   * or event
   * NOTE: requires permission
   * Note: This feature is available in Web Workers.
   *
   * MDN
   */
  class Notification extends EventTarget {
    /**
     * Construct a new Notification
     *
     * @param title     The text title of the notification
     * @param options   The options to configure this notification
     * @return a new Notification
     */
    def this(title:js.UndefOr[String] = js.undefined,
             options:js.UndefOr[NotificationOptions] = js.undefined) = this()

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
    var data: js.Object = js.native

    /**
     * The dir read-only property of the Notification interface indicates the
     * text direction of the notification, asspecified in the dir option of
     * the Notification() constructor.
     *
     * MDN
     */
    var dir: String = js.native

    /**
     * The icon read-only property of the Notification interface contains the
     * URL of an icon to be displayed as part of the notification, as specified
     * in the icon option of the Notification() constructor.
     *
     * MDN
     */
    var icon: String = js.native

    /**
     * The lang read-only property of the Notification interface indicates the
     * text direction of the notification, as specified in the lang option of
     * the Notification() constructor.
     *
     * MDN
     */
    var lang: String = js.native

    /**
     * The noscreen read-only property of the Notification interface specifies
     * whether the notification firing should enable the device's screen or not,
     * as specified in the noscreen option of the Notification() constructor.
     *
     * MDN
     */
    var noscreen: Boolean = js.native

    /**
     * The onclick property of the Notification interface specifies an event
     * listener to receive click events. These events occur when the user
     * clicks on a displayed Notification.
     *
     * MDN
     */
    var onclick: js.Function0[Unit] = js.native

    /**
     * The onclose property of the Notification interface specifies an event
     * listener to receive close events. These events occur when a Notification
     * is closed.
     *
     * MDN
     */
    @deprecated("This event handler is no longer listed in the Notifications API spec.", "forever")
    var onclose: js.Function0[Unit] = js.native

    /**
     * The onerror property of the Notification interface specifies an event
     * listener to receive error events. These events occur when something goes
     * wrong with a Notification (in many cases an error preventing the
     * notification from being displayed.)
     *
     * MDN
     */
    var onerror: js.Function0[Unit] = js.native

    /**
     * The onshow property of the Notification interface specifies an event
     * listener to receive show events. These events occur when a Notification
     * is displayed.
     *
     * MDN
     */
    @deprecated("This event handler is no longer listed in the Notifications API spec.", "forever")
    var onshow: js.Function0[Unit] = js.native

    /**
     * The permission read-only property of the Notification interface
     * indicates the current permission granted by the user for the current
     * origin to display web notifications.
     *
     * MDN
     */
    var permission: String = js.native

    /**
     * The renotify read-only property of the Notification interface specifies
     * whether the user should be notified after a new notification replaces an
     * old one, as specified in the renotify option of the Notification()
     * constructor.
     *
     * MDN
     */
    var renotify: Boolean = js.native

    /**
     * The silent read-only property of the Notification interface specifies
     * whether the notification should be silent, i.e. no sounds or vibrations
     * should be issued, regardless of the device settings. This is specified
     * in the renotify option of the Notification() constructor.
     *
     * MDN
     */
    var silent: Boolean = js.native

    /**
     * The sound read-only property of the Notification interface specifies the
     * URL of an audio file to be played when the notification fires. This is
     * specified in the sound option of the Notification() constructor.
     *
     * MDN
     */
    var sound: String = js.native

    /**
     * The sticky read-only property of the Notification interface specifies
     * whether the notification should be 'sticky', i.e. not easily clearable
     * by the user. This is specified in the sticky option of the
     * Notification() constructor.
     *
     * MDN
     */
    var sticky: Boolean = js.native

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
    var tag: String = js.native

    /**
     * The title read-only property of the Notification interface indicates
     * the title of the notification, as specified in the title parameter of
     * the Notification() constructor.
     *
     * MDN
     */
    var title: String = js.native

    /**
     * The vibrate read-only property of the Notification interface.
     * Specifies a vibration pattern for devices with vibration hardware
     * to emit.
     *
     * MDN
     */
    var vibrate: js.Array[Double] = js.native

    /**
     * The requestPermission() method of the Notification interface requests
     * permission from the user for the current origin to display
     * notifications.
     *
     * MDN
     */
    def requestPermission(callback:js.Function1[String, Unit]): Unit = js.native

    /**
     * The close() method of the Notification interface is used to close a
     * previously displayed notification.
     *
     * MDN
     */
    def close(): Unit = js.native
  }
}
