package org.scalajs

import org.scalajs.dom.raw.Window
import scala.scalajs.js

package object dom extends Window with scalajs.js.GlobalScope {
  type AbstractWorker = raw.AbstractWorker
  type AnalyserNode = raw.AnalyserNode
  type AnimationEvent = raw.AnimationEvent
  type ApplicationCache = raw.ApplicationCache
  val ApplicationCache: raw.ApplicationCache.type = js.native
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
  val Blob: raw.Blob.type = js.native
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
  val DOMException: raw.DOMException.type = js.native
  type DOMError = raw.DOMError
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
  val Event: raw.Event.type = js.native
  type EventException = raw.EventException
  val EventException: raw.EventException.type = js.native
  type EventSource = raw.EventSource
  val EventSource: raw.EventSource.type = js.native
  type EventTarget = raw.EventTarget
  type External = raw.External

  type FocusEvent = raw.FocusEvent
  type File = raw.File
  type FileList = raw.FileList
  type FileReader = raw.FileReader
  val FileReader: raw.FileReader.type = js.native
  type FormData = raw.FormData
  val FormData: raw.FormData.type = js.native

  type GainNode = raw.GainNode
  type Geolocation = raw.Geolocation

  type HashChangeEvent = raw.HashChangeEvent
  type History = raw.History

  type ImageData = raw.ImageData

  type KeyboardEvent = raw.KeyboardEvent
  val KeyboardEvent: raw.KeyboardEvent.type = js.native

  type LinkStyle = raw.LinkStyle
  type Location = raw.Location

  type MediaError = raw.MediaError
  val MediaError: raw.MediaError.type = js.native
  type MediaElementAudioSourceNode = raw.MediaElementAudioSourceNode
  type MediaList = raw.MediaList
  type MediaQueryList = raw.MediaQueryList
  type MediaQueryListListener = raw.MediaQueryListListener
  type MediaStream = raw.MediaStream
  type MediaStreamAudioDestinationNode = raw.MediaStreamAudioDestinationNode
  type MediaStreamAudioSourceNode = raw.MediaStreamAudioSourceNode
  type MessageChannel = raw.MessageChannel
  type MessageEvent = raw.MessageEvent
  type MessagePort = raw.MessagePort
  type ModifierKeyEvent = raw.ModifierKeyEvent
  type MouseEvent = raw.MouseEvent
  type MutationEvent = raw.MutationEvent
  val MutationEvent: raw.MutationEvent.type = js.native
  type MutationObserver = raw.MutationObserver
  type MutationObserverInit = raw.MutationObserverInit
  val MutationObserverInit: raw.MutationObserverInit.type = js.native
  type MutationRecord = raw.MutationRecord

  type NamedNodeMap = raw.NamedNodeMap
  type NavigatorID = raw.NavigatorID
  type Navigator = raw.Navigator
  type NavigatorGeolocation = raw.NavigatorGeolocation
  type NavigatorContentUtils = raw.NavigatorContentUtils
  type NavigatorOnLine = raw.NavigatorOnLine
  type NavigatorStorageUtils = raw.NavigatorStorageUtils
  type NodeSelector = raw.NodeSelector
  type Node = raw.Node
  val Node: raw.Node.type = js.native
  type NodeFilter = raw.NodeFilter
  val NodeFilter: raw.NodeFilter.type = js.native
  type NodeIterator = raw.NodeIterator
  type NodeList = raw.NodeList
  type NodeListOf[TNode <: Node] = raw.NodeListOf[TNode]

  type ObjectURLOptions = raw.ObjectURLOptions
  type OfflineAudioContext = raw.OfflineAudioContext
  @deprecated("Use the promise version of OfflineAudioContext.startRendering instead.", "forever")
  type OfflineAudioCompletionEvent = raw.OfflineAudioCompletionEvent
  type OscillatorNode = raw.OscillatorNode

  type PannerNode = raw.PannerNode
  type ParentNode = raw.ParentNode
  type Performance = raw.Performance
  type PerformanceEntry = raw.PerformanceEntry
  type PerformanceTiming = raw.PerformanceTiming
  type PerformanceMark = raw.PerformanceMark
  type PerformanceMeasure = raw.PerformanceMeasure
  type PerformanceNavigation = raw.PerformanceNavigation
  val PerformanceNavigation: raw.PerformanceNavigation.type = js.native
  type PerformanceResourceTiming = raw.PerformanceResourceTiming
  type PeriodicWave = raw.PeriodicWave
  type Position = raw.Position
  type PositionOptions = raw.PositionOptions
  type PositionError = raw.PositionError
  val PositionError: raw.PositionError.type = js.native
  type ProcessingInstruction = raw.ProcessingInstruction
  type ProgressEvent = raw.ProgressEvent
  type PopStateEvent = raw.PopStateEvent

  type Range = raw.Range
  val Range: raw.Range.type = js.native

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
  val TextEvent: raw.TextEvent.type = js.native
  type TextMetrics = raw.TextMetrics
  type TextTrack = raw.TextTrack
  val TextTrack: raw.TextTrack.type = js.native
  type TextTrackCue = raw.TextTrackCue
  type TextTrackCueList = raw.TextTrackCueList
  type TextTrackList = raw.TextTrackList
  type TimeRanges = raw.TimeRanges
  type Touch = raw.Touch
  type TouchEvent = raw.TouchEvent
  type TouchList = raw.TouchList
  type TrackEvent = raw.TrackEvent
  type TransitionEvent = raw.TransitionEvent
  type TreeWalker = raw.TreeWalker

  type UIEvent = raw.UIEvent
  type URL = raw.URL

  type ValidityState = raw.ValidityState

  type WaveShaperNode = raw.WaveShaperNode
  type WebSocket = raw.WebSocket
  val WebSocket: raw.WebSocket.type = js.native
  type WheelEvent = raw.WheelEvent
  val WheelEvent: raw.WheelEvent.type = js.native
  type Window = raw.Window
  type WindowConsole = raw.WindowConsole
  type WindowLocalStorage = raw.WindowLocalStorage
  type WindowSessionStorage = raw.WindowSessionStorage
  type WindowTimers = raw.WindowTimers
  type WindowTimersExtension = raw.WindowTimersExtension

  type WindowBase64 = raw.WindowBase64
  type Worker = raw.Worker
  val Worker: raw.Worker.type = js.native

  type XMLHttpRequest = raw.XMLHttpRequest
  val XMLHttpRequest: raw.XMLHttpRequest.type = js.native
  type XMLHttpRequestEventTarget = raw.XMLHttpRequestEventTarget
  type XMLSerializer = raw.XMLSerializer
  type XPathResult = raw.XPathResult
  val XPathResult: raw.XPathResult.type = js.native
  type XPathNSResolver = raw.XPathNSResolver
}
