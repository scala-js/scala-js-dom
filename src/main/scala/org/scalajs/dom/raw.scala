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

import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation._

@deprecated("All the members of raw.* have been moved to dom.*", "2.0.0")
object raw {

  @deprecated("use dom.AbstractWorker instead", "2.0.0")
  type AbstractWorker = dom.AbstractWorker
  @deprecated("use dom.AnalyserNode instead", "2.0.0")
  type AnalyserNode = dom.AnalyserNode
  @deprecated("use dom.AnimationEvent instead", "2.0.0")
  type AnimationEvent = dom.AnimationEvent
  @deprecated("use dom.ApplicationCache instead", "2.0.0")
  type ApplicationCache = dom.ApplicationCache
  @deprecated("use dom.ApplicationCache instead", "2.0.0")
  lazy val ApplicationCache: dom.ApplicationCache.type = dom.ApplicationCache
  @deprecated("use dom.Attr instead", "2.0.0")
  type Attr = dom.Attr
  @deprecated("use dom.AudioBuffer instead", "2.0.0")
  type AudioBuffer = dom.AudioBuffer
  @deprecated("use dom.AudioBufferSourceNode instead", "2.0.0")
  type AudioBufferSourceNode = dom.AudioBufferSourceNode
  @deprecated("use dom.AudioContext instead", "2.0.0")
  type AudioContext = dom.AudioContext
  @deprecated("use dom.AudioDestinationNode instead", "2.0.0")
  type AudioDestinationNode = dom.AudioDestinationNode
  @deprecated("use dom.AudioListener instead", "2.0.0")
  type AudioListener = dom.AudioListener
  @deprecated("use dom.AudioNode instead", "2.0.0")
  type AudioNode = dom.AudioNode
  @deprecated("use dom.AudioParam instead", "2.0.0")
  type AudioParam = dom.AudioParam
  @deprecated("use dom.AudioTrack instead", "2.0.0")
  type AudioTrack = dom.AudioTrack
  @deprecated("use dom.AudioTrackList instead", "2.0.0")
  type AudioTrackList = dom.AudioTrackList

  @deprecated("use dom.BeforeUnloadEvent instead", "2.0.0")
  type BeforeUnloadEvent = dom.BeforeUnloadEvent
  @deprecated("use dom.BiquadFilterNode instead", "2.0.0")
  type BiquadFilterNode = dom.BiquadFilterNode
  @deprecated("use dom.Blob instead", "2.0.0")
  type Blob = dom.Blob
  @deprecated("use dom.Blob instead", "2.0.0")
  lazy val Blob: dom.Blob.type = dom.Blob
  @deprecated("use dom.BlobPropertyBag instead", "2.0.0")
  lazy val BlobPropertyBag: dom.BlobPropertyBag.type = dom.BlobPropertyBag
  @deprecated("use dom.BlobPropertyBag instead", "2.0.0")
  type BlobPropertyBag = dom.BlobPropertyBag

