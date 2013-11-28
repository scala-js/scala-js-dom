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


class SVGMarkerElement extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
  var orientType: SVGAnimatedEnumeration = _
  var markerUnits: SVGAnimatedEnumeration = _
  var markerWidth: SVGAnimatedLength = _
  var markerHeight: SVGAnimatedLength = _
  var orientAngle: SVGAnimatedAngle = _
  var refY: SVGAnimatedLength = _
  var refX: SVGAnimatedLength = _

  def setOrientToAngle(angle: SVGAngle): Unit = ???

  def setOrientToAuto(): Unit = ???

  var SVG_MARKER_ORIENT_UNKNOWN: js.Number = _
  var SVG_MARKER_ORIENT_ANGLE: js.Number = _
  var SVG_MARKERUNITS_UNKNOWN: js.Number = _
  var SVG_MARKERUNITS_STROKEWIDTH: js.Number = _
  var SVG_MARKER_ORIENT_AUTO: js.Number = _
  var SVG_MARKERUNITS_USERSPACEONUSE: js.Number = _
}

object SVGMarkerElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGMarkerElement),List())))) */
  var SVG_MARKER_ORIENT_UNKNOWN: js.Number = _
  var SVG_MARKER_ORIENT_ANGLE: js.Number = _
  var SVG_MARKERUNITS_UNKNOWN: js.Number = _
  var SVG_MARKERUNITS_STROKEWIDTH: js.Number = _
  var SVG_MARKER_ORIENT_AUTO: js.Number = _
  var SVG_MARKERUNITS_USERSPACEONUSE: js.Number = _
}

class SVGGElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


class SVGPathSegCurvetoCubicSmoothAbs extends SVGPathSeg {
  var y: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var y2: js.Number = _
}


class SVGZoomEvent extends UIEvent {
  var zoomRectScreen: SVGRect = _
  var previousScale: js.Number = _
  var newScale: js.Number = _
  var previousTranslate: SVGPoint = _
  var newTranslate: SVGPoint = _
}


trait SVGUnitTypes extends js.Object {
  var SVG_UNIT_TYPE_UNKNOWN: js.Number = _
  var SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: js.Number = _
  var SVG_UNIT_TYPE_USERSPACEONUSE: js.Number = _
}

object SVGUnitTypes extends js.Object {
  var SVG_UNIT_TYPE_UNKNOWN: js.Number = _
  var SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: js.Number = _
  var SVG_UNIT_TYPE_USERSPACEONUSE: js.Number = _
}

class SVGPathSegMovetoRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


class SVGLineElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var y1: SVGAnimatedLength = _
  var x2: SVGAnimatedLength = _
  var x1: SVGAnimatedLength = _
  var y2: SVGAnimatedLength = _
}


class SVGDescElement extends SVGElement with SVGStylable with SVGLangSpace {
}


class SVGPathSegCurvetoQuadraticSmoothRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


class SVGClipPathElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var clipPathUnits: SVGAnimatedEnumeration = _
}


class SVGTextPositioningElement extends SVGTextContentElement {
  var y: SVGAnimatedLengthList = _
  var rotate: SVGAnimatedNumberList = _
  var dy: SVGAnimatedLengthList = _
  var x: SVGAnimatedLengthList = _
  var dx: SVGAnimatedLengthList = _
}


class SVGPathSegLinetoVerticalRel extends SVGPathSeg {
  var y: js.Number = _
}


class SVGAnimatedString extends js.Object {
  var animVal: js.String = _
  var baseVal: js.String = _
}


trait SVGTests extends js.Object {
  var requiredFeatures: SVGStringList = _
  var requiredExtensions: SVGStringList = _
  var systemLanguage: SVGStringList = _

  def hasExtension(extension: js.String): js.Boolean = ???
}

class SVGPatternElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired with SVGURIReference {
  var patternUnits: SVGAnimatedEnumeration = _
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var patternContentUnits: SVGAnimatedEnumeration = _
  var patternTransform: SVGAnimatedTransformList = _
  var height: SVGAnimatedLength = _
}


class SVGAnimatedAngle extends js.Object {
  var animVal: SVGAngle = _
  var baseVal: SVGAngle = _
}


class SVGScriptElement extends SVGElement with SVGExternalResourcesRequired with SVGURIReference {
  var `type`: js.String = _
}


class SVGViewElement extends SVGElement with SVGZoomAndPan with SVGFitToViewBox with SVGExternalResourcesRequired {
  var viewTarget: SVGStringList = _
}


trait SVGLocatable extends js.Object {
  var farthestViewportElement: SVGElement = _
  var nearestViewportElement: SVGElement = _

  def getBBox(): SVGRect = ???

  def getTransformToElement(element: SVGElement): SVGMatrix = ???

  def getCTM(): SVGMatrix = ???

  def getScreenCTM(): SVGMatrix = ???
}

class SVGTitleElement extends SVGElement with SVGStylable with SVGLangSpace {
}


