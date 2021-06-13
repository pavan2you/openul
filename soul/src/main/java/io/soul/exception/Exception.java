package io.soul.exception;

import io.soul.Object;

public abstract class Exception extends java.lang.Exception implements Object {

    public Exception() {
        init();
    }

    public Exception(String message) {
        super(message);
        init();
    }

    public Exception(String message, Throwable cause) {
        super(message, cause);
        init();
    }

    public Exception(Throwable cause) {
        super(cause);
        init();
    }
}
