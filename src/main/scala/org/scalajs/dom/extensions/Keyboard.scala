package org.scalajs.dom.extensions

import org.scalajs.dom
import org.scalajs.dom.KeyboardEvent

import scala.scalajs.js
import scala.scalajs.js.UndefOr

object KeyboardPolyfill {

  /**
   * Primarily it allows you to abandon onpress events that have cross-browser incompatible behavior and
   * that are to be deprecated in favor of beforeinput events in W3C DOM4. Calling polyfill method on keydown/keyup event
   * gives you normalized keyCode across platforms and browsers and estimated charCode in case of a key representing
   * printable character. pfKeyCode & optional pfCharCode properties are added to Event object for possible latter use
   */
  implicit class PfEvent(e: KeyboardEvent) {

    /** to retrieve polyfilled code later */
    def pfKeyCode: Option[Int] = getDynamic("pfKeyCode")
    def pfCharCode: Option[Int] = getDynamic("pfCharCode")

    /**
     * Basically attempts to unite keyCodes across variety of platforms and browsers and
     * find a corresponding charCode in case of a printable unicode point
     * @return  (keyCode, Option[charCode])
     */
    def polyfill(): (Int, Option[Int]) = {
      require(e.`type` != "keypress", "This polyfill only works with keydown/keyup events")
      val keyCode = normalize(e.keyCode)
      val result = ChCode.shiftableKey2Char.lift(keyCode) match {
        case Some(shift) => (keyCode, Option(shift(e.shiftKey)))
        case None => (keyCode, ChCode.key2char.lift(keyCode))
      }
      pfKeyCode(keyCode)
      result._2.foreach(pfCharCode(_))
      result
    }

    private def setDynamic(name: String, value: js.Any) = e.asInstanceOf[js.Dynamic].updateDynamic(name)(value)
    private def getDynamic[T](name: String): Option[T] = Option((e.asInstanceOf[js.Dynamic].selectDynamic(name): UndefOr[Dynamic]).orNull).asInstanceOf[Option[T]]

    private def pfKeyCode(keyCode: Int) = setDynamic("pfKeyCode", keyCode)
    private def pfCharCode(charCode: Int) = setDynamic("pfCharCode", charCode)

    /**
     * To be improved continuously, most of the other stuff concerns Mac atypical keyboard layout and ancient browsers
     * You're welcome to contribute
     */
    private def normalize(keyCode: Int): Int = {
      if (Device.isGecko)
        keyCode match {
          case 173 => KCode.Dash
          case 59 => KCode.Semicolon
          case 61 => KCode.Equals
          case 0 => KCode.Win
          case other => keyCode
        }
      else if (Device.isMac)
        keyCode match {
          case 224 => KCode.Meta
          case 12 => KCode.NumLock
          case other => keyCode
        }
      else
        keyCode
    }
  }

  object Device {
    val IOSRegex  = "iPhone|iPod|iPad".r

    val userAgent = dom.window.navigator.userAgent
    val platform  = dom.window.navigator.platform

    val isIOS             = IOSRegex.findFirstIn(userAgent).isDefined
    val isIPad            = userAgent.contains("iPad")
    val isIPod            = userAgent.contains("iPod")
    val isIPhone          = userAgent.contains("iPhone")
    val isAndroid         = userAgent.contains("Android")

    val isGecko           = userAgent.contains("Gecko/")
    val isWebKit          = userAgent.contains("WebKit/")
    val isIE              = userAgent.contains("Trident/")
    val isOpera           = userAgent.contains("Opera/")
    val isChrome          = userAgent.contains("Chrome/")

    val isLinux           = platform.contains("Linux")
    val isWin             = platform.contains("Win")
    val isMac             = platform.contains("Mac")
    val isChrOS           = platform.contains("CrOS")

    val isTouchable       = isIOS || isAndroid
  }
}

/**
 * @note ([0-9] * + - / .) are the only characters shared by 2 keys on keyboard, this duplication is caused by existence of numpad.
 */
object ChCode {
  import KCode._

  /** shift changes charCode */
  private def >(w: Int, wo: Int)(shift: Boolean) = if (shift) w else wo
  /** add offset to a lower case letter which gives you it's char code */
  private def >>(keyCode: Int)(shift: Boolean) = if (shift) keyCode else letterKeyToLowerCaseCharCode(keyCode)

