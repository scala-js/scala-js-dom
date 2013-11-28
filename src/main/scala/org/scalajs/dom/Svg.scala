/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */

package org.scalajs.dom

import scala.scalajs.js

trait GetSVGDocument extends js.Object {
  def getSVGDocument(): Document = ???
}

class SVGPathSegCurvetoQuadraticRel extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
}

/**
 * The marker element defines the graphics that is to be used for drawing
 * arrowheads or polymarkers on a given <path> , <line> , <polyline> or
 * <polygon> element.
 *
 * MDN
 */
class SVGMarkerElement extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
  var orientType: SVGAnimatedEnumeration = _
  var markerUnits: SVGAnimatedEnumeration = _
  def markerWidth: SVGAnimatedLength = _
  def markerHeight: SVGAnimatedLength = _
  def orientAngle: SVGAnimatedAngle = _
  def refY: SVGAnimatedLength = _
  def refX: SVGAnimatedLength = _

  def setOrientToAngle(angle: SVGAngle): Unit = ???

  def setOrientToAuto(): Unit = ???
}

object SVGMarkerElement extends js.Object {
  val SVG_MARKER_ORIENT_UNKNOWN: js.Number = _
  val SVG_MARKER_ORIENT_ANGLE: js.Number = _
  val SVG_MARKERUNITS_UNKNOWN: js.Number = _
  val SVG_MARKERUNITS_STROKEWIDTH: js.Number = _
  val SVG_MARKER_ORIENT_AUTO: js.Number = _
  val SVG_MARKERUNITS_USERSPACEONUSE: js.Number = _
}

/**
 * The SVGGElement interface corresponds to the <g> element.
 *
 * MDN
 */
class SVGGElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


class SVGPathSegCurvetoCubicSmoothAbs extends SVGPathSeg {
  var y: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var y2: js.Number = _
}


class SVGZoomEvent extends UIEvent {
  def zoomRectScreen: SVGRect = _
  def previousScale: js.Number = _
  def newScale: js.Number = _
  def previousTranslate: SVGPoint = _
  def newTranslate: SVGPoint = _
}


trait SVGUnitTypes extends js.Object {
  val SVG_UNIT_TYPE_UNKNOWN: js.Number = _
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: js.Number = _
  val SVG_UNIT_TYPE_USERSPACEONUSE: js.Number = _
}

object SVGUnitTypes extends js.Object {
  val SVG_UNIT_TYPE_UNKNOWN: js.Number = _
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: js.Number = _
  val SVG_UNIT_TYPE_USERSPACEONUSE: js.Number = _
}

class SVGPathSegMovetoRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
 * The SVGLineElement interface provides access to the properties of <line>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGLineElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute y1 on the given <line> element.
   *
   * MDN
   */
  def y1: SVGAnimatedLength = _
  /**
   * Corresponds to attribute x2 on the given <line> element.
   *
   * MDN
   */
  def x2: SVGAnimatedLength = _
  /**
   * Corresponds to attribute x1 on the given <line> element.
   *
   * MDN
   */
  def x1: SVGAnimatedLength = _
  /**
   * Corresponds to attribute y2 on the given <line> element.
   *
   * MDN
   */
  def y2: SVGAnimatedLength = _
}


/**
 * The SVGDescElement interface corresponds to the <desc> element.
 *
 * MDN
 */
class SVGDescElement extends SVGElement with SVGStylable with SVGLangSpace {
}


class SVGPathSegCurvetoQuadraticSmoothRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
 * The SVGClipPathElement interface provides access to the properties of
 * <clippath> elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGClipPathElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute clipPathUnits on the given <clippath> element. Takes
   * one of the constants defined in SVGUnitTypes
   *
   * MDN
   */
  def clipPathUnits: SVGAnimatedEnumeration = _
}


/**
 * The SVGTextPositioningElement interface is inherited by text-related
 * interfaces: SVGTextElement, SVGTSpanElement, SVGTRefElement and
 * SVGAltGlyphElement.
 *
 * MDN
 */
class SVGTextPositioningElement extends SVGTextContentElement {
  /**
   * Corresponds to attribute y on the given element.
   *
   * MDN
   */
  def y: SVGAnimatedLengthList = _
  /**
   * Corresponds to attribute rotate on the given element.
   *
   * MDN
   */
  def rotate: SVGAnimatedNumberList = _
  /**
   * Corresponds to attribute dy on the given element.
   *
   * MDN
   */
  def dy: SVGAnimatedLengthList = _
  /**
   * Corresponds to attribute x on the given element.
   *
   * MDN
   */
  def x: SVGAnimatedLengthList = _
  /**
   * Corresponds to attribute dx on the given element.
   *
   * MDN
   */
  def dx: SVGAnimatedLengthList = _
}


class SVGPathSegLinetoVerticalRel extends SVGPathSeg {
  var y: js.Number = _
}


/**
 * The SVGAnimatedString interface is used for attributes of type DOMString which
 * can be animated.
 *
 * MDN
 */
class SVGAnimatedString extends js.Object {
  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: js.String = _
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: js.String = _
}


/**
 * Interface SVGTests defines an interface which applies to all elements which have
 * attributes requiredFeatures, requiredExtensions and systemLanguage.
 *
 * MDN
 */
trait SVGTests extends js.Object {
  /**
   * Corresponds to attribute requiredFeatures on the given element.
   *
   * MDN
   */
  var requiredFeatures: SVGStringList = _
  /**
   * Corresponds to attribute requiredExtensions on the given element.
   *
   * MDN
   */
  var requiredExtensions: SVGStringList = _
  /**
   * Corresponds to attribute systemLanguage on the given element.
   *
   * MDN
   */
  var systemLanguage: SVGStringList = _

  /**
   * Returns true if the browser supports the given extension, specified by a URI.
   *
   * MDN
   */
  def hasExtension(extension: js.String): js.Boolean = ???
}

/**
 * The SVGPatternElement interface corresponds to the <pattern> element.
 *
 * MDN
 */
class SVGPatternElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired with SVGURIReference {
  /**
   * Corresponds to attribute patternUnits on the given <pattern> element. Takes one
   * of the constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def patternUnits: SVGAnimatedEnumeration = _
  /**
   * Corresponds to attribute y on the given <pattern> element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = _
  /**
   * Corresponds to attribute width on the given <pattern> element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = _
  /**
   * Corresponds to attribute x on the given <pattern> element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = _
  /**
   * Corresponds to attribute patternContentUnits on the given <pattern> element.
   * Takes one of the constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def patternContentUnits: SVGAnimatedEnumeration = _
  /**
   * Corresponds to attribute patternTransform on the given <pattern> element.
   *
   * MDN
   */
  def patternTransform: SVGAnimatedTransformList = _
  /**
   * Corresponds to attribute height on the given <pattern> element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = _
}


/**
 * The SVGAnimatedAngle interface is used for attributes of basic type <angle> which
 * can be animated.
 *
 * MDN
 */
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
  def animVal: SVGAngle = ???
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGAngle = _
}


/**
 * The SVGScriptElement interface corresponds to the SVG <script> element.
 *
 * MDN
 */
class SVGScriptElement extends SVGElement with SVGExternalResourcesRequired with SVGURIReference {
  def `type`: js.String = _
}


/**
 * The SVGViewElement interface provides access to the properties of <view>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGViewElement extends SVGElement with SVGZoomAndPan with SVGFitToViewBox with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute viewTarget on the given <view> element. A list of
   * DOMString values which contain the names listed in the viewTarget attribute. Each
   * of the DOMString values can be associated with the corresponding element using the
   * getElementById() method call.
   *
   * MDN
   */
  def viewTarget: SVGStringList = _
}


trait SVGLocatable extends js.Object {
  var farthestViewportElement: SVGElement = _
  var nearestViewportElement: SVGElement = _

  def getBBox(): SVGRect = ???

  def getTransformToElement(element: SVGElement): SVGMatrix = ???

  def getCTM(): SVGMatrix = ???

  def getScreenCTM(): SVGMatrix = ???
}

/**
 * The SVGTitleElement interface corresponds to the <title> element.
 *
 * MDN
 */
class SVGTitleElement extends SVGElement with SVGStylable with SVGLangSpace {
}


/**
 * The SVGAnimatedTransformList interface is used for attributes which take a list
 * of numbers and which can be animated.
 *
 * MDN
 */
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
  def animVal: SVGTransformList = ???
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGTransformList = _
}


trait SVGFitToViewBox extends js.Object {
  var viewBox: SVGAnimatedRect = _
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
}

class SVGPointList extends js.Object {
  def numberOfItems: js.Number = _

  def replaceItem(newItem: SVGPoint, index: js.Number): SVGPoint = ???

  def getItem(index: js.Number): SVGPoint = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGPoint): SVGPoint = ???

  def initialize(newItem: SVGPoint): SVGPoint = ???

  def removeItem(index: js.Number): SVGPoint = ???

  def insertItemBefore(newItem: SVGPoint, index: js.Number): SVGPoint = ???
}


/**
 * The SVGAnimatedLengthList interface is used for attributes of type
 * SVGLengthList which can be animated.
 *
 * MDN
 */
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
  def animVal: SVGLengthList = ???
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGLengthList = _
}


