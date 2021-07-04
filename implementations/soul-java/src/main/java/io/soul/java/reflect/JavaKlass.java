package io.soul.java.reflect;

import io.soul.SoulObject;
import io.soul.codec.Streamable;
import io.soul.datatype.String;
import io.soul.io.InputStream;
import io.soul.io.OutputStream;
import io.soul.java.datatype.JavaString;
import io.soul.reflect.Klass;

public class JavaKlass<T> extends SoulObject implements Klass<T> {

    private final Class<T> actual;

    public JavaKlass(Class<T> jClass) {
        actual = jClass;
    }

    @Override
    public String getName() {
        return new JavaString(actual.getName());
    }

    @Override
    public void writeTo(OutputStream<Streamable> stream) {
    }

    @Override
    public Streamable readFrom(InputStream<Streamable> stream) {
        return null;
    }
}
