package org.scalajs.dom.extensions

import scala.scalajs.js
import org.scalajs.dom

/**
 * Used to extend out javascript *Collections to make them usable as normal
 * Scala Seq[*]s
 */
class EasySeq[T](jsLength: js.Number, jsApply: js.Number => T) extends Seq[T] {
  def length = jsLength.toInt

  def apply(x: Int) = jsApply(x)

  def iterator = new Iterator[T] {
    var index = 0

    def hasNext: scala.Boolean = index < jsLength

    def next() = {
      val res = jsApply(index)
      index += 1
      res
    }

  }
}

/**
 * Encapsulates a Color, allowing you to do useful work with it
 * before serializing it to a String
 */
case class Color(r: Int, g: Int, b: Int) {
  override def toString() = s"rgb($r, $g, $b)"

  def *(c: Color) = Color(r * c.r, g * c.g, b * c.b)

  def +(c: Color) = Color(r + c.r, g + c.g, b + c.b)
}

object Color {

  val d = "[0-9a-zA-Z]"
  val RGB = "rgb\\((\\d+), (\\d+), (\\d+)\\)".r
  val ShortHex = s"#($d)($d)($d)".r
  val LongHex = s"#($d$d)($d$d)($d$d)".r

  def hex(x: String) = Integer.parseInt(x, 16)

  def apply(s: String): Color = {
    s match {
      case RGB(r, g, b) => Color(r.toInt, g.toInt, b.toInt)
      case ShortHex(r, g, b) => Color(hex(r) * 16, hex(g) * 16, hex(b) * 16)
      case LongHex(r, g, b) => Color(hex(r), hex(g), hex(b))
    }
  }

  val White = Color(255, 255, 255)
  val Red = Color(255, 0, 0)
  val Green = Color(0, 255, 0)
  val Blue = Color(0, 0, 255)
  val Cyan = Color(0, 255, 255)
  val Magenta = Color(255, 0, 255)
  val Yellow = Color(255, 255, 0)
  val Black = Color(0, 0, 0)
  val all = Seq(
    White,
    Red,
    Green,
    Blue,
    Cyan,
    Magenta,
    Yellow,
    Black
  )
}

object Image {
  def createBase64Svg(s: String) = {
    val img =
      dom.document
        .createElement("img")
        .asInstanceOf[dom.HTMLImageElement]

    img.src = "data:image/svg+xml;base64," + s
    img
  }
}

/**
 * A list of the codes returned by KeyEvents.
 */
object KeyCode {
  val backspace = 8
  val tab = 9
  val enter = 13
  val shift = 16
  val ctrl = 17
  val alt = 18
  val pause = 19
  val capsLock = 20
  val escape = 27
  val pageUp = 33
  val pageDown = 34
  val end = 35
  val home = 36
  val left = 37
  val up = 38
  val right = 39
  val down = 40
  val insert = 45
  val delete = 46
  val num0 = 48
  val num1 = 49
  val num2 = 50
  val num3 = 51
  val num4 = 52
  val num5 = 53
  val num6 = 54
  val num7 = 55
  val num8 = 56
  val num9 = 57
  val a = 65
  val b = 66
  val c = 67
  val d = 68
  val e = 69
  val f = 70
  val g = 71
  val h = 72
  val i = 73
  val j = 74
  val k = 75
  val l = 76
  val m = 77
  val n = 78
  val o = 79
  val p = 80
  val q = 81
  val r = 82
  val s = 83
  val t = 84
  val u = 85
  val v = 86
  val w = 87
  val x = 88
  val y = 89
  val z = 90
}