  @deprecated("use dom.CanvasGradient instead", "2.0.0")
  type CanvasGradient = dom.CanvasGradient
  @deprecated("use dom.CanvasPattern instead", "2.0.0")
  type CanvasPattern = dom.CanvasPattern
  @deprecated("use dom.CanvasRenderingContext2D instead", "2.0.0")
  type CanvasRenderingContext2D = dom.CanvasRenderingContext2D
  @deprecated("use dom.CDATASection instead", "2.0.0")
  type CDATASection = dom.CDATASection
  @deprecated("use dom.ChannelMergerNode instead", "2.0.0")
  type ChannelMergerNode = dom.ChannelMergerNode
  @deprecated("use dom.ChannelSplitterNode instead", "2.0.0")
  type ChannelSplitterNode = dom.ChannelSplitterNode
  @deprecated("use dom.CharacterData instead", "2.0.0")
  type CharacterData = dom.CharacterData
  @deprecated("use dom.DOMRect instead", "2.0.0")
  type ClientRect = dom.DOMRect
  @deprecated("use dom.DOMRectList instead", "2.0.0")
  type ClientRectList = dom.DOMRectList
  @deprecated("use dom.ClipboardEvent instead", "2.0.0")
  type ClipboardEvent = dom.ClipboardEvent
  @deprecated("use dom.ClipboardEventInit instead", "2.0.0")
  type ClipboardEventInit = dom.ClipboardEventInit
  @deprecated("use dom.CloseEvent instead", "2.0.0")
  type CloseEvent = dom.CloseEvent
  @deprecated("use dom.CompositionEvent instead", "2.0.0")
  type CompositionEvent = dom.CompositionEvent
  @deprecated("use dom.Comment instead", "2.0.0")
  type Comment = dom.Comment
  @deprecated("use dom.Coordinates instead", "2.0.0")
  type Coordinates = dom.Coordinates
  @deprecated("use dom.Console instead", "2.0.0")
  type Console = dom.Console
  @deprecated("use dom.ConvertToBlobOptions instead", "2.0.0")
  type ConvertToBlobOptions = dom.ConvertToBlobOptions
  @deprecated("use dom.ConvolverNode instead", "2.0.0")
  type ConvolverNode = dom.ConvolverNode
  @deprecated("use dom.CreateImageBitmapOptions instead", "2.0.0")
  type CreateImageBitmapOptions = dom.CreateImageBitmapOptions
  @deprecated("use dom.CSSFontFaceRule instead", "2.0.0")
  type CSSFontFaceRule = dom.CSSFontFaceRule
  @deprecated("use dom.CSSImportRule instead", "2.0.0")
  type CSSImportRule = dom.CSSImportRule
  @deprecated("use dom.CSSKeyframeRule instead", "2.0.0")
  type CSSKeyframeRule = dom.CSSKeyframeRule
  @deprecated("use dom.CSSMediaRule instead", "2.0.0")
  type CSSMediaRule = dom.CSSMediaRule
  @deprecated("use dom.CSSNamespaceRule instead", "2.0.0")
  type CSSNamespaceRule = dom.CSSNamespaceRule
  @deprecated("use dom.CSSPageRule instead", "2.0.0")
  type CSSPageRule = dom.CSSPageRule
  @deprecated("use dom.CSSRule instead", "2.0.0")
  type CSSRule = dom.CSSRule
  @deprecated("use dom.CSSRule instead", "2.0.0")
  @inline def CSSRule = dom.CSSRule
  @deprecated("use dom.CSSRuleList instead", "2.0.0")
  type CSSRuleList = dom.CSSRuleList
  @deprecated("use dom.CSSStyleDeclaration instead", "2.0.0")
  type CSSStyleDeclaration = dom.CSSStyleDeclaration
  @deprecated("use dom.CSSStyleSheet instead", "2.0.0")
  type CSSStyleSheet = dom.CSSStyleSheet
  @deprecated("use dom.CSSStyleRule instead", "2.0.0")
  type CSSStyleRule = dom.CSSStyleRule
  @deprecated("use dom.CustomEvent instead", "2.0.0")
  type CustomEvent = dom.CustomEvent

  @deprecated("use dom.DataTransfer instead", "2.0.0")
  type DataTransfer = dom.DataTransfer
  @deprecated("use dom.DedicatedWorkerGlobalScope instead", "2.0.0")
  type DedicatedWorkerGlobalScope = dom.DedicatedWorkerGlobalScope
  @deprecated("use dom.DelayNode instead", "2.0.0")
  type DelayNode = dom.DelayNode
  @deprecated("use dom.DocumentType instead", "2.0.0")
  type DocumentType = dom.DocumentType
  @deprecated("use dom.DocumentEvent instead", "2.0.0")
  type DocumentEvent = dom.DocumentEvent
  @deprecated("use dom.Document instead", "2.0.0")
  type Document = dom.Document
  @deprecated("use dom.DocumentFragment instead", "2.0.0")
  type DocumentFragment = dom.DocumentFragment
  @deprecated("use dom.DOMException instead", "2.0.0")
  type DOMException = dom.DOMException
  @deprecated("use dom.DOMImplementation instead", "2.0.0")
  type DOMImplementation = dom.DOMImplementation
  @deprecated("use dom.DOMException instead", "2.0.0")
  lazy val DOMException: dom.DOMException.type = dom.DOMException
  @deprecated("use dom.DOMList instead", "2.0.0")
  type DOMList[+T] = dom.DOMList[T]
  @deprecated("use dom.DOMParser instead", "2.0.0")
  type DOMParser = dom.DOMParser
  @deprecated("use dom.DOMRect instead", "2.0.0")
  type DOMRect = dom.DOMRect
  @deprecated("use dom.DOMRectList instead", "2.0.0")
  type DOMRectList = dom.DOMRectList
  @deprecated("use dom.DOMSettableTokenList instead", "2.0.0")
  type DOMSettableTokenList = dom.DOMSettableTokenList
  @deprecated("use dom.DOMStringList instead", "2.0.0")
  type DOMStringList = dom.DOMStringList
  @deprecated("use dom.DOMTokenList instead", "2.0.0")
  type DOMTokenList = dom.DOMTokenList
  @deprecated("use dom.DragEvent instead", "2.0.0")
  type DragEvent = dom.DragEvent
  @deprecated("use dom.DynamicsCompressorNode instead", "2.0.0")
  type DynamicsCompressorNode = dom.DynamicsCompressorNode

