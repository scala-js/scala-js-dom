/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */
package org.scalajs.dom.raw

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait GetSVGDocument extends js.Object {
  def getSVGDocument(): Document = js.native
}

@js.native
@JSGlobal
class SVGPathSegCurvetoQuadraticRel extends SVGPathSeg {
  var y: Double = js.native
  var y1: Double = js.native
  var x: Double = js.native
  var x1: Double = js.native
}

/**
 * The marker element defines the graphics that is to be used for drawing
 * arrowheads or polymarkers on a given &lt;path&gt; , &lt;line&gt; , &lt;polyline&gt; or
 * &lt;polygon&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGMarkerElement
    extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox
    with SVGExternalResourcesRequired {
  var orientType: SVGAnimatedEnumeration = js.native
  var markerUnits: SVGAnimatedEnumeration = js.native

  def markerWidth: SVGAnimatedLength = js.native

  def markerHeight: SVGAnimatedLength = js.native

  def orientAngle: SVGAnimatedAngle = js.native

  def refY: SVGAnimatedLength = js.native

  def refX: SVGAnimatedLength = js.native

  def setOrientToAngle(angle: SVGAngle): Unit = js.native

  def setOrientToAuto(): Unit = js.native
}

@js.native
@JSGlobal
object SVGMarkerElement extends js.Object {
  val SVG_MARKER_ORIENT_UNKNOWN: Int = js.native
  val SVG_MARKER_ORIENT_ANGLE: Int = js.native
  val SVG_MARKERUNITS_UNKNOWN: Int = js.native
  val SVG_MARKERUNITS_STROKEWIDTH: Int = js.native
  val SVG_MARKER_ORIENT_AUTO: Int = js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: Int = js.native
}

/**
 * The SVGGElement interface corresponds to the &lt;g&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGGElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired

@js.native
@JSGlobal
class SVGPathSegCurvetoCubicSmoothAbs extends SVGPathSeg {
  var y: Double = js.native
  var x2: Double = js.native
  var x: Double = js.native
  var y2: Double = js.native
}

@js.native
@JSGlobal
class SVGZoomEvent extends UIEvent {
  def zoomRectScreen: SVGRect = js.native

  def previousScale: Double = js.native

  def newScale: Double = js.native

  def previousTranslate: SVGPoint = js.native

  def newTranslate: SVGPoint = js.native
}

@js.native
trait SVGUnitTypes extends js.Object {
  val SVG_UNIT_TYPE_UNKNOWN: Int = js.native
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Int = js.native
  val SVG_UNIT_TYPE_USERSPACEONUSE: Int = js.native
}

@js.native
@JSGlobal
object SVGUnitTypes extends js.Object {
  val SVG_UNIT_TYPE_UNKNOWN: Int = js.native
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Int = js.native
  val SVG_UNIT_TYPE_USERSPACEONUSE: Int = js.native
}

@js.native
@JSGlobal
class SVGPathSegMovetoRel extends SVGPathSeg {
  var y: Double = js.native
  var x: Double = js.native
}

/**
 * The SVGLineElement interface provides access to the properties of &lt;line&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGLineElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute y1 on the given &lt;line&gt; element.
   *
   * MDN
   */
  def y1: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute x2 on the given &lt;line&gt; element.
   *
   * MDN
   */
  def x2: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute x1 on the given &lt;line&gt; element.
   *
   * MDN
   */
  def x1: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute y2 on the given &lt;line&gt; element.
   *
   * MDN
   */
  def y2: SVGAnimatedLength = js.native
}

/**
 * The SVGDescElement interface corresponds to the &lt;desc&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGDescElement
    extends SVGElement with SVGStylable with SVGLangSpace

@js.native
@JSGlobal
class SVGPathSegCurvetoQuadraticSmoothRel extends SVGPathSeg {
  var y: Double = js.native
  var x: Double = js.native
}

/**
 * The SVGClipPathElement interface provides access to the properties of
 * &lt;clippath&gt; elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGClipPathElement
    extends SVGElement with SVGUnitTypes with SVGStylable with SVGTransformable
    with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute clipPathUnits on the given &lt;clippath&gt; element. Takes
   * one of the constants defined in SVGUnitTypes
   *
   * MDN
   */
  def clipPathUnits: SVGAnimatedEnumeration = js.native
}

/**
 * The SVGTextPositioningElement interface is inherited by text-related
 * interfaces: SVGTextElement, SVGTSpanElement, SVGTRefElement and
 * SVGAltGlyphElement.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGTextPositioningElement extends SVGTextContentElement {

  /**
   * Corresponds to attribute y on the given element.
   *
   * MDN
   */
  def y: SVGAnimatedLengthList = js.native

  /**
   * Corresponds to attribute rotate on the given element.
   *
   * MDN
   */
  def rotate: SVGAnimatedNumberList = js.native

  /**
   * Corresponds to attribute dy on the given element.
   *
   * MDN
   */
  def dy: SVGAnimatedLengthList = js.native

  /**
   * Corresponds to attribute x on the given element.
   *
   * MDN
   */
  def x: SVGAnimatedLengthList = js.native

  /**
   * Corresponds to attribute dx on the given element.
   *
   * MDN
   */
  def dx: SVGAnimatedLengthList = js.native
}

@js.native
@JSGlobal
class SVGPathSegLinetoVerticalRel extends SVGPathSeg {
  var y: Double = js.native
}

/**
 * The SVGAnimatedString interface is used for attributes of type DOMString which
 * can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedString extends js.Object {

  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: String = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: String = js.native
}

/**
 * Interface SVGTests defines an interface which applies to all elements which have
 * attributes requiredFeatures, requiredExtensions and systemLanguage.
 *
 * MDN
 */
@js.native
trait SVGTests extends js.Object {

  /**
   * Corresponds to attribute requiredFeatures on the given element.
   *
   * MDN
   */
  var requiredFeatures: SVGStringList = js.native

  /**
   * Corresponds to attribute requiredExtensions on the given element.
   *
   * MDN
   */
  var requiredExtensions: SVGStringList = js.native

  /**
   * Corresponds to attribute systemLanguage on the given element.
   *
   * MDN
   */
  var systemLanguage: SVGStringList = js.native

  /**
   * Returns true if the browser supports the given extension, specified by a URI.
   *
   * MDN
   */
  def hasExtension(extension: String): Boolean = js.native
}

/**
 * The SVGPatternElement interface corresponds to the &lt;pattern&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGPatternElement
    extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace
    with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired
    with SVGURIReference {

  /**
   * Corresponds to attribute patternUnits on the given &lt;pattern&gt; element. Takes one
   * of the constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def patternUnits: SVGAnimatedEnumeration = js.native

  /**
   * Corresponds to attribute y on the given &lt;pattern&gt; element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute width on the given &lt;pattern&gt; element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute x on the given &lt;pattern&gt; element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute patternContentUnits on the given &lt;pattern&gt; element.
   * Takes one of the constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def patternContentUnits: SVGAnimatedEnumeration = js.native

  /**
   * Corresponds to attribute patternTransform on the given &lt;pattern&gt; element.
   *
   * MDN
   */
  def patternTransform: SVGAnimatedTransformList = js.native

  /**
   * Corresponds to attribute height on the given &lt;pattern&gt; element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = js.native
}

/**
 * The SVGAnimatedAngle interface is used for attributes of basic type &lt;angle&gt; which
 * can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedAngle extends js.Object {

  /**
   * A read only SVGAngle representing the current animated value of the given
   * attribute. If the given attribute is not currently being animated, then the
   * SVGAngle will have the same contents as baseVal. The object referenced by animVal
   * will always be distinct from the one referenced by baseVal, even when the attribute
   * is not animated.
   *
   * MDN
   */
  def animVal: SVGAngle = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGAngle = js.native
}

/**
 * The SVGScriptElement interface corresponds to the SVG &lt;script&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGScriptElement
    extends SVGElement with SVGExternalResourcesRequired with SVGURIReference {
  def `type`: String = js.native
}

/**
 * The SVGViewElement interface provides access to the properties of &lt;view&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGViewElement
    extends SVGElement with SVGZoomAndPan with SVGFitToViewBox
    with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute viewTarget on the given &lt;view&gt; element. A list of
   * DOMString values which contain the names listed in the viewTarget attribute. Each
   * of the DOMString values can be associated with the corresponding element using the
   * getElementById() method call.
   *
   * MDN
   */
  def viewTarget: SVGStringList = js.native
}

@js.native
trait SVGLocatable extends js.Object {
  var farthestViewportElement: SVGElement = js.native
  var nearestViewportElement: SVGElement = js.native

  def getBBox(): SVGRect = js.native

  def getTransformToElement(element: SVGElement): SVGMatrix = js.native

  def getCTM(): SVGMatrix = js.native

  def getScreenCTM(): SVGMatrix = js.native
}

/**
 * The SVGTitleElement interface corresponds to the &lt;title&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGTitleElement
    extends SVGElement with SVGStylable with SVGLangSpace

/**
 * The SVGAnimatedTransformList interface is used for attributes which take a list
 * of numbers and which can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedTransformList extends js.Object {

  /**
   * A read only SVGTransformList representing the current animated value of the given
   * attribute. If the given attribute is not currently being animated, then the
   * SVGTransformList will have the same contents as baseVal. The object referenced by
   * animVal will always be distinct from the one referenced by baseVal, even when the
   * attribute is not animated.
   *
   * MDN
   */
  def animVal: SVGTransformList = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGTransformList = js.native
}

@js.native
trait SVGFitToViewBox extends js.Object {
  var viewBox: SVGAnimatedRect = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
}

@js.native
@JSGlobal
class SVGPointList extends js.Object {
  def numberOfItems: Int = js.native

  def replaceItem(newItem: SVGPoint, index: Int): SVGPoint = js.native

  def getItem(index: Int): SVGPoint = js.native

  def clear(): Unit = js.native

  def appendItem(newItem: SVGPoint): SVGPoint = js.native

  def initialize(newItem: SVGPoint): SVGPoint = js.native

  def removeItem(index: Int): SVGPoint = js.native

  def insertItemBefore(newItem: SVGPoint, index: Int): SVGPoint = js.native
}

/**
 * The SVGAnimatedLengthList interface is used for attributes of type
 * SVGLengthList which can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedLengthList extends js.Object {

  /**
   * A read only SVGLengthList representing the current animated value of the given
   * attribute. If the given attribute is not currently being animated, then the
   * SVGLengthList will have the same contents as baseVal. The object referenced by
   * animVal will always be distinct from the one referenced by baseVal, even when the
   * attribute is not animated.
   *
   * MDN
   */
  def animVal: SVGLengthList = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGLengthList = js.native
}

