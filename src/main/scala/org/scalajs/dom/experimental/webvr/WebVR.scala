package org.scalajs.dom.experimental.webvr

/*
 * Façade to the WebVR API, Editor’s Draft, 21 September 2016
 *
 * [[https://w3c.github.io/webvr/]]
 *
 */

import org.scalajs.dom._
import org.scalajs.dom.html.IFrame

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.Promise
import scala.scalajs.js.typedarray.Float32Array
import scala.language.implicitConversions


/**
  * The VRLayer interface is provided to a VRDisplay and presented in the HMD.
  */
@ScalaJSDefined
trait VRLayer extends js.Object {
  /** The source attribute defines the canvas whose contents will be presented by the VRDisplay when VRDisplay.submitFrame() is called. */
  var source: VRSource
  /** The leftBounds attribute contains four values defining the texture bounds within the
    * source canvas to present to the eye in UV space:
    * [0] left offset of the bounds (0.0 - 1.0);
    * [1] top offset of the bounds (0.0 - 1.0); [2] width of the bounds (0.0 - 1.0); [3] height of the bounds (0.0 - 1.0).
    * The leftBounds MUST default to [0.0, 0.0, 0.5, 1.0].
    */
  var leftBounds: js.Array[Float]
  /**
    * The rightBounds attribute contains four values defining the texture bounds rectangle within the
    * source canvas to present to the eye in UV space:
    * [0] left offset of the bounds (0.0 - 1.0);
    * [1] top offset of the bounds (0.0 - 1.0);
    * [2] width of the bounds (0.0 - 1.0);
    * [3] height of the bounds (0.0 - 1.0).
    * The rightBounds MUST default to [0.5, 0.0, 0.5, 1.0].
    */
  var rightBounds: js.Array[Float]
}

object VRLayer {
  def apply(source: VRSource, leftBounds: js.Array[Float], rightBounds: js.Array[Float]): VRLayer = {
    js.Dynamic
      .literal(source = source.merge[js.Any], leftBounds = leftBounds, rightBounds = rightBounds)
      .asInstanceOf[VRLayer]
  }
}

@ScalaJSDefined
trait VRFrameData extends js.Object {
  /** Monotonically increasing value that allows the author to determine if position state data been updated from the hardware. Since values are monotonically increasing, they can be compared to determine the ordering of updates, as newer values will always be greater than or equal to older values. The timestamp starts at 0 the first time getFrameData() is invoked for a given VRDisplay. */
  def timestamp: Double // DOMHighResTimeStamp
  /** A 4x4 matrix describing the projection to be used for the left eye’s rendering, given as a 16 element array in column major order. This value may be passed directly to WebGL’s uniformMatrix4fv function. It is highly recommended that applications use this matrix without modification. Failure to use this projection matrix when rendering may cause the presented frame to be distorted or badly aligned, resulting in varying degrees of user discomfort. */
  def leftProjectionMatrix: Float32Array
  /** A 4x4 matrix describing the view transform to be used for the left eye’s rendering, given as a 16 element array in column major order. Represents the inverse of the model matrix of the left eye in sitting space. This value may be passed directly to WebGL’s uniformMatrix4fv function. It is highly recommended that applications use this matrix when rendering. */
  def leftViewMatrix: Float32Array
  /** A 4x4 matrix describing the projection to be used for the right eye’s rendering, given as a 16 element array in column major order. This value may be passed directly to WebGL’s uniformMatrix4fv function. It is highly recommended that applications use this matrix without modification. Failure to use this projection matrix when rendering may cause the presented frame to be distorted or badly aligned, resulting in varying degrees of user discomfort. */
  def rightProjectionMatrix: Float32Array
  /** A 4x4 matrix describing the view transform to be used for the right eye’s rendering, given as a 16 element array in column major order. Represents the inverse of the model matrix of the right eye in sitting space. This value may be passed directly to WebGL’s uniformMatrix4fv function. It is highly recommended that applications use this matrix when rendering. */
  def rightViewMatrix: Float32Array
  /** The VRPose of the VRDisplay at timestamp. */
  def pose: VRPose
}

