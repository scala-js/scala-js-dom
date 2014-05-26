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
class ArrayBuffer extends js.Object {
  /**
   * The length, in bytes, of this ArrayBuffer.
   */
  def byteLength: Int = ???
  
  /**
   *  Returns an ArrayBufferView of this ArrayBuffer, limited to the specified range.
   *  
   *  @param begin  The start index, in bytes, into this ArrayBuffer.
   *  @param end  The end index, in bytes, into this ArrayBuffer.
   */
  def slice(begin: Int, end: Int = ???): ArrayBufferView = ???
}

object ArrayBuffer {
  def isView(value: js.Any): js.Boolean = ???
}

trait ArrayBufferView extends js.Object {
  /**
   * The source buffer for this view.
   */
  val buffer: ArrayBuffer = ???
  
  /**
   * The offset into the source array buffer this view starts at.
   */
  def byteOffset: Int = ???
  
  /**
   * The length, in bytes of this view.
   */
  def byteLength: Int = ???
}

/**
 * Defines common functionality across all typed arrays.
 */
trait TypedArray[T] extends js.Object {
  @JSBracketAccess
  def apply(index: Int): Int = ???
  @JSBracketAccess
  def update(index: Int, value: Int): Unit = ???
  
  /**
   * Copies the contents of `array` into this array, starting at `offset`.
   */
  def set(array: T, offset: Int = ???): Unit = ???

  /**
   * Copies the contents of `array` into this array, starting at `offset`.
   */
  def set(array: js.Array[Int], offset: Int = ???): Unit = ???

  /**
   * Returns a new view of this typed array. from `begin` to `end` inclusive.
   */ 
  def subarray(begin: Int, end: Int = ???): T = ???
  

  /**
   * The number of entries in this typed array.
   */
  val length: Int = ???
}

/**
 * An array of signed bytes.
 */
class Int8Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Int8Array] {
  
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Int8Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (1).
   */  
  val BYTES_PER_ELEMENT: Int = ???
}

/**
 * An array of unsigned bytes.
 */
class Uint8Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint8Array] {
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Uint8Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (1).
   */
  val BYTES_PER_ELEMENT: Int = ???
}

/**
 * An array of clamped unsigned bytes.
 */
class Uint8ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint8ClampedArray]{
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Uint8ClampedArray extends js.Object {
  /**
   * The number of bytes per element in an array of this type (1).
   */
  val BYTES_PER_ELEMENT: Int = ???
}

/**
 * An array of signed short integers.
 */
class Int16Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Int16Array] {
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Int16Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (2).
   */  
  val BYTES_PER_ELEMENT: Int = ???
}

/**
 * An array of unsigned short integers.
 */
class Uint16Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint16Array] {
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Uint16Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (2).
   */  
  val BYTES_PER_ELEMENT: Int = 2
}

/**
 * An array of clamped unsigned short integers.
 */
class Uint16ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint16ClampedArray] {
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Uint16ClampedArray extends js.Object {
  /**
   * The number of bytes per element in an array of this type (2).
   */  
  val BYTES_PER_ELEMENT: Int = ???
}

/**
 * An array of signed integers.
 */
class Int32Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Int32Array] {
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Int32Array extends js.Object {
  /** The number of bytes per element in an array of this type (4). */  
  val BYTES_PER_ELEMENT: Int = ???
}


/**
 * An array of unsigned integers.
 */
class Uint32Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint32Array] {
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Uint32Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (4).
   */  
  val BYTES_PER_ELEMENT: Int = ???
}

/**
 * An array of clamped unsigned integers.
 */
class Uint32ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArray[Uint32ClampedArray] {
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
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Uint32ClampedArray extends js.Object {
  /**
   * The number of bytes per element in an array of this type (4).
   */  
  val BYTES_PER_ELEMENT: Int = ???
}

/**
 * An array of 32 bit IEEE-754 floating point numbers.
 */
class Float32Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Float32Array] {
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
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Float32Array extends js.Object {
  /**
   * The number of bytes per element in an array of this type (4).
   */  
  val BYTES_PER_ELEMENT: Int = ???
}

/**
 * An array of 64 bit IEEE-754 floating point numbers.
 */
class Float64Array private () extends js.Object
    with ArrayBufferView
    with TypedArray[Float64Array] {
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
  def this(array: js.Array[Int]) = this()

  /**
   * Construct a new array with `buffer` as storage, using a view from the specified `byteOffset` with the given `length`.
   */
  def this(buffer: ArrayBuffer, byteOffset: Int = ???, length: Int = ???) = this()
}

object Float64Array extends js.Object {
  /** The number of bytes per element in an array of this type (8). */  
  val BYTES_PER_ELEMENT: Int = ???
}

class DataView(buffer: ArrayBuffer, byteOffset: Int, byteLength: Int) extends js.Object
    with ArrayBufferView {
  
  /**
   * Returns the signed 8-bit integer at `byteOffset`.
   */
  def getInt8(byteOffset: Int): Int = ???
  
  /**
   * Returns the unsigned 8-bit integer at `byteOffset`.
   */
  def getUint8(byteOffset: Int): Int = ???

  /**
   * Returns the signed 16-bit integer at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getInt16(byteOffset: Int, littleEndian: js.Boolean = ???): Int = ???
  
  /**
   * Returns the unsigned 16-bit integer at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getUint16(byteOffset: Int, littleEndian: js.Boolean = ???): Int = ???
  
  /**
   * Returns the signed 32-bit integer at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getInt32(byteOffset: Int, littleEndian: js.Boolean = ???): Int = ???

  /**
   * Returns the unsigned 32-bit integer at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getUint32(byteOffset: Int, littleEndian: js.Boolean = ???): Int = ???
  
  /**
   * Returns the 32-bit IEEE-754 float at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getFloat32(byteOffset: Int, littleEndian: js.Boolean = ???): Int = ???

  /**
   * Returns the 64-bit IEEE-754 float at `byteOffset`, if `littleEndian` uses little endian, otherwise uses big endian.
   */
  def getFloat64(byteOffset: Int, littleEndian: js.Boolean = ???): Int = ???

  /**
   * Sets the signed byte at `byteOffset` to `value`.
   */
  def setInt8(byteOffset: Int, value: Int): Int = ???

  /**
   * Sets the unsigned byte at `byteOffset` to `value`.
   */
  def setUint8(byteOffset: Int, value: Int): Int = ???

  /**
   * Sets the signed short at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setInt16(byteOffset: Int, value: Int, littleEndian: js.Boolean = ???): Int = ???

  /**
   * Sets the unsigned short at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setUint16(byteOffset: Int, value: Int, littleEndian: js.Boolean = ???): Int = ???
  
  /**
   * Sets the signed integer at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setInt32(byteOffset: Int, value: Int, littleEndian: js.Boolean = ???): Int = ???

  /**
   * Sets the unsigned integer at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setUint32(byteOffset: Int, value: Int, littleEndian: js.Boolean = ???): Int = ???

  /**
   * Sets the 32-bit IEEE 754 float at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setFloat32(byteOffset: Int, value: Int, littleEndian: js.Boolean = ???): Int = ???

  /**
   * Sets the 64-bit IEEE 754 float at `byteOffset` to `value`. If `littleEndian` is `true`, uses little-endian, otherwise uses big-endian.
   */
  def setFloat64(byteOffset: Int, value: Int, littleEndian: js.Boolean = ???): Int = ???
}