/**
 * The SVGAnimatedPreserveAspectRatio interface is used for attributes of type
 * SVGPreserveAspectRatio which can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedPreserveAspectRatio extends js.Object {

  /**
   * A read only SVGPreserveAspectRatio representing the current animated value of
   * the given attribute. If the given attribute is not currently being animated, then
   * the SVGPreserveAspectRatio will have the same contents as baseVal. The object
   * referenced by animVal is always distinct from the one referenced by baseVal, even
   * when the attribute is not animated.
   *
   * MDN
   */
  def animVal: SVGPreserveAspectRatio = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGPreserveAspectRatio = js.native
}

@js.native
trait SVGExternalResourcesRequired extends js.Object {
  var externalResourcesRequired: SVGAnimatedBoolean = js.native
}

/**
 * The SVGAngle interface correspond to the &lt;angle&gt; basic data type.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAngle extends js.Object {

  /**
   * The value as a string value, in the units expressed by unitType. Setting this
   * attribute will cause value, valueInSpecifiedUnits and unitType to be updated
   * automatically to reflect this setting. Exceptions on setting: a DOMException
   * with code SYNTAX_ERR is raised if the assigned string cannot be parsed as a valid
   * &lt;angle&gt;. a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when
   * the length corresponds to a read only attribute or when the object itself is read
   * only.
   *
   * MDN
   */
  var valueAsString: String = js.native

  /**
   * The value as a floating point value, in the units expressed by unitType. Setting
   * this attribute will cause value and valueAsString to be updated automatically to
   * reflect this setting. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  var valueInSpecifiedUnits: Double = js.native

  /**
   * The value as a floating point value, in user units. Setting this attribute will
   * cause valueInSpecifiedUnits and valueAsString to be updated automatically to
   * reflect this setting. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  var value: Double = js.native

  /**
   * The type of the value as specified by one of the SVG_ANGLETYPE_* constants defined
   * on this interface.
   *
   * MDN
   */
  def unitType: Int = js.native

  /**
   * Reset the value as a number with an associated unitType, thereby replacing the
   * values for all of the attributes on the object. Exceptions: a DOMException with
   * code NOT_SUPPORTED_ERR is raised if unitType is SVG_ANGLETYPE_UNKNOWN or not a
   * valid unit type constant (one of the other SVG_ANGLETYPE_* constants defined on
   * this interface). a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the length corresponds to a read only attribute or when the object
   * itself is read only.
   *
   * MDN
   */
  def newValueSpecifiedUnits(unitType: Int,
      valueInSpecifiedUnits: Double): Unit = js.native

  /**
   * Preserve the same underlying stored value, but reset the stored unit identifier to
   * the given unitType. Object attributes unitType, valueInSpecifiedUnits and
   * valueAsString might be modified as a result of this method.
   *
   * MDN
   */
  def convertToSpecifiedUnits(unitType: Int): Unit = js.native
}

/**
 * The SVGAngle interface correspond to the &lt;angle&gt; basic data type.
 *
 * MDN
 */
@js.native
@JSGlobal
object SVGAngle extends js.Object {

  val SVG_ANGLETYPE_RAD: Int = js.native

  /**
   * The unit type is not one of predefined unit types. It is invalid to attempt to define a
   * new value of this type or to attempt to switch an existing value to this type.
   *
   * MDN
   */
  val SVG_ANGLETYPE_UNKNOWN: Int = js.native
  val SVG_ANGLETYPE_UNSPECIFIED: Int = js.native

  /**
   * The unit type was explicitly set to degrees.
   *
   * MDN
   */
  val SVG_ANGLETYPE_DEG: Int = js.native
  val SVG_ANGLETYPE_GRAD: Int = js.native
}

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG
 * language derive from the SVGElement interface.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGElement extends Element {
  var onmouseover: js.Function1[MouseEvent, _] = js.native

  /**
   * The element which established the current viewport. Often, the nearest ancestor
   * &lt;svg&gt; element. Null if the given element is the outermost svg element.
   *
   * MDN
   */
  def viewportElement: SVGElement = js.native

  var onmousemove: js.Function1[MouseEvent, _] = js.native
  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var ondblclick: js.Function1[MouseEvent, _] = js.native
  var onfocusout: js.Function1[FocusEvent, _] = js.native
  var onfocusin: js.Function1[FocusEvent, _] = js.native

  /**
   * Corresponds to attribute xml:base on the given element.
   *
   * MDN
   */
  var xmlbase: String = js.native
  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onload: js.Function1[Event, _] = js.native
  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var onclick: js.Function1[MouseEvent, _] = js.native

  /**
   * The nearest ancestor &lt;svg&gt; element. Null if the given element is the outermost svg
   * element.
   *
   * MDN
   */
  def ownerSVGElement: SVGSVGElement = js.native
}

@js.native
@JSGlobal
class SVGPathSegLinetoHorizontalAbs extends SVGPathSeg {
  var x: Double = js.native
}

@js.native
@JSGlobal
class SVGPathSegArcAbs extends SVGPathSeg {
  var y: Double = js.native
  var sweepFlag: Boolean = js.native
  var r2: Double = js.native
  var x: Double = js.native
  var angle: Double = js.native
  var r1: Double = js.native
  var largeArcFlag: Boolean = js.native
}

/**
 * The SVGTransformList defines a list of SVGTransform objects.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGTransformList extends js.Object {
  def numberOfItems: Int = js.native

  /**
   * Returns the specified item from the list. The returned item is the item itself and
   * not a copy. Any changes made to the item are immediately reflected in the list. The
   * first item is number 0. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def getItem(index: Int): SVGTransform = js.native

  def consolidate(): SVGTransform = js.native

  /**
   * Clears all existing current items from the list, with the result being an empty
   * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the list corresponds to a read only attribute or when the object itself
   * is read only.
   *
   * MDN
   */
  def clear(): Unit = js.native

  /**
   * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
   * from its previous list before it is inserted into this list. The inserted item is the
   * item itself and not a copy. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def appendItem(newItem: SVGTransform): SVGTransform = js.native

  /**
   * Clears all existing current items from the list and re-initializes the list to hold
   * the single item specified by the parameter. If the inserted item is already in a
   * list, it is removed from its previous list before it is inserted into this list. The
   * inserted item is the item itself and not a copy. The return value is the item inserted
   * into the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def initialize(newItem: SVGTransform): SVGTransform = js.native

  /**
   * Removes an existing item from the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only. a DOMException with code
   * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
   * numberOfItems.
   *
   * MDN
   */
  def removeItem(index: Int): SVGTransform = js.native

  /**
   * Inserts a new item into the list at the specified position. The first item is number
   * 0. If newItem is already in a list, it is removed from its previous list before it is
   * inserted into this list. The inserted item is the item itself and not a copy. If the
   * item is already in this list, note that the index of the item to insert before is
   * before the removal of the item. If the index is equal to 0, then the new item is
   * inserted at the front of the list. If the index is greater than or equal to
   * numberOfItems, then the new item is appended to the end of the list. Exceptions: a
   * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
   * corresponds to a read only attribute or when the object itself is read only.
   *
   * MDN
   */
  def insertItemBefore(newItem: SVGTransform,
      index: Int): SVGTransform = js.native

  /**
   * Replaces an existing item in the list with a new item. If newItem is already in a list,
   * it is removed from its previous list before it is inserted into this list. The
   * inserted item is the item itself and not a copy. If the item is already in this list,
   * note that the index of the item to replace is before the removal of the item.
   * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
   * when the list corresponds to a read only attribute or when the object itself is read
   * only. a DOMException with code INDEX_SIZE_ERR is raised if the index number is
   * greater than or equal to numberOfItems.
   *
   * MDN
   */
  def replaceItem(newItem: SVGTransform, index: Int): SVGTransform = js.native

  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
}

@js.native
@JSGlobal
class SVGPathSegClosePath extends SVGPathSeg

/**
 * The SVGAnimatedLength interface is used for attributes of basic type &lt;length&gt;
 * which can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedLength extends js.Object {

  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: SVGLength = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGLength = js.native
}

/**
 * The SVGAnimatedPoints interface supports elements which have a points attribute
 * which holds a list of coordinate values and which support the ability to animate
 * that attribute.
 *
 * MDN
 */
@js.native
trait SVGAnimatedPoints extends js.Object {

  /**
   * Provides access to the base (i.e., static) contents of the points attribute.
   *
   * MDN
   */
  var points: SVGPointList = js.native

  /**
   * Provides access to the current animated contents of the points attribute. If the
   * given attribute or property is being animated, contains the current animated
   * value of the attribute or property. If the given attribute or property is not
   * currently being animated, contains the same value as points.
   *
   * MDN
   */
  def animatedPoints: SVGPointList = js.native
}

/**
 * The SVGDefsElement interface corresponds to the &lt;defs&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGDefsElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired

@js.native
@JSGlobal
class SVGPathSegLinetoHorizontalRel extends SVGPathSeg {
  var x: Double = js.native
}

/**
 * The SVGEllipseElement interface provides access to the properties of &lt;ellipse&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGEllipseElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute ry on the given &lt;ellipse&gt; element.
   *
   * MDN
   */
  def ry: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute cx on the given &lt;ellipse&gt; element.
   *
   * MDN
   */
  def cx: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute rx on the given &lt;ellipse&gt; element.
   *
   * MDN
   */
  def rx: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute cy on the given &lt;ellipse&gt; element.
   *
   * MDN
   */
  def cy: SVGAnimatedLength = js.native
}

/**
 * The SVGAElement interface provides access to the properties of &lt;a&gt; elements, as
 * well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGAElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired with SVGURIReference {

  /**
   * Corresponds to attribute target on the given &lt;a&gt; element.
   *
   * MDN
   */
  def target: SVGAnimatedString = js.native
}

/**
 * The SVGStylable interface is implemented on all objects corresponding to SVG
 * elements that can have style, class and presentation attributes specified on
 * them.
 *
 * MDN
 */
@js.native
trait SVGStylable extends js.Object {

  /**
   * Corresponds to attribute class on the given element.
   *
   * MDN
   */
  var className: SVGAnimatedString = js.native

  /**
   * Corresponds to attribute style on the given element.
   *
   * MDN
   */
  var style: CSSStyleDeclaration = js.native
}

/**
 * Interface SVGTransformable contains properties and methods that apply to all
 * elements which have attribute transform.
 *
 * MDN
 */
@js.native
trait SVGTransformable extends SVGLocatable {

  /**
   * Corresponds to attribute transform on the given element.
   *
   * MDN
   */
  var transform: SVGAnimatedTransformList = js.native
}

@js.native
trait SVGLangSpace extends js.Object {
  var xmllang: String = js.native
  var xmlspace: String = js.native
}