/**
 * The SVGAnimatedPreserveAspectRatio interface is used for attributes of type
 * SVGPreserveAspectRatio which can be animated.
 *
 * MDN
 */
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
  def animVal: SVGPreserveAspectRatio = ???
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGPreserveAspectRatio = _
}


trait SVGExternalResourcesRequired extends js.Object {
  var externalResourcesRequired: SVGAnimatedBoolean = _
}

/**
 * The SVGAngle interface correspond to the <angle> basic data type.
 *
 * MDN
 */
class SVGAngle extends js.Object {
  /**
   * The value as a string value, in the units expressed by unitType. Setting this
   * attribute will cause value, valueInSpecifiedUnits and unitType to be updated
   * automatically to reflect this setting. Exceptions on setting: a DOMException
   * with code SYNTAX_ERR is raised if the assigned string cannot be parsed as a valid
   * <angle>. a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when
   * the length corresponds to a read only attribute or when the object itself is read
   * only.
   *
   * MDN
   */
  var valueAsString: js.String = _
  /**
   * The value as a floating point value, in the units expressed by unitType. Setting
   * this attribute will cause value and valueAsString to be updated automatically to
   * reflect this setting. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  var valueInSpecifiedUnits: js.Number = _
  /**
   * The value as a floating point value, in user units. Setting this attribute will
   * cause valueInSpecifiedUnits and valueAsString to be updated automatically to
   * reflect this setting. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  var value: js.Number = _
  /**
   * The type of the value as specified by one of the SVG_ANGLETYPE_* constants defined
   * on this interface.
   *
   * MDN
   */
  def unitType: js.Number = _

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
  def newValueSpecifiedUnits(unitType: js.Number, valueInSpecifiedUnits: js.Number): Unit = ???

  /**
   * Preserve the same underlying stored value, but reset the stored unit identifier to
   * the given unitType. Object attributes unitType, valueInSpecifiedUnits and
   * valueAsString might be modified as a result of this method.
   *
   * MDN
   */
  def convertToSpecifiedUnits(unitType: js.Number): Unit = ???


}

/**
 * The SVGAngle interface correspond to the <angle> basic data type.
 *
 * MDN
 */
object SVGAngle extends js.Object {

  val SVG_ANGLETYPE_RAD: js.Number = _
  /**
   * The unit type is not one of predefined unit types. It is invalid to attempt to define a
   * new value of this type or to attempt to switch an existing value to this type.
   *
   * MDN
   */
  val SVG_ANGLETYPE_UNKNOWN: js.Number = _
  val SVG_ANGLETYPE_UNSPECIFIED: js.Number = _
  /**
   * The unit type was explicitly set to degrees.
   *
   * MDN
   */
  val SVG_ANGLETYPE_DEG: js.Number = _
  val SVG_ANGLETYPE_GRAD: js.Number = _
}

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG
 * language derive from the SVGElement interface.
 *
 * MDN
 */
class SVGElement extends Element {
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  /**
   * The element which established the current viewport. Often, the nearest ancestor
   * <svg> element. Null if the given element is the outermost svg element.
   *
   * MDN
   */
  def viewportElement: SVGElement = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
  /**
   * Corresponds to attribute xml:base on the given element.
   *
   * MDN
   */
  var xmlbase: js.String = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  /**
   * The nearest ancestor <svg> element. Null if the given element is the outermost svg
   * element.
   *
   * MDN
   */
  def ownerSVGElement: SVGSVGElement = _
  /**
   * The value of the id attribute on the given element, or the empty string if id is not
   * present.
   *
   * MDN
   */
  var id: js.String = _

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


class SVGPathSegLinetoHorizontalAbs extends SVGPathSeg {
  var x: js.Number = _
}


class SVGPathSegArcAbs extends SVGPathSeg {
  var y: js.Number = _
  var sweepFlag: js.Boolean = _
  var r2: js.Number = _
  var x: js.Number = _
  var angle: js.Number = _
  var r1: js.Number = _
  var largeArcFlag: js.Boolean = _
}


/**
 * The SVGTransformList defines a list of SVGTransform objects.
 *
 * MDN
 */
class SVGTransformList extends js.Object {
  def numberOfItems: js.Number = _

  /**
   * Returns the specified item from the list. The returned item is the item itself and
   * not a copy. Any changes made to the item are immediately reflected in the list. The
   * first item is number 0. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def getItem(index: js.Number): SVGTransform = ???

  def consolidate(): SVGTransform = ???

  /**
   * Clears all existing current items from the list, with the result being an empty
   * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the list corresponds to a read only attribute or when the object itself
   * is read only.
   *
   * MDN
   */
  def clear(): Unit = ???

  /**
   * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
   * from its previous list before it is inserted into this list. The inserted item is the
   * item itself and not a copy. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def appendItem(newItem: SVGTransform): SVGTransform = ???

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
  def initialize(newItem: SVGTransform): SVGTransform = ???

  /**
   * Removes an existing item from the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only. a DOMException with code
   * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
   * numberOfItems.
   *
   * MDN
   */
  def removeItem(index: js.Number): SVGTransform = ???

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
  def insertItemBefore(newItem: SVGTransform, index: js.Number): SVGTransform = ???

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
  def replaceItem(newItem: SVGTransform, index: js.Number): SVGTransform = ???

  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = ???
}


class SVGPathSegClosePath extends SVGPathSeg {
}


/**
 * The SVGAnimatedLength interface is used for attributes of basic type <length>
 * which can be animated.
 *
 * MDN
 */
class SVGAnimatedLength extends js.Object {
  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: SVGLength = _
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: SVGLength = _
}


/**
 * The SVGAnimatedPoints interface supports elements which have a points attribute
 * which holds a list of coordinate values and which support the ability to animate
 * that attribute.
 *
 * MDN
 */
trait SVGAnimatedPoints extends js.Object {
  /**
   * Provides access to the base (i.e., static) contents of the points attribute.
   *
   * MDN
   */
  var points: SVGPointList = _
  /**
   * Provides access to the current animated contents of the points attribute. If the
   * given attribute or property is being animated, contains the current animated
   * value of the attribute or property. If the given attribute or property is not
   * currently being animated, contains the same value as points.
   *
   * MDN
   */
  def animatedPoints: SVGPointList = _
}

/**
 * The SVGDefsElement interface corresponds to the <defs> element.
 *
 * MDN
 */
class SVGDefsElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


class SVGPathSegLinetoHorizontalRel extends SVGPathSeg {
  var x: js.Number = _
}


/**
 * The SVGEllipseElement interface provides access to the properties of <ellipse>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGEllipseElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute ry on the given <ellipse> element.
   *
   * MDN
   */
  def ry: SVGAnimatedLength = _
  /**
   * Corresponds to attribute cx on the given <ellipse> element.
   *
   * MDN
   */
  def cx: SVGAnimatedLength = _
  /**
   * Corresponds to attribute rx on the given <ellipse> element.
   *
   * MDN
   */
  def rx: SVGAnimatedLength = _
  /**
   * Corresponds to attribute cy on the given <ellipse> element.
   *
   * MDN
   */
  def cy: SVGAnimatedLength = _
}


/**
 * The SVGAElement interface provides access to the properties of <a> elements, as
 * well as methods to manipulate them.
 *
 * MDN
 */
class SVGAElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  /**
   * Corresponds to attribute target on the given <a> element.
   *
   * MDN
   */
  def target: SVGAnimatedString = _
}


/**
 * The SVGStylable interface is implemented on all objects corresponding to SVG
 * elements that can have style, class and presentation attributes specified on
 * them.
 *
 * MDN
 */
trait SVGStylable extends js.Object {
  /**
   * Corresponds to attribute class on the given element.
   *
   * MDN
   */
  var className: SVGAnimatedString = _
  /**
   * Corresponds to attribute style on the given element.
   *
   * MDN
   */
  var style: CSSStyleDeclaration = _
}

/**
 * Interface SVGTransformable contains properties and methods that apply to all
 * elements which have attribute transform.
 *
 * MDN
 */
trait SVGTransformable extends SVGLocatable {
  /**
   * Corresponds to attribute transform on the given element.
   *
   * MDN
   */
  var transform: SVGAnimatedTransformList = _
}

trait SVGLangSpace extends js.Object {
  var xmllang: js.String = _
  var xmlspace: js.String = _
}

class SVGPoint extends js.Object {
  var y: js.Number = _
  var x: js.Number = _

  def matrixTransform(matrix: SVGMatrix): SVGPoint = ???
}


/**
 * The SVGAnimatedNumber interface is used for attributes which take a list of
 * numbers and which can be animated.
 *
 * MDN
 */
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
  def animVal: SVGNumberList = ???
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  def baseVal: SVGNumberList = ???
}


/**
 * The SVGSVGElement interface provides access to the properties of <svg> elements,
 * as well as methods to manipulate them. This interface contains also various
 * miscellaneous commonly-used utility methods, such as matrix operations and the
 * ability to control the time of redraw on visual rendering devices.
 *
 * MDN
 */
