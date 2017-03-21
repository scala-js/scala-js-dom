package org.scalajs.dom.experimental

import scala.scalajs.js
import scala.scalajs.js.annotation._

// the stream API is defined in https://streams.spec.whatwg.org/

/**
 * [[https://streams.spec.whatwg.org/#ws-state ¶4.2.4.3. get state]] of
 * whatwg streams spec
 */
@js.native
sealed trait WriteableState extends js.Any

object WriteableState {

  /**
   * The stream’s internal queue is full; that is, the stream is exerting
   * backpressure. Use .ready to be notified of when the pressure subsides.
   */
  val waiting = "waiting".asInstanceOf[WriteableState]

  /**
   * The stream’s internal queue is not full; call .write() until
   * backpressure is exerted.
   */
  val writable = "writable".asInstanceOf[WriteableState]

  /**
   * The stream’s .close() method has been called, and a command to close is
   * in the queue or being processed by the underlying sink; attempts to
   * write will now fail. */
  val closing = "closing".asInstanceOf[WriteableState]

  /** The underlying sink has been closed; writing is no longer possible. */
  val closed = "closed".asInstanceOf[WriteableState]

  /** An error occurred interacting with the underlying sink or the stream
   * has been aborted, so the stream is now
   * dead. */
  val errored = "errored".asInstanceOf[WriteableState]
}

/**
 * [[https://streams.spec.whatwg.org/#ws-class ¶4.2. Class WritableStream]] of
 * whatwg Stream spec
 *
 *
 * todo: the constructor
 * @tparam T Type of the Chunks to be written to the Stream
 */
@js.native
trait WriteableStream[-T] extends js.Object {

  /**
   * The closed getter returns a promise that will be fulfilled when the
   * stream becomes closed, or rejected if it ever errors.
   * see [[https://streams.spec.whatwg.org/#ws-closed ¶4.2.4.1. get closed]]
   */
  val closed: js.Promise[WriteableStream[T]] = js.native

  /**
   * The ready getter returns a promise that will be fulfilled when the
   * stream transitions away from the "waiting" state to any other state.
   * Once the stream transitions back to "waiting", the getter will return a
   * new promise that stays pending until the next state transition. In
   * essence, this promise gives a signal as to when any backpressure has let
   * up (or that the stream has been
   * closed or errored).
   *
   * see [[https://streams.spec.whatwg.org/#ws-ready ¶4.2.4.2. get ready]]
   * of whatwg streams spec.
   */
  val ready: js.Promise[WriteableStream[T]] = js.native

  /**
   * The state getter returns the state of the stream
   * see [[https://streams.spec.whatwg.org/#ws-state ¶4.2.4.3. get state]]
   * of whatwg streams spec
   */
  def state: WriteableState = js.native

  /**
   * The abort method signals that the producer can no longer successfully
   * write to the stream and it should be immediately moved to an "errored"
   * state, with any queued-up writes discarded. This will also execute any
   * abort mechanism of the underlying sink.
   * see [[https://streams.spec.whatwg.org/#ws-abort ¶4.2.4.4. abort(reason)]]
   *
   * @param reason spec specifies Any (!?)
   */
  def abort(reason: Any): Unit = js.native

  /**
   * The close method signals that the producer is done writing chunks to the
   * stream and wishes to move the stream to a "closed" state. This queues an
   * action to close the stream, such that once any currently queued-up
   * writes complete, the close mechanism of the underlying sink will
   * execute, releasing any held resources. In the meantime, the stream will
   * be in a "closing" state.
   *
   * [[https://streams.spec.whatwg.org/#ws-close ¶4.2.4.5. close()]]
   *
   * @return a promise of this stream being closed
   */
  def close(): js.Promise[WriteableStream[T]] = js.native

  /**
   * The write method adds a write to the stream’s internal queue,
   * instructing the stream to write the given chunk of data to the
   * underlying sink once all other pending writes have finished successfully
   * . It returns a promise that will be fulfilled or rejected depending on
   * the success or failure of writing the chunk to the underlying sink. The
   * impact of enqueuing this chunk will be immediately reflected in the
   * stream’s state property; in particular, if the internal queue is now
   * full according to the stream’s queuing strategy, the stream will exert
   * backpressure by changing its state to "waiting".
   *
   * see [[https://streams.spec.whatwg.org/#ws-write 4.2.4.6. write(chunk)]]
   * of whatwg streams spec
   *
   * @param chunk
   * @return bblfish: not sure what the type of the promise returned is
   */
  def write(chunk: Chunk[T]): js.Promise[Any] = js.native
}