@js.native
@JSGlobal
class SVGPoint extends js.Object {
  var y: Double = js.native
  var x: Double = js.native

  def matrixTransform(matrix: SVGMatrix): SVGPoint = js.native
}

/**
 * The SVGAnimatedNumber interface is used for attributes which take a list of
 * numbers and which can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedNumberList extends js.Object {

  /**
   * A read only SVGNumberList representing the current animated value of the given
   * attribute. If the given attribute is not currently being animated, then the
   * SVGNumberList will have the same contents as baseVal. The object referenced by
   * animVal will always be distinct from the one referenced by baseVal, even when the
   * attribute is not animated.
   *
   * MDN
   */
  def animVal: SVGNumberList = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  def baseVal: SVGNumberList = js.native
}

/**
 * The SVGSVGElement interface provides access to the properties of &lt;svg&gt; elements,
 * as well as methods to manipulate them. This interface contains also various
 * miscellaneous commonly-used utility methods, such as matrix operations and the
 * ability to control the time of redraw on visual rendering devices.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGSVGElement
    extends SVGElement with SVGStylable with SVGZoomAndPan with DocumentEvent
    with SVGLangSpace with SVGLocatable with SVGTests with SVGFitToViewBox
    with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute width on the given &lt;svg&gt; element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute x on the given &lt;svg&gt; element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute contentStyleType on the given &lt;svg&gt; element.
   *
   * MDN
   */
  var contentStyleType: String = js.native
  var onzoom: js.Function1[js.Any, _] = js.native

  /**
   * Corresponds to attribute y on the given &lt;svg&gt; element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = js.native

  /**
   * The position and size of the viewport (implicit or explicit) that corresponds to
   * this &lt;svg&gt; element. When the browser is actually rendering the content, then the
   * position and size values represent the actual values when rendering. The position
   * and size values are unitless values in the coordinate system of the parent element.
   * If no parent element exists (i.e., &lt;svg&gt; element represents the root of the
   * document tree), if this SVG document is embedded as part of another document (e.g.,
   * via the HTML &lt;object&gt; element), then the position and size are unitless values in
   * the coordinate system of the parent document. (If the parent uses CSS or XSL layout,
   * then unitless values represent pixel units for the current CSS or XSL viewport.)
   *
   * MDN
   */
  def viewport: SVGRect = js.native

  var onerror: js.Function1[Event, _] = js.native

  /**
   * Corresponding size of a pixel unit along the y-axis of the viewport.
   *
   * MDN
   */
  def pixelUnitToMillimeterY: Double = js.native

  var onresize: js.Function1[UIEvent, _] = js.native

  /**
   * Corresponding size of a screen pixel along the y-axis of the viewport.
   *
   * MDN
   */
  def screenPixelToMillimeterY: Double = js.native

  /**
   * Corresponds to attribute height on the given &lt;svg&gt; element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = js.native

  var onabort: js.Function1[UIEvent, _] = js.native

  /**
   * Corresponds to attribute contentScriptType on the given &lt;svg&gt; element.
   *
   * MDN
   */
  var contentScriptType: String = js.native

  /**
   * Size of a pixel units (as defined by CSS2) along the x-axis of the viewport, which
   * represents a unit somewhere in the range of 70dpi to 120dpi, and, on systems that
   * support this, might actually match the characteristics of the target medium. On
   * systems where it is impossible to know the size of a pixel, a suitable default pixel
   * size is provided.
   *
   * MDN
   */
  def pixelUnitToMillimeterX: Double = js.native

  /**
   * On an outermost &lt;svg&gt; element, the corresponding translation factor that takes
   * into account user "magnification".
   *
   * MDN
   */
  def currentTranslate: SVGPoint = js.native

  var onunload: js.Function1[Event, _] = js.native

  /**
   * On an outermost &lt;svg&gt; element, this attribute indicates the current scale factor
   * relative to the initial view to take into account user magnification and panning
   * operations. DOM attributes currentScale and currentTranslate are equivalent to
   * the 2x3 matrix [a b c d e f] = [currentScale 0 0 currentScale currentTranslate.x
   * currentTranslate.y]. If "magnification" is enabled (i.e.,
   * zoomAndPan="magnify"), then the effect is as if an extra transformation were
   * placed at the outermost level on the SVG document fragment (i.e., outside the
   * outermost &lt;svg&gt; element).
   *
   * MDN
   */
  def currentScale: Double = js.native

  var onscroll: js.Function1[UIEvent, _] = js.native

  /**
   * User interface (UI) events in DOM Level 2 indicate the screen positions at which the
   * given UI event occurred. When the browser actually knows the physical size of a
   * "screen unit", this attribute will express that information; otherwise, user
   * agents will provide a suitable default value such as .28mm.
   *
   * MDN
   */
  def screenPixelToMillimeterX: Double = js.native

  /**
   * Adjusts the clock for this SVG document fragment, establishing a new current time.
   * If setCurrentTime is called before the document timeline has begun (for example,
   * by script running in a &lt;script&gt; element before the document's SVGLoad event is
   * dispatched), then the value of seconds in the last invocation of the method gives
   * the time that the document will seek to once the document timeline has begun.
   *
   * MDN
   */
  def setCurrentTime(seconds: Double): Unit = js.native

  /**
   * Creates an SVGLength object outside of any document trees. The object is
   * initialized to a value of zero user units.
   *
   * MDN
   */
  def createSVGLength(): SVGLength = js.native

  /**
   * Returns the list of graphics elements whose rendered content intersects the
   * supplied rectangle. Each candidate graphics element is to be considered a match
   * only if the same graphics element can be a target of pointer events as defined in
   * pointer-events processing.
   *
   * MDN
   */
  def getIntersectionList(rect: SVGRect,
      referenceElement: SVGElement): NodeList = js.native

  /**
   * Unsuspends (i.e., unpauses) currently running animations that are defined
   * within the SVG document fragment, causing the animation clock to continue from the
   * time at which it was suspended.
   *
   * MDN
   */
  def unpauseAnimations(): Unit = js.native

  /**
   * Creates an SVGRect object outside of any document trees. The object is initialized
   * such that all values are set to 0 user units.
   *
   * MDN
   */
  def createSVGRect(): SVGRect = js.native

  /**
   * Returns true if the rendered content of the given element intersects the supplied
   * rectangle. Each candidate graphics element is to be considered a match only if the
   * same graphics element can be a target of pointer events as defined in
   * pointer-events processing.
   *
   * MDN
   */
  def checkIntersection(element: SVGElement,
      rect: SVGRect): Boolean = js.native

  /**
   * Cancels all currently active suspendRedraw() method calls. This method is most
   * useful at the very end of a set of SVG DOM calls to ensure that all pending
   * suspendRedraw() method calls have been cancelled.
   *
   * MDN
   */
  def unsuspendRedrawAll(): Unit = js.native

  /**
   * Suspends (i.e., pauses) all currently running animations that are defined within
   * the SVG document fragment corresponding to this &lt;svg&gt; element, causing the
   * animation clock corresponding to this document fragment to stand still until it is
   * unpaused.
   *
   * MDN
   */
  def pauseAnimations(): Unit = js.native

  /**
   * Takes a time-out value which indicates that redraw shall not occur until: the
   * corresponding unsuspendRedraw() call has been made, an unsuspendRedrawAll()
   * call has been made, or its timer has timed out. In environments that do not support
   * interactivity (e.g., print media), then redraw shall not be suspended. Calls to
   * suspendRedraw() and unsuspendRedraw() should, but need not be, made in balanced
   * pairs. To suspend redraw actions as a collection of SVG DOM changes occur, precede
   * the changes to the SVG DOM with a method call similar to: suspendHandleID =
   * suspendRedraw(maxWaitMilliseconds); and follow the changes with a method call
   * similar to: unsuspendRedraw(suspendHandleID); Note that multiple
   * suspendRedraw calls can be used at once and that each such method call is treated
   * independently of the other suspendRedraw method calls.
   *
   * MDN
   */
  def suspendRedraw(maxWaitMilliseconds: Int): Int = js.native

  /**
   * Unselects any selected objects, including any selections of text strings and
   * type-in bars.
   *
   * MDN
   */
  def deselectAll(): Unit = js.native

  /**
   * Creates an SVGAngle object outside of any document trees. The object is
   * initialized to a value of zero degrees (unitless).
   *
   * MDN
   */
  def createSVGAngle(): SVGAngle = js.native

  def getEnclosureList(rect: SVGRect,
      referenceElement: SVGElement): NodeList = js.native

  /**
   * Creates an SVGTransform object outside of any document trees. The object is
   * initialized to an identity matrix transform (SVG_TRANSFORM_MATRIX).
   *
   * MDN
   */
  def createSVGTransform(): SVGTransform = js.native

  /**
   * Cancels a specified suspendRedraw() by providing a unique suspend handle ID that
   * was returned by a previous suspendRedraw() call.
   *
   * MDN
   */
  def unsuspendRedraw(suspendHandleID: Int): Unit = js.native

  /**
   * In rendering environments supporting interactivity, forces the user agent to
   * immediately redraw all regions of the viewport that require updating.
   *
   * MDN
   */
  def forceRedraw(): Unit = js.native

  /**
   * Returns the current time in seconds relative to the start time for the current SVG
   * document fragment. If getCurrentTime is called before the document timeline has
   * begun (for example, by script running in a &lt;script&gt; element before the document's
   * SVGLoad event is dispatched), then 0 is returned.
   *
   * MDN
   */
  def getCurrentTime(): Int = js.native

  /**
   * Returns true if the rendered content of the given element is entirely contained
   * within the supplied rectangle. Each candidate graphics element is to be
   * considered a match only if the same graphics element can be a target of pointer
   * events as defined in pointer-events processing.
   *
   * MDN
   */
  def checkEnclosure(element: SVGElement, rect: SVGRect): Boolean = js.native

  /**
   * Creates an SVGMatrix object outside of any document trees. The object is
   * initialized to the identity matrix.
   *
   * MDN
   */
  def createSVGMatrix(): SVGMatrix = js.native

  /**
   * Creates an SVGPoint object outside of any document trees. The object is
   * initialized to the point (0,0) in the user coordinate system.
   *
   * MDN
   */
  def createSVGPoint(): SVGPoint = js.native

  /**
   * Creates an SVGNumber object outside of any document trees. The object is
   * initialized to a value of zero.
   *
   * MDN
   */
  def createSVGNumber(): SVGNumber = js.native

  /**
   * Creates an SVGTransform object outside of any document trees. The object is
   * initialized to the given matrix transform (i.e., SVG_TRANSFORM_MATRIX). The
   * values from the parameter matrix are copied, the matrix parameter is not adopted as
   * SVGTransform::matrix.
   *
   * MDN
   */
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native

  def getComputedStyle(elt: Element,
      pseudoElt: String = js.native): CSSStyleDeclaration = js.native

  /**
   * Searches this SVG document fragment (i.e., the search is restricted to a subset of
   * the document tree) for an Element whose id is given by elementId. If an Element is
   * found, that Element is returned. If no such element exists, returns null. Behavior
   * is not defined if more than one element has this id.
   *
   * MDN
   */
  def getElementById(elementId: String): Element = js.native
}