class SVGSVGElement extends SVGElement with SVGStylable with SVGZoomAndPan with DocumentEvent with SVGLangSpace with SVGLocatable with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute width on the given <svg> element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = _
  /**
   * Corresponds to attribute x on the given <svg> element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = _
  /**
   * Corresponds to attribute contentStyleType on the given <svg> element.
   *
   * MDN
   */
  var contentStyleType: js.String = _
  var onzoom: js.Function1[js.Any, js.Any] = _
  /**
   * Corresponds to attribute y on the given <svg> element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = _
  /**
   * The position and size of the viewport (implicit or explicit) that corresponds to
   * this <svg> element. When the browser is actually rendering the content, then the
   * position and size values represent the actual values when rendering. The position
   * and size values are unitless values in the coordinate system of the parent element.
   * If no parent element exists (i.e., <svg> element represents the root of the
   * document tree), if this SVG document is embedded as part of another document (e.g.,
   * via the HTML <object> element), then the position and size are unitless values in
   * the coordinate system of the parent document. (If the parent uses CSS or XSL layout,
   * then unitless values represent pixel units for the current CSS or XSL viewport.)
   *
   * MDN
   */
  def viewport: SVGRect = _
  var onerror: js.Function1[Event, js.Any] = _
  /**
   * Corresponding size of a pixel unit along the y-axis of the viewport.
   *
   * MDN
   */
  def pixelUnitToMillimeterY: js.Number = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  /**
   * Corresponding size of a screen pixel along the y-axis of the viewport.
   *
   * MDN
   */
  def screenPixelToMillimeterY: js.Number = _
  /**
   * Corresponds to attribute height on the given <svg> element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  /**
   * Corresponds to attribute contentScriptType on the given <svg> element.
   *
   * MDN
   */
  var contentScriptType: js.String = _
  /**
   * Size of a pixel units (as defined by CSS2) along the x-axis of the viewport, which
   * represents a unit somewhere in the range of 70dpi to 120dpi, and, on systems that
   * support this, might actually match the characteristics of the target medium. On
   * systems where it is impossible to know the size of a pixel, a suitable default pixel
   * size is provided.
   *
   * MDN
   */
  def pixelUnitToMillimeterX: js.Number = _
  /**
   * On an outermost <svg> element, the corresponding translation factor that takes
   * into account user "magnification".
   *
   * MDN
   */
  def currentTranslate: SVGPoint = _
  var onunload: js.Function1[Event, js.Any] = _
  /**
   * On an outermost <svg> element, this attribute indicates the current scale factor
   * relative to the initial view to take into account user magnification and panning
   * operations. DOM attributes currentScale and currentTranslate are equivalent to
   * the 2x3 matrix [a b c d e f] = [currentScale 0 0 currentScale currentTranslate.x
   * currentTranslate.y]. If "magnification" is enabled (i.e.,
   * zoomAndPan="magnify"), then the effect is as if an extra transformation were
   * placed at the outermost level on the SVG document fragment (i.e., outside the
   * outermost <svg> element).
   *
   * MDN
   */
  def currentScale: js.Number = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  /**
   * User interface (UI) events in DOM Level 2 indicate the screen positions at which the
   * given UI event occurred. When the browser actually knows the physical size of a
   * "screen unit", this attribute will express that information; otherwise, user
   * agents will provide a suitable default value such as .28mm.
   *
   * MDN
   */
  def screenPixelToMillimeterX: js.Number = _

  /**
   * Adjusts the clock for this SVG document fragment, establishing a new current time.
   * If setCurrentTime is called before the document timeline has begun (for example,
   * by script running in a <script> element before the document's SVGLoad event is
   * dispatched), then the value of seconds in the last invocation of the method gives
   * the time that the document will seek to once the document timeline has begun.
   *
   * MDN
   */
  def setCurrentTime(seconds: js.Number): Unit = ???

  /**
   * Creates an SVGLength object outside of any document trees. The object is
   * initialized to a value of zero user units.
   *
   * MDN
   */
  def createSVGLength(): SVGLength = ???

  /**
   * Returns the list of graphics elements whose rendered content intersects the
   * supplied rectangle. Each candidate graphics element is to be considered a match
   * only if the same graphics element can be a target of pointer events as defined in
   * pointer-events processing.
   *
   * MDN
   */
  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeList = ???

  /**
   * Unsuspends (i.e., unpauses) currently running animations that are defined
   * within the SVG document fragment, causing the animation clock to continue from the
   * time at which it was suspended.
   *
   * MDN
   */
  def unpauseAnimations(): Unit = ???

  /**
   * Creates an SVGRect object outside of any document trees. The object is initialized
   * such that all values are set to 0 user units.
   *
   * MDN
   */
  def createSVGRect(): SVGRect = ???

  /**
   * Returns true if the rendered content of the given element intersects the supplied
   * rectangle. Each candidate graphics element is to be considered a match only if the
   * same graphics element can be a target of pointer events as defined in
   * pointer-events processing.
   *
   * MDN
   */
  def checkIntersection(element: SVGElement, rect: SVGRect): js.Boolean = ???

  /**
   * Cancels all currently active suspendRedraw() method calls. This method is most
   * useful at the very end of a set of SVG DOM calls to ensure that all pending
   * suspendRedraw() method calls have been cancelled.
   *
   * MDN
   */
  def unsuspendRedrawAll(): Unit = ???

  /**
   * Suspends (i.e., pauses) all currently running animations that are defined within
   * the SVG document fragment corresponding to this <svg> element, causing the
   * animation clock corresponding to this document fragment to stand still until it is
   * unpaused.
   *
   * MDN
   */
  def pauseAnimations(): Unit = ???

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
  def suspendRedraw(maxWaitMilliseconds: js.Number): js.Number = ???

  /**
   * Unselects any selected objects, including any selections of text strings and
   * type-in bars.
   *
   * MDN
   */
  def deselectAll(): Unit = ???

  /**
   * Creates an SVGAngle object outside of any document trees. The object is
   * initialized to a value of zero degrees (unitless).
   *
   * MDN
   */
  def createSVGAngle(): SVGAngle = ???

  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeList = ???

  /**
   * Creates an SVGTransform object outside of any document trees. The object is
   * initialized to an identity matrix transform (SVG_TRANSFORM_MATRIX).
   *
   * MDN
   */
  def createSVGTransform(): SVGTransform = ???

  /**
   * Cancels a specified suspendRedraw() by providing a unique suspend handle ID that
   * was returned by a previous suspendRedraw() call.
   *
   * MDN
   */
  def unsuspendRedraw(suspendHandleID: js.Number): Unit = ???

  /**
   * In rendering environments supporting interactivity, forces the user agent to
   * immediately redraw all regions of the viewport that require updating.
   *
   * MDN
   */
  def forceRedraw(): Unit = ???

  /**
   * Returns the current time in seconds relative to the start time for the current SVG
   * document fragment. If getCurrentTime is called before the document timeline has
   * begun (for example, by script running in a <script> element before the document's
   * SVGLoad event is dispatched), then 0 is returned.
   *
   * MDN
   */
  def getCurrentTime(): js.Number = ???

  /**
   * Returns true if the rendered content of the given element is entirely contained
   * within the supplied rectangle. Each candidate graphics element is to be
   * considered a match only if the same graphics element can be a target of pointer
   * events as defined in pointer-events processing.
   *
   * MDN
   */
  def checkEnclosure(element: SVGElement, rect: SVGRect): js.Boolean = ???

  /**
   * Creates an SVGMatrix object outside of any document trees. The object is
   * initialized to the identity matrix.
   *
   * MDN
   */
  def createSVGMatrix(): SVGMatrix = ???

  /**
   * Creates an SVGPoint object outside of any document trees. The object is
   * initialized to the point (0,0) in the user coordinate system.
   *
   * MDN
   */
  def createSVGPoint(): SVGPoint = ???

  /**
   * Creates an SVGNumber object outside of any document trees. The object is
   * initialized to a value of zero.
   *
   * MDN
   */
  def createSVGNumber(): SVGNumber = ???

  /**
   * Creates an SVGTransform object outside of any document trees. The object is
   * initialized to the given matrix transform (i.e., SVG_TRANSFORM_MATRIX). The
   * values from the parameter matrix are copied, the matrix parameter is not adopted as
   * SVGTransform::matrix.
   *
   * MDN
   */
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = ???

  def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???

  def getComputedStyle(elt: Element): CSSStyleDeclaration = ???

  /**
   * Searches this SVG document fragment (i.e., the search is restricted to a subset of
   * the document tree) for an Element whose id is given by elementId. If an Element is
   * found, that Element is returned. If no such element exists, returns null. Behavior
   * is not defined if more than one element has this id.
   *
   * MDN
   */
  def getElementById(elementId: js.String): Element = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


/**
 * The SVGAnimatedInteger interface is used for attributes of basic type <integer>
 * which can be animated.
 *
 * MDN
 */
class SVGAnimatedInteger extends js.Object {
  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: js.Number = _
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: js.Number = _
}


/**
 * The SVGTextElement interface corresponds to the <text> elements.
 *
 * MDN
 */
class SVGTextElement extends SVGTextPositioningElement with SVGTransformable {
}


/**
 * The SVGTSpanElement interface provides access to the properties of <tspan>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGTSpanElement extends SVGTextPositioningElement {
}


class SVGPathSegLinetoVerticalAbs extends SVGPathSeg {
  var y: js.Number = _
}


/**
 * The SVGStyleElement interface corresponds to the SVG <style> element.
 *
 * MDN
 */