class SVGAnimatedTransformList extends js.Object {
  var animVal: SVGTransformList = _
  var baseVal: SVGTransformList = _
}


trait SVGFitToViewBox extends js.Object {
  var viewBox: SVGAnimatedRect = _
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
}

class SVGPointList extends js.Object {
  var numberOfItems: js.Number = _

  def replaceItem(newItem: SVGPoint, index: js.Number): SVGPoint = ???

  def getItem(index: js.Number): SVGPoint = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGPoint): SVGPoint = ???

  def initialize(newItem: SVGPoint): SVGPoint = ???

  def removeItem(index: js.Number): SVGPoint = ???

  def insertItemBefore(newItem: SVGPoint, index: js.Number): SVGPoint = ???
}


class SVGAnimatedLengthList extends js.Object {
  var animVal: SVGLengthList = _
  var baseVal: SVGLengthList = _
}


class SVGAnimatedPreserveAspectRatio extends js.Object {
  var animVal: SVGPreserveAspectRatio = _
  var baseVal: SVGPreserveAspectRatio = _
}


trait SVGExternalResourcesRequired extends js.Object {
  var externalResourcesRequired: SVGAnimatedBoolean = _
}

class SVGAngle extends js.Object {
  var valueAsString: js.String = _
  var valueInSpecifiedUnits: js.Number = _
  var value: js.Number = _
  var unitType: js.Number = _

  def newValueSpecifiedUnits(unitType: js.Number, valueInSpecifiedUnits: js.Number): Unit = ???

  def convertToSpecifiedUnits(unitType: js.Number): Unit = ???

  var SVG_ANGLETYPE_RAD: js.Number = _
  var SVG_ANGLETYPE_UNKNOWN: js.Number = _
  var SVG_ANGLETYPE_UNSPECIFIED: js.Number = _
  var SVG_ANGLETYPE_DEG: js.Number = _
  var SVG_ANGLETYPE_GRAD: js.Number = _
}

object SVGAngle extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAngle),List())))) */
  var SVG_ANGLETYPE_RAD: js.Number = _
  var SVG_ANGLETYPE_UNKNOWN: js.Number = _
  var SVG_ANGLETYPE_UNSPECIFIED: js.Number = _
  var SVG_ANGLETYPE_DEG: js.Number = _
  var SVG_ANGLETYPE_GRAD: js.Number = _
}

class SVGElement extends Element {
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var viewportElement: SVGElement = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
  var xmlbase: js.String = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var ownerSVGElement: SVGSVGElement = _
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


class SVGTransformList extends js.Object {
  var numberOfItems: js.Number = _

  def getItem(index: js.Number): SVGTransform = ???

  def consolidate(): SVGTransform = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGTransform): SVGTransform = ???

  def initialize(newItem: SVGTransform): SVGTransform = ???

  def removeItem(index: js.Number): SVGTransform = ???

  def insertItemBefore(newItem: SVGTransform, index: js.Number): SVGTransform = ???

  def replaceItem(newItem: SVGTransform, index: js.Number): SVGTransform = ???

  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = ???
}


class SVGPathSegClosePath extends SVGPathSeg {
}


class SVGAnimatedLength extends js.Object {
  var animVal: SVGLength = _
  var baseVal: SVGLength = _
}


trait SVGAnimatedPoints extends js.Object {
  var points: SVGPointList = _
  var animatedPoints: SVGPointList = _
}

class SVGDefsElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


class SVGPathSegLinetoHorizontalRel extends SVGPathSeg {
  var x: js.Number = _
}


class SVGEllipseElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var ry: SVGAnimatedLength = _
  var cx: SVGAnimatedLength = _
  var rx: SVGAnimatedLength = _
  var cy: SVGAnimatedLength = _
}


class SVGAElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  var target: SVGAnimatedString = _
}


trait SVGStylable extends js.Object {
  var className: SVGAnimatedString = _
  var style: CSSStyleDeclaration = _
}

trait SVGTransformable extends SVGLocatable {
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


class SVGAnimatedNumberList extends js.Object {
  var animVal: SVGNumberList = _
  var baseVal: SVGNumberList = _
}


class SVGSVGElement extends SVGElement with SVGStylable with SVGZoomAndPan with DocumentEvent with SVGLangSpace with SVGLocatable with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired {
  var width: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var contentStyleType: js.String = _
  var onzoom: js.Function1[js.Any, js.Any] = _
  var y: SVGAnimatedLength = _
  var viewport: SVGRect = _
  var onerror: js.Function1[Event, js.Any] = _
  var pixelUnitToMillimeterY: js.Number = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  var screenPixelToMillimeterY: js.Number = _
  var height: SVGAnimatedLength = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var contentScriptType: js.String = _
  var pixelUnitToMillimeterX: js.Number = _
  var currentTranslate: SVGPoint = _
  var onunload: js.Function1[Event, js.Any] = _
  var currentScale: js.Number = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var screenPixelToMillimeterX: js.Number = _

  def setCurrentTime(seconds: js.Number): Unit = ???

  def createSVGLength(): SVGLength = ???

  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeList = ???

