package io.soul.java.ds;

import io.soul.SoulObject;
import io.soul.codec.Streamable;
import io.soul.ds.Array;
import io.soul.ds.Iterator;
import io.soul.ds.Sequence;
import io.soul.io.InputStream;
import io.soul.io.OutputStream;

public class JavaArray<T> extends SoulObject implements Array<T> {

    @Override
    public void set(T[] value) {

    }

    @Override
    public T[] get() {
        return null;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public T elementAt(int index) {
        return null;
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public Sequence<T> subsequence(int from, int to) {
        return null;
    }

    @Override
    public void writeTo(OutputStream<Streamable> stream) {

    }

    @Override
    public Streamable readFrom(InputStream<Streamable> stream) {
        return null;
    }
}