/**
  * The VRDisplay interface forms the base of all VR devices supported by this API.
  * It includes generic information such as device IDs and descriptions.
  */
@js.native
trait VRDisplay extends EventTarget {
  def isConnected: Boolean = js.native

  def isPresenting: Boolean = js.native

  /** Dictionary of capabilities describing the VRDisplay. */
  val capabilities: VRDisplayCapabilities = js.native

  /**
    * If this VRDisplay supports room-scale experiences, the optional
    * stage attribute contains details on the room-scale parameters.
    * The stageParameters attribute can not change between null
    * and non-null once the VRDisplay is enumerated; however,
    * the values within VRStageParameters may change after
    * any call to VRDisplay.submitFrame as the user may re-configure
    * their environment at any time.
    */
  def stageParameters: VRStageParameters = js.native

  /* Return the current VREyeParameters for the given eye. */
  def getEyeParameters(whichEye: VREye): VREyeParameters = js.native

  /**
    * An identifier for this distinct VRDisplay. Used as an
    * association point in the Gamepad API.
    */
  val displayId: Int = js.native
  /** A display name, a user-readable name identifying it. */
  val displayName: String = js.native

  /**
    * Populates the passed VRFrameData with the information required to render
    * the current frame.
    */
  def getFrameData(frameData: VRFrameData): Boolean = js.native

  /**
    * Return a VRPose containing the future predicted pose of the VRDisplay
    * when the current frame will be presented. The value returned will not
    * change until JavaScript has returned control to the browser.
    *
    * The VRPose will contain the position, orientation, velocity,
    * and acceleration of each of these properties.
    */
  def getPose(): VRPose = js.native

  /**
    * Reset the pose for this display, treating its current position and
    * orientation as the "origin/zero" values. VRPose.position,
    * VRPose.orientation, and VRStageParameters.sittingToStandingTransform may be
    * updated when calling resetPose(). This should be called in only
    * sitting-space experiences.
    */
  def resetPose(): Unit = js.native

  /**
    * z-depth defining the near plane of the eye view frustum
    * enables mapping of values in the render target depth
    * attachment to scene coordinates. Initially set to 0.01.
    */
  var depthNear: Double = js.native
  /**
    * z-depth defining the far plane of the eye view frustum
    * enables mapping of values in the render target depth
    * attachment to scene coordinates. Initially set to 10000.0.
    */
  var depthFar: Double = js.native

  /**
    * The callback passed to "requestAnimationFrame" will be called
    * any time a new frame should be rendered. When the VRDisplay is
    * presenting the callback will be called at the native refresh
    * rate of the HMD. When not presenting this function acts
    * identically to how window.requestAnimationFrame acts. Content should
    * make no assumptions of frame rate or vsync behavior as the HMD runs
    * asynchronously from other displays and at differing refresh rates.
    */
  def requestAnimationFrame(callback: js.Function): Int = js.native

  /**
    * Passing the value returned by requestAnimationFrame to
    * cancelAnimationFrame will unregister the callback.
    */
  def cancelAnimationFrame(handle: Int): Unit = js.native

  /**
    * Begin presenting to the VRDisplay. Must be called in response to a user gesture.
    * Repeat calls while already presenting will update the VRLayers being displayed.
    * If the number of values in the leftBounds/rightBounds arrays is not 0 or 4 for any of the passed layers the promise is rejected
    * If the source of any of the layers is not present (null), the promise is rejected.
    */
  def requestPresent(layers: js.Array[VRLayer]): Promise[Unit] = js.native

  /** Stops presenting to the VRDisplay. */
  def exitPresent(): Promise[Unit] = js.native

  /** Get the layers currently being presented. */
  def getLayers(): js.Array[VRLayer] = js.native

