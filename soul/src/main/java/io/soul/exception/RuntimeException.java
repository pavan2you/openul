package io.soul.exception;

import io.soul.Object;

public abstract class RuntimeException extends java.lang.RuntimeException implements Object {

    public RuntimeException() {
        init();
    }

    public RuntimeException(String message) {
        super(message);
        init();
    }

    public RuntimeException(String message, Throwable cause) {
        super(message, cause);
        init();
    }

    public RuntimeException(Throwable cause) {
        super(cause);
        init();
    }
}
