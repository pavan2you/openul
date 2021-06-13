package io.soul.java.concurrency;

import io.soul.Object;
import io.soul.concurrency.ThreadSignalingException;
import io.soul.datatype.String;
import io.soul.java.SoulObject;
import io.soul.java.reflect.SoulClass;
import io.soul.memory.Initializable;
import io.soul.reflect.Klass;

public class SoulThreadSignalingException extends ThreadSignalingException {

    private SoulObject<SoulThreadSignalingException> delegate;
    protected Klass<SoulThreadSignalingException> klass;

    public SoulThreadSignalingException(Throwable e) {
        super(e);
    }

    @Override
    public Initializable init() {
        delegate = new SoulObject<>(this);
        klass = new SoulClass<>((Class<SoulThreadSignalingException>) this.getClass());
        return this;
    }

    @Override
    public boolean equalsTo(Object other) {
        return delegate.equalsTo(new SoulObject<>(other));
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