  def unpauseAnimations(): Unit = ???

  def createSVGRect(): SVGRect = ???

  def checkIntersection(element: SVGElement, rect: SVGRect): js.Boolean = ???

  def unsuspendRedrawAll(): Unit = ???

  def pauseAnimations(): Unit = ???

  def suspendRedraw(maxWaitMilliseconds: js.Number): js.Number = ???

  def deselectAll(): Unit = ???

  def createSVGAngle(): SVGAngle = ???

  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeList = ???

  def createSVGTransform(): SVGTransform = ???

  def unsuspendRedraw(suspendHandleID: js.Number): Unit = ???

  def forceRedraw(): Unit = ???

  def getCurrentTime(): js.Number = ???

  def checkEnclosure(element: SVGElement, rect: SVGRect): js.Boolean = ???

  def createSVGMatrix(): SVGMatrix = ???

  def createSVGPoint(): SVGPoint = ???

  def createSVGNumber(): SVGNumber = ???

  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = ???

  def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???

  def getComputedStyle(elt: Element): CSSStyleDeclaration = ???

  def getElementById(elementId: js.String): Element = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


class SVGAnimatedInteger extends js.Object {
  var animVal: js.Number = _
  var baseVal: js.Number = _
}


class SVGTextElement extends SVGTextPositioningElement with SVGTransformable {
}


class SVGTSpanElement extends SVGTextPositioningElement {
}


class SVGPathSegLinetoVerticalAbs extends SVGPathSeg {
  var y: js.Number = _
}


class SVGStyleElement extends SVGElement with SVGLangSpace {
  var media: js.String = _
  var `type`: js.String = _
  var title: js.String = _
}


class SVGRadialGradientElement extends SVGGradientElement {
  var cx: SVGAnimatedLength = _
  var r: SVGAnimatedLength = _
  var cy: SVGAnimatedLength = _
  var fx: SVGAnimatedLength = _
  var fy: SVGAnimatedLength = _
}


class SVGImageElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
}


class SVGAnimatedNumber extends js.Object {
  var animVal: js.Number = _
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


class SVGStringList extends js.Object {
  var numberOfItems: js.Number = _

  def replaceItem(newItem: js.String, index: js.Number): js.String = ???

  def getItem(index: js.Number): js.String = ???

  def clear(): Unit = ???

  def appendItem(newItem: js.String): js.String = ???

  def initialize(newItem: js.String): js.String = ???

  def removeItem(index: js.Number): js.String = ???

  def insertItemBefore(newItem: js.String, index: js.Number): js.String = ???
}


class SVGLength extends js.Object {
  var valueAsString: js.String = _
  var valueInSpecifiedUnits: js.Number = _
  var value: js.Number = _
  var unitType: js.Number = _

  def newValueSpecifiedUnits(unitType: js.Number, valueInSpecifiedUnits: js.Number): Unit = ???

  def convertToSpecifiedUnits(unitType: js.Number): Unit = ???

  var SVG_LENGTHTYPE_NUMBER: js.Number = _
  var SVG_LENGTHTYPE_CM: js.Number = _
  var SVG_LENGTHTYPE_PC: js.Number = _
  var SVG_LENGTHTYPE_PERCENTAGE: js.Number = _
  var SVG_LENGTHTYPE_MM: js.Number = _
  var SVG_LENGTHTYPE_PT: js.Number = _
  var SVG_LENGTHTYPE_IN: js.Number = _
  var SVG_LENGTHTYPE_EMS: js.Number = _
  var SVG_LENGTHTYPE_PX: js.Number = _
  var SVG_LENGTHTYPE_UNKNOWN: js.Number = _
  var SVG_LENGTHTYPE_EXS: js.Number = _
}

object SVGLength extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLength),List())))) */
  var SVG_LENGTHTYPE_NUMBER: js.Number = _
  var SVG_LENGTHTYPE_CM: js.Number = _
  var SVG_LENGTHTYPE_PC: js.Number = _
  var SVG_LENGTHTYPE_PERCENTAGE: js.Number = _
  var SVG_LENGTHTYPE_MM: js.Number = _
  var SVG_LENGTHTYPE_PT: js.Number = _
  var SVG_LENGTHTYPE_IN: js.Number = _
  var SVG_LENGTHTYPE_EMS: js.Number = _
  var SVG_LENGTHTYPE_PX: js.Number = _
  var SVG_LENGTHTYPE_UNKNOWN: js.Number = _
  var SVG_LENGTHTYPE_EXS: js.Number = _
}

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
  var textLength: SVGAnimatedLength = _
  var lengthAdjust: SVGAnimatedEnumeration = _

  def getCharNumAtPosition(point: SVGPoint): js.Number = ???

  def getStartPositionOfChar(charnum: js.Number): SVGPoint = ???

  def getExtentOfChar(charnum: js.Number): SVGRect = ???

  def getComputedTextLength(): js.Number = ???

  def getSubStringLength(charnum: js.Number, nchars: js.Number): js.Number = ???

  def selectSubString(charnum: js.Number, nchars: js.Number): Unit = ???

  def getNumberOfChars(): js.Number = ???

  def getRotationOfChar(charnum: js.Number): js.Number = ???

  def getEndPositionOfChar(charnum: js.Number): SVGPoint = ???

  var LENGTHADJUST_SPACING: js.Number = _
  var LENGTHADJUST_SPACINGANDGLYPHS: js.Number = _
  var LENGTHADJUST_UNKNOWN: js.Number = _
}

object SVGTextContentElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextContentElement),List())))) */
  var LENGTHADJUST_SPACING: js.Number = _
  var LENGTHADJUST_SPACINGANDGLYPHS: js.Number = _
  var LENGTHADJUST_UNKNOWN: js.Number = _
}

class SVGTransform extends js.Object {
  var `type`: js.Number = _
  var angle: js.Number = _
  var matrix: SVGMatrix = _

  def setTranslate(tx: js.Number, ty: js.Number): Unit = ???

  def setScale(sx: js.Number, sy: js.Number): Unit = ???

  def setMatrix(matrix: SVGMatrix): Unit = ???

  def setSkewY(angle: js.Number): Unit = ???

  def setRotate(angle: js.Number, cx: js.Number, cy: js.Number): Unit = ???

  def setSkewX(angle: js.Number): Unit = ???

  var SVG_TRANSFORM_SKEWX: js.Number = _
  var SVG_TRANSFORM_UNKNOWN: js.Number = _
  var SVG_TRANSFORM_SCALE: js.Number = _
  var SVG_TRANSFORM_TRANSLATE: js.Number = _
  var SVG_TRANSFORM_MATRIX: js.Number = _
  var SVG_TRANSFORM_ROTATE: js.Number = _
  var SVG_TRANSFORM_SKEWY: js.Number = _
}

object SVGTransform extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTransform),List())))) */
  var SVG_TRANSFORM_SKEWX: js.Number = _
  var SVG_TRANSFORM_UNKNOWN: js.Number = _
  var SVG_TRANSFORM_SCALE: js.Number = _
  var SVG_TRANSFORM_TRANSLATE: js.Number = _
  var SVG_TRANSFORM_MATRIX: js.Number = _
  var SVG_TRANSFORM_ROTATE: js.Number = _
  var SVG_TRANSFORM_SKEWY: js.Number = _
}

trait SVGURIReference extends js.Object {
  var href: SVGAnimatedString = _
}

class SVGPathSeg extends js.Object {
  var pathSegType: js.Number = _
  var pathSegTypeAsLetter: js.String = _
  var PATHSEG_MOVETO_REL: js.Number = _
  var PATHSEG_LINETO_VERTICAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_ABS: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_ABS: js.Number = _
  var PATHSEG_LINETO_ABS: js.Number = _
  var PATHSEG_CLOSEPATH: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_REL: js.Number = _
  var PATHSEG_LINETO_REL: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_ARC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_REL: js.Number = _
  var PATHSEG_UNKNOWN: js.Number = _
  var PATHSEG_LINETO_VERTICAL_ABS: js.Number = _
  var PATHSEG_ARC_ABS: js.Number = _
  var PATHSEG_MOVETO_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: js.Number = _
}

object SVGPathSeg extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSeg),List())))) */
  var PATHSEG_MOVETO_REL: js.Number = _
  var PATHSEG_LINETO_VERTICAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_ABS: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_ABS: js.Number = _
  var PATHSEG_LINETO_ABS: js.Number = _
  var PATHSEG_CLOSEPATH: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_REL: js.Number = _
  var PATHSEG_LINETO_REL: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_ARC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_REL: js.Number = _
  var PATHSEG_UNKNOWN: js.Number = _
  var PATHSEG_LINETO_VERTICAL_ABS: js.Number = _
  var PATHSEG_ARC_ABS: js.Number = _
  var PATHSEG_MOVETO_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: js.Number = _
}

class SVGNumber extends js.Object {
  var value: js.Number = _
}


