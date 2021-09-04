package org.scalajs.dom

import org.scalajs.dom

/** Short aliases of all the dom.SVGThing classes
  */
object svg {
  type A = SVGAElement
  type AnimatedAngle = SVGAnimatedAngle
  type AnimatedBoolean = SVGAnimatedBoolean
  type AnimatedInteger = SVGAnimatedInteger
  type AnimatedEnumeration = SVGAnimatedEnumeration
  type AnimatedPreserveAspectRatio = SVGAnimatedPreserveAspectRatio
  type AnimatedLength = SVGAnimatedLength
  type AnimatedLengthList = SVGAnimatedLengthList
  type AnimatedNumber = SVGAnimatedNumber
  type AnimatedNumberList = SVGAnimatedNumberList
  type AnimatedPathData = SVGAnimatedPathData
  type AnimatedPoints = SVGAnimatedPoints
  type AnimatedRect = SVGAnimatedRect
  type AnimatedString = SVGAnimatedString
  type AnimatedTransformList = SVGAnimatedTransformList
  type Angle = SVGAngle
  @inline def Angle = SVGAngle

  type Circle = SVGCircleElement
  type ClipPath = SVGClipPathElement
  type ComponentTransferFunction = SVGComponentTransferFunctionElement

  @inline def ComponentTransferFunction =
    SVGComponentTransferFunctionElement

  type Defs = SVGDefsElement
  type Desc = SVGDescElement

  type Element = SVGElement
  type ElementInstance = SVGElementInstance
  type ElementInstanceList = SVGElementInstanceList
  type Ellipse = SVGEllipseElement
  type Exception = SVGException
  @inline def Exception = SVGException
  type ExternalResourcesRequired = SVGExternalResourcesRequired

  type FEBlend = SVGFEBlendElement
  @inline def FEBlend = SVGFEBlendElement
  type FEColorMatrix = SVGFEColorMatrixElement
  @inline def FEColorMatrix = SVGFEColorMatrixElement
  type FEComposite = SVGFECompositeElement
  @inline def FEComposite = SVGFECompositeElement
  type FEComponentTransfer = SVGFEComponentTransferElement
  type FEConvolveMatrix = SVGFEConvolveMatrixElement
  @inline def FEConvolveMatrix = SVGFEConvolveMatrixElement
  type FEDistantLight = SVGFEDistantLightElement
  type FEDiffuseLighting = SVGFEDiffuseLightingElement
  type FEDisplacementMap = SVGFEDisplacementMapElement
  @inline def FEDisplacementMap = SVGFEDisplacementMapElement
  type FEFlood = SVGFEFloodElement
  type FEFuncA = SVGFEFuncAElement
  type FEFuncB = SVGFEFuncBElement
  type FEFuncG = SVGFEFuncGElement
  type FEFuncR = SVGFEFuncRElement
  type FEGaussianBlur = SVGFEGaussianBlurElement
  type FEImage = SVGFEImageElement
  type FEMerge = SVGFEMergeElement
  type FEMergeNode = SVGFEMergeNodeElement
  type FEMorphology = SVGFEMorphologyElement
  type FEOffset = SVGFEOffsetElement
  type FEPointLight = SVGFEPointLightElement
  type FESpecularLighting = SVGFESpecularLightingElement
  @inline def FEMorphology = SVGFEMorphologyElement
  type FESpotLight = SVGFESpotLightElement
  type FETile = SVGFETileElement
  type FETurbulence = SVGFETurbulenceElement
  @inline def FETurbulence = SVGFETurbulenceElement
  type Filter = SVGFilterElement

  type FilterPrimitiveStandardAttributes =
    SVGFilterPrimitiveStandardAttributes
  type FitToViewBox = SVGFitToViewBox

  type G = SVGGElement
  type GetSVGDocument = dom.GetSVGDocument
  type Gradient = SVGGradientElement
  @inline def Gradient = SVGGradientElement

  type Image = SVGImageElement