class SVGStyleElement extends SVGElement with SVGLangSpace {
  /**
   * Corresponds to attribute media on the given element. A DOMException is raised with
   * code NO_MODIFICATION_ALLOWED_ERR on an attempt to change the value of a read only
   * attribute.
   *
   * MDN
   */
  var media: js.String = _
  def `type`: js.String = _
  /**
   * Corresponds to attribute title on the given element. A DOMException is raised with
   * code NO_MODIFICATION_ALLOWED_ERR on an attempt to change the value of a read only
   * attribute.
   *
   * MDN
   */
  var title: js.String = _
}


/**
 * The SVGRadialGradientElement interface corresponds to the <radialgradient>
 * element.
 *
 * MDN
 */
class SVGRadialGradientElement extends SVGGradientElement {
  /**
   * Corresponds to attribute cx on the given <radialgradient> element.
   *
   * MDN
   */
  def cx: SVGAnimatedLength = _
  /**
   * Corresponds to attribute r on the given <radialgradient> element.
   *
   * MDN
   */
  def r: SVGAnimatedLength = _
  /**
   * Corresponds to attribute cy on the given <radialgradient> element.
   *
   * MDN
   */
  def cy: SVGAnimatedLength = _
  /**
   * Corresponds to attribute fx on the given <radialgradient> element.
   *
   * MDN
   */
  def fx: SVGAnimatedLength = _
  /**
   * Corresponds to attribute fy on the given <radialgradient> element.
   *
   * MDN
   */
  def fy: SVGAnimatedLength = _
}


/**
 * The SVGImageElement interface corresponds to the <image> element.
 *
 * MDN
 */
class SVGImageElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  /**
   * Corresponds to attribute y on the given <image> element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = _
  /**
   * Corresponds to attribute width on the given <image> element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = _
  /**
   * Corresponds to attribute preserveAspectRatio on the given <image> element.
   *
   * MDN
   */
  def preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
  /**
   * Corresponds to attribute x on the given <image> element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = _
  /**
   * Corresponds to attribute height on the given <image> element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = _
}


/**
 * The SVGAnimatedNumber interface is used for attributes of basic type <Number>
 * which can be animated.
 *
 * MDN
 */
class SVGAnimatedNumber extends js.Object {
  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: js.Number = _
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: js.Number = _
}


class SVGMetadataElement extends SVGElement {
}


class SVGPathSegArcRel extends SVGPathSeg {
  var y: js.Number = _
  var sweepFlag: js.Boolean = _
  var r2: js.Number = _
  var x: js.Number = _
  var angle: js.Number = _
  var r1: js.Number = _
  var largeArcFlag: js.Boolean = _
}


class SVGPathSegMovetoAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
 * The SVGStringList defines a list of DOMString objects.
 *
 * MDN
 */
class SVGStringList extends js.Object {
  def numberOfItems: js.Number = _

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
  def replaceItem(newItem: js.String, index: js.Number): js.String = ???

  /**
   * Returns the specified item from the list. The returned item is the item itself and
   * not a copy. Any changes made to the item are immediately reflected in the list. The
   * first item is number 0. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def getItem(index: js.Number): js.String = ???

  /**
   * Clears all existing current items from the list, with the result being an empty
   * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the list corresponds to a read only attribute or when the object itself
   * is read only.
   *
   * MDN
   */
  def clear(): Unit = ???

  /**
   * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
   * from its previous list before it is inserted into this list. The inserted item is the
   * item itself and not a copy. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def appendItem(newItem: js.String): js.String = ???

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
  def initialize(newItem: js.String): js.String = ???

  /**
   * Removes an existing item from the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only. a DOMException with code
   * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
   * numberOfItems.
   *
   * MDN
   */
  def removeItem(index: js.Number): js.String = ???

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
  def insertItemBefore(newItem: js.String, index: js.Number): js.String = ???
}


/**
 * The SVGLength interface correspond to the <length> basic data type.
 *
 * MDN
 */
class SVGLength extends js.Object {
  /**
   * The value as a string value, in the units expressed by unitType. Setting this
   * attribute will cause value, valueInSpecifiedUnits and unitType to be updated
   * automatically to reflect this setting. Exceptions on setting: a DOMException
   * with code SYNTAX_ERR is raised if the assigned string cannot be parsed as a valid
   * <length>. a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when
   * the length corresponds to a read only attribute or when the object itself is read
   * only.
   *
   * MDN
   */
  var valueAsString: js.String = _
  /**
   * The value as a floating point value, in the units expressed by unitType. Setting
   * this attribute will cause value and valueAsString to be updated automatically to
   * reflect this setting. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  var valueInSpecifiedUnits: js.Number = _
  /**
   * The value as a floating point value, in user units. Setting this attribute will
   * cause valueInSpecifiedUnits and valueAsString to be updated automatically to
   * reflect this setting. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  var value: js.Number = _
  /**
   * The type of the value as specified by one of the SVG_LENGTHTYPE_* constants defined
   * on this interface.
   *
   * MDN
   */
  def unitType: js.Number = _

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
  def newValueSpecifiedUnits(unitType: js.Number, valueInSpecifiedUnits: js.Number): Unit = ???

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
  def convertToSpecifiedUnits(unitType: js.Number): Unit = ???
}

/**
 * The SVGLength interface correspond to the <length> basic data type.
 *
 * MDN
 */
object SVGLength extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLength),List())))) */
  val SVG_LENGTHTYPE_NUMBER: js.Number = _
  val SVG_LENGTHTYPE_CM: js.Number = _
  val SVG_LENGTHTYPE_PC: js.Number = _
  val SVG_LENGTHTYPE_PERCENTAGE: js.Number = _
  val SVG_LENGTHTYPE_MM: js.Number = _
  val SVG_LENGTHTYPE_PT: js.Number = _
  val SVG_LENGTHTYPE_IN: js.Number = _
  val SVG_LENGTHTYPE_EMS: js.Number = _
  val SVG_LENGTHTYPE_PX: js.Number = _
  /**
   * The unit type is not one of predefined unit types. It is invalid to attempt to define a
   * new value of this type or to attempt to switch an existing value to this type.
   *
   * MDN
   */
  val SVG_LENGTHTYPE_UNKNOWN: js.Number = _
  val SVG_LENGTHTYPE_EXS: js.Number = _
}

/**
 * The SVGPolygonElement interface provides access to the properties of <polygon>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGPolygonElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired {
}


class SVGPathSegCurvetoCubicRel extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
  var y2: js.Number = _
}


class SVGTextContentElement extends SVGElement with SVGStylable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  def textLength: SVGAnimatedLength = _
  def lengthAdjust: SVGAnimatedEnumeration = _

  def getCharNumAtPosition(point: SVGPoint): js.Number = ???

  def getStartPositionOfChar(charnum: js.Number): SVGPoint = ???

  def getExtentOfChar(charnum: js.Number): SVGRect = ???

  def getComputedTextLength(): js.Number = ???

  def getSubStringLength(charnum: js.Number, nchars: js.Number): js.Number = ???

  def selectSubString(charnum: js.Number, nchars: js.Number): Unit = ???

  def getNumberOfChars(): js.Number = ???

  def getRotationOfChar(charnum: js.Number): js.Number = ???

  def getEndPositionOfChar(charnum: js.Number): SVGPoint = ???

}

object SVGTextContentElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextContentElement),List())))) */
  val LENGTHADJUST_SPACING: js.Number = _
  val LENGTHADJUST_SPACINGANDGLYPHS: js.Number = _
  val LENGTHADJUST_UNKNOWN: js.Number = _
}

/**
 * SVGTransform is the interface for one of the component transformations within an
 * SVGTransformList; thus, an SVGTransform object corresponds to a single
 * component (e.g., scale(…) or matrix(…)) within a transform attribute.
 *
 * MDN
 */
class SVGTransform extends js.Object {
  def `type`: js.Number = _
  /**
   * A convenience attribute for SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX and
   * SVG_TRANSFORM_SKEWY. It holds the angle that was specified. For
   * SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE and SVG_TRANSFORM_SCALE,
   * angle will be zero.
   *
   * MDN
   */
  def angle: js.Number = _
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
  def matrix: SVGMatrix = _

  /**
   * Sets the transform type to SVG_TRANSFORM_TRANSLATE, with parameters tx and ty
   * defining the translation amounts. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def setTranslate(tx: js.Number, ty: js.Number): Unit = ???

  /**
   * Sets the transform type to SVG_TRANSFORM_SCALE, with parameters sx and sy
   * defining the scale amounts. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def setScale(sx: js.Number, sy: js.Number): Unit = ???

  /**
   * Sets the transform type to SVG_TRANSFORM_MATRIX, with parameter matrix defining
   * the new transformation. Note that the values from the parameter matrix are copied.
   * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
   * when attempting to modify a read only attribute or when the object itself is read
   * only.
   *
   * MDN
   */
  def setMatrix(matrix: SVGMatrix): Unit = ???