/**
 * The SVGAnimatedInteger interface is used for attributes of basic type &lt;integer&gt;
 * which can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedInteger extends js.Object {

  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: Int = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: Int = js.native
}

/**
 * The SVGTextElement interface corresponds to the &lt;text&gt; elements.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGTextElement
    extends SVGTextPositioningElement with SVGTransformable

/**
 * The SVGTSpanElement interface provides access to the properties of &lt;tspan&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGTSpanElement extends SVGTextPositioningElement

@js.native
@JSGlobal
class SVGPathSegLinetoVerticalAbs extends SVGPathSeg {
  var y: Double = js.native
}

/**
 * The SVGStyleElement interface corresponds to the SVG &lt;style&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGStyleElement extends SVGElement with SVGLangSpace {

  /**
   * Corresponds to attribute media on the given element. A DOMException is raised with
   * code NO_MODIFICATION_ALLOWED_ERR on an attempt to change the value of a read only
   * attribute.
   *
   * MDN
   */
  var media: String = js.native

  def `type`: String = js.native

  /**
   * Corresponds to attribute title on the given element. A DOMException is raised with
   * code NO_MODIFICATION_ALLOWED_ERR on an attempt to change the value of a read only
   * attribute.
   *
   * MDN
   */
  var title: String = js.native
}

/**
 * The SVGRadialGradientElement interface corresponds to the &lt;radialgradient&gt;
 * element.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGRadialGradientElement extends SVGGradientElement {

  /**
   * Corresponds to attribute cx on the given &lt;radialgradient&gt; element.
   *
   * MDN
   */
  def cx: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute r on the given &lt;radialgradient&gt; element.
   *
   * MDN
   */
  def r: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute cy on the given &lt;radialgradient&gt; element.
   *
   * MDN
   */
  def cy: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute fx on the given &lt;radialgradient&gt; element.
   *
   * MDN
   */
  def fx: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute fy on the given &lt;radialgradient&gt; element.
   *
   * MDN
   */
  def fy: SVGAnimatedLength = js.native
}

/**
 * The SVGImageElement interface corresponds to the &lt;image&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGImageElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired with SVGURIReference {

  /**
   * Corresponds to attribute y on the given &lt;image&gt; element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute width on the given &lt;image&gt; element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute preserveAspectRatio on the given &lt;image&gt; element.
   *
   * MDN
   */
  def preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native

  /**
   * Corresponds to attribute x on the given &lt;image&gt; element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute height on the given &lt;image&gt; element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = js.native
}

/**
 * The SVGAnimatedNumber interface is used for attributes of basic type &lt;Number&gt;
 * which can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedNumber extends js.Object {

  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: Double = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: Double = js.native
}

@js.native
@JSGlobal
abstract class SVGMetadataElement extends SVGElement

@js.native
@JSGlobal
class SVGPathSegArcRel extends SVGPathSeg {
  var y: Double = js.native
  var sweepFlag: Boolean = js.native
  var r2: Double = js.native
  var x: Double = js.native
  var angle: Double = js.native
  var r1: Double = js.native
  var largeArcFlag: Boolean = js.native
}

@js.native
@JSGlobal
class SVGPathSegMovetoAbs extends SVGPathSeg {
  var y: Double = js.native
  var x: Double = js.native
}

/**
 * The SVGStringList defines a list of DOMString objects.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGStringList extends js.Object {
  def numberOfItems: Int = js.native

  /**
   * Replaces an existing item in the list with a new item. If newItem is already in a list,
   * it is removed from its previous list before it is inserted into this list. The
   * inserted item is the item itself and not a copy. If the item is already in this list,
   * note that the index of the item to replace is before the removal of the item.
   * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
   * when the list corresponds to a read only attribute or when the object itself is read
   * only. a DOMException with code INDEX_SIZE_ERR is raised if the index number is
   * greater than or equal to numberOfItems.
   *
   * MDN
   */
  def replaceItem(newItem: String, index: Int): String = js.native

  /**
   * Returns the specified item from the list. The returned item is the item itself and
   * not a copy. Any changes made to the item are immediately reflected in the list. The
   * first item is number 0. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def getItem(index: Int): String = js.native

  /**
   * Clears all existing current items from the list, with the result being an empty
   * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the list corresponds to a read only attribute or when the object itself
   * is read only.
   *
   * MDN
   */
  def clear(): Unit = js.native

  /**
   * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
   * from its previous list before it is inserted into this list. The inserted item is the
   * item itself and not a copy. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def appendItem(newItem: String): String = js.native

  /**
   * Clears all existing current items from the list and re-initializes the list to hold
   * the single item specified by the parameter. If the inserted item is already in a
   * list, it is removed from its previous list before it is inserted into this list. The
   * inserted item is the item itself and not a copy. The return value is the item inserted
   * into the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def initialize(newItem: String): String = js.native

  /**
   * Removes an existing item from the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only. a DOMException with code
   * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
   * numberOfItems.
   *
   * MDN
   */
  def removeItem(index: Int): String = js.native

  /**
   * Inserts a new item into the list at the specified position. The first item is number
   * 0. If newItem is already in a list, it is removed from its previous list before it is
   * inserted into this list. The inserted item is the item itself and not a copy. If the
   * item is already in this list, note that the index of the item to insert before is
   * before the removal of the item. If the index is equal to 0, then the new item is
   * inserted at the front of the list. If the index is greater than or equal to
   * numberOfItems, then the new item is appended to the end of the list. Exceptions: a
   * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
   * corresponds to a read only attribute or when the object itself is read only.
   *
   * MDN
   */
  def insertItemBefore(newItem: String, index: Int): String = js.native
}

/**
 * The SVGLength interface correspond to the &lt;length&gt; basic data type.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGLength extends js.Object {

  /**
   * The value as a string value, in the units expressed by unitType. Setting this
   * attribute will cause value, valueInSpecifiedUnits and unitType to be updated
   * automatically to reflect this setting. Exceptions on setting: a DOMException
   * with code SYNTAX_ERR is raised if the assigned string cannot be parsed as a valid
   * &lt;length&gt;. a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when
   * the length corresponds to a read only attribute or when the object itself is read
   * only.
   *
   * MDN
   */
  var valueAsString: String = js.native

  /**
   * The value as a floating point value, in the units expressed by unitType. Setting
   * this attribute will cause value and valueAsString to be updated automatically to
   * reflect this setting. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  var valueInSpecifiedUnits: Double = js.native

  /**
   * The value as a floating point value, in user units. Setting this attribute will
   * cause valueInSpecifiedUnits and valueAsString to be updated automatically to
   * reflect this setting. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  var value: Double = js.native

  /**
   * The type of the value as specified by one of the SVG_LENGTHTYPE_* constants defined
   * on this interface.
   *
   * MDN
   */
  def unitType: Int = js.native

  /**
   * Reset the value as a number with an associated unitType, thereby replacing the
   * values for all of the attributes on the object. Exceptions: a DOMException with
   * code NOT_SUPPORTED_ERR is raised if unitType is SVG_LENGTHTYPE_UNKNOWN or not a
   * valid unit type constant (one of the other SVG_LENGTHTYPE_* constants defined on
   * this interface). a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the length corresponds to a read only attribute or when the object
   * itself is read only.
   *
   * MDN
   */
  def newValueSpecifiedUnits(unitType: Int,
      valueInSpecifiedUnits: Double): Unit = js.native

  /**
   * Preserve the same underlying stored value, but reset the stored unit identifier to
   * the given unitType. Object attributes unitType, valueInSpecifiedUnits and
   * valueAsString might be modified as a result of this method. For example, if the
   * original value were "0.5cm" and the method was invoked to convert to millimeters,
   * then the unitType would be changed to SVG_LENGTHTYPE_MM, valueInSpecifiedUnits
   * would be changed to the numeric value 5 and valueAsString would be changed to "5mm".
   *
   * MDN
   */
  def convertToSpecifiedUnits(unitType: Int): Unit = js.native
}

/**
 * The SVGLength interface correspond to the &lt;length&gt; basic data type.
 *
 * MDN
 */
@js.native
@JSGlobal
object SVGLength extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLength),List())))) */
  val SVG_LENGTHTYPE_NUMBER: Int = js.native
  val SVG_LENGTHTYPE_CM: Int = js.native
  val SVG_LENGTHTYPE_PC: Int = js.native
  val SVG_LENGTHTYPE_PERCENTAGE: Int = js.native
  val SVG_LENGTHTYPE_MM: Int = js.native
  val SVG_LENGTHTYPE_PT: Int = js.native
  val SVG_LENGTHTYPE_IN: Int = js.native
  val SVG_LENGTHTYPE_EMS: Int = js.native
  val SVG_LENGTHTYPE_PX: Int = js.native

  /**
   * The unit type is not one of predefined unit types. It is invalid to attempt to define a
   * new value of this type or to attempt to switch an existing value to this type.
   *
   * MDN
   */
  val SVG_LENGTHTYPE_UNKNOWN: Int = js.native
  val SVG_LENGTHTYPE_EXS: Int = js.native
}

/**
 * The SVGPolygonElement interface provides access to the properties of &lt;polygon&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGPolygonElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired

@js.native
@JSGlobal
class SVGPathSegCurvetoCubicRel extends SVGPathSeg {
  var y: Double = js.native
  var y1: Double = js.native
  var x2: Double = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var y2: Double = js.native
}

@js.native
@JSGlobal
abstract class SVGTextContentElement
    extends SVGElement with SVGStylable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired {
  def textLength: SVGAnimatedLength = js.native

  def lengthAdjust: SVGAnimatedEnumeration = js.native

  def getCharNumAtPosition(point: SVGPoint): Int = js.native

  def getStartPositionOfChar(charnum: Int): SVGPoint = js.native

  def getExtentOfChar(charnum: Int): SVGRect = js.native

  def getComputedTextLength(): Int = js.native

  def getSubStringLength(charnum: Int, nchars: Int): Int = js.native

  def selectSubString(charnum: Int, nchars: Int): Unit = js.native

  def getNumberOfChars(): Int = js.native

  def getRotationOfChar(charnum: Int): Int = js.native

  def getEndPositionOfChar(charnum: Int): SVGPoint = js.native
}

@js.native
@JSGlobal
object SVGTextContentElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextContentElement),List())))) */
  val LENGTHADJUST_SPACING: Int = js.native
  val LENGTHADJUST_SPACINGANDGLYPHS: Int = js.native
  val LENGTHADJUST_UNKNOWN: Int = js.native
}

