package org.fuelsyourcyb.exathunk;

import java.util.concurrent.RunnableFuture;

// A deferred computation.
// Computation trees chould be implementation-agnostic.
public interface Thunk<Value> extends RunnableFuture<Value> {

    // An optional callback to perform any work needed
    // to advance the computation.
    // Blocking evaluation of a callback would look
    // something like:
    //   while (!isFinished()) { step(); }
    void step();

    // TODO(ejconlon) Implement this when needed.
    // While thunk implementations should manage the
    // execution of the computation, some exposure of
    // internal state is useful to propagate errors, etc.
    // State getState();
}