  /**
   * Sets the transform type to SVG_TRANSFORM_SKEWY, with parameter angle defining
   * the amount of skew. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def setSkewY(angle: js.Number): Unit = ???

  /**
   * Sets the transform type to SVG_TRANSFORM_ROTATE, with parameter angle defining
   * the rotation angle and parameters cx and cy defining the optional center of
   * rotation. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when attempting to modify a read only attribute or when the object itself is
   * read only.
   *
   * MDN
   */
  def setRotate(angle: js.Number, cx: js.Number, cy: js.Number): Unit = ???

  /**
   * Sets the transform type to SVG_TRANSFORM_SKEWX, with parameter angle defining
   * the amount of skew. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def setSkewX(angle: js.Number): Unit = ???

}

/**
 * SVGTransform is the interface for one of the component transformations within an
 * SVGTransformList; thus, an SVGTransform object corresponds to a single
 * component (e.g., scale(…) or matrix(…)) within a transform attribute.
 *
 * MDN
 */
object SVGTransform extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTransform),List())))) */
  val SVG_TRANSFORM_SKEWX: js.Number = _
  /**
   * The unit type is not one of predefined unit types. It is invalid to attempt to define a
   * new value of this type or to attempt to switch an existing value to this type.
   *
   * MDN
   */
  val SVG_TRANSFORM_UNKNOWN: js.Number = _
  val SVG_TRANSFORM_SCALE: js.Number = _
  val SVG_TRANSFORM_TRANSLATE: js.Number = _
  val SVG_TRANSFORM_MATRIX: js.Number = _
  val SVG_TRANSFORM_ROTATE: js.Number = _
  val SVG_TRANSFORM_SKEWY: js.Number = _
}

trait SVGURIReference extends js.Object {
  var href: SVGAnimatedString = _
}

class SVGPathSeg extends js.Object {
  def pathSegType: js.Number = _
  def pathSegTypeAsLetter: js.String = _
}

object SVGPathSeg extends js.Object {

  val PATHSEG_MOVETO_REL: js.Number = _
  val PATHSEG_LINETO_VERTICAL_REL: js.Number = _
  val PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: js.Number = _
  val PATHSEG_CURVETO_QUADRATIC_REL: js.Number = _
  val PATHSEG_CURVETO_CUBIC_ABS: js.Number = _
  val PATHSEG_LINETO_HORIZONTAL_ABS: js.Number = _
  val PATHSEG_CURVETO_QUADRATIC_ABS: js.Number = _
  val PATHSEG_LINETO_ABS: js.Number = _
  val PATHSEG_CLOSEPATH: js.Number = _
  val PATHSEG_LINETO_HORIZONTAL_REL: js.Number = _
  val PATHSEG_CURVETO_CUBIC_SMOOTH_REL: js.Number = _
  val PATHSEG_LINETO_REL: js.Number = _
  val PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: js.Number = _
  val PATHSEG_ARC_REL: js.Number = _
  val PATHSEG_CURVETO_CUBIC_REL: js.Number = _
  val PATHSEG_UNKNOWN: js.Number = _
  val PATHSEG_LINETO_VERTICAL_ABS: js.Number = _
  val PATHSEG_ARC_ABS: js.Number = _
  val PATHSEG_MOVETO_ABS: js.Number = _
  val PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: js.Number = _
}

/**
 * The SVGNumber interface correspond to the <number> basic data type.
 *
 * MDN
 */
class SVGNumber extends js.Object {
  /**
   * The value of the given attribute. Exceptions on setting: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is Raised on an attempt to change the value of a read
   * only attribute.
   *
   * MDN
   */
  var value: js.Number = _
}


/**
 * The SVGPathElement interface corresponds to the <path> element.
 *
 * MDN
 */
class SVGPathElement extends SVGElement with SVGStylable with SVGAnimatedPathData with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  /**
   * Returns the index into pathSegList which is distance units along the path,
   * utilizing the user agent's distance-along-a-path algorithm.
   *
   * MDN
   */
  def getPathSegAtLength(distance: js.Number): js.Number = ???

  /**
   * Returns the (x,y) coordinate in user space which is distance units along the path,
   * utilizing the browser's distance-along-a-path algorithm.
   *
   * MDN
   */
  def getPointAtLength(distance: js.Number): SVGPoint = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticAbs object.
   * Parameters: float x The absolute X coordinate for the end point of this path
   * segment. float y The absolute Y coordinate for the end point of this path segment.
   * float x1 The absolute X coordinate for the first control point. float y1 The
   * absolute Y coordinate for the first control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoQuadraticAbs(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number): SVGPathSegCurvetoQuadraticAbs = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoRel object. Parameters:
   * float x The relative X coordinate for the end point of this path segment. float y The
   * relative Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoRel(x: js.Number, y: js.Number): SVGPathSegLinetoRel = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticRel object.
   * Parameters: float x The relative X coordinate for the end point of this path
   * segment. float y The relative Y coordinate for the end point of this path segment.
   * float x1 The relative X coordinate for the first control point. float y1 The
   * relative Y coordinate for the first control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoQuadraticRel(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number): SVGPathSegCurvetoQuadraticRel = ???

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
  def createSVGPathSegCurvetoCubicAbs(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicAbs = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoAbs object. Parameters:
   * float x The absolute X coordinate for the end point of this path segment. float y The
   * absolute Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoAbs(x: js.Number, y: js.Number): SVGPathSegLinetoAbs = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegClosePath object.
   *
   * MDN
   */
  def createSVGPathSegClosePath(): SVGPathSegClosePath = ???

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
  def createSVGPathSegCurvetoCubicRel(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicRel = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticSmoothRel
   * object. Parameters: float x The absolute X coordinate for the end point of this path
   * segment. float y The absolute Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: js.Number, y: js.Number): SVGPathSegCurvetoQuadraticSmoothRel = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegMovetoRel object. Parameters:
   * float x The relative X coordinate for the end point of this path segment. float y The
   * relative Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegMovetoRel(x: js.Number, y: js.Number): SVGPathSegMovetoRel = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoCubicSmoothAbs object.
   * Parameters float x The absolute X coordinate for the end point of this path segment.
   * float y The absolute Y coordinate for the end point of this path segment. float x2 The
   * absolute X coordinate for the second control point. float y2 The absolute Y
   * coordinate for the second control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoCubicSmoothAbs(x: js.Number, y: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicSmoothAbs = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegMovetoAbs object. Parameters:
   * float x The absolute X coordinate for the end point of this path segment. float y The
   * absolute Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegMovetoAbs(x: js.Number, y: js.Number): SVGPathSegMovetoAbs = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoVerticalRel object.
   * Parameters: float y The relative Y coordinate for the end point of this path
   * segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoVerticalRel(y: js.Number): SVGPathSegLinetoVerticalRel = ???

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
  def createSVGPathSegArcRel(x: js.Number, y: js.Number, r1: js.Number, r2: js.Number, angle: js.Number, largeArcFlag: js.Boolean, sweepFlag: js.Boolean): SVGPathSegArcRel = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticSmoothAbs
   * object. Parameters: float x The absolute X coordinate for the end point of this path
   * segment. float y The absolute Y coordinate for the end point of this path segment.
   *
   * MDN
   */
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: js.Number, y: js.Number): SVGPathSegCurvetoQuadraticSmoothAbs = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoHorizontalRel object.
   * Parameters: float x The relative X coordinate for the end point of this path
   * segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoHorizontalRel(x: js.Number): SVGPathSegLinetoHorizontalRel = ???

  def getTotalLength(): js.Number = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegCurvetoCubicSmoothRel object.
   * Parameters float x The absolute X coordinate for the end point of this path segment.
   * float y The absolute Y coordinate for the end point of this path segment. float x2 The
   * absolute X coordinate for the second control point. float y2 The absolute Y
   * coordinate for the second control point.
   *
   * MDN
   */
  def createSVGPathSegCurvetoCubicSmoothRel(x: js.Number, y: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicSmoothRel = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoHorizontalAbs object.
   * Parameters: float x The absolute X coordinate for the end point of this path
   * segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoHorizontalAbs(x: js.Number): SVGPathSegLinetoHorizontalAbs = ???

  /**
   * Returns a stand-alone, parentless SVGPathSegLinetoVerticalAbs object.
   * Parameters: float y The absolute Y coordinate for the end point of this path
   * segment.
   *
   * MDN
   */
  def createSVGPathSegLinetoVerticalAbs(y: js.Number): SVGPathSegLinetoVerticalAbs = ???

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
  def createSVGPathSegArcAbs(x: js.Number, y: js.Number, r1: js.Number, r2: js.Number, angle: js.Number, largeArcFlag: js.Boolean, sweepFlag: js.Boolean): SVGPathSegArcAbs = ???
}


/**
 * The SVGAnimatedRect interface is used for attributes of basic SVGRect which can be
 * animated.
 *
 * MDN
 */
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
  def animVal: SVGRect = ???
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  def baseVal: SVGRect = _
}


class SVGPathSegList extends js.Object {
  def numberOfItems: js.Number = _

  def replaceItem(newItem: SVGPathSeg, index: js.Number): SVGPathSeg = ???

  def getItem(index: js.Number): SVGPathSeg = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGPathSeg): SVGPathSeg = ???

  def initialize(newItem: SVGPathSeg): SVGPathSeg = ???

  def removeItem(index: js.Number): SVGPathSeg = ???

  def insertItemBefore(newItem: SVGPathSeg, index: js.Number): SVGPathSeg = ???
}