  /**
    * The VRLayer provided to the VRDisplay will be captured and presented
    * in the HMD. Calling this function has the same effect on the source
    * canvas as any other operation that uses its source image, and canvases
    * created without preserveDrawingBuffer set to true will be cleared.
    */
  def submitFrame(pose: VRPose = ???): Unit = js.native
}

/**
  * The VRDisplayCapabilities interface describes the capabilities of a VRDisplay.
  * These are expected to be static per-device/per-user.
  */
@ScalaJSDefined
trait VRDisplayCapabilities extends js.Object {
  /** The hasPosition attribute MUST return whether the VRDisplay is capable of tracking its position. */
  val hasPosition: Boolean
  /** The hasOrientation attribute MUST return whether the VRDisplay is capable of tracking its orientation. */
  val hasOrientation: Boolean
  /** The hasExternalDisplay attribute MUST return whether the VRDisplay is separate
    * from the device’s primary display. If presenting VR content will obscure other content on the device,
    * this should be false. When false, the application should not attempt to
    * mirror VR content or update non-VR UI because that content will not be visible.
    */
  val hasExternalDisplay: Boolean
  /**
    * The canPresent attribute MUST return whether the VRDisplay is capable of presenting content
    * to an HMD or similar device. Can be used to indicate "magic window" devices that are capable
    * of 6DoF tracking but for which VRDisplay.requestPresent() is not meaningful.
    * If false then calls to VRDisplay.requestPresent() should always fail, and VRDisplay.getEyeParameters() should return NULL.
    */
  val canPresent: Boolean
  /**
    * Indicates the maximum length of the array that requestPresent() will accept. MUST be 1 if canPresent is true, 0 otherwise.
    */
  val maxLayers: Int
}

/**
  * (Deprecated) The VRFieldOfView interface represents a field of view, as given by 4 degrees describing the view from a center point.
  */
@ScalaJSDefined
trait VRFieldOfView extends js.Object {
  val upDegrees: Double
  val rightDegrees: Double
  val downDegrees: Double
  val leftDegrees: Double
}

/**
  * The VRPose interface represents a sensor’s state at a given timestamp.
  */
@ScalaJSDefined
trait VRPose extends js.Object {
  /**
    * Position of the VRDisplay at timestamp as a 3D vector. Position is given in meters from an origin point, which is either the position the sensor was first read at or the position of the sensor at the point that resetPose() was last called. The coordinate system uses these axis definitions:
    *
    * Positive X is to the user’s right.
    * Positive Y is up.
    * Positive Z is behind the user.
    * All positions are given relative to the identity orientation in sitting space.
    * Transforming this point with VRStageParameters.sittingToStandingTransform converts
    * this to standing space. MAY be NULL if the sensor is incapable of providing positional data.
    * User agents MAY provide emulated position values through techniques such as neck modeling,
    * but when doing so SHOULD report VRDisplayCapabilities.hasPosition as false.
    * When not NULL MUST be a three-element array.
    */
  val position: Float32Array
  /** Linear velocity of the sensor at timestamp meters per second. MAY be NULL if the sensor is incapable of providing linear velocity. When not NULL MUST be a three-element array.
    */
  val linearVelocity: Float32Array
  /**
    * Linear acceleration of the sensor at timestamp given in meters per second squared. MAY be NULL if the sensor is incapable of providing linear acceleration. When not NULL MUST be a three-element array.
    */
  val linearAcceleration: Float32Array
  /**
    * Orientation of the sensor at timestamp as a quaternion.
    * The orientation yaw (rotation around the Y axis) is relative to the initial yaw of
    * the sensor when it was first read or the yaw of the sensor at the point that
    * resetPose() was last called.
    * An orientation of [0, 0, 0, 1] is considered to be "forward".
    * MAY be NULL if the sensor is incapable of providing orientation data.
    * When not NULL MUST be a four-element array.
    */
  val orientation: Float32Array
  /**
    * Angular velocity of the sensor at timestamp given in radians per second. MAY be NULL if the sensor is incapable of providing angular velocity. When not NULL MUST be a three-element array.
    */
  val angularVelocity: Float32Array
  /**
    * Angular acceleration of the sensor at timestamp given in radians per second squared. MAY be NULL if the sensor is incapable of providing angular acceleration. When not NULL MUST be a three-element array.
    */
  val angularAcceleration: Float32Array
}