/**
 * defined at [[https://streams.spec.whatwg.org/#readable-stream ¶2.1. Readable Streams]] of
 * whatwg Streams spec.
 *
 * @tparam T Type of the Chunks returned by the Stream. Can't make it coveriant,
 *           due to T
 */
@js.native
trait ReadableStream[+T] extends js.Object {

  /**
   * The locked getter returns whether or not the readable stream is locked
   * to a reader.
   *
   * throws scala.scalajs.js.TypeError  if the stream is not readable
   */
  def locked: Boolean = js.native

  /**
   * The cancel method cancels the stream, signaling a loss of interest in
   * the stream by a consumer. The supplied reason argument will be given to
   * the underlying source, which may or may not use it.
   *
   * @param reason the reason <- actually not what type this is
   * @return a Promise, but not quite sure what it can contain
   */
  def cancel(reason: String): js.Promise[Any] = js.native

  /**
   * See [[https://streams.spec.whatwg.org/#rs-get-reader ¶3.2.4.3. getReader()]]
   * of whatwg streams spec. Also see the example usage there.
   *
   * The getReader method creates a readable stream reader and locks the
   * stream to the new reader. While the stream is locked, no other reader
   * can be acquired until this one is released. The returned reader provides
   * the ability to directly read individual chunks from the stream via the
   * reader’s read method. This functionality is especially useful for
   * creating abstractions that desire the ability to consume a stream in its
   * entirety. By getting a reader for the stream, you can ensure nobodyA
   * else can interleave reads with yours or cancel the stream, which would
   * interfere with your abstraction.
   *
   * Note that if a stream becomes closed or errored, any reader it is locked
   * to is automatically released.
   *
   * throws scala.scalajs.js.TypeError if not a readable stream
   *
   * @return a new ReadableStreamReader
   *
   */
  def getReader(): ReadableStreamReader[T] = js.native

  /**
   * see [[https://streams.spec.whatwg.org/#rs-pipe-through §3.2.4.4. pipeThrough({ writable, readable }, options)]]
   *
   * The pipeThrough method provides a convenient, chainable way of piping
   * this readable stream through a transform stream (or any other {
   * writable, readable } pair). It simply pipes the stream into the writable
   * side of the supplied pair, and returns the readable side for further use
   * . Piping a stream will generally lock it for the duration of the pipe,
   * preventing any other consumer fromA acquiring a
   * reader.
   *
   * This method is intentionally generic; it does not require that its this
   * value be a ReadableStream object. It also does not require that its
   * writable argument be a WritableStream instance, or that its readable
   * argument be a ReadableStream instance.
   *
   * //todo: determine the type of options
   */
  def pipeThrough[U](
      pair: Any, // TODO js.Tuple2[WriteableStream[T], ReadableStream[U]]
      options: Any = js.undefined): ReadableStream[U] = js.native

  /**
   * See [[https://streams.spec.whatwg.org/#rs-pipe-to ¶3.2.4.5. pipeTo(dest, { preventClose, preventAbort, preventCancel } = {})]]
   * of whatwg Streams spec.
   *
   * The pipeTo method pipes this readable stream to a given writable stream.
   * The way in which the piping process behaves under various error
   * conditions can be customized with a number of passed options. It returns
   * a promise that fulfills when the piping process completes successfully,
   * or rejects if any errors were encountered.
   *
   * Piping a stream will generally lock it for the duration of the pipe,
   * preventing any other consumer from acquiring a reader. This method is
   * intentionally generic; it does not require that its this value be a
   * ReadableStream object.
   *
   * //todo: determine the type of options
   */
  def pipeTo(dest: WriteableStream[T],
      options: Any = js.undefined): Unit = js.native

  /**
   * See [[https://streams.spec.whatwg.org/#rs-tee ¶3.2.4.6. tee()]] of whatwg
   * streams spec.
   *
   * The tee method tees this readable stream, returning a two-element array
   * containing the two resulting branches as new ReadableStream instances.
   *
   * Teeing a stream will lock it, preventing any other consumer from
   * acquiring a reader. To cancel the stream, cancel both of the resulting
   * branches; a composite cancellation reason will then be propagated to the
   * stream’s underlying source.
   *
   * Note that the chunks seen in each branch will be the same object. If the
   * chunks are not immutable, this could allow interference between the two
   * branches. (Let us know if you think we should add an option to tee that
   * creates structured clones of the chunks for each branch.)
   */
  def tee(): js.Array[_ <: ReadableStream[T]] = js.native //TODO js.Tuple2[ReadableStream[T], ReadableStream[T]]
}