class SVGPathElement extends SVGElement with SVGStylable with SVGAnimatedPathData with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  def getPathSegAtLength(distance: js.Number): js.Number = ???

  def getPointAtLength(distance: js.Number): SVGPoint = ???

  def createSVGPathSegCurvetoQuadraticAbs(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number): SVGPathSegCurvetoQuadraticAbs = ???

  def createSVGPathSegLinetoRel(x: js.Number, y: js.Number): SVGPathSegLinetoRel = ???

  def createSVGPathSegCurvetoQuadraticRel(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number): SVGPathSegCurvetoQuadraticRel = ???

  def createSVGPathSegCurvetoCubicAbs(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicAbs = ???

  def createSVGPathSegLinetoAbs(x: js.Number, y: js.Number): SVGPathSegLinetoAbs = ???

  def createSVGPathSegClosePath(): SVGPathSegClosePath = ???

  def createSVGPathSegCurvetoCubicRel(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicRel = ???

  def createSVGPathSegCurvetoQuadraticSmoothRel(x: js.Number, y: js.Number): SVGPathSegCurvetoQuadraticSmoothRel = ???

  def createSVGPathSegMovetoRel(x: js.Number, y: js.Number): SVGPathSegMovetoRel = ???

  def createSVGPathSegCurvetoCubicSmoothAbs(x: js.Number, y: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicSmoothAbs = ???

  def createSVGPathSegMovetoAbs(x: js.Number, y: js.Number): SVGPathSegMovetoAbs = ???

  def createSVGPathSegLinetoVerticalRel(y: js.Number): SVGPathSegLinetoVerticalRel = ???

  def createSVGPathSegArcRel(x: js.Number, y: js.Number, r1: js.Number, r2: js.Number, angle: js.Number, largeArcFlag: js.Boolean, sweepFlag: js.Boolean): SVGPathSegArcRel = ???

  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: js.Number, y: js.Number): SVGPathSegCurvetoQuadraticSmoothAbs = ???

  def createSVGPathSegLinetoHorizontalRel(x: js.Number): SVGPathSegLinetoHorizontalRel = ???

  def getTotalLength(): js.Number = ???

  def createSVGPathSegCurvetoCubicSmoothRel(x: js.Number, y: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicSmoothRel = ???

  def createSVGPathSegLinetoHorizontalAbs(x: js.Number): SVGPathSegLinetoHorizontalAbs = ???

  def createSVGPathSegLinetoVerticalAbs(y: js.Number): SVGPathSegLinetoVerticalAbs = ???

  def createSVGPathSegArcAbs(x: js.Number, y: js.Number, r1: js.Number, r2: js.Number, angle: js.Number, largeArcFlag: js.Boolean, sweepFlag: js.Boolean): SVGPathSegArcAbs = ???
}


class SVGAnimatedRect extends js.Object {
  var animVal: SVGRect = _
  var baseVal: SVGRect = _
}


class SVGPathSegList extends js.Object {
  var numberOfItems: js.Number = _

  def replaceItem(newItem: SVGPathSeg, index: js.Number): SVGPathSeg = ???

  def getItem(index: js.Number): SVGPathSeg = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGPathSeg): SVGPathSeg = ???

  def initialize(newItem: SVGPathSeg): SVGPathSeg = ???

  def removeItem(index: js.Number): SVGPathSeg = ???

  def insertItemBefore(newItem: SVGPathSeg, index: js.Number): SVGPathSeg = ???
}


class SVGElementInstance extends EventTarget {
  var previousSibling: SVGElementInstance = _
  var parentNode: SVGElementInstance = _
  var lastChild: SVGElementInstance = _
  var nextSibling: SVGElementInstance = _
  var childNodes: SVGElementInstanceList = _
  var correspondingUseElement: SVGUseElement = _
  var correspondingElement: SVGElement = _
  var firstChild: SVGElementInstance = _
}


class SVGCircleElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var cx: SVGAnimatedLength = _
  var r: SVGAnimatedLength = _
  var cy: SVGAnimatedLength = _
}


class SVGRect extends js.Object {
  var y: js.Number = _
  var width: js.Number = _
  var x: js.Number = _
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


class SVGMatrix extends js.Object {
  var e: js.Number = _
  var c: js.Number = _
  var a: js.Number = _
  var b: js.Number = _
  var d: js.Number = _
  var f: js.Number = _

  def multiply(secondMatrix: SVGMatrix): SVGMatrix = ???

  def flipY(): SVGMatrix = ???

  def skewY(angle: js.Number): SVGMatrix = ???

  def inverse(): SVGMatrix = ???

  def scaleNonUniform(scaleFactorX: js.Number, scaleFactorY: js.Number): SVGMatrix = ???

  def rotate(angle: js.Number): SVGMatrix = ???

  def flipX(): SVGMatrix = ???

  def translate(x: js.Number, y: js.Number): SVGMatrix = ???

  def scale(scaleFactor: js.Number): SVGMatrix = ???

  def rotateFromVector(x: js.Number, y: js.Number): SVGMatrix = ???

  def skewX(angle: js.Number): SVGMatrix = ???
}


class SVGUseElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var animatedInstanceRoot: SVGElementInstance = _
  var instanceRoot: SVGElementInstance = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
}


trait SVGException extends js.Object {
  var code: js.Number = _
  var message: js.String = _

  var SVG_MATRIX_NOT_INVERTABLE: js.Number = _
  var SVG_WRONG_TYPE_ERR: js.Number = _
  var SVG_INVALID_VALUE_ERR: js.Number = _
  var name: js.String = _
}

object SVGException extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGException),List())))) */
  var SVG_MATRIX_NOT_INVERTABLE: js.Number = _
  var SVG_WRONG_TYPE_ERR: js.Number = _
  var SVG_INVALID_VALUE_ERR: js.Number = _
}

class SVGLinearGradientElement extends SVGGradientElement {
  var y1: SVGAnimatedLength = _
  var x2: SVGAnimatedLength = _
  var x1: SVGAnimatedLength = _
  var y2: SVGAnimatedLength = _
}