class SVGElementInstance extends EventTarget {
  def previousSibling: SVGElementInstance = _
  def parentNode: SVGElementInstance = _
  def lastChild: SVGElementInstance = _
  def nextSibling: SVGElementInstance = _
  def childNodes: SVGElementInstanceList = _
  def correspondingUseElement: SVGUseElement = _
  def correspondingElement: SVGElement = _
  def firstChild: SVGElementInstance = _
}


/**
 * The SVGCircleElement interface provides access to the properties of <circle>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGCircleElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute cx on the given <circle> element.
   *
   * MDN
   */
  def cx: SVGAnimatedLength = _
  /**
   * Corresponds to attribute r on the given <circle> element.
   *
   * MDN
   */
  def r: SVGAnimatedLength = _
  /**
   * Corresponds to attribute cy on the given <circle> element.
   *
   * MDN
   */
  def cy: SVGAnimatedLength = _
}


/**
 * The SVGRect represents rectangular geometry. Rectangles are defined as
 * consisting of a (x,y) coordinate pair identifying a minimum X value, a minimum Y
 * value, and a width and height, which are usually constrained to be non-negative.
 *
 * MDN
 */
class SVGRect extends js.Object {
  /**
   * The y coordinate of the rectangle, in user units.
   *
   * MDN
   */
  var y: js.Number = _
  /**
   * The width coordinate of the rectangle, in user units.
   *
   * MDN
   */
  var width: js.Number = _
  /**
   * The x coordinate of the rectangle, in user units.
   *
   * MDN
   */
  var x: js.Number = _
  /**
   * The height coordinate of the rectangle, in user units.
   *
   * MDN
   */
  var height: js.Number = _
}


class SVGPathSegCurvetoCubicAbs extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
  var y2: js.Number = _
}


class SVGPathSegCurvetoQuadraticAbs extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
}


class SVGPathSegLinetoAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
 * Many of SVG's graphics operations utilize 2x3 matrices of the form:
 *
 * MDN
 */
class SVGMatrix extends js.Object {
  var e: js.Number = _
  var c: js.Number = _
  var a: js.Number = _
  var b: js.Number = _
  var d: js.Number = _
  var f: js.Number = _

  /**
   * Performs matrix multiplication. This matrix is post-multiplied by another
   * matrix, returning the resulting new matrix.
   *
   * MDN
   */
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = ???

  /**
   * Post-multiplies the transformation [1 0 0 -1 0 0] and returns the resulting
   * matrix.
   *
   * MDN
   */
  def flipY(): SVGMatrix = ???

  /**
   * Post-multiplies a skewY transformation on the current matrix and returns the
   * resulting matrix.
   *
   * MDN
   */
  def skewY(angle: js.Number): SVGMatrix = ???

  /**
   * Return the inverse matrix Exceptions: a DOMException with code
   * SVG_MATRIX_NOT_INVERTABLE is raised if the matrix is not invertable.
   *
   * MDN
   */
  def inverse(): SVGMatrix = ???

  /**
   * Post-multiplies a non-uniform scale transformation on the current matrix and
   * returns the resulting matrix.
   *
   * MDN
   */
  def scaleNonUniform(scaleFactorX: js.Number, scaleFactorY: js.Number): SVGMatrix = ???

  /**
   * Post-multiplies a rotation transformation on the current matrix and returns the
   * resulting matrix.
   *
   * MDN
   */
  def rotate(angle: js.Number): SVGMatrix = ???

  /**
   * Post-multiplies the transformation [-1 0 0 1 0 0] and returns the resulting
   * matrix.
   *
   * MDN
   */
  def flipX(): SVGMatrix = ???

  /**
   * Post-multiplies a translation transformation on the current matrix and returns
   * the resulting matrix.
   *
   * MDN
   */
  def translate(x: js.Number, y: js.Number): SVGMatrix = ???

  /**
   * Post-multiplies a uniform scale transformation on the current matrix and returns
   * the resulting matrix.
   *
   * MDN
   */
  def scale(scaleFactor: js.Number): SVGMatrix = ???

  /**
   * Post-multiplies a rotation transformation on the current matrix and returns the
   * resulting matrix. The rotation angle is determined by taking (+/-) atan(y/x). The
   * direction of the vector (x, y) determines whether the positive or negative angle
   * value is used. Exceptions: a DOMException with code SVG_INVALID_VALUE_ERR is
   * raised if one of the parameters has an invalid value.
   *
   * MDN
   */
  def rotateFromVector(x: js.Number, y: js.Number): SVGMatrix = ???

  /**
   * Post-multiplies a skewX transformation on the current matrix and returns the
   * resulting matrix.
   *
   * MDN
   */
  def skewX(angle: js.Number): SVGMatrix = ???
}


/**
 * The SVGUseElement interface provides access to the properties of <use> elements,
 * as well as methods to manipulate them.
 *
 * MDN
 */
class SVGUseElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  /**
   * Corresponds to attribute y on the given <use> element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = _
  /**
   * Corresponds to attribute width on the given <use> element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = _
  /**
   * If the xlink:href attribute is being animated, contains the current animated root
   * of the instance tree. If the xlink:href attribute is not currently being animated,
   * contains the same value as instanceRoot. See description of SVGElementInstance
   * to learn more about the instance tree.
   *
   * MDN
   */
  def animatedInstanceRoot: SVGElementInstance = _
  /**
   * The root of the instance tree. See description of SVGElementInstance to learn more
   * about the instance tree.
   *
   * MDN
   */
  def instanceRoot: SVGElementInstance = _
  /**
   * Corresponds to attribute x on the given <use> element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = _
  /**
   * Corresponds to attribute height on the given <use> element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = _
}


trait SVGException extends js.Object {
  def code: js.Number = _
  def message: js.String = _
  def name: js.String = _
}

object SVGException extends js.Object {
  val SVG_MATRIX_NOT_INVERTABLE: js.Number = _
  val SVG_WRONG_TYPE_ERR: js.Number = _
  val SVG_INVALID_VALUE_ERR: js.Number = _
}

/**
 * The SVGLinearGradientElement interface corresponds to the <lineargradient>
 * element.
 *
 * MDN
 */
class SVGLinearGradientElement extends SVGGradientElement {
  /**
   * Corresponds to attribute y1 on the given <lineargradient> element.
   *
   * MDN
   */
  def y1: SVGAnimatedLength = _
  /**
   * Corresponds to attribute x2 on the given <lineargradient> element.
   *
   * MDN
   */
  def x2: SVGAnimatedLength = _
  /**
   * Corresponds to attribute x1 on the given <lineargradient> element.
   *
   * MDN
   */
  def x1: SVGAnimatedLength = _
  /**
   * Corresponds to attribute y2 on the given <lineargradient> element.
   *
   * MDN
   */
  def y2: SVGAnimatedLength = _
}


/**
 * The SVGAnimatedEnumeration interface is used for attributes whose value must be a
 * constant from a particular enumeration and which can be animated.
 *
 * MDN
 */
class SVGAnimatedEnumeration extends js.Object {
  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: js.Number = _
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: js.Number = _
}


/**
 * The SVGRectElement interface provides access to the properties of <rect>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGRectElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute y on the given <rect> element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = _
  /**
   * Corresponds to attribute width on the given <rect> element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = _
  /**
   * Corresponds to attribute ry on the given <rect> element.
   *
   * MDN
   */
  def ry: SVGAnimatedLength = _
  /**
   * Corresponds to attribute rx on the given <rect> element.
   *
   * MDN
   */
  def rx: SVGAnimatedLength = _
  /**
   * Corresponds to attribute x on the given <rect> element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = _
  /**
   * Corresponds to attribute height on the given <rect> element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = _
}


class SVGPathSegCurvetoQuadraticSmoothAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


class SVGPathSegCurvetoCubicSmoothRel extends SVGPathSeg {
  var y: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var y2: js.Number = _
}


/**
 * The SVGLengthList defines a list of SVGLength objects.
 *
 * MDN
 */
class SVGLengthList extends js.Object {
  def numberOfItems: js.Number = _

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
  def replaceItem(newItem: SVGLength, index: js.Number): SVGLength = ???

  /**
   * Returns the specified item from the list. The returned item is the item itself and
   * not a copy. Any changes made to the item are immediately reflected in the list. The
   * first item is number 0. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def getItem(index: js.Number): SVGLength = ???

  /**
   * Clears all existing current items from the list, with the result being an empty
   * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the list corresponds to a read only attribute or when the object itself
   * is read only.
   *
   * MDN
   */
  def clear(): Unit = ???

  /**
   * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
   * from its previous list before it is inserted into this list. The inserted item is the
   * item itself and not a copy. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def appendItem(newItem: SVGLength): SVGLength = ???

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
  def initialize(newItem: SVGLength): SVGLength = ???

  /**
   * Removes an existing item from the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only. a DOMException with code
   * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
   * numberOfItems.
   *
   * MDN
   */
  def removeItem(index: js.Number): SVGLength = ???

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
  def insertItemBefore(newItem: SVGLength, index: js.Number): SVGLength = ???
}


