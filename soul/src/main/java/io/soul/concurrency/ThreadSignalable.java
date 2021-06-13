package io.soul.concurrency;

public interface ThreadSignalable {

    void waitIndefinite() throws ThreadSignalingException;

    void waitTill(long millis) throws ThreadSignalingException;

    void notifyWaiting();

    void notifyAllWaiting();
}