/**
 * See [[https://streams.spec.whatwg.org/#reader-class ¶3.4. Class ReadableStreamReader]]
 * of whatwg streams spec.
 *
 * The ReadableStreamReader class represents a readable stream reader designed
 * to be vended [sic] by a ReadableStream instance.
 *
 * The ReadableStreamReader constructor is generally not meant to be used directly;
 * instead, a stream’s getReader() method should be used. This allows different
 * classes of readable streams to vend different classes of readers without the
 * consumer needing to know which goes with which.
 *
 * @tparam T Type of the Chunks returned by the Stream
 */
@js.native
@JSGlobal
class ReadableStreamReader[+T](stream: ReadableStream[T]) extends js.Object {

  /**
   * See [[https://streams.spec.whatwg.org/#reader-closed §3.4.4.1. get closed]]
   * of whatwg Streams spec.
   *
   * The closed getter returns a promise that will be fulfilled when the stream
   * becomes closed or the reader’s lock is released, or rejected if the
   * stream ever errors.
   */
  def closed: js.Promise[ReadableStreamReader[T]] = js.native

  /**
   * See [[https://streams.spec.whatwg.org/#reader-cancel §3.4.4.2. cancel(reason)]]
   * of whatwg Streams spec.
   *
   * If the reader is active, the cancel method behaves the same as that for
   * the associated stream. When done, it automatically releases the lock.
   *
   * //todo determine type of reason
   */
  // not actually sure what the return type is here
  def cancel(reason: Any): js.Promise[Any] = js.native

  /**
   * See [[https://streams.spec.whatwg.org/#reader-read 3.4.4.3. read()]] of
   * whatwg Stream spec.
   *
   * The read method will return a promise that allows access to the next chunk
   * from the stream’s internal queue, if available. If the chunk does become
   * available, the promise will be fulfilled with an object of the form {
   * value: theChunk, done: false }. If the stream becomes closed, the
   * promise will be fulfilled with an object of the form { value: undefined,
   * done: true }. If the stream becomes errored, the promise will be
   * rejected with the relevant error. If reading a chunk causes the queue to
   * become empty, more data will be pulled from the underlying source.
   */
  def read(): js.Promise[Chunk[T]] = js.native

  /**
   * The releaseLock method releases the reader’s lock on the corresponding
   * stream. After the lock is released, the reader is no longer active. If the
   * associated stream is errored when the lock is released, the reader will
   * appear errored in the same way from now on; otherwise, the reader will
   * appear closed.
   * A reader’s lock cannot be released while it still has a pending read
   * request, i.e., if a promise returned by the reader’s read() method has
   * not yet been settled. Attempting to do so will throw a TypeError and leave
   * the reader locked to the stream.
   *
   * throws scala.scalajs.js.TypeError
   */
  def releaseLock(): Unit = js.native
}

/**
 *
 * [[https://streams.spec.whatwg.org/#rs-controller-class ¶3.3 Class
 * ReadableStreamController]] of whatwg spec
 *
 * The ReadableStreamController constructor cannot be used directly; it only
 * works on a ReadableStream that is in the middle of being constructed.
 *
 * @param stream can be null
 * @tparam T Type of the Chunks to be enqueued to the Stream

 */
@js.native
@JSGlobal
class ReadableStreamController[-T](stream: ReadableStream[T] = null)
    extends js.Object {

  /**
   *
   * The desiredSize getter returns the desired size to fill the controlled
   * stream’s internal queue. It can be negative, if the queue is over-full.
   * An underlying source should use this information to determine when and how
   * to apply backpressure.
   *
   * @return the size of the strem - no idea if this actually is an int
   */
  def desiredSize: Int = js.native

  /**
   * The close method will close the controlled readable stream. Consumers will
   * still be able to read any previously-enqueued chunks from the stream, but
   * once those are read, the stream will become closed
   * throws scala.scalajs.js.TypeError if this is not a readable controller
   */
  def close(): Unit = js.native

  /**
   * The enqueue method will enqueue a given chunk in the controlled readable
   * stream.
   *
   * @param chunk
   * throws scala.scalajs.js.RangeError if size is too big
   * @return  seems like its an undefOr[Int] of the size
   *
   */
  def enqueue(chunk: Chunk[T]): js.UndefOr[Int] = js.native

  /**
   * The error method will error the readable stream, making all future
   * interactions with it fail with the given error e.
   *
   * @param e : an error - can this be any type?
   *          throws scala.scalajs.js.TypeError
   */
  def error(e: Any): Unit = js.native
}

/**
 *
 * See [[https://streams.spec.whatwg.org/#chunk ¶2 Model]] but mostly the
 * examples in the whatwg streams spec
 *
 */
@js.native
trait Chunk[+T] extends js.Object {

  /**
   * The value of the chunk.
   */
  def value: T = js.native

  def done: Boolean = js.native
}