/**
  * The VREyeParameters interface represents all the information required to correctly render a scene for a given eye.
  */
@ScalaJSDefined
trait VREyeParameters extends js.Object {
  /**
    * Offset from the center point between the users eyes to the center of the eye in meters. This value SHOULD represent half of the user’s interpupillary distance (IPD), but MAY also represent the distance from the center point of the headset to the center point of the lens for the given eye. Values for the left eye MUST be negative; values for the right eye MUST be positive.
    */
  val offset: Float32Array
  /**
    * The current field of view for the eye, as the user adjusts her headset IPD.
    */
  val fieldOfView: VRFieldOfView
  /**
    * Describes the recommended render target width of each eye viewport, in pixels. If multiple eyes are rendered in a single render target, then the render target should be made large enough to fit both viewports. The renderWidth for the left eye and right eye MUST NOT overlap, and the renderWidth for the right eye MUST be to the right of the renderWidth for the left eye.
    */
  val renderWidth: Int
  /**
    * Describes the recommended render target height of each eye viewport, in pixels. If multiple eyes are rendered in a single render target, then the render target should be made large enough to fit both viewports. The renderWidth for the left eye and right eye MUST NOT overlap, and the renderWidth for the right eye MUST be to the right of the renderWidth for the left eye.
    */
  val renderHeight: Int
}

/**
  * The VRStageParameters interface represents the values describing the the stage/play area for devices that support room-scale experiences.
  */
@ScalaJSDefined
trait VRStageParameters extends js.Object {
  /**
    * The sittingToStandingTransform attribute is a 16-element array containing the components of a 4×4 transform matrix. This matrix transforms the sitting-space position returned by getPose()/getImmediatePose() to a standing-space position.
    */
  val sittingToStandingTransform: Float32Array
  /**
    * Width of the play-area bounds in meters. The bounds are defined as an axis-aligned rectangle on the floor. The center of the rectangle is at (0,0,0) in standing-space coordinates. These bounds are defined for safety purposes. Content should not require the user to move beyond these bounds; however, it is possible for the user to ignore the bounds resulting in position values outside of this rectangle.
    */
  val sizeX: Float
  /**
    * Depth of the play-area bounds in meters. The bounds are defined as an axis-aligned rectangle on the floor. The center of the rectangle is at (0,0,0) in standing-space coordinates. These bounds are defined for safety purposes. Content should not require the user to move beyond these bounds; however, it is possible for the user to ignore the bounds resulting in position values outside of this rectangle.
    */
  val sizeZ: Float
}

/**
  * Navigator Interface extension
  */
@js.native
trait NavigatorWebVR extends js.Object {
  /** Return a Promise which resolves to a list of available VRDisplays. */
  def getVRDisplays(): Promise[js.Array[VRDisplay]] = js.native

  /** activeVRDisplays includes every VRDisplay that is currently presenting. */
  val activeVRDisplays: js.Array[VRDisplay] = js.native

  /** The vrEnabled attribute’s getter must return true if the context object is allowed to use the feature indicated by attribute name allowvr and VR is supported, and false otherwise. */
  def vrEnabled: Boolean = js.native
}

/**
  * Window Interface extension
  */