  type LangSpace = SVGLangSpace
  type Length = SVGLength
  @inline def Length = SVGLength
  type LengthList = SVGLengthList
  type Line = SVGLineElement
  type LinearGradient = SVGLinearGradientElement
  type Locatable = SVGLocatable

  type Marker = SVGMarkerElement
  @inline def Marker = SVGMarkerElement
  type Mask = SVGMaskElement
  type Matrix = SVGMatrix
  type Metadata = SVGMetadataElement

  type Number = SVGNumber
  type NumberList = SVGNumberList

  type Path = SVGPathElement
  type PathSeg = SVGPathSeg
  @inline def PathSeg = SVGPathSeg
  type PathSegArcAbs = SVGPathSegArcAbs
  type PathSegArcRel = SVGPathSegArcRel
  type PathSegClosePath = SVGPathSegClosePath
  type PathSegCurvetoCubicSmoothAbs = SVGPathSegCurvetoCubicSmoothAbs
  type PathSegCurvetoQuadraticRel = SVGPathSegCurvetoQuadraticRel

  type PathSegCurvetoQuadraticSmoothRel =
    SVGPathSegCurvetoQuadraticSmoothRel
  type PathSegCurvetoCubicAbs = SVGPathSegCurvetoCubicAbs
  type PathSegCurvetoCubicRel = SVGPathSegCurvetoCubicRel
  type PathSegCurvetoQuadraticAbs = SVGPathSegCurvetoQuadraticAbs
  type PathSegCurvetoCubicSmoothRel = SVGPathSegCurvetoCubicSmoothRel

  type PathSegCurvetoQuadraticSmoothAbs =
    SVGPathSegCurvetoQuadraticSmoothAbs
  type PathSegLinetoAbs = SVGPathSegLinetoAbs
  type PathSegLinetoRel = SVGPathSegLinetoRel
  type PathSegLinetoHorizontalAbs = SVGPathSegLinetoHorizontalAbs
  type PathSegLinetoHorizontalRel = SVGPathSegLinetoHorizontalRel
  type PathSegLinetoVerticalAbs = SVGPathSegLinetoVerticalAbs
  type PathSegLinetoVerticalRel = SVGPathSegLinetoVerticalRel
  type PathSegMovetoAbs = SVGPathSegMovetoAbs
  type PathSegMovetoRel = SVGPathSegMovetoRel
  type PathSegList = SVGPathSegList
  type Pattern = SVGPatternElement
  type Point = SVGPoint
  type PointList = SVGPointList
  type Polygon = SVGPolygonElement
  type Polyline = SVGPolylineElement
  type PreserveAspectRatio = SVGPreserveAspectRatio
  @inline def PreserveAspectRatio = SVGPreserveAspectRatio

  type RadialGradient = SVGRadialGradientElement
  type Rect = SVGRect
  // Irregular aliasing, due to collision with dom.SVGRect
  type RectElement = SVGRectElement

  type Script = SVGScriptElement
  type Stop = SVGStopElement
  type Stylable = SVGStylable
  type Style = SVGStyleElement
  type StringList = SVGStringList
  type SVG = SVGSVGElement
  type Switch = SVGSwitchElement
  type Symbol = SVGSymbolElement

  type Text = SVGTextElement
  type TextContent = SVGTextContentElement
  @inline def TextContent = SVGTextContentElement
  type TextPath = SVGTextPathElement
  @inline def TextPath = SVGTextPathElement
  type TextPositioning = SVGTextPositioningElement
  type Tests = SVGTests
  type Title = SVGTitleElement
  type Transform = SVGTransform
  @inline def Transform = SVGTransform
  type Transformable = SVGTransformable
  type TransformList = SVGTransformList
  type TSpan = SVGTSpanElement

  type UnitTypes = SVGUnitTypes
  @inline def UnitTypes = SVGUnitTypes
  type URIReference = SVGURIReference
  type Use = SVGUseElement

  type View = SVGViewElement

  type ZoomAndPan = SVGZoomAndPan
  @inline def ZoomAndPan = SVGZoomAndPan
}
