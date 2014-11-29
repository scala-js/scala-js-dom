/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 *
 * Based on https://www.khronos.org/registry/typedarray/specs/1.0/
 */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * An ArrayBuffer is an underlying buffer of bytes, which views such as [[Int8Array]] use for underlying storage.
 */
class ArrayBuffer private () extends js.Object {
  /**
   * Construct a new ArrayBuffer of the specified size. Its contents are initialized to 0.
   *
   * @param length The size, in bytes, of the ArrayBuffer to create.
   */
  def this(length: Int) = this()

  /**
   * The length, in bytes, of this ArrayBuffer.
   */
  def byteLength: Int = js.native

  /**
   *  Returns an ArrayBufferView of this ArrayBuffer, limited to the specified range.
   *
   *  @param begin  The start index, in bytes, into this ArrayBuffer.
   *  @param end  The end index, in bytes, into this ArrayBuffer.
   */
  def slice(begin: Int, end: Int = js.native): ArrayBufferView = js.native
}

object ArrayBuffer extends js.Object {
  def isView(value: js.Any): Boolean = js.native
}

trait ArrayBufferView extends js.Object {
  /**
   * The source buffer for this view.
   */
  val buffer: ArrayBuffer = js.native

  /**
   * The offset into the source array buffer this view starts at.
   */
  def byteOffset: Int = js.native

  /**
   * The length, in bytes of this view.
   */
  def byteLength: Int = js.native
}

/**
 * Defines common functionality across all typed arrays.
 */
trait TypedArray[T, B] extends js.Object {
  @JSBracketAccess
  def apply(index: Int): B = js.native
  @JSBracketAccess
  def update(index: Int, value: B): Unit = js.native

  /**
   * Copies the contents of `array` into this array, starting at `offset`.
   */
  def set(array: T): Unit = js.native

  /**
   * Copies the contents of `array` into this array, starting at `offset`.
   */
  def set(array: T, offset: Int): Unit = js.native

  /**
   * Copies the contents of `array` into this array, starting at `offset`.
   */
  def set(array: js.Array[B], offset: Int = js.native): Unit = js.native

  /**
   * Returns a new view of this typed array. from `begin` to `end` inclusive.
   */
  def subarray(begin: Int, end: Int = js.native): T = js.native


  /**
   * The number of entries in this typed array.
   */
  val length: Int = js.native
}

/**
 * An array of signed bytes.
 */
class Int8Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Int8Array, Int] {

  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Int8Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Int8Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (1).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of unsigned bytes.
 */
class Uint8Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint8Array, Int] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Uint8Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Uint8Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (1).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of clamped unsigned bytes.
 */
class Uint8ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint8ClampedArray, Int]{
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Uint8ClampedArray) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Uint8ClampedArray extends js.Object {
  /**
   * The number of bytes per element in an array of this type (1).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of signed short integers.
 */
class Int16Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Int16Array, Int] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Int16Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Int16Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (2).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of unsigned short integers.
 */
class Uint16Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint16Array, Int] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Uint16Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Uint16Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (2).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of clamped unsigned short integers.
 */
class Uint16ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint16ClampedArray, Int] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Uint16ClampedArray) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Uint16ClampedArray extends js.Object {
  /**
   * The number of bytes per element in an array of this type (2).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of signed integers.
 */
class Int32Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Int32Array, Int] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Int32Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Int32Array extends js.Object {
  /** The number of bytes per element in an array of this type (4). */
  val BYTES_PER_ELEMENT: Int = js.native
}


/**
 * An array of unsigned integers.
 */
class Uint32Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint32Array, Int] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Uint32Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Uint32Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (4).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of clamped unsigned integers.
 */
class Uint32ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint32ClampedArray, Int] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Uint32Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Uint32ClampedArray extends js.Object {
  /**
   * The number of bytes per element in an array of this type (4).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of 32 bit IEEE-754 floating point numbers.
 */
class Float32Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Float32Array, Float] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Float32Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Float]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Float32Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (4).
   */
  val BYTES_PER_ELEMENT: Int = js.native
}

/**
 * An array of 64 bit IEEE-754 floating point numbers.
 */
class Float64Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Float64Array, Double] {
  /**
   * Construct a new array of the given length, with contents initialized to 0. The underlying ArrayBuffer is newly created.
   */
  def this(length: Int) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: Float64Array) = this()

  /**
   * Construct a new array with a copy of the provided array. The underlying ArrayBuffer is newly created.
   */
  def this(array: js.Array[Double]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = js.native, length: Int = js.native) = this()
}

object Float64Array extends js.Object {
  /** The number of bytes per element in an array of this type (8). */
  val BYTES_PER_ELEMENT: Int = js.native
}

class DataView(buffer: ArrayBuffer, byteOffset: Int, byteLength: Int) extends js.Object
    with ArrayBufferView {

  /**
   * Returns the signed 8-bit integer at `byteOffset`.
   */
  def getInt8(byteOffset: Int): Int = js.native

  /**
   * Returns the unsigned 8-bit integer at `byteOffset`.
   */
  def getUint8(byteOffset: Int): Int = js.native

  /**
   * Returns the signed 16-bit integer at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getInt16(byteOffset: Int, littleEndian: Boolean = js.native): Int = js.native

  /**
   * Returns the unsigned 16-bit integer at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getUint16(byteOffset: Int, littleEndian: Boolean = js.native): Int = js.native

  /**
   * Returns the signed 32-bit integer at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getInt32(byteOffset: Int, littleEndian: Boolean = js.native): Int = js.native

  /**
   * Returns the unsigned 32-bit integer at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getUint32(byteOffset: Int, littleEndian: Boolean = js.native): Double = js.native

  /**
   * Returns the 32-bit IEEE-754 float at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getFloat32(byteOffset: Int, littleEndian: Boolean = js.native): Double = js.native

  /**
   * Returns the 64-bit IEEE-754 float at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getFloat64(byteOffset: Int, littleEndian: Boolean = js.native): Double = js.native

  /**
   * Sets the signed byte at `byteOffset` to `value`.
   */
  def setInt8(byteOffset: Int, value: Int): Unit = js.native

  /**
   * Sets the unsigned byte at `byteOffset` to `value`.
   */
  def setUint8(byteOffset: Int, value: Int): Unit = js.native

  /**
   * Sets the signed short at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setInt16(byteOffset: Int, value: Int, littleEndian: Boolean = js.native): Unit = js.native

  /**
   * Sets the unsigned short at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setUint16(byteOffset: Int, value: Int, littleEndian: Boolean = js.native): Unit = js.native

  /**
   * Sets the signed integer at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setInt32(byteOffset: Int, value: Int, littleEndian: Boolean = js.native): Unit = js.native

  /**
   * Sets the unsigned integer at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setUint32(byteOffset: Int, value: Int, littleEndian: Boolean = js.native): Unit = js.native

  /**
   * Sets the 32-bit IEEE 754 float at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setFloat32(byteOffset: Int, value: Int, littleEndian: Boolean = js.native): Unit = js.native

  /**
   * Sets the 64-bit IEEE 754 float at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setFloat64(byteOffset: Int, value: Int, littleEndian: Boolean = js.native): Unit = js.native
}