/**
 * SVGTransform is the interface for one of the component transformations within an
 * SVGTransformList; thus, an SVGTransform object corresponds to a single
 * component (e.g., scale(…) or matrix(…)) within a transform attribute.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGTransform extends js.Object {
  def `type`: Int = js.native

  /**
   * A convenience attribute for SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX and
   * SVG_TRANSFORM_SKEWY. It holds the angle that was specified. For
   * SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE and SVG_TRANSFORM_SCALE,
   * angle will be zero.
   *
   * MDN
   */
  def angle: Double = js.native

  /**
   * The matrix that represents this transformation. The matrix object is live,
   * meaning that any changes made to the SVGTransform object are immediately
   * reflected in the matrix object and vice versa. In case the matrix object is changed
   * directly (i.e., without using the methods on the SVGTransform interface itself)
   * then the type of the SVGTransform changes to SVG_TRANSFORM_MATRIX. For
   * SVG_TRANSFORM_MATRIX, the matrix contains the a, b, c, d, e, f values supplied by
   * the user. For SVG_TRANSFORM_TRANSLATE, e and f represent the translation amounts
   * (a=1, b=0, c=0 and d=1). For SVG_TRANSFORM_SCALE, a and d represent the scale
   * amounts (b=0, c=0, e=0 and f=0). For SVG_TRANSFORM_SKEWX and
   * SVG_TRANSFORM_SKEWY, a, b, c and d represent the matrix which will result in the
   * given skew (e=0 and f=0). For SVG_TRANSFORM_ROTATE, a, b, c, d, e and f together
   * represent the matrix which will result in the given rotation. When the rotation is
   * around the center point (0, 0), e and f will be zero.
   *
   * MDN
   */
  def matrix: SVGMatrix = js.native

  /**
   * Sets the transform type to SVG_TRANSFORM_TRANSLATE, with parameters tx and ty
   * defining the translation amounts. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def setTranslate(tx: Double, ty: Double): Unit = js.native

  /**
   * Sets the transform type to SVG_TRANSFORM_SCALE, with parameters sx and sy
   * defining the scale amounts. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def setScale(sx: Double, sy: Double): Unit = js.native

  /**
   * Sets the transform type to SVG_TRANSFORM_MATRIX, with parameter matrix defining
   * the new transformation. Note that the values from the parameter matrix are copied.
   * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
   * when attempting to modify a read only attribute or when the object itself is read
   * only.
   *
   * MDN
   */
  def setMatrix(matrix: SVGMatrix): Unit = js.native

  /**
   * Sets the transform type to SVG_TRANSFORM_SKEWY, with parameter angle defining
   * the amount of skew. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def setSkewY(angle: Double): Unit = js.native

  /**
   * Sets the transform type to SVG_TRANSFORM_ROTATE, with parameter angle defining
   * the rotation angle and parameters cx and cy defining the optional center of
   * rotation. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when attempting to modify a read only attribute or when the object itself is
   * read only.
   *
   * MDN
   */
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native

  /**
   * Sets the transform type to SVG_TRANSFORM_SKEWX, with parameter angle defining
   * the amount of skew. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def setSkewX(angle: Double): Unit = js.native
}

/**
 * SVGTransform is the interface for one of the component transformations within an
 * SVGTransformList; thus, an SVGTransform object corresponds to a single
 * component (e.g., scale(…) or matrix(…)) within a transform attribute.
 *
 * MDN
 */
@js.native
@JSGlobal
object SVGTransform extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTransform),List())))) */
  val SVG_TRANSFORM_SKEWX: Int = js.native

  /**
   * The unit type is not one of predefined unit types. It is invalid to attempt to define a
   * new value of this type or to attempt to switch an existing value to this type.
   *
   * MDN
   */
  val SVG_TRANSFORM_UNKNOWN: Int = js.native
  val SVG_TRANSFORM_SCALE: Int = js.native
  val SVG_TRANSFORM_TRANSLATE: Int = js.native
  val SVG_TRANSFORM_MATRIX: Int = js.native
  val SVG_TRANSFORM_ROTATE: Int = js.native
  val SVG_TRANSFORM_SKEWY: Int = js.native
}

@js.native
trait SVGURIReference extends js.Object {
  var href: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
class SVGPathSeg extends js.Object {
  def pathSegType: Int = js.native

  def pathSegTypeAsLetter: String = js.native
}

@js.native
@JSGlobal
object SVGPathSeg extends js.Object {

  val PATHSEG_MOVETO_REL: Int = js.native
  val PATHSEG_LINETO_VERTICAL_REL: Int = js.native
  val PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: Int = js.native
  val PATHSEG_CURVETO_QUADRATIC_REL: Int = js.native
  val PATHSEG_CURVETO_CUBIC_ABS: Int = js.native
  val PATHSEG_LINETO_HORIZONTAL_ABS: Int = js.native
  val PATHSEG_CURVETO_QUADRATIC_ABS: Int = js.native
  val PATHSEG_LINETO_ABS: Int = js.native
  val PATHSEG_CLOSEPATH: Int = js.native
  val PATHSEG_LINETO_HORIZONTAL_REL: Int = js.native
  val PATHSEG_CURVETO_CUBIC_SMOOTH_REL: Int = js.native
  val PATHSEG_LINETO_REL: Int = js.native
  val PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: Int = js.native
  val PATHSEG_ARC_REL: Int = js.native
  val PATHSEG_CURVETO_CUBIC_REL: Int = js.native
  val PATHSEG_UNKNOWN: Int = js.native
  val PATHSEG_LINETO_VERTICAL_ABS: Int = js.native
  val PATHSEG_ARC_ABS: Int = js.native
  val PATHSEG_MOVETO_ABS: Int = js.native
  val PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: Int = js.native
}

/**
 * The SVGNumber interface correspond to the &lt;number&gt; basic data type.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGNumber extends js.Object {

  /**
   * The value of the given attribute. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is Raised on an attempt to change the value of a read
   * only attribute.
   *
   * MDN
   */
  var value: Double = js.native
}

/**
 * The SVGPathElement interface corresponds to the &lt;path&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGPathElement
    extends SVGElement with SVGStylable with SVGAnimatedPathData
    with SVGTransformable with SVGLangSpace with SVGTests
    with SVGExternalResourcesRequired {

  /**
   * Returns the index into pathSegList which is distance units along the path,
   * utilizing the user agent's distance-along-a-path algorithm.
   *
   * MDN
   */
  def getPathSegAtLength(distance: Double): Int = js.native

  /**
   * Returns the (x,y) coordinate in user space which is distance units along the path,
   * utilizing the browser's distance-along-a-path algorithm.
   *
   * MDN
   */
  def getPointAtLength(distance: Double): SVGPoint = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticAbs object.
   * Parameters: float x The absolute X coordinate for the end point of this path
   * segment. float y The absolute Y coordinate for the end point of this path segment.
   * float x1 The absolute X coordinate for the first control point. float y1 The
   * absolute Y coordinate for the first control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double,
      y1: Double): SVGPathSegCurvetoQuadraticAbs = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoRel object. Parameters:
   * float x The relative X coordinate for the end point of this path segment. float y The
   * relative Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoRel(x: Double,
      y: Double): SVGPathSegLinetoRel = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticRel object.
   * Parameters: float x The relative X coordinate for the end point of this path
   * segment. float y The relative Y coordinate for the end point of this path segment.
   * float x1 The relative X coordinate for the first control point. float y1 The
   * relative Y coordinate for the first control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double,
      y1: Double): SVGPathSegCurvetoQuadraticRel = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoCubicAbs object.
   * Parameters: float x The absolute X coordinate for the end point of this path
   * segment. float y The absolute Y coordinate for the end point of this path segment.
   * float x1 The absolute X coordinate for the first control point. float y1 The
   * absolute Y coordinate for the first control point. float x2 The absolute X
   * coordinate for the second control point. float y2 The absolute Y coordinate for the
   * second control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double,
      y1: Double, x2: Double,
      y2: Double): SVGPathSegCurvetoCubicAbs = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoAbs object. Parameters:
   * float x The absolute X coordinate for the end point of this path segment. float y The
   * absolute Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoAbs(x: Double,
      y: Double): SVGPathSegLinetoAbs = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegClosePath object.
   *
   * MDN
   */
  def createSVGPathSegClosePath(): SVGPathSegClosePath = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoCubicRel object.
   * Parameters: float x The relative X coordinate for the end point of this path
   * segment. float y The relative Y coordinate for the end point of this path segment.
   * float x1 The relative X coordinate for the first control point. float y1 The
   * relative Y coordinate for the first control point. float x2 The relative X
   * coordinate for the second control point. float y2 The relative Y coordinate for the
   * second control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double,
      y1: Double, x2: Double,
      y2: Double): SVGPathSegCurvetoCubicRel = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticSmoothRel
   * object. Parameters: float x The absolute X coordinate for the end point of this path
   * segment. float y The absolute Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double,
      y: Double): SVGPathSegCurvetoQuadraticSmoothRel = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegMovetoRel object. Parameters:
   * float x The relative X coordinate for the end point of this path segment. float y The
   * relative Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegMovetoRel(x: Double,
      y: Double): SVGPathSegMovetoRel = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoCubicSmoothAbs object.
   * Parameters float x The absolute X coordinate for the end point of this path segment.
   * float y The absolute Y coordinate for the end point of this path segment. float x2 The
   * absolute X coordinate for the second control point. float y2 The absolute Y
   * coordinate for the second control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double,
      y2: Double): SVGPathSegCurvetoCubicSmoothAbs = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegMovetoAbs object. Parameters:
   * float x The absolute X coordinate for the end point of this path segment. float y The
   * absolute Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegMovetoAbs(x: Double,
      y: Double): SVGPathSegMovetoAbs = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoVerticalRel object.
   * Parameters: float y The relative Y coordinate for the end point of this path
   * segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoVerticalRel(
      y: Double): SVGPathSegLinetoVerticalRel = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegArcRel object. Parameters: float x
   * The relative X coordinate for the end point of this path segment. float y The
   * relative Y coordinate for the end point of this path segment. float r1 The x-axis
   * radius for the ellipse. float r2 The y-axis radius for the ellipse. float angle The
   * rotation angle in degrees for the ellipse's x-axis relative to the x-axis of the
   * user coordinate system. boolean largeArcFlag The value of the large-arc-flag
   * parameter. boolean sweepFlag The value of the large-arc-flag parameter.
   *
   * MDN
   */
  def createSVGPathSegArcRel(x: Double, y: Double, r1: Double, r2: Double,
      angle: Double, largeArcFlag: Boolean,
      sweepFlag: Boolean): SVGPathSegArcRel = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticSmoothAbs
   * object. Parameters: float x The absolute X coordinate for the end point of this path
   * segment. float y The absolute Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double,
      y: Double): SVGPathSegCurvetoQuadraticSmoothAbs = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoHorizontalRel object.
   * Parameters: float x The relative X coordinate for the end point of this path
   * segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoHorizontalRel(
      x: Double): SVGPathSegLinetoHorizontalRel = js.native

  def getTotalLength(): Double = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoCubicSmoothRel object.
   * Parameters float x The absolute X coordinate for the end point of this path segment.
   * float y The absolute Y coordinate for the end point of this path segment. float x2 The
   * absolute X coordinate for the second control point. float y2 The absolute Y
   * coordinate for the second control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double,
      y2: Double): SVGPathSegCurvetoCubicSmoothRel = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoHorizontalAbs object.
   * Parameters: float x The absolute X coordinate for the end point of this path
   * segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoHorizontalAbs(
      x: Double): SVGPathSegLinetoHorizontalAbs = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoVerticalAbs object.
   * Parameters: float y The absolute Y coordinate for the end point of this path
   * segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoVerticalAbs(
      y: Double): SVGPathSegLinetoVerticalAbs = js.native

  /**
   * Returns a stand-alone, parentless SVGPathSegArcAbs object. Parameters: float x
   * The absolute X coordinate for the end point of this path segment. float y The
   * absolute Y coordinate for the end point of this path segment. float r1 The x-axis
   * radius for the ellipse. float r2 The y-axis radius for the ellipse. float angle The
   * rotation angle in degrees for the ellipse's x-axis relative to the x-axis of the
   * user coordinate system. boolean largeArcFlag The value of the large-arc-flag
   * parameter. boolean sweepFlag The value of the large-arc-flag parameter.
   *
   * MDN
   */
  def createSVGPathSegArcAbs(x: Double, y: Double, r1: Double, r2: Double,
      angle: Double, largeArcFlag: Boolean,
      sweepFlag: Boolean): SVGPathSegArcAbs = js.native
}