class SVGAnimatedEnumeration extends js.Object {
  var animVal: js.Number = _
  var baseVal: js.Number = _
}


class SVGRectElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var ry: SVGAnimatedLength = _
  var rx: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
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


class SVGLengthList extends js.Object {
  var numberOfItems: js.Number = _

  def replaceItem(newItem: SVGLength, index: js.Number): SVGLength = ???

  def getItem(index: js.Number): SVGLength = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGLength): SVGLength = ???

  def initialize(newItem: SVGLength): SVGLength = ???

  def removeItem(index: js.Number): SVGLength = ???

  def insertItemBefore(newItem: SVGLength, index: js.Number): SVGLength = ???
}


class SVGPolylineElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired {
}


trait SVGAnimatedPathData extends js.Object {
  var pathSegList: SVGPathSegList = _
}

trait SVGZoomAndPan extends js.Object {
  var zoomAndPan: js.Number = _
  var SVG_ZOOMANDPAN_MAGNIFY: js.Number = _
  var SVG_ZOOMANDPAN_UNKNOWN: js.Number = _
  var SVG_ZOOMANDPAN_DISABLE: js.Number = _
}

object SVGZoomAndPan extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGZoomAndPan),List())))) */
  var SVG_ZOOMANDPAN_MAGNIFY: js.Number = _
  var SVG_ZOOMANDPAN_UNKNOWN: js.Number = _
  var SVG_ZOOMANDPAN_DISABLE: js.Number = _
}


class SVGTextPathElement extends SVGTextContentElement with SVGURIReference {
  var startOffset: SVGAnimatedLength = _
  var method: SVGAnimatedEnumeration = _
  var spacing: SVGAnimatedEnumeration = _
  var TEXTPATH_SPACINGTYPE_EXACT: js.Number = _
  var TEXTPATH_METHODTYPE_STRETCH: js.Number = _
  var TEXTPATH_SPACINGTYPE_AUTO: js.Number = _
  var TEXTPATH_SPACINGTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_ALIGN: js.Number = _
}

object SVGTextPathElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextPathElement),List())))) */
  var TEXTPATH_SPACINGTYPE_EXACT: js.Number = _
  var TEXTPATH_METHODTYPE_STRETCH: js.Number = _
  var TEXTPATH_SPACINGTYPE_AUTO: js.Number = _
  var TEXTPATH_SPACINGTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_ALIGN: js.Number = _
}

class SVGGradientElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGExternalResourcesRequired with SVGURIReference {
  var spreadMethod: SVGAnimatedEnumeration = _
  var gradientTransform: SVGAnimatedTransformList = _
  var gradientUnits: SVGAnimatedEnumeration = _
  var SVG_SPREADMETHOD_REFLECT: js.Number = _
  var SVG_SPREADMETHOD_PAD: js.Number = _
  var SVG_SPREADMETHOD_UNKNOWN: js.Number = _
  var SVG_SPREADMETHOD_REPEAT: js.Number = _
}

object SVGGradientElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGGradientElement),List())))) */
  var SVG_SPREADMETHOD_REFLECT: js.Number = _
  var SVG_SPREADMETHOD_PAD: js.Number = _
  var SVG_SPREADMETHOD_UNKNOWN: js.Number = _
  var SVG_SPREADMETHOD_REPEAT: js.Number = _
}

class SVGNumberList extends js.Object {
  var numberOfItems: js.Number = _

  def replaceItem(newItem: SVGNumber, index: js.Number): SVGNumber = ???

  def getItem(index: js.Number): SVGNumber = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGNumber): SVGNumber = ???

  def initialize(newItem: SVGNumber): SVGNumber = ???

  def removeItem(index: js.Number): SVGNumber = ???

  def insertItemBefore(newItem: SVGNumber, index: js.Number): SVGNumber = ???
}


class SVGPathSegLinetoRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


class SVGAnimatedBoolean extends js.Object {
  var animVal: js.Boolean = _
  var baseVal: js.Boolean = _
}


class SVGSwitchElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


class SVGPreserveAspectRatio extends js.Object {
  var align: js.Number = _
  var meetOrSlice: js.Number = _
  var SVG_PRESERVEASPECTRATIO_NONE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMIN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMAX: js.Number = _
  var SVG_MEETORSLICE_UNKNOWN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMIN: js.Number = _
  var SVG_MEETORSLICE_MEET: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMIN: js.Number = _
  var SVG_MEETORSLICE_SLICE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_UNKNOWN: js.Number = _
}

object SVGPreserveAspectRatio extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPreserveAspectRatio),List())))) */
  var SVG_PRESERVEASPECTRATIO_NONE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMIN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMAX: js.Number = _
  var SVG_MEETORSLICE_UNKNOWN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMIN: js.Number = _
  var SVG_MEETORSLICE_MEET: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMIN: js.Number = _
  var SVG_MEETORSLICE_SLICE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_UNKNOWN: js.Number = _
}


