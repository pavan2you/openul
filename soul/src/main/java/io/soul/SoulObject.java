package io.soul;

import io.soul.concurrency.ThreadSignalingException;
import io.soul.datatype.String;
import io.soul.memory.Initializable;
import io.soul.reflect.Klass;

public class SoulObject implements Object {

    public java.lang.Object actual;

    public SoulObject() {
        this(null);
    }

    public SoulObject(java.lang.Object actual) {
        this.actual = actual;
        init();
    }

    @Override
    public Initializable init() {
        return this;
    }

    @Override
    public void waitIndefinite() throws ThreadSignalingException {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new ThreadSignalingException(e);
        }
    }

    @Override
    public void waitTill(long millis) throws ThreadSignalingException {
        try {
            wait(millis);
        } catch (InterruptedException e) {
            throw new ThreadSignalingException(e);
        }
    }

    @Override
    public void notifyWaiting() {
        notify();
    }

    @Override
    public void notifyAllWaiting() {
        notifyAll();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == null) {
            return false;
        }
        if (other.getClass() != getClass()) {
            return false;
        }

        return equalsTo((SoulObject) other);
    }

    @Override
    public boolean equalsTo(Object other) {
        return this == other || this.actual == ((SoulObject) other).actual;
    }

    @Override
    public int hashCode() {
        return hashValue();
    }

    @Override
    public int hashValue() {
        return actual == null ? 0 : actual.hashCode();
    }

    @Override
    public String stringify() {
        return Soul.asString(toString());
    }

    @Override
    public Klass<? extends Object> getKlass() {
        return Soul.klassOf(this);
    }

    @Override
    public boolean instanceOf(Klass<?> klass) {
        return getKlass().equalsTo(klass);
    }

    @Override
    public void release() {
        actual = null;
    }
}