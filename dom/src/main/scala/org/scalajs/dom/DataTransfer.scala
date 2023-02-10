/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The DataTransfer object is used to hold the data that is being dragged during a drag and drop operation. It may hold
  * one or more data items, each of one or more data types. For more information about drag and drop, see Drag and Drop.
  *
  * This object is available from the dataTransfer property of all drag events. It cannot be created separately.
  */
@js.native
trait DataTransfer extends js.Object {

  /** Specifies the effects that are allowed for this drag. You may set this in the dragstart event to set the desired
    * effects for the source, and within the dragenter and dragover events to set the desired effects for the target.
    * The value is not used for other events.
    */
  var effectAllowed: DataTransferEffectAllowedKind = js.native

  /** The actual effect that will be used. */
  var dropEffect: DataTransferDropEffectKind = js.native

  /** Remove the data associated with a given type. The type argument is optional. If the type is empty or not
    * specified, the data associated with all types is removed. If data for the specified type does not exist, or the
    * data transfer contains no data, this method will have no effect.
    */
  def clearData(format: String = js.native): Unit = js.native

  /** Set the data for a given type. If data for the type does not exist, it is added at the end, such that the last
    * item in the types list will be the new format. If data for the type already exists, the existing data is replaced
    * in the same position. That is, the order of the types list is not changed when replacing data of the same type.
    */
  def setData(format: String, data: String): Unit = js.native

  /** Gives a DataTransferItemList object which is a list of all of the drag data. */
  def items: DataTransferItemList = js.native

  /** Set the image to be used for dragging if a custom one is desired. Most of the time, this would not be set, as a
    * default image is created from the node that was dragged.
    *
    * If the node is an HTML img element, an HTML canvas element or a XUL image element, the image data is used.
    * Otherwise, image should be a visible node and the drag image will be created from this. If image is null, any
    * custom drag image is cleared and the default is used instead.
    *
    * The coordinates specify the offset into the image where the mouse cursor should be. To center the image, for
    * instance, use values that are half the width and height of the image.
    *
    * @param image
    *   An element to use as the drag feedback image.
    * @param x
    *   Horizontal offset within the image.
    * @param y
    *   Vertical offset within the image.
    */
  def setDragImage(image: Element, x: Double, y: Double): Unit = js.native

  /** Retrieves the data for a given type, or an empty string if data for that type does not exist or the data transfer
    * contains no data.
    *
    * A security error will occur if you attempt to retrieve data during a drag that was set from a different domain, or
    * the caller would otherwise not have access to. This data will only be available once a drop occurs during the drop
    * event.
    */
  def getData(format: String): String = js.native

  /** An array of the drag data formats (as strings) that were set in the dragstart event.
    *
    * The order of the formats is the same order as the data included in the drag operation.
    *
    * The formats are Unicode strings giving the type or format of the data, generally given by a MIME type. Some values
    * that are not MIME types are special-cased for legacy reasons (for example "text").
    */
  def types: FrozenArray[String] = js.native

  def files: FileList = js.native
}