class SVGStopElement extends SVGElement with SVGStylable {
  var offset: SVGAnimatedNumber = _
}


class SVGSymbolElement extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
}


class SVGElementInstanceList extends js.Object {
  var length: js.Number = _

  def item(index: js.Number): SVGElementInstance = ???
}


class SVGMaskElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var maskUnits: SVGAnimatedEnumeration = _
  var maskContentUnits: SVGAnimatedEnumeration = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
}


class SVGFilterElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGURIReference with SVGExternalResourcesRequired {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var filterResX: SVGAnimatedInteger = _
  var filterUnits: SVGAnimatedEnumeration = _
  var primitiveUnits: SVGAnimatedEnumeration = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
  var filterResY: SVGAnimatedInteger = _

  def setFilterRes(filterResX: js.Number, filterResY: js.Number): Unit = ???
}


class SVGFEMergeNodeElement extends SVGElement {
  var in1: SVGAnimatedString = _
}


class SVGFEFloodElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
}


class SVGFEFuncAElement extends SVGComponentTransferFunctionElement {
}


class SVGFETileElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
}


class SVGFEBlendElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in2: SVGAnimatedString = _
  var mode: SVGAnimatedEnumeration = _
  var in1: SVGAnimatedString = _
  var SVG_FEBLEND_MODE_DARKEN: js.Number = _
  var SVG_FEBLEND_MODE_UNKNOWN: js.Number = _
  var SVG_FEBLEND_MODE_MULTIPLY: js.Number = _
  var SVG_FEBLEND_MODE_NORMAL: js.Number = _
  var SVG_FEBLEND_MODE_SCREEN: js.Number = _
  var SVG_FEBLEND_MODE_LIGHTEN: js.Number = _
}

object SVGFEBlendElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEBlendElement),List())))) */
  var SVG_FEBLEND_MODE_DARKEN: js.Number = _
  var SVG_FEBLEND_MODE_UNKNOWN: js.Number = _
  var SVG_FEBLEND_MODE_MULTIPLY: js.Number = _
  var SVG_FEBLEND_MODE_NORMAL: js.Number = _
  var SVG_FEBLEND_MODE_SCREEN: js.Number = _
  var SVG_FEBLEND_MODE_LIGHTEN: js.Number = _
}

class SVGFEMergeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
}


class SVGFEPointLightElement extends SVGElement {
  var y: SVGAnimatedNumber = _
  var x: SVGAnimatedNumber = _
  var z: SVGAnimatedNumber = _
}


class SVGFEGaussianBlurElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var stdDeviationX: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var stdDeviationY: SVGAnimatedNumber = _

  def setStdDeviation(stdDeviationX: js.Number, stdDeviationY: js.Number): Unit = ???
}


trait SVGFilterPrimitiveStandardAttributes extends SVGStylable {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
  var result: SVGAnimatedString = _
}

class SVGFESpecularLightingElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var surfaceScale: SVGAnimatedNumber = _
  var specularExponent: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var specularConstant: SVGAnimatedNumber = _
}


class SVGFEMorphologyElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var operator: SVGAnimatedEnumeration = _
  var radiusX: SVGAnimatedNumber = _
  var radiusY: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_MORPHOLOGY_OPERATOR_UNKNOWN: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_ERODE: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_DILATE: js.Number = _
}

object SVGFEMorphologyElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEMorphologyElement),List())))) */
  var SVG_MORPHOLOGY_OPERATOR_UNKNOWN: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_ERODE: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_DILATE: js.Number = _
}

class SVGFEFuncRElement extends SVGComponentTransferFunctionElement {
}


class SVGFEDisplacementMapElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in2: SVGAnimatedString = _
  var xChannelSelector: SVGAnimatedEnumeration = _
  var yChannelSelector: SVGAnimatedEnumeration = _
  var scale: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_CHANNEL_B: js.Number = _
  var SVG_CHANNEL_R: js.Number = _
  var SVG_CHANNEL_G: js.Number = _
  var SVG_CHANNEL_UNKNOWN: js.Number = _
  var SVG_CHANNEL_A: js.Number = _
}

object SVGFEDisplacementMapElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEDisplacementMapElement),List())))) */
  var SVG_CHANNEL_B: js.Number = _
  var SVG_CHANNEL_R: js.Number = _
  var SVG_CHANNEL_G: js.Number = _
  var SVG_CHANNEL_UNKNOWN: js.Number = _
  var SVG_CHANNEL_A: js.Number = _
}

class SVGComponentTransferFunctionElement extends SVGElement {
  var tableValues: SVGAnimatedNumberList = _
  var slope: SVGAnimatedNumber = _
  var `type`: SVGAnimatedEnumeration = _
  var exponent: SVGAnimatedNumber = _
  var amplitude: SVGAnimatedNumber = _
  var intercept: SVGAnimatedNumber = _
  var offset: SVGAnimatedNumber = _
  var SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_TABLE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: js.Number = _
}

object SVGComponentTransferFunctionElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGComponentTransferFunctionElement),List())))) */
  var SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_TABLE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: js.Number = _
}

class SVGFEDistantLightElement extends SVGElement {
  var azimuth: SVGAnimatedNumber = _
  var elevation: SVGAnimatedNumber = _
}


class SVGFEFuncBElement extends SVGComponentTransferFunctionElement {
}


class SVGFETurbulenceElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var baseFrequencyX: SVGAnimatedNumber = _
  var numOctaves: SVGAnimatedInteger = _
  var `type`: SVGAnimatedEnumeration = _
  var baseFrequencyY: SVGAnimatedNumber = _
  var stitchTiles: SVGAnimatedEnumeration = _
  var seed: SVGAnimatedNumber = _
  var SVG_STITCHTYPE_UNKNOWN: js.Number = _
  var SVG_STITCHTYPE_NOSTITCH: js.Number = _
  var SVG_TURBULENCE_TYPE_UNKNOWN: js.Number = _
  var SVG_TURBULENCE_TYPE_TURBULENCE: js.Number = _
  var SVG_TURBULENCE_TYPE_FRACTALNOISE: js.Number = _
  var SVG_STITCHTYPE_STITCH: js.Number = _
}

object SVGFETurbulenceElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFETurbulenceElement),List())))) */
  var SVG_STITCHTYPE_UNKNOWN: js.Number = _
  var SVG_STITCHTYPE_NOSTITCH: js.Number = _
  var SVG_TURBULENCE_TYPE_UNKNOWN: js.Number = _
  var SVG_TURBULENCE_TYPE_TURBULENCE: js.Number = _
  var SVG_TURBULENCE_TYPE_FRACTALNOISE: js.Number = _
  var SVG_STITCHTYPE_STITCH: js.Number = _
}

class SVGFEFuncGElement extends SVGComponentTransferFunctionElement {
}


class SVGFEColorMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
  var `type`: SVGAnimatedEnumeration = _
  var values: SVGAnimatedNumberList = _
  var SVG_FECOLORMATRIX_TYPE_SATURATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_MATRIX: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_HUEROTATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: js.Number = _
}

object SVGFEColorMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEColorMatrixElement),List())))) */
  var SVG_FECOLORMATRIX_TYPE_SATURATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_MATRIX: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_HUEROTATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: js.Number = _
}

class SVGFESpotLightElement extends SVGElement {
  var pointsAtY: SVGAnimatedNumber = _
  var y: SVGAnimatedNumber = _
  var limitingConeAngle: SVGAnimatedNumber = _
  var specularExponent: SVGAnimatedNumber = _
  var x: SVGAnimatedNumber = _
  var pointsAtZ: SVGAnimatedNumber = _
  var z: SVGAnimatedNumber = _
  var pointsAtX: SVGAnimatedNumber = _
}


class SVGFEOffsetElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var dy: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var dx: SVGAnimatedNumber = _
}


class SVGFEImageElement extends SVGElement with SVGLangSpace with SVGFilterPrimitiveStandardAttributes with SVGURIReference with SVGExternalResourcesRequired {
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
}


class SVGFECompositeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var operator: SVGAnimatedEnumeration = _
  var in2: SVGAnimatedString = _
  var k2: SVGAnimatedNumber = _
  var k1: SVGAnimatedNumber = _
  var k3: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var k4: SVGAnimatedNumber = _
  var SVG_FECOMPOSITE_OPERATOR_OUT: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_OVER: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_XOR: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_UNKNOWN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_IN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ATOP: js.Number = _
}

object SVGFECompositeElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFECompositeElement),List())))) */
  var SVG_FECOMPOSITE_OPERATOR_OUT: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_OVER: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_XOR: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_UNKNOWN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_IN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ATOP: js.Number = _
}

class SVGFEComponentTransferElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
}


class SVGFEDiffuseLightingElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var surfaceScale: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var diffuseConstant: SVGAnimatedNumber = _
}


object SVGFEConvolveMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEConvolveMatrixElement),List())))) */
  var SVG_EDGEMODE_WRAP: js.Number = _
  var SVG_EDGEMODE_DUPLICATE: js.Number = _
  var SVG_EDGEMODE_UNKNOWN: js.Number = _
  var SVG_EDGEMODE_NONE: js.Number = _
}

class SVGFEConvolveMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var orderY: SVGAnimatedInteger = _
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var orderX: SVGAnimatedInteger = _
  var preserveAlpha: SVGAnimatedBoolean = _
  var kernelMatrix: SVGAnimatedNumberList = _
  var edgeMode: SVGAnimatedEnumeration = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var bias: SVGAnimatedNumber = _
  var targetX: SVGAnimatedInteger = _
  var targetY: SVGAnimatedInteger = _
  var divisor: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_EDGEMODE_WRAP: js.Number = _
  var SVG_EDGEMODE_DUPLICATE: js.Number = _
  var SVG_EDGEMODE_UNKNOWN: js.Number = _
  var SVG_EDGEMODE_NONE: js.Number = _
}