/**
 * The SVGAnimatedRect interface is used for attributes of basic SVGRect which can be
 * animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedRect extends js.Object {

  /**
   * A read only SVGRect representing the current animated value of the given
   * attribute. If the given attribute is not currently being animated, then the
   * SVGRect will have the same contents as baseVal. The object referenced by animVal
   * will always be distinct from the one referenced by baseVal, even when the attribute
   * is not animated.
   *
   * MDN
   */
  def animVal: SVGRect = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  def baseVal: SVGRect = js.native
}

@js.native
@JSGlobal
class SVGPathSegList extends js.Object {
  def numberOfItems: Int = js.native

  def replaceItem(newItem: SVGPathSeg, index: Int): SVGPathSeg = js.native

  def getItem(index: Int): SVGPathSeg = js.native

  def clear(): Unit = js.native

  def appendItem(newItem: SVGPathSeg): SVGPathSeg = js.native

  def initialize(newItem: SVGPathSeg): SVGPathSeg = js.native

  def removeItem(index: Int): SVGPathSeg = js.native

  def insertItemBefore(newItem: SVGPathSeg, index: Int): SVGPathSeg = js.native
}

@js.native
@JSGlobal
class SVGElementInstance extends EventTarget {
  def previousSibling: SVGElementInstance = js.native

  def parentNode: SVGElementInstance = js.native

  def lastChild: SVGElementInstance = js.native

  def nextSibling: SVGElementInstance = js.native

  def childNodes: SVGElementInstanceList = js.native

  def correspondingUseElement: SVGUseElement = js.native

  def correspondingElement: SVGElement = js.native

  def firstChild: SVGElementInstance = js.native
}

/**
 * The SVGCircleElement interface provides access to the properties of &lt;circle&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGCircleElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute cx on the given &lt;circle&gt; element.
   *
   * MDN
   */
  def cx: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute r on the given &lt;circle&gt; element.
   *
   * MDN
   */
  def r: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute cy on the given &lt;circle&gt; element.
   *
   * MDN
   */
  def cy: SVGAnimatedLength = js.native
}

/**
 * The SVGRect represents rectangular geometry. Rectangles are defined as
 * consisting of a (x,y) coordinate pair identifying a minimum X value, a minimum Y
 * value, and a width and height, which are usually constrained to be non-negative.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGRect extends js.Object {

  /**
   * The y coordinate of the rectangle, in user units.
   *
   * MDN
   */
  var y: Double = js.native

  /**
   * The width coordinate of the rectangle, in user units.
   *
   * MDN
   */
  var width: Double = js.native

  /**
   * The x coordinate of the rectangle, in user units.
   *
   * MDN
   */
  var x: Double = js.native

  /**
   * The height coordinate of the rectangle, in user units.
   *
   * MDN
   */
  var height: Double = js.native
}

@js.native
@JSGlobal
class SVGPathSegCurvetoCubicAbs extends SVGPathSeg {
  var y: Double = js.native
  var y1: Double = js.native
  var x2: Double = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var y2: Double = js.native
}

@js.native
@JSGlobal
class SVGPathSegCurvetoQuadraticAbs extends SVGPathSeg {
  var y: Double = js.native
  var y1: Double = js.native
  var x: Double = js.native
  var x1: Double = js.native
}

@js.native
@JSGlobal
class SVGPathSegLinetoAbs extends SVGPathSeg {
  var y: Double = js.native
  var x: Double = js.native
}

/**
 * Many of SVG's graphics operations utilize 2x3 matrices of the form:
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGMatrix extends js.Object {
  var e: Double = js.native
  var c: Double = js.native
  var a: Double = js.native
  var b: Double = js.native
  var d: Double = js.native
  var f: Double = js.native

  /**
   * Performs matrix multiplication. This matrix is post-multiplied by another
   * matrix, returning the resulting new matrix.
   *
   * MDN
   */
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = js.native

  /**
   * Post-multiplies the transformation [1 0 0 -1 0 0] and returns the resulting
   * matrix.
   *
   * MDN
   */
  def flipY(): SVGMatrix = js.native

  /**
   * Post-multiplies a skewY transformation on the current matrix and returns the
   * resulting matrix.
   *
   * MDN
   */
  def skewY(angle: Double): SVGMatrix = js.native

  /**
   * Return the inverse matrix Exceptions: a DOMException with code
   * SVG_MATRIX_NOT_INVERTABLE is raised if the matrix is not invertable.
   *
   * MDN
   */
  def inverse(): SVGMatrix = js.native

  /**
   * Post-multiplies a non-uniform scale transformation on the current matrix and
   * returns the resulting matrix.
   *
   * MDN
   */
  def scaleNonUniform(scaleFactorX: Double,
      scaleFactorY: Double): SVGMatrix = js.native

  /**
   * Post-multiplies a rotation transformation on the current matrix and returns the
   * resulting matrix.
   *
   * MDN
   */
  def rotate(angle: Double): SVGMatrix = js.native

  /**
   * Post-multiplies the transformation [-1 0 0 1 0 0] and returns the resulting
   * matrix.
   *
   * MDN
   */
  def flipX(): SVGMatrix = js.native

  /**
   * Post-multiplies a translation transformation on the current matrix and returns
   * the resulting matrix.
   *
   * MDN
   */
  def translate(x: Double, y: Double): SVGMatrix = js.native

  /**
   * Post-multiplies a uniform scale transformation on the current matrix and returns
   * the resulting matrix.
   *
   * MDN
   */
  def scale(scaleFactor: Double): SVGMatrix = js.native

  /**
   * Post-multiplies a rotation transformation on the current matrix and returns the
   * resulting matrix. The rotation angle is determined by taking (+/-) atan(y/x). The
   * direction of the vector (x, y) determines whether the positive or negative angle
   * value is used. Exceptions: a DOMException with code SVG_INVALID_VALUE_ERR is
   * raised if one of the parameters has an invalid value.
   *
   * MDN
   */
  def rotateFromVector(x: Double, y: Double): SVGMatrix = js.native

  /**
   * Post-multiplies a skewX transformation on the current matrix and returns the
   * resulting matrix.
   *
   * MDN
   */
  def skewX(angle: Double): SVGMatrix = js.native
}

/**
 * The SVGUseElement interface provides access to the properties of &lt;use&gt; elements,
 * as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGUseElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired with SVGURIReference {

  /**
   * Corresponds to attribute y on the given &lt;use&gt; element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute width on the given &lt;use&gt; element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = js.native

  /**
   * If the xlink:href attribute is being animated, contains the current animated root
   * of the instance tree. If the xlink:href attribute is not currently being animated,
   * contains the same value as instanceRoot. See description of SVGElementInstance
   * to learn more about the instance tree.
   *
   * MDN
   */
  def animatedInstanceRoot: SVGElementInstance = js.native

  /**
   * The root of the instance tree. See description of SVGElementInstance to learn more
   * about the instance tree.
   *
   * MDN
   */
  def instanceRoot: SVGElementInstance = js.native

  /**
   * Corresponds to attribute x on the given &lt;use&gt; element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute height on the given &lt;use&gt; element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = js.native
}

@js.native
trait SVGException extends js.Object {
  def code: Int = js.native

  def message: String = js.native

  def name: String = js.native
}

@js.native
@JSGlobal
object SVGException extends js.Object {
  val SVG_MATRIX_NOT_INVERTABLE: Int = js.native
  val SVG_WRONG_TYPE_ERR: Int = js.native
  val SVG_INVALID_VALUE_ERR: Int = js.native
}

/**
 * The SVGLinearGradientElement interface corresponds to the &lt;lineargradient&gt;
 * element.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGLinearGradientElement extends SVGGradientElement {

  /**
   * Corresponds to attribute y1 on the given &lt;lineargradient&gt; element.
   *
   * MDN
   */
  def y1: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute x2 on the given &lt;lineargradient&gt; element.
   *
   * MDN
   */
  def x2: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute x1 on the given &lt;lineargradient&gt; element.
   *
   * MDN
   */
  def x1: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute y2 on the given &lt;lineargradient&gt; element.
   *
   * MDN
   */
  def y2: SVGAnimatedLength = js.native
}

/**
 * The SVGAnimatedEnumeration interface is used for attributes whose value must be a
 * constant from a particular enumeration and which can be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedEnumeration extends js.Object {

  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: Int = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: Int = js.native
}

/**
 * The SVGRectElement interface provides access to the properties of &lt;rect&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGRectElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute y on the given &lt;rect&gt; element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute width on the given &lt;rect&gt; element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute ry on the given &lt;rect&gt; element.
   *
   * MDN
   */
  def ry: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute rx on the given &lt;rect&gt; element.
   *
   * MDN
   */
  def rx: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute x on the given &lt;rect&gt; element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute height on the given &lt;rect&gt; element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = js.native
}