  @deprecated("use dom.Element instead", "2.0.0")
  type Element = dom.Element
  @deprecated("use dom.ErrorEvent instead", "2.0.0")
  type ErrorEvent = dom.ErrorEvent
  @deprecated("use dom.Event instead", "2.0.0")
  type Event = dom.Event
  @deprecated("use dom.Event instead", "2.0.0")
  lazy val Event: dom.Event.type = dom.Event
  @deprecated("use dom.EventException instead", "2.0.0")
  type EventException = dom.EventException
  @deprecated("use dom.EventException instead", "2.0.0")
  lazy val EventException: dom.EventException.type = dom.EventException
  @deprecated("use dom.EventInit instead", "2.0.0")
  type EventInit = dom.EventInit
  @deprecated("use dom.EventSource instead", "2.0.0")
  type EventSource = dom.EventSource
  @deprecated("use dom.EventSource instead", "2.0.0")
  lazy val EventSource: dom.EventSource.type = dom.EventSource
  @deprecated("use dom.EventTarget instead", "2.0.0")
  type EventTarget = dom.EventTarget
  @deprecated("use dom.External instead", "2.0.0")
  type External = dom.External

  @deprecated("use dom.FocusEvent instead", "2.0.0")
  type FocusEvent = dom.FocusEvent
  @deprecated("use dom.File instead", "2.0.0")
  type File = dom.File
  @deprecated("use dom.FileList instead", "2.0.0")
  type FileList = dom.FileList
  @deprecated("use dom.FileReader instead", "2.0.0")
  type FileReader = dom.FileReader
  @deprecated("use dom.FileReader instead", "2.0.0")
  lazy val FileReader: dom.FileReader.type = dom.FileReader
  @deprecated("use dom.FormData instead", "2.0.0")
  type FormData = dom.FormData
  @deprecated("use dom.FormData instead", "2.0.0")
  lazy val FormData: dom.FormData.type = dom.FormData

  @deprecated("use dom.GainNode instead", "2.0.0")
  type GainNode = dom.GainNode
  @deprecated("use dom.Geolocation instead", "2.0.0")
  type Geolocation = dom.Geolocation

