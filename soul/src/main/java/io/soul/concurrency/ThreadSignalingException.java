package io.soul.concurrency;

import io.soul.Object;
import io.soul.Soul;
import io.soul.SoulObject;
import io.soul.datatype.String;
import io.soul.exception.Exception;
import io.soul.memory.Initializable;
import io.soul.reflect.Klass;

@SuppressWarnings("unused")
public class ThreadSignalingException extends Exception {

    private SoulObject delegate;
    private Klass<ThreadSignalingException> klass;

    public ThreadSignalingException(java.lang.String message) {
        super(message);
        init();
    }

    public ThreadSignalingException(java.lang.String message, Throwable cause) {
        super(message, cause);
        init();
    }

    public ThreadSignalingException(Throwable cause) {
        super(cause);
        init();
    }

    @Override
    public Initializable init() {
        delegate = new SoulObject(this);
        klass = Soul.klassOf(this);
        return this;
    }

    @Override
    public boolean equalsTo(Object other) {
        return delegate.equalsTo(new SoulObject(other));
    }

    @Override
    public int hashValue() {
        return delegate.hashValue();
    }

    @Override
    public String stringify() {
        return delegate.stringify();
    }

    @Override
    public void waitIndefinite() throws ThreadSignalingException {
        delegate.waitIndefinite();
    }

    @Override
    public void waitTill(long millis) throws ThreadSignalingException {
        delegate.waitTill(millis);
    }

    @Override
    public void notifyWaiting() {
        delegate.notifyWaiting();
    }

    @Override
    public void notifyAllWaiting() {
        delegate.notifyAllWaiting();
    }

    @Override
    public Klass<? extends Object> getKlass() {
        return klass;
    }

    @Override
    public boolean instanceOf(Klass<?> klass) {
        return this.klass.equalsTo(klass);
    }

    @Override
    public void release() {
        delegate = null;
        klass = null;
    }
}