/**
 * The SVGPolylineElement interface provides access to the properties of
 * <polyline> elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGPolylineElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired {
}


trait SVGAnimatedPathData extends js.Object {
  var pathSegList: SVGPathSegList = _
}

trait SVGZoomAndPan extends js.Object {
  var zoomAndPan: js.Number = _
}

object SVGZoomAndPan extends js.Object {
  val SVG_ZOOMANDPAN_MAGNIFY: js.Number = _
  val SVG_ZOOMANDPAN_UNKNOWN: js.Number = _
  val SVG_ZOOMANDPAN_DISABLE: js.Number = _
}


class SVGTextPathElement extends SVGTextContentElement with SVGURIReference {
  def startOffset: SVGAnimatedLength = _
  def method: SVGAnimatedEnumeration = _
  def spacing: SVGAnimatedEnumeration = _
}

object SVGTextPathElement extends js.Object {

  val TEXTPATH_SPACINGTYPE_EXACT: js.Number = _
  val TEXTPATH_METHODTYPE_STRETCH: js.Number = _
  val TEXTPATH_SPACINGTYPE_AUTO: js.Number = _
  val TEXTPATH_SPACINGTYPE_UNKNOWN: js.Number = _
  val TEXTPATH_METHODTYPE_UNKNOWN: js.Number = _
  val TEXTPATH_METHODTYPE_ALIGN: js.Number = _
}

/**
 * The SVGGradient interface is a base interface used by SVGLinearGradientElement
 * and SVGRadialGradientElement.
 *
 * MDN
 */
class SVGGradientElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGExternalResourcesRequired with SVGURIReference {
  /**
   * Corresponds to attribute spreadMethod on the given element. One of the Spread
   * Method Types defined on this interface.
   *
   * MDN
   */
  def spreadMethod: SVGAnimatedEnumeration = _
  /**
   * Corresponds to attribute gradientTransform on the given element.
   *
   * MDN
   */
  def gradientTransform: SVGAnimatedTransformList = _
  /**
   * Corresponds to attribute gradientUnits on the given element. Takes one of the
   * constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def gradientUnits: SVGAnimatedEnumeration = _
}

/**
 * The SVGGradient interface is a base interface used by SVGLinearGradientElement
 * and SVGRadialGradientElement.
 *
 * MDN
 */
object SVGGradientElement extends js.Object {
  val SVG_SPREADMETHOD_REFLECT: js.Number = _
  val SVG_SPREADMETHOD_PAD: js.Number = _
  /**
   * The type is not one of predefined types. It is invalid to attempt to define a new value
   * of this type or to attempt to switch an existing value to this type.
   *
   * MDN
   */
  val SVG_SPREADMETHOD_UNKNOWN: js.Number = _
  val SVG_SPREADMETHOD_REPEAT: js.Number = _
}

/**
 * The SVGNumberList defines a list of SVGNumber objects.
 *
 * MDN
 */
class SVGNumberList extends js.Object {
  def numberOfItems: js.Number = _

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
  def replaceItem(newItem: SVGNumber, index: js.Number): SVGNumber = ???

  /**
   * Returns the specified item from the list. The returned item is the item itself and
   * not a copy. Any changes made to the item are immediately reflected in the list. The
   * first item is number 0. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def getItem(index: js.Number): SVGNumber = ???

  /**
   * Clears all existing current items from the list, with the result being an empty
   * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
   * raised when the list corresponds to a read only attribute or when the object itself
   * is read only.
   *
   * MDN
   */
  def clear(): Unit = ???

  /**
   * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
   * from its previous list before it is inserted into this list. The inserted item is the
   * item itself and not a copy. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only.
   *
   * MDN
   */
  def appendItem(newItem: SVGNumber): SVGNumber = ???

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
  def initialize(newItem: SVGNumber): SVGNumber = ???

  /**
   * Removes an existing item from the list. Exceptions: a DOMException with code
   * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
   * attribute or when the object itself is read only. a DOMException with code
   * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
   * numberOfItems.
   *
   * MDN
   */
  def removeItem(index: js.Number): SVGNumber = ???

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
  def insertItemBefore(newItem: SVGNumber, index: js.Number): SVGNumber = ???
}


class SVGPathSegLinetoRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
 * The SVGAnimatedBoolean interface is used for attributes of type boolean which can
 * be animated.
 *
 * MDN
 */
class SVGAnimatedBoolean extends js.Object {
  /**
   * If the given attribute or property is being animated, contains the current
   * animated value of the attribute or property. If the given attribute or property is
   * not currently being animated, contains the same value as baseVal.
   *
   * MDN
   */
  def animVal: js.Boolean = _
  /**
   * The base value of the given attribute before applying any animations.
   *
   * MDN
   */
  var baseVal: js.Boolean = _
}


/**
 * The SVGSwitchElement interface corresponds to the <switch> element.
 *
 * MDN
 */
class SVGSwitchElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


/**
 * The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio
 * attribute, which is available for some of SVG's elements.
 *
 * MDN
 */
class SVGPreserveAspectRatio extends js.Object {
  /**
   * The type of the alignment value as specified by one of the
   * SVG_PRESERVEASPECTRATIO_* constants defined on this interface.
   *
   * MDN
   */
  var align: js.Number = _
  /**
   * The type of the meet-or-slice value as specified by one of the SVG_MEETORSLICE_*
   * constants defined on this interface.
   *
   * MDN
   */
  var meetOrSlice: js.Number = _
}

/**
 * The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio
 * attribute, which is available for some of SVG's elements.
 *
 * MDN
 */
object SVGPreserveAspectRatio extends js.Object {

  val SVG_PRESERVEASPECTRATIO_NONE: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMINYMID: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMAXYMIN: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMINYMAX: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMAXYMAX: js.Number = _
  /**
   * The enumeration was set to a value that is not one of predefined types. It is invalid
   * to attempt to define a new value of this type or to attempt to switch an existing value
   * to this type.
   *
   * MDN
   */
  val SVG_MEETORSLICE_UNKNOWN: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMAXYMID: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMIDYMAX: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMINYMIN: js.Number = _
  /*
   * Corresponds to value meet for attribute preserveAspectRatio.
   *
   * MDN
   */
  val SVG_MEETORSLICE_MEET: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMIDYMID: js.Number = _
  val SVG_PRESERVEASPECTRATIO_XMIDYMIN: js.Number = _
  /**
   * Corresponds to value slice for attribute preserveAspectRatio.
   *
   * MDN
   */
  val SVG_MEETORSLICE_SLICE: js.Number = _
  val SVG_PRESERVEASPECTRATIO_UNKNOWN: js.Number = _
}


/**
 * The SVGStopElement interface corresponds to the <stop> element.
 *
 * MDN
 */
class SVGStopElement extends SVGElement with SVGStylable {
  /**
   * Corresponds to attribute offset on the given <stop> element.
   *
   * MDN
   */
  var offset: SVGAnimatedNumber = _
}


/**
 * The SVGSymbolElement interface corresponds to the <symbol> element.
 *
 * MDN
 */
class SVGSymbolElement extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
}


class SVGElementInstanceList extends js.Object {
  def length: js.Number = _

  def item(index: js.Number): SVGElementInstance = ???
}


/**
 * The SVGMaskElement interface provides access to the properties of <mask>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGMaskElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute y on the given <mask> element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = _
  /**
   * Corresponds to attribute width on the given <mask> element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = _
  /**
   * Corresponds to attribute maskUnits on the given <mask> element. Takes one of the
   * constants defined in SVGUnitTypes
   *
   * MDN
   */
  def maskUnits: SVGAnimatedEnumeration = _
  /**
   * Corresponds to attribute maskContentUnits on the given <mask> element. Takes one
   * of the constants defined in SVGUnitTypes
   *
   * MDN
   */
  def maskContentUnits: SVGAnimatedEnumeration = _
  /**
   * Corresponds to attribute x on the given <mask> element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = _
  /**
   * Corresponds to attribute height on the given <mask> element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = _
}


/**
 * The SVGFilterElement interface provides access to the properties of <filter>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class SVGFilterElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGURIReference with SVGExternalResourcesRequired {
  /**
   * Corresponds to attribute y on the given <filter> element.
   *
   * MDN
   */
  def y: SVGAnimatedLength = _
  /**
   * Corresponds to attribute width on the given <filter> element.
   *
   * MDN
   */
  def width: SVGAnimatedLength = _
  /**
   * Contains the X component of attribute filterRes on the given <filter> element.
   *
   * MDN
   */
  def filterResX: SVGAnimatedInteger = _
  /**
   * Corresponds to attribute filterUnits on the given <filter> element. Takes one of
   * the constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def filterUnits: SVGAnimatedEnumeration = _
  /**
   * Corresponds to attribute primitiveUnits on the given <filter> element. Takes one
   * of the constants defined in SVGUnitTypes.
   *
   * MDN
   */
  def primitiveUnits: SVGAnimatedEnumeration = _
  /**
   * Corresponds to attribute x on the given <filter> element.
   *
   * MDN
   */
  def x: SVGAnimatedLength = _
  /**
   * Corresponds to attribute height on the given <filter> element.
   *
   * MDN
   */
  def height: SVGAnimatedLength = _
  /**
   * Contains the Y component of attribute filterRes on the given <filter> element.
   *
   * MDN
   */
  def filterResY: SVGAnimatedInteger = _

  /**
   * Sets the values for attribute filterRes.
   *
   * MDN
   */
  def setFilterRes(filterResX: js.Number, filterResY: js.Number): Unit = ???
}