  @deprecated("use dom.HashChangeEvent instead", "2.0.0")
  type HashChangeEvent = dom.HashChangeEvent
  @deprecated("use dom.History instead", "2.0.0")
  type History = dom.History
  @deprecated("use dom.HTMLAnchorElement instead", "2.0.0")
  type HTMLAnchorElement = dom.HTMLAnchorElement
  @deprecated("use dom.HTMLAudioElement instead", "2.0.0")
  type HTMLAudioElement = dom.HTMLAudioElement
  @deprecated("use dom.HTMLAreaElement instead", "2.0.0")
  type HTMLAreaElement = dom.HTMLAreaElement
  @deprecated("use dom.HTMLBaseElement instead", "2.0.0")
  type HTMLBaseElement = dom.HTMLBaseElement
  @deprecated("use dom.HTMLBodyElement instead", "2.0.0")
  type HTMLBodyElement = dom.HTMLBodyElement
  @deprecated("use dom.HTMLButtonElement instead", "2.0.0")
  type HTMLButtonElement = dom.HTMLButtonElement
  @deprecated("use dom.HTMLBRElement instead", "2.0.0")
  type HTMLBRElement = dom.HTMLBRElement
  @deprecated("use dom.HTMLCanvasElement instead", "2.0.0")
  type HTMLCanvasElement = dom.HTMLCanvasElement
  @deprecated("use dom.HTMLCollectionElement instead", "2.0.0")
  type HTMLCollectionElement = dom.HTMLCollection
  @deprecated("use dom.HTMLDataListElement instead", "2.0.0")
  type HTMLDataListElement = dom.HTMLDataListElement
  @deprecated("use dom.HTMLDivElement instead", "2.0.0")
  type HTMLDivElement = dom.HTMLDivElement
  @deprecated("use dom.HTMLDListElement instead", "2.0.0")
  type HTMLDListElement = dom.HTMLDListElement
  @deprecated("use dom.HTMLDocument instead", "2.0.0")
  type HTMLDocument = dom.HTMLDocument
  @deprecated("use dom.HTMLElement instead", "2.0.0")
  type HTMLElement = dom.HTMLElement
  @deprecated("use dom.HTMLEmbedElement instead", "2.0.0")
  type HTMLEmbedElement = dom.HTMLEmbedElement
  @deprecated("use dom.HTMLFieldSetElement instead", "2.0.0")
  type HTMLFieldSetElement = dom.HTMLFieldSetElement
  @deprecated("use dom.HTMLFormElement instead", "2.0.0")
  type HTMLFormElement = dom.HTMLFormElement
  @deprecated("use dom.HTMLHeadElement instead", "2.0.0")
  type HTMLHeadElement = dom.HTMLHeadElement
  @deprecated("use dom.HTMLHeadingElement instead", "2.0.0")
  type HTMLHeadingElement = dom.HTMLHeadingElement
  @deprecated("use dom.HTMLHtmlElement instead", "2.0.0")
  type HTMLHtmlElement = dom.HTMLHtmlElement
  @deprecated("use dom.HTMLHRElement instead", "2.0.0")
  type HTMLHRElement = dom.HTMLHRElement
  @deprecated("use dom.HTMLIFrameElement instead", "2.0.0")
  type HTMLIFrameElement = dom.HTMLIFrameElement
  @deprecated("use dom.HTMLImageElement instead", "2.0.0")
  type HTMLImageElement = dom.HTMLImageElement
  @deprecated("use dom.HTMLInputElement instead", "2.0.0")
  type HTMLInputElement = dom.HTMLInputElement
  @deprecated("use dom.HTMLLabelElement instead", "2.0.0")
  type HTMLLabelElement = dom.HTMLLabelElement
  @deprecated("use dom.HTMLLegendElement instead", "2.0.0")
  type HTMLLegendElement = dom.HTMLLegendElement
  @deprecated("use dom.HTMLLIElement instead", "2.0.0")
  type HTMLLIElement = dom.HTMLLIElement
  @deprecated("use dom.HTMLLinkElement instead", "2.0.0")
  type HTMLLinkElement = dom.HTMLLinkElement
  @deprecated("use dom.HTMLMapElement instead", "2.0.0")
  type HTMLMapElement = dom.HTMLMapElement
  @deprecated("use dom.HTMLMediaElement instead", "2.0.0")
  type HTMLMediaElement = dom.HTMLMediaElement
  @deprecated("use dom.HTMLMediaElement instead", "2.0.0")
  @inline def HTMLMediaElement = dom.HTMLMediaElement
  @deprecated("use dom.HTMLMenuElement instead", "2.0.0")
  type HTMLMenuElement = dom.HTMLMenuElement
  @deprecated("use dom.HTMLMetaElement instead", "2.0.0")
  type HTMLMetaElement = dom.HTMLMetaElement
  @deprecated("use dom.HTMLModElement instead", "2.0.0")
  type HTMLModElement = dom.HTMLModElement
  @deprecated("use dom.HTMLObjectElement instead", "2.0.0")
  type HTMLObjectElement = dom.HTMLObjectElement
  @deprecated("use dom.HTMLOListElement instead", "2.0.0")
  type HTMLOListElement = dom.HTMLOListElement
  @deprecated("use dom.HTMLOptGroupElement instead", "2.0.0")
  type HTMLOptGroupElement = dom.HTMLOptGroupElement
  @deprecated("use dom.HTMLOptionElement instead", "2.0.0")
  type HTMLOptionElement = dom.HTMLOptionElement
  @deprecated("use dom.HTMLParagraphElement instead", "2.0.0")
  type HTMLParagraphElement = dom.HTMLParagraphElement
  @deprecated("use dom.HTMLParamElement instead", "2.0.0")
  type HTMLParamElement = dom.HTMLParamElement
  @deprecated("use dom.HTMLPreElement instead", "2.0.0")
  type HTMLPreElement = dom.HTMLPreElement
  @deprecated("use dom.HTMLProgressElement instead", "2.0.0")
  type HTMLProgressElement = dom.HTMLProgressElement
  @deprecated("use dom.HTMLQuoteElement instead", "2.0.0")
  type HTMLQuoteElement = dom.HTMLQuoteElement
  @deprecated("use dom.HTMLScriptElement instead", "2.0.0")
  type HTMLScriptElement = dom.HTMLScriptElement
  @deprecated("use dom.HTMLSelectElement instead", "2.0.0")
  type HTMLSelectElement = dom.HTMLSelectElement
  @deprecated("use dom.HTMLSourceElement instead", "2.0.0")
  type HTMLSourceElement = dom.HTMLSourceElement
  @deprecated("use dom.HTMLSpanElement instead", "2.0.0")
  type HTMLSpanElement = dom.HTMLSpanElement
  @deprecated("use dom.HTMLStyleElement instead", "2.0.0")
  type HTMLStyleElement = dom.HTMLStyleElement
  @deprecated("use dom.HTMLTableElement instead", "2.0.0")
  type HTMLTableElement = dom.HTMLTableElement
  @deprecated("use dom.HTMLTableAlignment instead", "2.0.0")
  type HTMLTableAlignment = dom.HTMLTableAlignment
  @deprecated("use dom.HTMLTableCaptionElement instead", "2.0.0")
  type HTMLTableCaptionElement = dom.HTMLTableCaptionElement
  @deprecated("use dom.HTMLTableCellElement instead", "2.0.0")
  type HTMLTableCellElement = dom.HTMLTableCellElement
  @deprecated("use dom.HTMLTableColElement instead", "2.0.0")
  type HTMLTableColElement = dom.HTMLTableColElement
  @deprecated("use dom.HTMLTableRowElement instead", "2.0.0")
  type HTMLTableRowElement = dom.HTMLTableRowElement
  @deprecated("use dom.HTMLTableSectionElement instead", "2.0.0")
  type HTMLTableSectionElement = dom.HTMLTableSectionElement
  @deprecated("use dom.HTMLTitleElement instead", "2.0.0")
  type HTMLTitleElement = dom.HTMLTitleElement
  @deprecated("use dom.HTMLTextAreaElement instead", "2.0.0")
  type HTMLTextAreaElement = dom.HTMLTextAreaElement
  @deprecated("use dom.HTMLTrackElement instead", "2.0.0")
  type HTMLTrackElement = dom.HTMLTrackElement
  @deprecated("use dom.HTMLUListElement instead", "2.0.0")
  type HTMLUListElement = dom.HTMLUListElement
  @deprecated("use dom.HTMLUnknownElement instead", "2.0.0")
  type HTMLUnknownElement = dom.HTMLUnknownElement
  @deprecated("use dom.HTMLVideoElement instead", "2.0.0")
  type HTMLVideoElement = dom.HTMLVideoElement

