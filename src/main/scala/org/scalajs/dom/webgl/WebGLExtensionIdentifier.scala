package org.scalajs.dom.webgl

/** Abstract class that maps a string enum onto a WebGL extension type
  *
  * @param value
  *   the string enum to pass the underlying `getExtension`
  * @tparam T
  *   the type that will be returned by the `getExtension`
  */
abstract class WebGLExtensionIdentifier[T](val value: String)
