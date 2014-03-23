/**
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the EPFL scala-js-dom project.
 * 
 * Based on https://www.khronos.org/registry/typedarray/specs/1.0/
 */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._ 

class ArrayBuffer extends js.Object {
  def byteLength: js.Number = ???
  def slice(begin: js.Number, end: js.Number): ArrayBufferView = ???
  def slice(begin: js.Number): ArrayBufferView = ???
}

object ArrayBuffer {
  def isView(value: js.Any): js.Boolean = ???
}

trait ArrayBufferView extends js.Object {
  def buffer: ArrayBuffer = ???
  def byteOffset: js.Number = ???
  def byteLength: js.Number = ???
}

/**
 * Defines common functionality across all typed arrays.
 * NOTE: This is just a utility and should probably be
 * re-jigged so as not to pollute the org.scalajs.dom package somehow.
 */
trait TypedArrayCommon[T] extends js.Object {
  @JSBracketAccess
  def apply(index: js.Number): js.Number = ???
  @JSBracketAccess
  def update(index: js.Number, value: js.Number): Unit = ???
  
  def set(array: T, offset: js.Number): Unit = ???
  def set(array: T): Unit = ???
  def set(array: js.Array[js.Number], offset: js.Number): Unit = ???
  def set(array: js.Array[js.Number]): Unit = ???

  def subarray(start: js.Number, end: js.Number): T = ???
}

class Int8Array private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Int8Array] {
  def this(length: js.Number) = this()
  def this(array: Int8Array) = this()
  def this(array: js.Array[js.Number]) = this()  
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Int8Array extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 1
}

class Uint8Array private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Uint8Array] {
  def this(length: js.Number) = this()
  def this(array: Uint8Array) = this()
  def this(array: js.Array[js.Number]) = this()
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Uint8Array extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 1
}

class Uint8ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Uint8ClampedArray]{
  def this(length: js.Number) = this()
  def this(array: Uint8ClampedArray) = this()
  def this(array: js.Array[js.Number]) = this()  
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Uint8ClampedArray extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 1
}

class Int16Array private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Int16Array] {
  def this(length: js.Number) = this()
  def this(array: Int16Array) = this()
  def this(array: js.Array[js.Number]) = this()  
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Int16Array extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 2
}

class Uint16Array private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Uint16Array] {
  def this(length: js.Number) = this()
  def this(array: Uint16Array) = this()
  def this(array: js.Array[js.Number]) = this()
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Uint16Array extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 2
}

class Uint16ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Uint16ClampedArray] {
  def this(length: js.Number) = this()
  def this(array: Uint16ClampedArray) = this()
  def this(array: js.Array[js.Number]) = this()  
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Uint16ClampedArray extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 2
}

class Int32Array private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Int32Array] {
  def this(length: js.Number) = this()
  def this(array: Int32Array) = this()
  def this(array: js.Array[js.Number]) = this()  
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Int32Array extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 4
}


class Uint32Array private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Uint32Array] {
  def this(length: js.Number) = this()
  def this(array: Uint32Array) = this()
  def this(array: js.Array[js.Number]) = this()    
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Uint32Array extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 4
}

class Uint32ClampedArray private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Uint32ClampedArray] {
  def this(length: js.Number) = this()
  def this(array: Uint32ClampedArray) = this()
  def this(array: js.Array[js.Number]) = this()  
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Uint32ClampedArray extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 4
}

class Float32Array private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Float32Array] {
  
  def this(length: js.Number) = this()
  def this(array: Float32Array) = this()
  def this(array: js.Array[js.Number]) = this()  
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Float32Array extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 4
}

class Float64Array private () extends js.Object
    with ArrayBufferView
    with TypedArrayCommon[Float64Array] {
  def this(length: js.Number) = this()
  def this(array: Float64Array) = this()
  def this(array: js.Array[js.Number]) = this()  
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number) = this()
  def this(buffer: ArrayBuffer, byteOffset: js.Number, length: js.Number) = this()
}

object Float64Array extends js.Object {
  val BYTES_PER_ELEMENT: js.Number = 8
}

class DataView(buffer: ArrayBuffer, byteOffset: js.Number, byteLength: js.Number) extends js.Object
    with ArrayBufferView {
  def getInt8(byteOffset: js.Number): js.Number = ???
  def getUint8(byteOffset: js.Number): js.Number = ???
  def getInt16(byteOffset: js.Number): js.Number = ???
  def getInt16(byteOffset: js.Number, littleEndian: js.Boolean): js.Number = ???
  def getUint16(byteOffset: js.Number): js.Number = ???
  def getUint16(byteOffset: js.Number, littleEndian: js.Boolean): js.Number = ???
  def getInt32(byteOffset: js.Number): js.Number = ???
  def getInt32(byteOffset: js.Number, littleEndian: js.Boolean): js.Number = ???
  def getUint32(byteOffset: js.Number): js.Number = ???
  def getUint32(byteOffset: js.Number, littleEndian: js.Boolean): js.Number = ???
  def getFloat32(byteOffset: js.Number): js.Number = ???
  def getFloat32(byteOffset: js.Number, littleEndian: js.Boolean): js.Number = ???
  def getFloat64(byteOffset: js.Number): js.Number = ???
  def getFloat64(byteOffset: js.Number, littleEndian: js.Boolean): js.Number = ???

  def setInt8(byteOffset: js.Number, value: js.Number): js.Number = ???
  def setUint8(byteOffset: js.Number, value: js.Number): js.Number = ???
  def setInt16(byteOffset: js.Number, value: js.Number): js.Number = ???
  def setInt16(byteOffset: js.Number, value: js.Number, littleEndian: js.Boolean): js.Number = ???
  def setUint16(byteOffset: js.Number, value: js.Number): js.Number = ???
  def setUint16(byteOffset: js.Number, value: js.Number, littleEndian: js.Boolean): js.Number = ???
  def setInt32(byteOffset: js.Number, value: js.Number): js.Number = ???
  def setInt32(byteOffset: js.Number, value: js.Number, littleEndian: js.Boolean): js.Number = ???
  def setUint32(byteOffset: js.Number, value: js.Number): js.Number = ???
  def setUint32(byteOffset: js.Number, value: js.Number, littleEndian: js.Boolean): js.Number = ???
  def setFloat32(byteOffset: js.Number, value: js.Number): js.Number = ???
  def setFloat32(byteOffset: js.Number, value: js.Number, littleEndian: js.Boolean): js.Number = ???
  def setFloat64(byteOffset: js.Number, value: js.Number): js.Number = ???
  def setFloat64(byteOffset: js.Number, value: js.Number, littleEndian: js.Boolean): js.Number = ???
}