  @deprecated("use dom.IDBCursor instead", "2.0.0")
  type IDBCursor = dom.IDBCursor
  @deprecated("use dom.IDBCursor instead", "2.0.0")
  @inline def IDBCursor = dom.IDBCursor
  @deprecated("use dom.IDBCursorWithValue instead", "2.0.0")
  type IDBCursorWithValue = dom.IDBCursorWithValue
  @deprecated("use dom.IDBDatabase instead", "2.0.0")
  type IDBDatabase = dom.IDBDatabase
  @deprecated("use dom.IDBEnvironment instead", "2.0.0")
  type IDBEnvironment = dom.IDBEnvironment
  @deprecated("use dom.IDBFactory instead", "2.0.0")
  type IDBFactory = dom.IDBFactory
  @deprecated("use dom.IDBIndex instead", "2.0.0")
  type IDBIndex = dom.IDBIndex
  @deprecated("use dom.IDBKeyRange instead", "2.0.0")
  type IDBKeyRange = dom.IDBKeyRange
  @deprecated("use dom.IDBKeyRange instead", "2.0.0")
  @inline def IDBKeyRange = dom.IDBKeyRange
  @deprecated("use dom.IDBObjectStore instead", "2.0.0")
  type IDBObjectStore = dom.IDBObjectStore
  @deprecated("use dom.IDBOpenDBRequest instead", "2.0.0")
  type IDBOpenDBRequest = dom.IDBOpenDBRequest
  @deprecated("use dom.IDBRequest instead", "2.0.0")
  type IDBRequest = dom.IDBRequest
  @deprecated("use dom.IDBTransaction instead", "2.0.0")
  type IDBTransaction = dom.IDBTransaction
  @deprecated("use dom.IDBTransaction instead", "2.0.0")
  @inline def IDBTransaction = dom.IDBTransaction
  @deprecated("use dom.IDBVersionChangeEvent instead", "2.0.0")
  type IDBVersionChangeEvent = dom.IDBVersionChangeEvent
  @deprecated("use dom.ImageBitmap instead", "2.0.0")
  type ImageBitmap = dom.ImageBitmap
  @deprecated("use dom.ImageData instead", "2.0.0")
  type ImageData = dom.ImageData

  @deprecated("use dom.KeyboardEvent instead", "2.0.0")
  type KeyboardEvent = dom.KeyboardEvent
  @deprecated("use dom.KeyboardEvent instead", "2.0.0")
  lazy val KeyboardEvent: dom.KeyboardEvent.type = dom.KeyboardEvent

  @deprecated("use dom.KeyboardEventInit instead", "2.0.0")
  type KeyboardEventInit = dom.KeyboardEventInit

  @deprecated("use dom.LinkStyle instead", "2.0.0")
  type LinkStyle = dom.LinkStyle
  @deprecated("use dom.Location instead", "2.0.0")
  type Location = dom.Location

  @deprecated("use dom.MediaError instead", "2.0.0")
  type MediaError = dom.MediaError
  @deprecated("use dom.MediaError instead", "2.0.0")
  lazy val MediaError: dom.MediaError.type = dom.MediaError
  @deprecated("use dom.MediaElementAudioSourceNode instead", "2.0.0")
  type MediaElementAudioSourceNode = dom.MediaElementAudioSourceNode
  @deprecated("use dom.MediaList instead", "2.0.0")
  type MediaList = dom.MediaList
  @deprecated("use dom.MediaQueryList instead", "2.0.0")
  type MediaQueryList = dom.MediaQueryList
  @deprecated("use dom.MediaQueryListListener instead", "2.0.0")
  type MediaQueryListListener = dom.MediaQueryListListener
  @deprecated("use dom.MediaStreamAudioDestinationNode instead", "2.0.0")
  type MediaStreamAudioDestinationNode = dom.MediaStreamAudioDestinationNode
  @deprecated("use dom.MediaStreamAudioSourceNode instead", "2.0.0")
  type MediaStreamAudioSourceNode = dom.MediaStreamAudioSourceNode
  @deprecated("use dom.MessageChannel instead", "2.0.0")
  type MessageChannel = dom.MessageChannel
  @deprecated("use dom.MessageEvent instead", "2.0.0")
  type MessageEvent = dom.MessageEvent
  @deprecated("use dom.MessagePort instead", "2.0.0")
  type MessagePort = dom.MessagePort
  @deprecated("use dom.ModifierKeyEvent instead", "2.0.0")
  type ModifierKeyEvent = dom.ModifierKeyEvent
  @deprecated("use dom.MouseEvent instead", "2.0.0")
  type MouseEvent = dom.MouseEvent
  @deprecated("use dom.PointerEvent instead", "2.0.0")
  type PointerEvent = dom.PointerEvent
  @deprecated("use dom.PointerEventInit instead", "2.0.0")
  type PointerEventInit = dom.PointerEventInit
  @deprecated("use dom.MutationObserver instead", "2.0.0")
  type MutationObserver = dom.MutationObserver
  @deprecated("use dom.MutationObserverInit instead", "2.0.0")
  type MutationObserverInit = dom.MutationObserverInit
  @deprecated("use dom.MutationObserverInit instead", "2.0.0")
  lazy val MutationObserverInit: dom.MutationObserverInit.type =
    dom.MutationObserverInit
  @deprecated("use dom.MutationRecord instead", "2.0.0")
  type MutationRecord = dom.MutationRecord