class SVGFEMergeNodeElement extends SVGElement {
  def in1: SVGAnimatedString = _
}


class SVGFEFloodElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
}


class SVGFEFuncAElement extends SVGComponentTransferFunctionElement {
}


class SVGFETileElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in1: SVGAnimatedString = _
}


class SVGFEBlendElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in2: SVGAnimatedString = _
  def mode: SVGAnimatedEnumeration = _
  def in1: SVGAnimatedString = _
}

object SVGFEBlendElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEBlendElement),List())))) */
  val SVG_FEBLEND_MODE_DARKEN: js.Number = _
  val SVG_FEBLEND_MODE_UNKNOWN: js.Number = _
  val SVG_FEBLEND_MODE_MULTIPLY: js.Number = _
  val SVG_FEBLEND_MODE_NORMAL: js.Number = _
  val SVG_FEBLEND_MODE_SCREEN: js.Number = _
  val SVG_FEBLEND_MODE_LIGHTEN: js.Number = _
}

class SVGFEMergeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
}


class SVGFEPointLightElement extends SVGElement {
  def y: SVGAnimatedNumber = _
  def x: SVGAnimatedNumber = _
  def z: SVGAnimatedNumber = _
}


class SVGFEGaussianBlurElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def stdDeviationX: SVGAnimatedNumber = _
  def in1: SVGAnimatedString = _
  def stdDeviationY: SVGAnimatedNumber = _

  def setStdDeviation(stdDeviationX: js.Number, stdDeviationY: js.Number): Unit = ???
}


trait SVGFilterPrimitiveStandardAttributes extends SVGStylable {
  def y: SVGAnimatedLength = _
  def width: SVGAnimatedLength = _
  def x: SVGAnimatedLength = _
  def height: SVGAnimatedLength = _
  def result: SVGAnimatedString = _
}

class SVGFESpecularLightingElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def kernelUnitLengthY: SVGAnimatedNumber = _
  def surfaceScale: SVGAnimatedNumber = _
  def specularExponent: SVGAnimatedNumber = _
  def in1: SVGAnimatedString = _
  def kernelUnitLengthX: SVGAnimatedNumber = _
  def specularConstant: SVGAnimatedNumber = _
}


class SVGFEMorphologyElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def operator: SVGAnimatedEnumeration = _
  def radiusX: SVGAnimatedNumber = _
  def radiusY: SVGAnimatedNumber = _
  def in1: SVGAnimatedString = _
}

object SVGFEMorphologyElement extends js.Object {
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: js.Number = _
  val SVG_MORPHOLOGY_OPERATOR_ERODE: js.Number = _
  val SVG_MORPHOLOGY_OPERATOR_DILATE: js.Number = _
}

class SVGFEFuncRElement extends SVGComponentTransferFunctionElement {
}


class SVGFEDisplacementMapElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in2: SVGAnimatedString = _
  def xChannelSelector: SVGAnimatedEnumeration = _
  def yChannelSelector: SVGAnimatedEnumeration = _
  def scale: SVGAnimatedNumber = _
  def in1: SVGAnimatedString = _
}

object SVGFEDisplacementMapElement extends js.Object {
  val SVG_CHANNEL_B: js.Number = _
  val SVG_CHANNEL_R: js.Number = _
  val SVG_CHANNEL_G: js.Number = _
  val SVG_CHANNEL_UNKNOWN: js.Number = _
  val SVG_CHANNEL_A: js.Number = _
}

class SVGComponentTransferFunctionElement extends SVGElement {
  def tableValues: SVGAnimatedNumberList = _
  def slope: SVGAnimatedNumber = _
  def `type`: SVGAnimatedEnumeration = _
  def exponent: SVGAnimatedNumber = _
  def amplitude: SVGAnimatedNumber = _
  def intercept: SVGAnimatedNumber = _
  def offset: SVGAnimatedNumber = _
}

object SVGComponentTransferFunctionElement extends js.Object {
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: js.Number = _
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: js.Number = _
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: js.Number = _
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: js.Number = _
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: js.Number = _
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: js.Number = _
}

class SVGFEDistantLightElement extends SVGElement {
  def azimuth: SVGAnimatedNumber = _
  def elevation: SVGAnimatedNumber = _
}


class SVGFEFuncBElement extends SVGComponentTransferFunctionElement {
}


class SVGFETurbulenceElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def baseFrequencyX: SVGAnimatedNumber = _
  def numOctaves: SVGAnimatedInteger = _
  def `type`: SVGAnimatedEnumeration = _
  def baseFrequencyY: SVGAnimatedNumber = _
  def stitchTiles: SVGAnimatedEnumeration = _
  def seed: SVGAnimatedNumber = _
}

object SVGFETurbulenceElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFETurbulenceElement),List())))) */
  val SVG_STITCHTYPE_UNKNOWN: js.Number = _
  val SVG_STITCHTYPE_NOSTITCH: js.Number = _
  val SVG_TURBULENCE_TYPE_UNKNOWN: js.Number = _
  val SVG_TURBULENCE_TYPE_TURBULENCE: js.Number = _
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: js.Number = _
  val SVG_STITCHTYPE_STITCH: js.Number = _
}

class SVGFEFuncGElement extends SVGComponentTransferFunctionElement {
}


class SVGFEColorMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in1: SVGAnimatedString = _
  def `type`: SVGAnimatedEnumeration = _
  def values: SVGAnimatedNumberList = _
}

object SVGFEColorMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEColorMatrixElement),List())))) */
  val SVG_FECOLORMATRIX_TYPE_SATURATE: js.Number = _
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: js.Number = _
  val SVG_FECOLORMATRIX_TYPE_MATRIX: js.Number = _
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: js.Number = _
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: js.Number = _
}

class SVGFESpotLightElement extends SVGElement {
  def pointsAtY: SVGAnimatedNumber = _
  def y: SVGAnimatedNumber = _
  def limitingConeAngle: SVGAnimatedNumber = _
  def specularExponent: SVGAnimatedNumber = _
  def x: SVGAnimatedNumber = _
  def pointsAtZ: SVGAnimatedNumber = _
  def z: SVGAnimatedNumber = _
  def pointsAtX: SVGAnimatedNumber = _
}


class SVGFEOffsetElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def dy: SVGAnimatedNumber = _
  def in1: SVGAnimatedString = _
  def dx: SVGAnimatedNumber = _
}


class SVGFEImageElement extends SVGElement with SVGLangSpace with SVGFilterPrimitiveStandardAttributes with SVGURIReference with SVGExternalResourcesRequired {
  def preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
}


class SVGFECompositeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def operator: SVGAnimatedEnumeration = _
  def in2: SVGAnimatedString = _
  def k2: SVGAnimatedNumber = _
  def k1: SVGAnimatedNumber = _
  def k3: SVGAnimatedNumber = _
  def in1: SVGAnimatedString = _
  def k4: SVGAnimatedNumber = _
}

object SVGFECompositeElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFECompositeElement),List())))) */
  val SVG_FECOMPOSITE_OPERATOR_OUT: js.Number = _
  val SVG_FECOMPOSITE_OPERATOR_OVER: js.Number = _
  val SVG_FECOMPOSITE_OPERATOR_XOR: js.Number = _
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: js.Number = _
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: js.Number = _
  val SVG_FECOMPOSITE_OPERATOR_IN: js.Number = _
  val SVG_FECOMPOSITE_OPERATOR_ATOP: js.Number = _
}

class SVGFEComponentTransferElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def in1: SVGAnimatedString = _
}


class SVGFEDiffuseLightingElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def kernelUnitLengthY: SVGAnimatedNumber = _
  def surfaceScale: SVGAnimatedNumber = _
  def in1: SVGAnimatedString = _
  def kernelUnitLengthX: SVGAnimatedNumber = _
  def diffuseConstant: SVGAnimatedNumber = _
}


object SVGFEConvolveMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEConvolveMatrixElement),List())))) */
  val SVG_EDGEMODE_WRAP: js.Number = _
  val SVG_EDGEMODE_DUPLICATE: js.Number = _
  val SVG_EDGEMODE_UNKNOWN: js.Number = _
  val SVG_EDGEMODE_NONE: js.Number = _
}

class SVGFEConvolveMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  def orderY: SVGAnimatedInteger = _
  def kernelUnitLengthY: SVGAnimatedNumber = _
  def orderX: SVGAnimatedInteger = _
  def preserveAlpha: SVGAnimatedBoolean = _
  def kernelMatrix: SVGAnimatedNumberList = _
  def edgeMode: SVGAnimatedEnumeration = _
  def kernelUnitLengthX: SVGAnimatedNumber = _
  def bias: SVGAnimatedNumber = _
  def targetX: SVGAnimatedInteger = _
  def targetY: SVGAnimatedInteger = _
  def divisor: SVGAnimatedNumber = _
  def in1: SVGAnimatedString = _
}