@js.native
@JSGlobal
class SVGPathSegCurvetoQuadraticSmoothAbs extends SVGPathSeg {
  var y: Double = js.native
  var x: Double = js.native
}

@js.native
@JSGlobal
class SVGPathSegCurvetoCubicSmoothRel extends SVGPathSeg {
  var y: Double = js.native
  var x2: Double = js.native
  var x: Double = js.native
  var y2: Double = js.native
}

/**
 * The SVGLengthList defines a list of SVGLength objects.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGLengthList extends js.Object {
  def numberOfItems: Int = js.native

  /**
   * Replaces an existing item in the list with a new item. If newItem is already in a list,
   * it is removed from its previous list before it is inserted into this list. The
   * inserted item is the item itself and not a copy. If the item is already in this list,
   * note that the index of the item to replace is before the removal of the item.
   * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
   * when the list corresponds to a read only attribute or when the object itself is read
   * only. a DOMException with code INDEX_SIZE_ERR is raised if the index number is
   * greater than or equal to numberOfItems.
   *
   * MDN
   */
  def replaceItem(newItem: SVGLength, index: Int): SVGLength = js.native

  /**
   * Returns the specified item from the list. The returned item is the item itself and
   * not a copy. Any changes made to the item are immediately reflected in the list. The
   * first item is number 0. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def getItem(index: Int): SVGLength = js.native

  /**
   * Clears all existing current items from the list, with the result being an empty
   * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the list corresponds to a read only attribute or when the object itself
   * is read only.
   *
   * MDN
   */
  def clear(): Unit = js.native

  /**
   * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
   * from its previous list before it is inserted into this list. The inserted item is the
   * item itself and not a copy. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def appendItem(newItem: SVGLength): SVGLength = js.native

  /**
   * Clears all existing current items from the list and re-initializes the list to hold
   * the single item specified by the parameter. If the inserted item is already in a
   * list, it is removed from its previous list before it is inserted into this list. The
   * inserted item is the item itself and not a copy. The return value is the item inserted
   * into the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def initialize(newItem: SVGLength): SVGLength = js.native

  /**
   * Removes an existing item from the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only. a DOMException with code
   * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
   * numberOfItems.
   *
   * MDN
   */
  def removeItem(index: Int): SVGLength = js.native

  /**
   * Inserts a new item into the list at the specified position. The first item is number
   * 0. If newItem is already in a list, it is removed from its previous list before it is
   * inserted into this list. The inserted item is the item itself and not a copy. If the
   * item is already in this list, note that the index of the item to insert before is
   * before the removal of the item. If the index is equal to 0, then the new item is
   * inserted at the front of the list. If the index is greater than or equal to
   * numberOfItems, then the new item is appended to the end of the list. Exceptions: a
   * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
   * corresponds to a read only attribute or when the object itself is read only.
   *
   * MDN
   */
  def insertItemBefore(newItem: SVGLength, index: Int): SVGLength = js.native
}

/**
 * The SVGPolylineElement interface provides access to the properties of
 * &lt;polyline&gt; elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGPolylineElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired

@js.native
trait SVGAnimatedPathData extends js.Object {
  var pathSegList: SVGPathSegList = js.native
}

@js.native
trait SVGZoomAndPan extends js.Object {
  var zoomAndPan: Int = js.native
}

@js.native
@JSGlobal
object SVGZoomAndPan extends js.Object {
  val SVG_ZOOMANDPAN_MAGNIFY: Int = js.native
  val SVG_ZOOMANDPAN_UNKNOWN: Int = js.native
  val SVG_ZOOMANDPAN_DISABLE: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGTextPathElement
    extends SVGTextContentElement with SVGURIReference {
  def startOffset: SVGAnimatedLength = js.native

  def method: SVGAnimatedEnumeration = js.native

  def spacing: SVGAnimatedEnumeration = js.native
}

@js.native
@JSGlobal
object SVGTextPathElement extends js.Object {

  val TEXTPATH_SPACINGTYPE_EXACT: Int = js.native
  val TEXTPATH_METHODTYPE_STRETCH: Int = js.native
  val TEXTPATH_SPACINGTYPE_AUTO: Int = js.native
  val TEXTPATH_SPACINGTYPE_UNKNOWN: Int = js.native
  val TEXTPATH_METHODTYPE_UNKNOWN: Int = js.native
  val TEXTPATH_METHODTYPE_ALIGN: Int = js.native
}

/**
 * The SVGGradient interface is a base interface used by SVGLinearGradientElement
 * and SVGRadialGradientElement.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGGradientElement
    extends SVGElement with SVGUnitTypes with SVGStylable
    with SVGExternalResourcesRequired with SVGURIReference {

  /**
   * Corresponds to attribute spreadMethod on the given element. One of the Spread
   * Method Types defined on this interface.
   *
   * MDN
   */
  def spreadMethod: SVGAnimatedEnumeration = js.native

  /**
   * Corresponds to attribute gradientTransform on the given element.
   *
   * MDN
   */
  def gradientTransform: SVGAnimatedTransformList = js.native

  /**
   * Corresponds to attribute gradientUnits on the given element. Takes one of the
   * constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def gradientUnits: SVGAnimatedEnumeration = js.native
}

/**
 * The SVGGradient interface is a base interface used by SVGLinearGradientElement
 * and SVGRadialGradientElement.
 *
 * MDN
 */
@js.native
@JSGlobal
object SVGGradientElement extends js.Object {
  val SVG_SPREADMETHOD_REFLECT: Int = js.native
  val SVG_SPREADMETHOD_PAD: Int = js.native

  /**
   * The type is not one of predefined types. It is invalid to attempt to define a new value
   * of this type or to attempt to switch an existing value to this type.
   *
   * MDN
   */
  val SVG_SPREADMETHOD_UNKNOWN: Int = js.native
  val SVG_SPREADMETHOD_REPEAT: Int = js.native
}

/**
 * The SVGNumberList defines a list of SVGNumber objects.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGNumberList extends js.Object {
  def numberOfItems: Int = js.native

  /**
   * Replaces an existing item in the list with a new item. If newItem is already in a list,
   * it is removed from its previous list before it is inserted into this list. The
   * inserted item is the item itself and not a copy. If the item is already in this list,
   * note that the index of the item to replace is before the removal of the item.
   * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
   * when the list corresponds to a read only attribute or when the object itself is read
   * only. a DOMException with code INDEX_SIZE_ERR is raised if the index number is
   * greater than or equal to numberOfItems.
   *
   * MDN
   */
  def replaceItem(newItem: SVGNumber, index: Int): SVGNumber = js.native

  /**
   * Returns the specified item from the list. The returned item is the item itself and
   * not a copy. Any changes made to the item are immediately reflected in the list. The
   * first item is number 0. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def getItem(index: Int): SVGNumber = js.native

  /**
   * Clears all existing current items from the list, with the result being an empty
   * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the list corresponds to a read only attribute or when the object itself
   * is read only.
   *
   * MDN
   */
  def clear(): Unit = js.native

  /**
   * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
   * from its previous list before it is inserted into this list. The inserted item is the
   * item itself and not a copy. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def appendItem(newItem: SVGNumber): SVGNumber = js.native

  /**
   * Clears all existing current items from the list and re-initializes the list to hold
   * the single item specified by the parameter. If the inserted item is already in a
   * list, it is removed from its previous list before it is inserted into this list. The
   * inserted item is the item itself and not a copy. The return value is the item inserted
   * into the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def initialize(newItem: SVGNumber): SVGNumber = js.native

  /**
   * Removes an existing item from the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only. a DOMException with code
   * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
   * numberOfItems.
   *
   * MDN
   */
  def removeItem(index: Int): SVGNumber = js.native

  /**
   * Inserts a new item into the list at the specified position. The first item is number
   * 0. If newItem is already in a list, it is removed from its previous list before it is
   * inserted into this list. The inserted item is the item itself and not a copy. If the
   * item is already in this list, note that the index of the item to insert before is
   * before the removal of the item. If the index is equal to 0, then the new item is
   * inserted at the front of the list. If the index is greater than or equal to
   * numberOfItems, then the new item is appended to the end of the list. Exceptions: a
   * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
   * corresponds to a read only attribute or when the object itself is read only.
   *
   * MDN
   */
  def insertItemBefore(newItem: SVGNumber, index: Int): SVGNumber = js.native
}

@js.native
@JSGlobal
class SVGPathSegLinetoRel extends SVGPathSeg {
  var y: Double = js.native
  var x: Double = js.native
}

/**
 * The SVGAnimatedBoolean interface is used for attributes of type boolean which can
 * be animated.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGAnimatedBoolean extends js.Object {

  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: Boolean = js.native

  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: Boolean = js.native
}

/**
 * The SVGSwitchElement interface corresponds to the &lt;switch&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGSwitchElement
    extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired

/**
 * The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio
 * attribute, which is available for some of SVG's elements.
 *
 * MDN
 */
@js.native
@JSGlobal
class SVGPreserveAspectRatio extends js.Object {

  /**
   * The type of the alignment value as specified by one of the
   * SVG_PRESERVEASPECTRATIO_* constants defined on this interface.
   *
   * MDN
   */
  var align: Int = js.native

  /**
   * The type of the meet-or-slice value as specified by one of the SVG_MEETORSLICE_*
   * constants defined on this interface.
   *
   * MDN
   */
  var meetOrSlice: Int = js.native
}

/**
 * The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio
 * attribute, which is available for some of SVG's elements.
 *
 * MDN
 */
@js.native
@JSGlobal
object SVGPreserveAspectRatio extends js.Object {

  val SVG_PRESERVEASPECTRATIO_NONE: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMID: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMAX: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Int = js.native

  /**
   * The enumeration was set to a value that is not one of predefined types. It is invalid
   * to attempt to define a new value of this type or to attempt to switch an existing value
   * to this type.
   *
   * MDN
   */
  val SVG_MEETORSLICE_UNKNOWN: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMID: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMIN: Int = js.native
  /*
   * Corresponds to value meet for attribute preserveAspectRatio.
   *
   * MDN
   */
  val SVG_MEETORSLICE_MEET: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMID: Int = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Int = js.native

  /**
   * Corresponds to value slice for attribute preserveAspectRatio.
   *
   * MDN
   */
  val SVG_MEETORSLICE_SLICE: Int = js.native
  val SVG_PRESERVEASPECTRATIO_UNKNOWN: Int = js.native
}