  @deprecated("use dom.NamedNodeMap instead", "2.0.0")
  type NamedNodeMap = dom.NamedNodeMap
  @deprecated("use dom.NavigatorID instead", "2.0.0")
  type NavigatorID = dom.NavigatorID
  @deprecated("use dom.Navigator instead", "2.0.0")
  type Navigator = dom.Navigator
  @deprecated("use dom.NavigatorContentUtils instead", "2.0.0")
  type NavigatorContentUtils = dom.NavigatorContentUtils
  @deprecated("use dom.NavigatorGeolocation instead", "2.0.0")
  type NavigatorGeolocation = dom.NavigatorGeolocation
  @deprecated("use dom.NavigatorLanguage instead", "2.0.0")
  type NavigatorLanguage = dom.NavigatorLanguage
  @deprecated("use dom.NavigatorOnLine instead", "2.0.0")
  type NavigatorOnLine = dom.NavigatorOnLine
  @deprecated("use dom.NavigatorStorageUtils instead", "2.0.0")
  type NavigatorStorageUtils = dom.NavigatorStorageUtils
  @deprecated("use dom.NodeSelector instead", "2.0.0")
  type NodeSelector = dom.NodeSelector
  @deprecated("use dom.Node instead", "2.0.0")
  type Node = dom.Node
  @deprecated("use dom.Node instead", "2.0.0")
  lazy val Node: dom.Node.type = dom.Node
  @deprecated("use dom.NodeFilter instead", "2.0.0")
  type NodeFilter = dom.NodeFilter
  @deprecated("use dom.NodeFilter instead", "2.0.0")
  lazy val NodeFilter: dom.NodeFilter.type = dom.NodeFilter
  @deprecated("use dom.NodeIterator instead", "2.0.0")
  type NodeIterator = dom.NodeIterator
  @deprecated("use dom.NodeList instead", "2.0.0")
  type NodeList[+T <: Node] = dom.NodeList[T]
  @deprecated("use dom.NodeListOf instead", "2.0.0")
  type NodeListOf[+T <: Node] = NodeList[T]

  @deprecated("use dom.OfflineAudioContext instead", "2.0.0")
  type OfflineAudioContext = dom.OfflineAudioContext
  @deprecated("use dom.OffscreenCanvas instead", "2.0.0")
  type OffscreenCanvas = dom.OffscreenCanvas
  @deprecated("use dom.OscillatorNode instead", "2.0.0")
  type OscillatorNode = dom.OscillatorNode

  @deprecated("use dom.PannerNode instead", "2.0.0")
  type PannerNode = dom.PannerNode
  @deprecated("use dom.ParentNode instead", "2.0.0")
  type ParentNode = dom.ParentNode
  @deprecated("use dom.Performance instead", "2.0.0")
  type Performance = dom.Performance
  @deprecated("use dom.PerformanceEntry instead", "2.0.0")
  type PerformanceEntry = dom.PerformanceEntry
  @deprecated("use dom.PerformanceTiming instead", "2.0.0")
  type PerformanceTiming = dom.PerformanceTiming
  @deprecated("use dom.PerformanceMark instead", "2.0.0")
  type PerformanceMark = dom.PerformanceMark
  @deprecated("use dom.PerformanceMeasure instead", "2.0.0")
  type PerformanceMeasure = dom.PerformanceMeasure
  @deprecated("use dom.PerformanceNavigation instead", "2.0.0")
  type PerformanceNavigation = dom.PerformanceNavigation
  @deprecated("use dom.PerformanceNavigation instead", "2.0.0")
  lazy val PerformanceNavigation: dom.PerformanceNavigation.type =
    dom.PerformanceNavigation
  @deprecated("use dom.PerformanceResourceTiming instead", "2.0.0")
  type PerformanceResourceTiming = dom.PerformanceResourceTiming
  @deprecated("use dom.PeriodicWave instead", "2.0.0")
  type PeriodicWave = dom.PeriodicWave
  @deprecated("use dom.Position instead", "2.0.0")
  type Position = dom.Position
  @deprecated("use dom.PositionOptions instead", "2.0.0")
  type PositionOptions = dom.PositionOptions
  @deprecated("use dom.PositionError instead", "2.0.0")
  type PositionError = dom.PositionError
  @deprecated("use dom.PositionError instead", "2.0.0")
  lazy val PositionError: dom.PositionError.type = dom.PositionError
  @deprecated("use dom.ProcessingInstruction instead", "2.0.0")
  type ProcessingInstruction = dom.ProcessingInstruction
  @deprecated("use dom.ProgressEvent instead", "2.0.0")
  type ProgressEvent = dom.ProgressEvent
  @deprecated("use dom.PopStateEvent instead", "2.0.0")
  type PopStateEvent = dom.PopStateEvent

