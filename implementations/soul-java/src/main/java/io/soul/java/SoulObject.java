package io.soul.java;

import io.soul.Object;
import io.soul.concurrency.ThreadSignalingException;
import io.soul.datatype.String;
import io.soul.java.concurrency.SoulThreadSignalingException;
import io.soul.java.datatype.SoulString;
import io.soul.java.reflect.SoulClass;
import io.soul.memory.Initializable;
import io.soul.reflect.Klass;

public class SoulObject<T> implements Object {

    protected Klass<SoulObject<T>> klass;
    public T actual;

    public SoulObject() {
        this(null);
    }

    public SoulObject(T actual) {
        this.actual = actual;
        init();
    }

    @Override
    public Initializable init() {
        klass = new SoulClass<>((Class<SoulObject<T>>) this.getClass());
        return this;
    }

    @Override
    public void waitIndefinite() throws ThreadSignalingException {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new SoulThreadSignalingException(e);
        }
    }

    @Override
    public void waitTill(long millis) throws ThreadSignalingException {
        try {
            wait(millis);
        } catch (InterruptedException e) {
            throw new SoulThreadSignalingException(e);
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
    public boolean equals(java.lang.Object obj) {
        SoulObject<java.lang.Object> other = new SoulObject<>();
        other.actual = obj;
        return equalsTo(other);
    }

    @Override
    public boolean equalsTo(Object other) {
        if (other == null) {
            return false;
        }
        if (other.getClass() != getClass()) {
            return false;
        }

        return this.actual == ((SoulObject<T>) other).actual;
    }

    @Override
    public int hashValue() {
        return actual == null ? 0 : actual.hashCode();
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
    public String stringify() {
        return new SoulString(toString());
    }

    @Override
    public void release() {
        actual = null;
        klass = null;
    }
}