/**
 * The SVGStopElement interface corresponds to the &lt;stop&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGStopElement extends SVGElement with SVGStylable {

  /**
   * Corresponds to attribute offset on the given &lt;stop&gt; element.
   *
   * MDN
   */
  var offset: SVGAnimatedNumber = js.native
}

/**
 * The SVGSymbolElement interface corresponds to the &lt;symbol&gt; element.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGSymbolElement
    extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox
    with SVGExternalResourcesRequired

@js.native
@JSGlobal
class SVGElementInstanceList extends js.Object {
  def length: Int = js.native

  def item(index: Int): SVGElementInstance = js.native
}

/**
 * The SVGMaskElement interface provides access to the properties of &lt;mask&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGMaskElement
    extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace
    with SVGTests with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute y on the given &lt;mask&gt; element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute width on the given &lt;mask&gt; element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute maskUnits on the given &lt;mask&gt; element. Takes one of the
   * constants defined in SVGUnitTypes
   *
   * MDN
   */
  def maskUnits: SVGAnimatedEnumeration = js.native

  /**
   * Corresponds to attribute maskContentUnits on the given &lt;mask&gt; element. Takes one
   * of the constants defined in SVGUnitTypes
   *
   * MDN
   */
  def maskContentUnits: SVGAnimatedEnumeration = js.native

  /**
   * Corresponds to attribute x on the given &lt;mask&gt; element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute height on the given &lt;mask&gt; element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = js.native
}

/**
 * The SVGFilterElement interface provides access to the properties of &lt;filter&gt;
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
@js.native
@JSGlobal
abstract class SVGFilterElement
    extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace
    with SVGURIReference with SVGExternalResourcesRequired {

  /**
   * Corresponds to attribute y on the given &lt;filter&gt; element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute width on the given &lt;filter&gt; element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = js.native

  /**
   * Contains the X component of attribute filterRes on the given &lt;filter&gt; element.
   *
   * MDN
   */
  def filterResX: SVGAnimatedInteger = js.native

  /**
   * Corresponds to attribute filterUnits on the given &lt;filter&gt; element. Takes one of
   * the constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def filterUnits: SVGAnimatedEnumeration = js.native

  /**
   * Corresponds to attribute primitiveUnits on the given &lt;filter&gt; element. Takes one
   * of the constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def primitiveUnits: SVGAnimatedEnumeration = js.native

  /**
   * Corresponds to attribute x on the given &lt;filter&gt; element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = js.native

  /**
   * Corresponds to attribute height on the given &lt;filter&gt; element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = js.native

  /**
   * Contains the Y component of attribute filterRes on the given &lt;filter&gt; element.
   *
   * MDN
   */
  def filterResY: SVGAnimatedInteger = js.native

  /**
   * Sets the values for attribute filterRes.
   *
   * MDN
   */
  def setFilterRes(filterResX: Double, filterResY: Double): Unit = js.native
}

@js.native
@JSGlobal
abstract class SVGFEMergeNodeElement extends SVGElement {
  def in1: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
abstract class SVGFEFloodElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes

@js.native
@JSGlobal
abstract class SVGFEFuncAElement extends SVGComponentTransferFunctionElement

@js.native
@JSGlobal
abstract class SVGFETileElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in1: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
abstract class SVGFEBlendElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in2: SVGAnimatedString = js.native

  def mode: SVGAnimatedEnumeration = js.native

  def in1: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
object SVGFEBlendElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEBlendElement),List())))) */
  val SVG_FEBLEND_MODE_DARKEN: Int = js.native
  val SVG_FEBLEND_MODE_UNKNOWN: Int = js.native
  val SVG_FEBLEND_MODE_MULTIPLY: Int = js.native
  val SVG_FEBLEND_MODE_NORMAL: Int = js.native
  val SVG_FEBLEND_MODE_SCREEN: Int = js.native
  val SVG_FEBLEND_MODE_LIGHTEN: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGFEMergeElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes

@js.native
@JSGlobal
abstract class SVGFEPointLightElement extends SVGElement {
  def y: SVGAnimatedNumber = js.native

  def x: SVGAnimatedNumber = js.native

  def z: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
abstract class SVGFEGaussianBlurElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def stdDeviationX: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native

  def stdDeviationY: SVGAnimatedNumber = js.native

  def setStdDeviation(stdDeviationX: Double,
      stdDeviationY: Double): Unit = js.native
}

@js.native
trait SVGFilterPrimitiveStandardAttributes extends SVGStylable {
  def y: SVGAnimatedLength = js.native

  def width: SVGAnimatedLength = js.native

  def x: SVGAnimatedLength = js.native

  def height: SVGAnimatedLength = js.native

  def result: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
abstract class SVGFESpecularLightingElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def kernelUnitLengthY: SVGAnimatedNumber = js.native

  def surfaceScale: SVGAnimatedNumber = js.native

  def specularExponent: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native

  def kernelUnitLengthX: SVGAnimatedNumber = js.native

  def specularConstant: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
abstract class SVGFEMorphologyElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def operator: SVGAnimatedEnumeration = js.native

  def radiusX: SVGAnimatedNumber = js.native

  def radiusY: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
object SVGFEMorphologyElement extends js.Object {
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Int = js.native
  val SVG_MORPHOLOGY_OPERATOR_ERODE: Int = js.native
  val SVG_MORPHOLOGY_OPERATOR_DILATE: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGFEFuncRElement extends SVGComponentTransferFunctionElement

@js.native
@JSGlobal
abstract class SVGFEDisplacementMapElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in2: SVGAnimatedString = js.native

  def xChannelSelector: SVGAnimatedEnumeration = js.native

  def yChannelSelector: SVGAnimatedEnumeration = js.native

  def scale: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
object SVGFEDisplacementMapElement extends js.Object {
  val SVG_CHANNEL_B: Int = js.native
  val SVG_CHANNEL_R: Int = js.native
  val SVG_CHANNEL_G: Int = js.native
  val SVG_CHANNEL_UNKNOWN: Int = js.native
  val SVG_CHANNEL_A: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGComponentTransferFunctionElement extends SVGElement {
  def tableValues: SVGAnimatedNumberList = js.native

  def slope: SVGAnimatedNumber = js.native

  def `type`: SVGAnimatedEnumeration = js.native

  def exponent: SVGAnimatedNumber = js.native

  def amplitude: SVGAnimatedNumber = js.native

  def intercept: SVGAnimatedNumber = js.native

  def offset: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
object SVGComponentTransferFunctionElement extends js.Object {
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Int = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGFEDistantLightElement extends SVGElement {
  def azimuth: SVGAnimatedNumber = js.native

  def elevation: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
abstract class SVGFEFuncBElement extends SVGComponentTransferFunctionElement

@js.native
@JSGlobal
abstract class SVGFETurbulenceElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def baseFrequencyX: SVGAnimatedNumber = js.native

  def numOctaves: SVGAnimatedInteger = js.native

  def `type`: SVGAnimatedEnumeration = js.native

  def baseFrequencyY: SVGAnimatedNumber = js.native

  def stitchTiles: SVGAnimatedEnumeration = js.native

  def seed: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
object SVGFETurbulenceElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFETurbulenceElement),List())))) */
  val SVG_STITCHTYPE_UNKNOWN: Int = js.native
  val SVG_STITCHTYPE_NOSTITCH: Int = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Int = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Int = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Int = js.native
  val SVG_STITCHTYPE_STITCH: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGFEFuncGElement extends SVGComponentTransferFunctionElement

@js.native
@JSGlobal
abstract class SVGFEColorMatrixElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in1: SVGAnimatedString = js.native

  def `type`: SVGAnimatedEnumeration = js.native

  def values: SVGAnimatedNumberList = js.native
}

@js.native
@JSGlobal
object SVGFEColorMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEColorMatrixElement),List())))) */
  val SVG_FECOLORMATRIX_TYPE_SATURATE: Int = js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Int = js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: Int = js.native
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Int = js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGFESpotLightElement extends SVGElement {
  def pointsAtY: SVGAnimatedNumber = js.native

  def y: SVGAnimatedNumber = js.native

  def limitingConeAngle: SVGAnimatedNumber = js.native

  def specularExponent: SVGAnimatedNumber = js.native

  def x: SVGAnimatedNumber = js.native

  def pointsAtZ: SVGAnimatedNumber = js.native

  def z: SVGAnimatedNumber = js.native

  def pointsAtX: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
abstract class SVGFEOffsetElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def dy: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native

  def dx: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
abstract class SVGFEImageElement
    extends SVGElement with SVGLangSpace
    with SVGFilterPrimitiveStandardAttributes with SVGURIReference
    with SVGExternalResourcesRequired {
  def preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
}

@js.native
@JSGlobal
abstract class SVGFECompositeElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def operator: SVGAnimatedEnumeration = js.native

  def in2: SVGAnimatedString = js.native

  def k2: SVGAnimatedNumber = js.native

  def k1: SVGAnimatedNumber = js.native

  def k3: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native

  def k4: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
object SVGFECompositeElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFECompositeElement),List())))) */
  val SVG_FECOMPOSITE_OPERATOR_OUT: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_OVER: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_XOR: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_IN: Int = js.native
  val SVG_FECOMPOSITE_OPERATOR_ATOP: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGFEComponentTransferElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in1: SVGAnimatedString = js.native
}

@js.native
@JSGlobal
abstract class SVGFEDiffuseLightingElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def kernelUnitLengthY: SVGAnimatedNumber = js.native

  def surfaceScale: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native

  def kernelUnitLengthX: SVGAnimatedNumber = js.native

  def diffuseConstant: SVGAnimatedNumber = js.native
}

@js.native
@JSGlobal
object SVGFEConvolveMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEConvolveMatrixElement),List())))) */
  val SVG_EDGEMODE_WRAP: Int = js.native
  val SVG_EDGEMODE_DUPLICATE: Int = js.native
  val SVG_EDGEMODE_UNKNOWN: Int = js.native
  val SVG_EDGEMODE_NONE: Int = js.native
}

@js.native
@JSGlobal
abstract class SVGFEConvolveMatrixElement
    extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def orderY: SVGAnimatedInteger = js.native

  def kernelUnitLengthY: SVGAnimatedNumber = js.native

  def orderX: SVGAnimatedInteger = js.native

  def preserveAlpha: SVGAnimatedBoolean = js.native

  def kernelMatrix: SVGAnimatedNumberList = js.native

  def edgeMode: SVGAnimatedEnumeration = js.native

  def kernelUnitLengthX: SVGAnimatedNumber = js.native

  def bias: SVGAnimatedNumber = js.native

  def targetX: SVGAnimatedInteger = js.native

  def targetY: SVGAnimatedInteger = js.native

  def divisor: SVGAnimatedNumber = js.native

  def in1: SVGAnimatedString = js.native
}
