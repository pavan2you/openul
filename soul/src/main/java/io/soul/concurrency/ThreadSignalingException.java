package io.soul.concurrency;

import io.soul.exception.Exception;

public abstract class ThreadSignalingException extends Exception {

    public ThreadSignalingException(String message) {
        super(message);
        init();
    }

    public ThreadSignalingException(String message, Throwable cause) {
        super(message, cause);
        init();
    }

    public ThreadSignalingException(Throwable cause) {
        super(cause);
        init();
    }
}
