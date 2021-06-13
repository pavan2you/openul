package io.soul.java.reflect;

import io.soul.codec.Streamable;
import io.soul.datatype.String;
import io.soul.io.InputStream;
import io.soul.io.OutputStream;
import io.soul.java.SoulObject;
import io.soul.java.datatype.SoulString;
import io.soul.reflect.Klass;

public class SoulClass<T> extends SoulObject<Class<T>> implements Klass<T> {

    public SoulClass(Class<T> jClass) {
        super(jClass);
    }

    @Override
    public String getName() {
        return new SoulString(actual.getName());
    }

    @Override
    public void writeTo(OutputStream<Streamable> stream) {
    }

    @Override
    public Streamable readFrom(InputStream<Streamable> stream) {
        return null;
    }
}