  /** keys that have different charCode representation when shift key is pressed */
  private val letterKey2Char = for(letterKeyCode  <- A to Z) yield (letterKeyCode, >>(letterKeyCode)_)
  val shiftableKey2Char = Map[Int, Boolean => Int](
    (Num0,                >(')',      Num0)),
    (Num1,                >('!',      Num1)),
    (Num2,                >('@',      Num2)),
    (Num3,                >('#',      Num3)),
    (Num4,                >('$',      Num4)),
    (Num5,                >('%',      Num5)),
    (Num6,                >('^',      Num6)),
    (Num7,                >('&',      Num7)),
    (Num8,                >('*',      Num8)),
    (Num9,                >('(',      Num9)),
    (Comma,               >('<',      ',')),
    (Dash,                >('_',      '-')),
    (Period,              >('>',      '.')),
    (Slash,               >('?',      '/')),
    (Backtick,            >('~',      '`')),
    (SquareBracketOpen,   >('{',      '[')),
    (Backslash,           >('|',      '\\')),
    (SquareBracketClose,  >('}',      ']')),
    (SingleQuote,         >('"',      ''')),
    (Semicolon,           >(':',      ';')),
    (Equals,              >('+',      '='))
  ) ++ letterKey2Char

  val key2char = Map[Int, Int](
    Space -> Space,
    Enter -> Enter,
    Numpad0,
    Numpad1,
    Numpad2,
    Numpad3,
    Numpad4,
    Numpad5,
    Numpad6,
    Numpad7,
    Numpad8,
    Numpad9,
    NumpadMultiply,
    NumpadAdd,
    NumpadSubtract,
    NumpadDivide,
    NumpadPeriod
  )
}

object KCode {

  /** numbers have KeyCode equal to CharCode */
  def isNumber(keyCode: Int) = keyCode >= Num0 && keyCode <= Num9
  val Num0 = '0'.toInt // 48
  val Num1 = '1'.toInt // 49
  val Num2 = '2'.toInt // 50
  val Num3 = '3'.toInt // 51
  val Num4 = '4'.toInt // 52
  val Num5 = '5'.toInt // 53
  val Num6 = '6'.toInt // 54
  val Num7 = '7'.toInt // 55
  val Num8 = '8'.toInt // 56
  val Num9 = '9'.toInt // 57

  /** [A-Z] charCode is equal to [a-z] keyCode, thus I won't duplicate constants */
  val charSizeOffset = 'a'.toInt - 'A'.toInt

  def isLetterKey(keyCode: Int) = keyCode >= A && keyCode <= Z
  def isUpperCaseLetter(charCode: Int) = isLetterKey(charCode)
  def letterKeyToLowerCaseCharCode(keyCode: Int) = keyCode + charSizeOffset
  def letterKeyToUpperCaseCharCode(keyCode: Int) = keyCode // informative method

  /** Upper case letters have CharCode equal to KeyCode */
  val A = 'A'.toInt // 65
  val B = 'B'.toInt // 66
  val C = 'C'.toInt // 67
  val D = 'D'.toInt // 68
  val E = 'E'.toInt // 69
  val F = 'F'.toInt // 70
  val G = 'G'.toInt // 71
  val H = 'H'.toInt // 72
  val I = 'I'.toInt // 73
  val J = 'J'.toInt // 74
  val K = 'K'.toInt // 75
  val L = 'L'.toInt // 76
  val M = 'M'.toInt // 77
  val N = 'N'.toInt // 78
  val O = 'O'.toInt // 79
  val P = 'P'.toInt // 80
  val Q = 'Q'.toInt // 81
  val R = 'R'.toInt // 82
  val S = 'S'.toInt // 83
  val T = 'T'.toInt // 84
  val U = 'U'.toInt // 85
  val V = 'V'.toInt // 86
  val W = 'W'.toInt // 87
  val X = 'X'.toInt // 88
  val Y = 'Y'.toInt // 89
  val Z = 'Z'.toInt // 90

  val Comma               = 188
  val Dash                = 189
  val Period              = 190
  val Slash               = 191
  val Backtick            = 192
  val SquareBracketOpen   = 219
  val Backslash           = 220
  val SquareBracketClose  = 221
  val SingleQuote         = 222
  val Semicolon           = 186
  val Equals              = 187

  /** Space & Enter have KeyCode equal to CharCode */
  val Space = 32 // both charCode and keyCode
  val Enter = 13 // both charCode and keyCode

  /** Numpad numbers share common numbers charCode */
  val Numpad0         = (96, Num0)
  val Numpad1         = (97, Num1)
  val Numpad2         = (98, Num2)
  val Numpad3         = (99, Num3)
  val Numpad4         = (100, Num4)
  val Numpad5         = (101, Num5)
  val Numpad6         = (102, Num6)
  val Numpad7         = (103, Num7)
  val Numpad8         = (104, Num8)
  val Numpad9         = (105, Num9)
  val NumpadMultiply  = (106, '*'.toInt)
  val NumpadAdd       = (107, '+'.toInt)
  val NumpadSubtract  = (109, '-'.toInt)
  val NumpadDivide    = (111, '/'.toInt)
  val NumpadPeriod    = (110, '.'.toInt)

  /** Keys that do not have unicode representation */
  val Backspace = 8
  val Tab       = 9
  val Shift     = 16
  val Ctrl      = 17
  val Alt       = 18
  val Pause     = 19
  val CapsLock  = 20
  val Escape    = 27
  val PageUp    = 33
  val PageDown  = 34
  val End       = 35
  val Home      = 36
  val Left      = 37
  val Up        = 38
  val Right     = 39
  val Down      = 40
  val Insert    = 45
  val Delete    = 46
  val Meta      = 91
  val Win       = 224
  val F1        = 112
  val F2        = 113
  val F3        = 114
  val F4        = 115
  val F5        = 116
  val F6        = 117
  val F7        = 118
  val F8        = 119
  val F9        = 120
  val F10       = 121
  val F11       = 122
  val F12       = 123
  val NumLock   = 144
}