  @deprecated("use dom.Range instead", "2.0.0")
  type Range = dom.Range
  @deprecated("use dom.Range instead", "2.0.0")
  lazy val Range: dom.Range.type = dom.Range

  @deprecated("use dom.Screen instead", "2.0.0")
  type Screen = dom.Screen
  @deprecated("use dom.Selection instead", "2.0.0")
  type Selection = dom.Selection
  @deprecated("use dom.StereoPannerNode instead", "2.0.0")
  type StereoPannerNode = dom.StereoPannerNode
  @deprecated("use dom.Storage instead", "2.0.0")
  type Storage = dom.Storage
  @deprecated("use dom.StorageEvent instead", "2.0.0")
  type StorageEvent = dom.StorageEvent
  @deprecated("use dom.StyleMedia instead", "2.0.0")
  type StyleMedia = dom.StyleMedia
  @deprecated("use dom.StyleSheetList instead", "2.0.0")
  type StyleSheetList = dom.StyleSheetList
  @deprecated("use dom.StyleSheet instead", "2.0.0")
  type StyleSheet = dom.StyleSheet

  @deprecated("use dom.Text instead", "2.0.0")
  type Text = dom.Text
  @deprecated("use dom.TextEvent instead", "2.0.0")
  type TextEvent = dom.TextEvent
  @deprecated("use dom.TextEvent instead", "2.0.0")
  lazy val TextEvent: dom.TextEvent.type = dom.TextEvent
  @deprecated("use dom.TextMetrics instead", "2.0.0")
  type TextMetrics = dom.TextMetrics
  @deprecated("use dom.TextTrack instead", "2.0.0")
  type TextTrack = dom.TextTrack
  @deprecated("use dom.TextTrack instead", "2.0.0")
  lazy val TextTrack: dom.TextTrack.type = dom.TextTrack
  @deprecated("use dom.TextTrackCue instead", "2.0.0")
  type TextTrackCue = dom.TextTrackCue
  @deprecated("use dom.TextTrackCueList instead", "2.0.0")
  type TextTrackCueList = dom.TextTrackCueList
  @deprecated("use dom.TextTrackList instead", "2.0.0")
  type TextTrackList = dom.TextTrackList
  @deprecated("use dom.TimeRanges instead", "2.0.0")
  type TimeRanges = dom.TimeRanges
  @deprecated("use dom.Touch instead", "2.0.0")
  type Touch = dom.Touch
  @deprecated("use dom.TouchEvent instead", "2.0.0")
  type TouchEvent = dom.TouchEvent
  @deprecated("use dom.TouchList instead", "2.0.0")
  type TouchList = dom.TouchList
  @deprecated("use dom.TrackEvent instead", "2.0.0")
  type TrackEvent = dom.TrackEvent
  @deprecated("use dom.Transferable instead", "2.0.0")
  type Transferable = dom.Transferable
  @deprecated("use dom.TransitionEvent instead", "2.0.0")
  type TransitionEvent = dom.TransitionEvent
  @deprecated("use dom.TreeWalker instead", "2.0.0")
  type TreeWalker = dom.TreeWalker
  @deprecated("use dom.TwoDContextAttributes instead", "2.0.0")
  type TwoDContextAttributes = dom.TwoDContextAttributes

  @deprecated("use dom.UIEvent instead", "2.0.0")
  type UIEvent = dom.UIEvent
  @deprecated("use dom.URL instead", "2.0.0")
  lazy val URL: dom.URL.type = dom.URL

  @deprecated("use dom.ValidityState instead", "2.0.0")
  type ValidityState = dom.ValidityState
  @deprecated("use dom.VisibilityState instead", "2.0.0")
  type VisibilityState = dom.VisibilityState
  @deprecated("use dom.VisibilityState instead", "2.0.0")
  lazy val VisibilityState: dom.VisibilityState.type = dom.VisibilityState

