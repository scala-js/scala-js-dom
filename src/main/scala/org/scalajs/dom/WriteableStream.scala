package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** [[https://streams.spec.whatwg.org/#ws-class ¶4.2. Class WritableStream]] of whatwg Stream spec
  *
  * todo: the constructor
  * @tparam T
  *   Type of the Chunks to be written to the Stream
  */
@js.native
trait WriteableStream[-T] extends js.Object {

  /** The closed getter returns a promise that will be fulfilled when the stream becomes closed, or rejected if it ever
    * errors. see [[https://streams.spec.whatwg.org/#ws-closed ¶4.2.4.1. get closed]]
    */
  val closed: js.Promise[WriteableStream[T]] = js.native

  /** The ready getter returns a promise that will be fulfilled when the stream transitions away from the "waiting"
    * state to any other state. Once the stream transitions back to "waiting", the getter will return a new promise that
    * stays pending until the next state transition. In essence, this promise gives a signal as to when any backpressure
    * has let up (or that the stream has been closed or errored).
    *
    * see [[https://streams.spec.whatwg.org/#ws-ready ¶4.2.4.2. get ready]] of whatwg streams spec.
    */
  val ready: js.Promise[WriteableStream[T]] = js.native

  /** The state getter returns the state of the stream see
    * [[https://streams.spec.whatwg.org/#ws-state ¶4.2.4.3. get state]] of whatwg streams spec
    */
  def state: WriteableState = js.native

  /** The abort method signals that the producer can no longer successfully write to the stream and it should be
    * immediately moved to an "errored" state, with any queued-up writes discarded. This will also execute any abort
    * mechanism of the underlying sink. see [[https://streams.spec.whatwg.org/#ws-abort ¶4.2.4.4. abort(reason)]]
    *
    * @param reason
    */
  def abort(reason: js.UndefOr[Any] = js.native): js.Promise[Unit] = js.native

  /** The close method signals that the producer is done writing chunks to the stream and wishes to move the stream to a
    * "closed" state. This queues an action to close the stream, such that once any currently queued-up writes complete,
    * the close mechanism of the underlying sink will execute, releasing any held resources. In the meantime, the stream
    * will be in a "closing" state.
    *
    * [[https://streams.spec.whatwg.org/#ws-close ¶4.2.4.5. close()]]
    *
    * @return
    *   a promise of this stream being closed
    */
  def close(): js.Promise[WriteableStream[T]] = js.native

  /** The write method adds a write to the stream’s internal queue, instructing the stream to write the given chunk of
    * data to the underlying sink once all other pending writes have finished successfully . It returns a promise that
    * will be fulfilled or rejected depending on the success or failure of writing the chunk to the underlying sink. The
    * impact of enqueuing this chunk will be immediately reflected in the stream’s state property; in particular, if the
    * internal queue is now full according to the stream’s queuing strategy, the stream will exert backpressure by
    * changing its state to "waiting".
    *
    * see [[https://streams.spec.whatwg.org/#ws-write 4.2.4.6. write(chunk)]] of whatwg streams spec
    *
    * @param chunk
    * @return
    *   bblfish: not sure what the type of the promise returned is
    */
  def write(chunk: Chunk[T]): js.Promise[Any] = js.native
}
