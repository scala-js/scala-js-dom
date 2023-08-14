package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

/** The IntersectionObserver interface of the Intersection Observer API provides a way to asynchronously observe changes
  * in the intersection of a target element with an ancestor element or with a top-level document's viewport.
  */
@js.native
@JSGlobal
class IntersectionObserver(
    callback: js.Function2[js.Array[IntersectionObserverEntry], IntersectionObserver, Unit],
    init: IntersectionObserverInit
) extends js.Object {

  /** The Element or Document whose bounds are used as the bounding box when testing for intersection. If no root value
    * was passed to the constructor or its value is null, the top-level document's viewport is used.
    */
  def root: Document | Element = js.native

  /** An offset rectangle applied to the root's bounding box when calculating intersections, effectively shrinking or
    * growing the root for calculation purposes. The value returned by this property may not be the same as the one
    * specified when calling the constructor as it may be changed to match internal requirements. Each offset can be
    * expressed in pixels (px) or as a percentage (%). The default is "0px 0px 0px 0px".
    */
  def rootMargin: String = js.native

  /** A list of thresholds, sorted in increasing numeric order, where each threshold is a ratio of intersection area to
    * bounding box area of an observed target. Notifications for a target are generated when any of the thresholds are
    * crossed for that target. If no value was passed to the constructor, 0 is used.
    */
  def thresholds: FrozenArray[Double] = js.native

  /** Stops the IntersectionObserver object from observing any target. */
  def disconnect(): Unit = js.native

  /** Tells the IntersectionObserver a target element to observe. */
  def observe(target: Element): Unit = js.native

  /** Returns an array of IntersectionObserverEntry objects for all observed targets. */
  def takeRecords(): js.Array[IntersectionObserverEntry] = js.native

  /** Tells the IntersectionObserver to stop observing a particular target element. */
  def unobserve(target: Element): Unit = js.native
}