  @deprecated("use dom.WaveShaperNode instead", "2.0.0")
  type WaveShaperNode = dom.WaveShaperNode
  @deprecated("use dom.WebGLActiveInfo instead", "2.0.0")
  type WebGLActiveInfo = dom.WebGLActiveInfo
  @deprecated("use dom.WebGLBuffer instead", "2.0.0")
  type WebGLBuffer = dom.WebGLBuffer
  @deprecated("use dom.WebGLContextAttributes instead", "2.0.0")
  type WebGLContextAttributes = dom.WebGLContextAttributes
  @deprecated("use dom.WebGLFramebuffer instead", "2.0.0")
  type WebGLFramebuffer = dom.WebGLFramebuffer
  @deprecated("use dom.WebGLProgram instead", "2.0.0")
  type WebGLProgram = dom.WebGLProgram
  @deprecated("use dom.WebGLRenderbuffer instead", "2.0.0")
  type WebGLRenderbuffer = dom.WebGLRenderbuffer
  @deprecated("use dom.WebGLRenderingContext instead", "2.0.0")
  type WebGLRenderingContext = dom.WebGLRenderingContext
  @deprecated("use dom.WebGLShader instead", "2.0.0")
  type WebGLShader = dom.WebGLShader
  @deprecated("use dom.WebGLShaderPrecisionFormat instead", "2.0.0")
  type WebGLShaderPrecisionFormat = dom.WebGLShaderPrecisionFormat
  @deprecated("use dom.WebGLTexture instead", "2.0.0")
  type WebGLTexture = dom.WebGLTexture
  @deprecated("use dom.WebGLUniformLocation instead", "2.0.0")
  type WebGLUniformLocation = dom.WebGLUniformLocation
  @deprecated("use dom.WebGLRenderingContext instead", "2.0.0")
  @inline def WebGLRenderingContext = dom.WebGLRenderingContext
  @deprecated("use dom.WebSocket instead", "2.0.0")
  type WebSocket = dom.WebSocket
  @deprecated("use dom.WebSocket instead", "2.0.0")
  lazy val WebSocket: dom.WebSocket.type = dom.WebSocket
  @deprecated("use dom.WheelEvent instead", "2.0.0")
  type WheelEvent = dom.WheelEvent
  @deprecated("use dom.WheelEvent instead", "2.0.0")
  lazy val WheelEvent: dom.WheelEvent.type = dom.WheelEvent
  @deprecated("use dom.Window instead", "2.0.0")
  type Window = dom.Window
  @deprecated("use dom.WindowConsole instead", "2.0.0")
  type WindowConsole = dom.WindowConsole
  @deprecated("use dom.WindowLocalStorage instead", "2.0.0")
  type WindowLocalStorage = dom.WindowLocalStorage
  @deprecated("use dom.WindowOrWorkerGlobalScope instead", "2.0.0")
  type WindowOrWorkerGlobalScope = dom.WindowOrWorkerGlobalScope
  @deprecated("use dom.WindowOrWorkerGlobalScope instead", "2.0.0")
  @inline def WindowOrWorkerGlobalScope = dom.WindowOrWorkerGlobalScope
  @deprecated("use dom.WindowSessionStorage instead", "2.0.0")
  type WindowSessionStorage = dom.WindowSessionStorage
  @deprecated("use dom.WindowTimers instead", "2.0.0")
  type WindowTimers = dom.WindowTimers
  @deprecated("use dom.WindowBase64 instead", "2.0.0")
  type WindowBase64 = dom.WindowBase64
  @deprecated("use dom.Worker instead", "2.0.0")
  type Worker = dom.Worker
  @deprecated("use dom.WorkerGlobalScope instead", "2.0.0")
  type WorkerGlobalScope = dom.WorkerGlobalScope
  @deprecated("use dom.WorkerLocation instead", "2.0.0")
  type WorkerLocation = dom.WorkerLocation
  @deprecated("use dom.WorkerNavigator instead", "2.0.0")
  type WorkerNavigator = dom.WorkerNavigator

  @deprecated("use dom.XMLHttpRequest instead", "2.0.0")
  type XMLHttpRequest = dom.XMLHttpRequest
  @deprecated("use dom.XMLHttpRequest instead", "2.0.0")
  lazy val XMLHttpRequest: dom.XMLHttpRequest.type = dom.XMLHttpRequest
  @deprecated("use dom.XMLHttpRequestEventTarget instead", "2.0.0")
  type XMLHttpRequestEventTarget = dom.XMLHttpRequestEventTarget
  @deprecated("use dom.XMLSerializer instead", "2.0.0")
  type XMLSerializer = dom.XMLSerializer
  @deprecated("use dom.XPathResult instead", "2.0.0")
  type XPathResult = dom.XPathResult
  @deprecated("use dom.XPathResult instead", "2.0.0")
  lazy val XPathResult: dom.XPathResult.type = dom.XPathResult
  @deprecated("use dom.XPathNSResolver instead", "2.0.0")
  type XPathNSResolver = dom.XPathNSResolver

  @deprecated("use dom.DedicatedWorkerGlobalScope instead", "2.0.0")
  @js.native
  @JSGlobalScope
  object DedicatedWorkerGlobalScope extends js.Object {

    /**
     * Returns an object reference to the DedicatedWorkerGlobalScope object itself.
     *
     * MDN
     */
    def self: DedicatedWorkerGlobalScope = js.native
  }
}