@js.native
trait WindowWebVR extends js.Object {
  /** A user agent MAY dispatch this event type to indicate that a VRDisplay has been connected. */
  var onvrdisplayconnected: EventHandler = js.native
  /** A user agent MAY dispatch this event type to indicate that a VRDisplay has been disconnected. */
  var onvrdisplaydisconnected: EventHandler = js.native
  /** A user agent MAY dispatch this event type to indicate that something has occured which suggests the VRDisplay should be presented to. For example, if the VRDisplay is capable of detecting when the user has put it on, this event SHOULD fire when they do so with the reason "mounted". */
  var onvrdisplayactivate: EventHandler = js.native
  /** A user agent MAY dispatch this event type to indicate that something has occured which suggests the VRDisplay should exit presentation. For example, if the VRDisplay is capable of detecting when the user has taken it off, this event SHOULD fire when they do so with the reason "unmounted". */
  var onvrdisplaydeactivate: EventHandler = js.native
  /**  A user agent MAY dispatch this event type to indicate that presentation to the display by the page is paused by the user agent, OS, or VR hardware. While a VRDisplay is blurred it does not lose it’s presenting status (isPresenting continues to report true) but getFrameData() returns false without updating the provided VRFrameData and getPose() returns null. This is to prevent tracking while the user interacts with potentially sensitive UI. For example: A user agent SHOULD blur the presenting application when the user is typing a URL into the browser with a virtual keyboard, otherwise the presenting page may be able to guess the URL the user is entering by tracking their head motions. */
  var onvrdisplayblur: EventHandler = js.native
  /**  A user agent MAY dispatch this event type to indicate that presentation to the display by the page has resumed after being blurred. */
  var onvrdisplayfocus: EventHandler = js.native
  /** A user agent MUST dispatch this event type to indicate that a VRDisplay has begun or ended VR presentation. This event should not fire on subsequent calls to requestPresent() after the VRDisplay has already begun VR presentation. */
  var onvrdisplaypresentchange: EventHandler = js.native
}

/**
  * the VREye types, "left" or "right"
  */
sealed class VREye(val whichEye: String)
object VREye {
  case object Left extends VREye("left")
  case object Right extends VREye("right")
}

/**
  * the VRDisplayEventReason
  */
class VRDisplayEventReason(val event: String)
object VRDisplayEventReason {
  /** The page has been navigated to from a context that allows this page to begin presenting immediately, such as from another site that was already in VR presentation mode. */
  case object Navigation extends VRDisplayEventReason("navigation")
  /** The VRDisplay has detected that the user has put it on. */
  case object Mounted extends VRDisplayEventReason("mounted")
  /** The VRDisplay has detected that the user has taken it off. */
  case object Unmounted extends VRDisplayEventReason("unmounted")
}

/**
  * The VRDisplayEvent
  */
@js.native
class VRDisplayEvent(eventInitDict: VRDisplayEventInit) extends Event {
  /** The VRDisplay associated with this event. */
  val display: VRDisplay = js.native
  /** VRDisplayEventReason describing why this event has has been fired. */
  val reason: String = js.native // VRDisplayEventReason see implicit
}

@ScalaJSDefined
trait VRDisplayEventInit extends js.Object {
  /** The VRDisplay associated with this event. */
  val display: VRDisplay
  /** VRDisplayEventReason describing why this event has has been fired. */
  val reason: String // VRDisplayEventReason see implicit
}

object VRDisplayEventInit {
  def apply(display: VRDisplay, reason: String): VRDisplayEventInit = {
    js.Dynamic
      .literal(display = display, reason = reason)
      .asInstanceOf[VRDisplayEventInit]
  }
}

@js.native
trait IFrameWebVR extends IFrame {
  /** The allowvr attribute is a boolean attribute. When specified, it indicates that Document objects
    * in the iframe element’s browsing context are to be allowed to access VR devices
    * (if it’s not blocked for other reasons, e.g. there is another ancestor iframe
    * without this attribute set). Document objects in an iframe element without
    * this attribute should reject calls to getVRDisplays() and should not fire any VRDisplayEvent.*/
 var allowvr: Boolean
}
