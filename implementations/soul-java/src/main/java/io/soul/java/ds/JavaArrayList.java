package io.soul.java.ds;

import io.soul.SoulObject;
import io.soul.codec.Streamable;
import io.soul.ds.Iterator;
import io.soul.ds.List;
import io.soul.io.InputStream;
import io.soul.io.OutputStream;

public class JavaArrayList<T> extends SoulObject implements List<T> {

    @Override
    public void add(T element) {

    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void writeTo(OutputStream<Streamable> stream) {

    }

    @Override
    public Streamable readFrom(InputStream<Streamable> stream) {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
