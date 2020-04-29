package org.scalajs

import scala.scalajs.js

package object dom {

  type AnalyserNode = raw.AnalyserNode
  type AnimationEvent = raw.AnimationEvent
  type ApplicationCache = raw.ApplicationCache
  lazy val ApplicationCache: raw.ApplicationCache.type = raw.ApplicationCache
  type Attr = raw.Attr
  type AudioBuffer = raw.AudioBuffer
  type AudioBufferSourceNode = raw.AudioBufferSourceNode
  type AudioContext = raw.AudioContext
  type AudioDestinationNode = raw.AudioDestinationNode
  type AudioListener = raw.AudioListener
  type AudioNode = raw.AudioNode
  type AudioParam = raw.AudioParam
  type AudioTrack = raw.AudioTrack
  type AudioTrackList = raw.AudioTrackList

  type BeforeUnloadEvent = raw.BeforeUnloadEvent
  type BiquadFilterNode = raw.BiquadFilterNode
  type Blob = raw.Blob
  lazy val Blob: raw.Blob.type = raw.Blob
  lazy val BlobPropertyBag: raw.BlobPropertyBag.type = raw.BlobPropertyBag
  type BlobPropertyBag = raw.BlobPropertyBag

  type CanvasGradient = raw.CanvasGradient
  type CanvasPattern = raw.CanvasPattern
  type CanvasRenderingContext2D = raw.CanvasRenderingContext2D
  type CDATASection = raw.CDATASection
  type ChannelMergerNode = raw.ChannelMergerNode
  type ChannelSplitterNode = raw.ChannelSplitterNode
  type CharacterData = raw.CharacterData
  type ClientRect = raw.ClientRect
  type ClientRectList = raw.ClientRectList
  type ClipboardEvent = raw.ClipboardEvent
  type ClipboardEventInit = raw.ClipboardEventInit
  type CloseEvent = raw.CloseEvent
  type CompositionEvent = raw.CompositionEvent
  type Comment = raw.Comment
  type Coordinates = raw.Coordinates
  type Console = raw.Console
  type ConvolverNode = raw.ConvolverNode
  type CustomEvent = raw.CustomEvent

  type DataTransfer = raw.DataTransfer
  type DelayNode = raw.DelayNode
  type DocumentType = raw.DocumentType
  type DocumentEvent = raw.DocumentEvent
  type Document = raw.Document
  type DocumentFragment = raw.DocumentFragment
  type DOMException = raw.DOMException
  type DOMImplementation = raw.DOMImplementation
  lazy val DOMException: raw.DOMException.type = raw.DOMException
  type DOMList[T] = raw.DOMList[T]
  type DOMParser = raw.DOMParser
  type DOMSettableTokenList = raw.DOMSettableTokenList
  type DOMStringList = raw.DOMStringList
  type DOMTokenList = raw.DOMTokenList
  type DragEvent = raw.DragEvent
  type DynamicsCompressorNode = raw.DynamicsCompressorNode

  type Element = raw.Element
  type ErrorEvent = raw.ErrorEvent
  type Event = raw.Event
  lazy val Event: raw.Event.type = raw.Event
  type EventException = raw.EventException
  lazy val EventException: raw.EventException.type = raw.EventException
  type EventSource = raw.EventSource
  lazy val EventSource: raw.EventSource.type = raw.EventSource
  type EventTarget = raw.EventTarget
  type External = raw.External

  type FocusEvent = raw.FocusEvent
  type File = raw.File
  type FileList = raw.FileList
  type FileReader = raw.FileReader
  lazy val FileReader: raw.FileReader.type = raw.FileReader
  type FormData = raw.FormData
  lazy val FormData: raw.FormData.type = raw.FormData

  type GainNode = raw.GainNode
  type Geolocation = raw.Geolocation

  type HashChangeEvent = raw.HashChangeEvent
  type History = raw.History

  type ImageData = raw.ImageData

  type KeyboardEvent = raw.KeyboardEvent
  lazy val KeyboardEvent: raw.KeyboardEvent.type = raw.KeyboardEvent

  type KeyboardEventInit = raw.KeyboardEventInit

  type LinkStyle = raw.LinkStyle
  type Location = raw.Location

  type MediaError = raw.MediaError
  lazy val MediaError: raw.MediaError.type = raw.MediaError
  type MediaElementAudioSourceNode = raw.MediaElementAudioSourceNode
  type MediaList = raw.MediaList
  type MediaQueryList = raw.MediaQueryList
  type MediaQueryListListener = raw.MediaQueryListListener
  type MediaStreamAudioDestinationNode = raw.MediaStreamAudioDestinationNode
  type MediaStreamAudioSourceNode = raw.MediaStreamAudioSourceNode
  type MessageChannel = raw.MessageChannel
  type MessageEvent = raw.MessageEvent
  type MessagePort = raw.MessagePort
  type ModifierKeyEvent = raw.ModifierKeyEvent
  type MouseEvent = raw.MouseEvent
  type PointerEvent = raw.PointerEvent
  type PointerEventInit = raw.PointerEventInit
  type MutationObserver = raw.MutationObserver
  type MutationObserverInit = raw.MutationObserverInit
  lazy val MutationObserverInit: raw.MutationObserverInit.type =
    raw.MutationObserverInit
  type MutationRecord = raw.MutationRecord

  type NamedNodeMap = raw.NamedNodeMap
  type NavigatorID = raw.NavigatorID
  type Navigator = raw.Navigator
  type NavigatorContentUtils = raw.NavigatorContentUtils
  type NavigatorGeolocation = raw.NavigatorGeolocation
  type NavigatorLanguage = raw.NavigatorLanguage
  type NavigatorOnLine = raw.NavigatorOnLine
  type NavigatorStorageUtils = raw.NavigatorStorageUtils
  type NodeSelector = raw.NodeSelector
  type Node = raw.Node
  lazy val Node: raw.Node.type = raw.Node
  type NodeFilter = raw.NodeFilter
  lazy val NodeFilter: raw.NodeFilter.type = raw.NodeFilter
  type NodeIterator = raw.NodeIterator
  type NodeList = raw.NodeList
  type NodeListOf[TNode <: Node] = raw.NodeListOf[TNode]

  type OfflineAudioContext = raw.OfflineAudioContext
  type OscillatorNode = raw.OscillatorNode

  type PannerNode = raw.PannerNode
  type ParentNode = raw.ParentNode
  type Performance = raw.Performance
  type PerformanceEntry = raw.PerformanceEntry
  type PerformanceTiming = raw.PerformanceTiming
  type PerformanceMark = raw.PerformanceMark
  type PerformanceMeasure = raw.PerformanceMeasure
  type PerformanceNavigation = raw.PerformanceNavigation
  lazy val PerformanceNavigation: raw.PerformanceNavigation.type =
    raw.PerformanceNavigation
  type PerformanceResourceTiming = raw.PerformanceResourceTiming
  type PeriodicWave = raw.PeriodicWave
  type Position = raw.Position
  type PositionOptions = raw.PositionOptions
  type PositionError = raw.PositionError
  lazy val PositionError: raw.PositionError.type = raw.PositionError
  type ProcessingInstruction = raw.ProcessingInstruction
  type ProgressEvent = raw.ProgressEvent
  type PopStateEvent = raw.PopStateEvent

  type Range = raw.Range
  lazy val Range: raw.Range.type = raw.Range

  type Screen = raw.Screen
  type Selection = raw.Selection
  type StereoPannerNode = raw.StereoPannerNode
  type Storage = raw.Storage
  type StorageEvent = raw.StorageEvent
  type StyleMedia = raw.StyleMedia
  type StyleSheetList = raw.StyleSheetList
  type StyleSheet = raw.StyleSheet

  type Text = raw.Text
  type TextEvent = raw.TextEvent
  lazy val TextEvent: raw.TextEvent.type = raw.TextEvent
  type TextMetrics = raw.TextMetrics
  type TextTrack = raw.TextTrack
  lazy val TextTrack: raw.TextTrack.type = raw.TextTrack
  type TextTrackCue = raw.TextTrackCue
  type TextTrackCueList = raw.TextTrackCueList
  type TextTrackList = raw.TextTrackList
  type TimeRanges = raw.TimeRanges
  type Touch = raw.Touch
  type TouchEvent = raw.TouchEvent
  type TouchList = raw.TouchList
  type Transferable = raw.Transferable
  type TrackEvent = raw.TrackEvent
  type TransitionEvent = raw.TransitionEvent
  type TreeWalker = raw.TreeWalker

  type UIEvent = raw.UIEvent
  lazy val URL: raw.URL.type = raw.URL

  type ValidityState = raw.ValidityState
  type VisibilityState = raw.VisibilityState
  lazy val VisibilityState: raw.VisibilityState.type = raw.VisibilityState

  type WaveShaperNode = raw.WaveShaperNode
  type WebSocket = raw.WebSocket
  lazy val WebSocket: raw.WebSocket.type = raw.WebSocket
  type WheelEvent = raw.WheelEvent
  lazy val WheelEvent: raw.WheelEvent.type = raw.WheelEvent
  type Window = raw.Window
  type WindowConsole = raw.WindowConsole
  type WindowLocalStorage = raw.WindowLocalStorage
  type WindowSessionStorage = raw.WindowSessionStorage
  type WindowTimers = raw.WindowTimers

  type WindowBase64 = raw.WindowBase64

  type XMLHttpRequest = raw.XMLHttpRequest
  lazy val XMLHttpRequest: raw.XMLHttpRequest.type = raw.XMLHttpRequest
  type XMLHttpRequestEventTarget = raw.XMLHttpRequestEventTarget
  type XMLSerializer = raw.XMLSerializer
  type XPathResult = raw.XPathResult
  lazy val XPathResult: raw.XPathResult.type = raw.XPathResult
  type XPathNSResolver = raw.XPathNSResolver

  lazy val window: Window = js.Dynamic.global.window.asInstanceOf[Window]
  lazy val document: html.Document = window.document

  lazy val console: Console = window.console
}
